/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immigrationproject;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author cstuser
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private Button cancelLoginB;

    @FXML
    private TextField passwordTF;

    @FXML
    private TextField LoginTF;

    @FXML
    private Button loginB;

    public static int role;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginB.setDefaultButton(true);

    }
    
    @FXML
    public void cancelHandler(){
         Platform.exit();
    }

    @FXML
    public void loginHandler() throws IOException, SQLException {
        String name = LoginTF.getText();
        String password = passwordTF.getText();
        String query = "Select * from applicant_user where user_name='" + name + "'";
        ResultSet result = ConnectJavaOracle.retreivefromDB(query);
        result.last();
        int resultLength = result.getRow();
        result.beforeFirst();
        if (resultLength == 0) {
            JOptionPane.showMessageDialog(null, "Incorrect Login");
            LoginTF.clear();
            passwordTF.clear();
            LoginTF.requestFocus();
        }
        while (result.next()) {
//        System.out.println("length= "+result.getString("user_name"));
            if (!password.equals(result.getString("user_password"))) {
                JOptionPane.showMessageDialog(null, "Incorrect Password");
                passwordTF.clear();
                passwordTF.requestFocus();
            } else {
                role = result.getInt("user_role");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime timestamp = LocalDateTime.now();
               
                String timestampQuery = "update applicant_user set user_login_timestamp=TO_DATE('" + timestamp.format(formatter) + "', 'yyyy/mm/dd hh24:mi:ss')where user_name='" + name + "'";
                ConnectJavaOracle.insertUpdateDB(timestampQuery, false);
              

                Stage thisStage = (Stage) loginB.getScene().getWindow();
                thisStage.close();
                Stage stage = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

                //create a new scene with root and set the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.resizableProperty().setValue(Boolean.FALSE);
                stage.show();
            }
        }
    }
    
     @FXML
    public void skipHandler() throws IOException{
        
        Stage thisStage = (Stage) loginB.getScene().getWindow();
                thisStage.close();
                Stage stage = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

                //create a new scene with root and set the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                //stage.initStyle(StageStyle.UNDECORATED);
                stage.resizableProperty().setValue(Boolean.FALSE);
                stage.show();
        
    }
}
