
package immigrationproject;

import java.time.LocalDate;
import javafx.scene.control.*;


/**
 *
 * @author v
 */
public class Work {
    private DatePicker work_from_DP;
    private DatePicker work_to_DP;
    private TextField work_nameTF;
    private TextField work_titleTF;
    private TextField work_countryTF;
    private TextField app_no;
    //Data members from Emp class
    private String emp_from;
    private String emp_to;
    private String emp_name;
    private String emp_title;
    private String emp_country;
    private String emp_app_no;

    public Work(DatePicker edu_from_DP, DatePicker edu_to_DP, TextField edu_nameTF, TextField edu_diplomaTF, TextField edu_specTF, TextField app_no) {
        this.work_from_DP = edu_from_DP;
        this.work_to_DP = edu_to_DP;
        this.work_nameTF = edu_nameTF;
        this.work_titleTF = edu_diplomaTF;
        this.work_countryTF = edu_specTF;
        this.app_no = app_no;
    }

    public LocalDate getTEXTWork_from_DP() {
        return work_from_DP.getValue();
    }

    
    public LocalDate getTEXTWork_to_DP() {
        return work_to_DP.getValue();
    }

        public String getTEXTWork_nameTF() {
        return work_nameTF.getText();
    }

    
    public String getTEXTWork_titleTF() {
        return work_titleTF.getText();
    }

       public String getTEXTWork_countryTF() {
        return work_countryTF.getText();
    }

   
    public String getTEXTApp_no() {
        return app_no.getText();
    }

    public void setWork_from_DP(String work_from) {
        work_from_DP.setValue(LocalDate.parse(work_from.substring(0, 10)));
    }

    public void setWork_to_DP(String work_to) {
      work_to_DP.setValue(LocalDate.parse(work_to.substring(0, 10)));
    }

    public void setWork_nameTF(String work_name) {
        work_nameTF.setText(work_name);
    }

    public void setWork_titleTF(String work_title) {
        work_titleTF.setText(work_title);
    }

    public void setWork_countryTF(String work_country) {
        work_countryTF.setText(work_country);
    }

   public void setFieldsVisible(){
       this.work_from_DP.setVisible(true);
        this.work_to_DP.setVisible(true);
        this.work_nameTF.setVisible(true);
        this.work_titleTF.setVisible(true);
        this.work_countryTF.setVisible(true);
       
   }
   //Methods from Emp class
    public Work(String emp_from, String emp_to, String emp_name, String emp_title, String emp_country, String emp_app_no) {
        this.emp_from = emp_from;
        this.emp_to = emp_to;
        this.emp_name = emp_name;
        this.emp_title = emp_title;
        this.emp_country = emp_country;
        this.emp_app_no = emp_app_no;
    }

    public Work() {
        this.emp_from = "";
        this.emp_to = "";
        this.emp_name = "";
        this.emp_title = "";
        this.emp_country = "";
        this.emp_app_no = "";
    }

    public String getEmp_from() {
        return emp_from;
    }

    public void setEmp_from(String emp_from) {
        this.emp_from = emp_from;
    }

    public String getEmp_to() {
        return emp_to;
    }

    public void setEmp_to(String emp_to) {
        this.emp_to = emp_to;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_title() {
        return emp_title;
    }

    public void setEmp_title(String emp_title) {
        this.emp_title = emp_title;
    }

    public String getEmp_country() {
        return emp_country;
    }

    public void setEmp_country(String emp_country) {
        this.emp_country = emp_country;
    }

    public String getEmp_app_no() {
        return emp_app_no;
    }

    public void setEmp_app_no(String emp_app_no) {
        this.emp_app_no = emp_app_no;
    }
    
    

    
    public String toQuery() {
        return "to_date('"+getTEXTWork_from_DP()+"','yyyy/mm/dd'),to_date('"+getTEXTWork_to_DP()+"','yyyy/mm/dd'),'"+
                getTEXTWork_nameTF()+"', '"+getTEXTWork_titleTF()+"', '"+getTEXTWork_countryTF()+"', '"+getTEXTApp_no();
    }

    
    
    

    
}
