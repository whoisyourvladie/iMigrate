package immigrationproject;

import java.time.LocalDate;
import javafx.scene.control.*;

/**
 *
 * @author v
 */
public class Family {

    private TextField fam_lnameTF;
    private TextField fam_fnameTF;
    private ComboBox fam_relationCB;
    private DatePicker fam_dob_DP;
    private TextField fam_place_birthTF;
    private ComboBox fam_accompCB;
    private TextField app_no;
    //data members from fam class
    private String fam_lname;
    private String fam_fname;
    private String fam_relation;
    private String fam_dob;
    private String fam_place_birth;
    private String fam_accomp;
    private String fam_app_no;

    public Family(TextField fam_lnameTF, TextField fam_fnameTF, ComboBox fam_relationCB, DatePicker fam_dob_DP, TextField fam_place_birthTF, ComboBox fam_accompCB, TextField app_no) {
        this.fam_lnameTF = fam_lnameTF;
        this.fam_fnameTF = fam_fnameTF;
        this.fam_relationCB = fam_relationCB;
        this.fam_dob_DP = fam_dob_DP;
        this.fam_place_birthTF = fam_place_birthTF;
        this.fam_accompCB = fam_accompCB;
        this.app_no = app_no;
    }

    public String getTEXTFam_lnameTF() {
        return fam_lnameTF.getText();
    }

    

    public String getTEXTFam_fnameTF() {
        return fam_fnameTF.getText();
    }

      

    public LocalDate getTEXTFam_dob_DP() {
        return fam_dob_DP.getValue();
    }

    
    public String getTEXTFam_place_birthTF() {
        return fam_place_birthTF.getText();
    }


    public String getApp_no() {
        return app_no.getText();
    }

   
    public ComboBox getFam_relationCB() {
        return fam_relationCB;
    }
    
  
    public ComboBox getFam_accompCB() {
        return fam_accompCB;
    }

    public void setFam_lnameTF(String fam_lname) {
        fam_lnameTF.setText(fam_lname);
    }

    public void setFam_fnameTF(String fam_fname) {
        fam_fnameTF.setText(fam_fname);
    }

    public void setFam_relationCB(String fam_relation) {
        fam_relationCB.setValue(fam_relation);
    }

    public void setFam_dob_DP(String fam_dob) {
        fam_dob_DP.setValue(LocalDate.parse(fam_dob.substring(0, 10)));
    }

    public void setFam_place_birthTF(String fam_place_birth) {
        fam_place_birthTF.setText(fam_place_birth); 
    }

    public void setFam_accompCB(String fam_accomp) {
        fam_accompCB.setValue(fam_accomp);
    }
    
    public void setFieldsVisible(){
        this.fam_lnameTF.setVisible(true); 
        this.fam_fnameTF.setVisible(true); 
        this.fam_relationCB.setVisible(true); 
        this.fam_dob_DP.setVisible(true); 
        this.fam_place_birthTF.setVisible(true); 
        this.fam_accompCB.setVisible(true); 
        this.app_no.setVisible(true); 
    }
    

    
    public String toQuery() {
        return "'" + getTEXTFam_lnameTF() + "','" + getTEXTFam_fnameTF() + "','" + fam_relationCB.getValue() + "', '"
                + getTEXTFam_place_birthTF() + "', to_date('" + getTEXTFam_dob_DP() + "','yyyy/mm/dd'),'" + fam_accompCB.getValue()
                + "', '" + getApp_no();
    }

    // methods from fam class
    public Family(String fam_lname, String fam_fname, String fam_relation, String fam_dob, String fam_place_birth, String fam_accomp, String fam_app_no) {
        this.fam_lname = fam_lname;
        this.fam_fname = fam_fname;
        this.fam_relation = fam_relation;
        this.fam_dob = fam_dob;
        this.fam_place_birth = fam_place_birth;
        this.fam_accomp = fam_accomp;
        this.fam_app_no = fam_app_no;
    }
    
    public Family() {
        fam_lname="";
        fam_fname="";
        fam_relation="";
        fam_dob="";
        fam_place_birth="";
        fam_accomp="";
        fam_app_no="";
    }

    public String getFam_lname() {
        return fam_lname;
    }

    public void setFam_lname(String fam_lname) {
        this.fam_lname = fam_lname;
    }

    public String getFam_fname() {
        return fam_fname;
    }

    public void setFam_fname(String fam_fname) {
        this.fam_fname = fam_fname;
    }

    public String getFam_relation() {
        return fam_relation;
    }

    public void setFam_relation(String fam_relation) {
        this.fam_relation = fam_relation;
    }

    public String getFam_dob() {
        return fam_dob;
    }

    public void setFam_dob(String fam_dob) {
        this.fam_dob = fam_dob;
    }

    public String getFam_place_birth() {
        return fam_place_birth;
    }

    public void setFam_place_birth(String fam_place_birth) {
        this.fam_place_birth = fam_place_birth;
    }

    public String getFam_accomp() {
        return fam_accomp;
    }

    public void setFam_accomp(String fam_accomp) {
        this.fam_accomp = fam_accomp;
    }

    public String getFam_app_no() {
        return fam_app_no;
    }

    public void setFam_app_no(String fam_app_no) {
        this.fam_app_no = fam_app_no;
    }

}
