
package immigrationproject;

import java.time.LocalDate;
import javafx.scene.control.*;


/**
 *
 * @author v
 */
public class Education {
    private DatePicker edu_from_DP;
    private DatePicker edu_to_DP;
    private TextField edu_nameTF;
    private TextField edu_diplomaTF;
    private TextField edu_specTF;
    private TextField app_no;
    
    //Data members from Edu class
    private String edu_from;
    private String edu_to;
    private String edu_name;
    private String edu_diploma;
    private String edu_spec;
    private String edu_app_no;
    
    

    public Education(DatePicker edu_from_DP, DatePicker edu_to_DP, TextField edu_nameTF, TextField edu_diplomaTF, TextField edu_specTF, TextField app_no) {
        this.edu_from_DP = edu_from_DP;
        this.edu_to_DP = edu_to_DP;
        this.edu_nameTF = edu_nameTF;
        this.edu_diplomaTF = edu_diplomaTF;
        this.edu_specTF = edu_specTF;
        this.app_no = app_no;
    }

    public LocalDate getTEXTEdu_from_DP() {
        return edu_from_DP.getValue();
    }

       public LocalDate getTEXTEdu_to_DP() {
        return edu_to_DP.getValue();
    }

   
    public String getTEXTEdu_nameTF() {
        return edu_nameTF.getText();
    }

    
    public String getTEXTEdu_diplomaTF() {
        return edu_diplomaTF.getText();
    }

    
    public String getTEXTEdu_specTF() {
        return edu_specTF.getText();
    }

   
    public String getTEXTApp_no() {
        return app_no.getText();
    }

    public void setEdu_from_DP(String edu_from) {
        edu_from_DP.setValue(LocalDate.parse(edu_from.substring(0, 10)));
    }

    public void setEdu_to_DP(String edu_to) {
        edu_to_DP.setValue(LocalDate.parse(edu_to.substring(0, 10)));
    }

    public void setEdu_nameTF(String edu_name) {
        edu_nameTF.setText(edu_name);
    } 

    public void setEdu_diplomaTF(String edu_diploma) {
        edu_diplomaTF.setText(edu_diploma);
    }

    public void setEdu_specTF(String edu_spec) {
        edu_specTF.setText(edu_spec);
    }
    
    public void setFieldsVisible(){
    edu_from_DP.setVisible(true);
    edu_to_DP.setVisible(true);
    edu_nameTF.setVisible(true);
    edu_diplomaTF.setVisible(true);
    edu_specTF.setVisible(true);
    }
    
    

   
   
    
    
    public String toQuery() {
        return "to_date('"+getTEXTEdu_from_DP()+"','yyyy/mm/dd'),to_date('"+getTEXTEdu_to_DP()+"','yyyy/mm/dd'),'"+
                getTEXTEdu_nameTF()+"', '"+getTEXTEdu_diplomaTF()+"', '"+getTEXTEdu_specTF()+"', '"+getTEXTApp_no();
    }

    //Methods from From Edu class
    
    public Education(String edu_from, String edu_to_, String edu_name, String edu_diploma, String edu_spec, String edu_app_no) {
        this.edu_from = edu_from;
        this.edu_to = edu_to_;
        this.edu_name = edu_name;
        this.edu_diploma = edu_diploma;
        this.edu_spec = edu_spec;
        this.edu_app_no = edu_app_no;
    }

    public Education() {
        edu_from = "";
        edu_to = "";
        edu_name = "";
        edu_diploma = "";
        edu_spec = "";
        edu_app_no = "";
    }

    public String getEdu_from() {
        return edu_from;
    }

    public void setEdu_from(String edu_from) {
        this.edu_from = edu_from;
    }

    public String getEdu_to() {
        return edu_to;
    }

    public void setEdu_to(String edu_to) {
        this.edu_to = edu_to;
    }

    public String getEdu_name() {
        return edu_name;
    }

    public void setEdu_name(String edu_name) {
        this.edu_name = edu_name;
    }

    public String getEdu_diploma() {
        return edu_diploma;
    }

    public void setEdu_diploma(String edu_diploma) {
        this.edu_diploma = edu_diploma;
    }

    public String getEdu_spec() {
        return edu_spec;
    }

    public void setEdu_spec(String edu_spec) {
        this.edu_spec = edu_spec;
    }

    public String getEdu_app_no() {
        return edu_app_no;
    }

    public void setEdu_app_no(String edu_app_no) {
        this.edu_app_no = edu_app_no;
    }

    
    

    
}
