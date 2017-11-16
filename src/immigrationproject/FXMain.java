package immigrationproject;

import java.awt.Color;
import java.io.IOException;
import javafx.util.*;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.UIManager;

/**
 *
 * @author cstuser
 */
public class FXMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("splashFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        
        
//        try {
//
//            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("FXML_Login.fxml")));
//            Scene splashScene = new Scene(FXMLLoader.load(getClass().getResource("splashFXML.fxml")));
//
//            primaryStage.setScene(splashScene);
//            primaryStage.initStyle(StageStyle.UNDECORATED);
//            primaryStage.show();
//
//            PauseTransition delay = new PauseTransition(Duration.seconds(5));
//            delay.setOnFinished(event -> primaryStage.hide());
//            delay.play();
//            primaryStage.setScene(scene);
////            //primaryStage.initStyle(StageStyle.UTILITY);
//            primaryStage.show();
//        } catch (IOException ex) {
//            System.out.println("Main Load error");
//            ex.printStackTrace(System.out);
//        }

        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.white);
        UI.put("Panel.background", Color.white);
//        Scanner infile=null;
//        PrintWriter outFile=null;
//        try {
//            infile= new Scanner (new FileReader("quebec_cities.txt"));
//            outFile= new PrintWriter("quebec_cities.out");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FXMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        int i=0;
//        while(infile.hasNextLine()){
//            outFile.println("insert into qc_cities values ("+i+",'"+infile.nextLine()+"');");
//            i++;
//        }
//        outFile.close();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
