package immigrationproject;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javax.swing.JOptionPane;
import static java.time.temporal.ChronoUnit.*;
import javafx.application.Platform;
import javafx.print.PrinterJob;
import javafx.scene.*;

public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane tabMainAnchorPane;

    @FXML
    private MenuButton searchMB;

    @FXML
    private MenuItem searchByNameMI;

    @FXML
    private MenuItem searchByApplNumberMI;

    @FXML
    private MenuItem searchByPassportMI;

    @FXML
    private Label onReviewTextL;

    @FXML
    private Label sinceReceivedTF;

    @FXML
    private TextField education5_SpecializationTF;

    @FXML
    private ComboBox fr_speak_CB;

    @FXML
    private TextField dep3_fnameTF;

    @FXML
    private TextField workExp1_CompCountryTF;

    @FXML
    private TextField workExp6_CompCountryTF;

    @FXML
    private TextField education6_InstNameTF;

    @FXML
    private DatePicker workExp9_ToTF;

    @FXML
    private Tab tab_mailTAB;

    @FXML
    private DatePicker dep3_dobTF;

    @FXML
    private DatePicker stayQC_fromDP;

    @FXML
    private ComboBox dep6_accCB;

    @FXML
    private TextField workExp4_CompNameTF;

    @FXML
    private TextField address_bldTF;

    @FXML
    private TextField countrybirthTF;

    @FXML
    private Label scoreL;

    @FXML
    private TextField education4_DiplomaTypeTF;

    @FXML
    private TextField education10_InstNameTF;

    @FXML
    private Tab workTAB;

    @FXML
    private DatePicker stayQC_toDP;

    @FXML
    private TextArea reportTA;

    @FXML
    private TextField workExp10_JobTitleTF;

    @FXML
    private TextField education9_DiplomaTypeTF;

    @FXML
    private DatePicker education10_FromTF;

    @FXML
    private TextField dep8_birthTF;

    @FXML
    private TextField workExp7_JobTitleTF;

    @FXML
    private Button prevB;

    @FXML
    private ComboBox emplNumLinesCB;

    @FXML
    private ComboBox en_listen_CB;

    @FXML
    private TextField dep3_lnameTF;

    @FXML
    private DatePicker dep9_dobTF;

    @FXML
    private TextField address_prvTF;

    @FXML
    private ToggleGroup stayTG;

    @FXML
    private TextField workExp1_JobTitleTF;

    @FXML
    private TextField address_streetTF;

    @FXML
    private TextField dep2_birthTF;

    @FXML
    private TextField dep6_fnameTF;

    @FXML
    private DatePicker dep2_dobTF;

    @FXML
    private DatePicker dep8_dobTF;

    @FXML
    private TextField workExp9_CompNameTF;

    @FXML
    private RadioButton stayQC_yesRB;

    @FXML
    private DatePicker education4_ToTF;

    @FXML
    private ComboBox dep5_accCB;

    @FXML
    private Tab educationTAB;

    @FXML
    private TextField education9_SpecializationTF;

    @FXML
    private TextField workExp6_JobTitleTF;

    @FXML
    private DatePicker workExp2_ToTF;

    @FXML
    private ComboBox dep9_relationCB;

    @FXML
    private DatePicker workExp5_ToTF;

    @FXML
    private Button findB;

    @FXML
    private TextField dep9_fnameTF;

    @FXML
    private DatePicker workExp3_FromTF;

    @FXML
    private DatePicker education7_ToTF;

    @FXML
    private TextField education8_DiplomaTypeTF;

    @FXML
    private TextField dep6_lnameTF;

    @FXML
    private ComboBox dep8_relationCB;

    @FXML
    private TextField empAddressJobOfferTF;

    @FXML
    private TextField address_cityTF;

    @FXML
    private ToggleGroup jobOfferTG;

    @FXML
    private TextField dep5_birthTF;

    @FXML
    private TextField workExp8_JobTitleTF;

    @FXML
    private TextField dep1_fnameTF;

    @FXML
    private TextField education5_DiplomaTypeTF;

    @FXML
    private DatePicker education2_FromTF;

    @FXML
    private DatePicker education3_FromTF;

    @FXML
    private RadioButton sex_mRB;

    @FXML
    private ComboBox en_write_CB;

    @FXML
    private TextField education4_SpecializationTF;

    @FXML
    private DatePicker workExp8_FromTF;

    @FXML
    private DatePicker workExp7_FromTF;

    @FXML
    private DatePicker education5_ToTF;

    @FXML
    private ComboBox intended_cityCB;

    @FXML
    private DatePicker education5_FromTF;

    @FXML
    private DatePicker education8_FromTF;

    @FXML
    private GridPane familyMembGridPane;

    @FXML
    private ComboBox dep7_relationCB;

    @FXML
    private TextField education8_InstNameTF;

    @FXML
    private RadioButton jobOffer_yesRB;

    @FXML
    private TextField workExp8_CompNameTF;

    @FXML
    private ComboBox dep10_accCB;

    @FXML
    private DatePicker workExp2_FromTF;

    @FXML
    private TextField provincebirthTF;

    @FXML
    private TextField dep5_lnameTF;

    @FXML
    private TextField workExp6_CompNameTF;

    @FXML
    private DatePicker workExp6_ToTF;

    @FXML
    private RadioButton stayQC_noRB;

    @FXML
    private TextField education10_SpecializationTF;

    @FXML
    private DatePicker education6_ToTF;

    @FXML
    private ComboBox educationLevel_CB;

    @FXML
    private DatePicker workExp7_ToTF;

    @FXML
    private TextField education2_InstNameTF;

    @FXML
    private TextField education2_DiplomaTypeTF;

    @FXML
    private TextField education1_SpecializationTF;

    @FXML
    private DatePicker workExp1_ToTF;

    @FXML
    private TextField dep4_fnameTF;

    @FXML
    private ComboBox dep8_accCB;

    @FXML
    private TextField fnameTF;

    @FXML
    private TextField dep8_lnameTF;

    @FXML
    private TextField applicantNumberTF;

    @FXML
    private ComboBox dep3_relationCB;

    @FXML
    private DatePicker education10_ToTF;

    @FXML
    private ComboBox dep7_accCB;

    @FXML
    private Label empNameJobOfferL;

    @FXML
    private TextField education4_InstNameTF;

    @FXML
    private Button saveB;

    @FXML
    private ComboBox reportChoiseCB;

    @FXML
    private TextField dep7_birthTF;

    @FXML
    private DatePicker workExp5_FromTF;

    @FXML
    private TextField education3_DiplomaTypeTF;

    @FXML
    private TextField workExp2_CompNameTF;

    @FXML
    private Tab languageTAB;

    @FXML
    private DatePicker workExp10_ToTF;

    @FXML
    private TextField education7_SpecializationTF;

    @FXML
    private ComboBox dep1_relationCB;

    @FXML
    private TextField dep10_lnameTF;

    @FXML
    private Tab tab_dependTAB;

    @FXML
    private TextField dep1_birthTF;

    @FXML
    private TextField address_phoneTF;

    @FXML
    private ComboBox whereDiplomaObtained_CB;

    @FXML
    private TextField address_appTF;

    @FXML
    private TextField workExp10_CompNameTF;

    @FXML
    private ComboBox areaOfTrainingCB;

    @FXML
    private TextField education3_InstNameTF;

    @FXML
    private TextField workExp7_CompNameTF;

    @FXML
    private TextField address_countryTF;

    @FXML
    private TextField education10_DiplomaTypeTF;

    @FXML
    private TextField dep7_fnameTF;

    @FXML
    private TextField empNameJobOfferTF;

    @FXML
    private ComboBox numberOfEducInstitCB;

    @FXML
    private TextField dep7_lnameTF;

    @FXML
    private ComboBox dep3_accCB;

    @FXML
    private TextField passportTF;

    @FXML
    private RadioButton jobOffer_noRB;

    @FXML
    private ComboBox fr_listen_CB;

    @FXML
    private TextField education9_InstNameTF;

    @FXML
    private TextField workExp1_CompNameTF;

    @FXML
    private DatePicker education1_ToTF;

    @FXML
    private TextField intendedProf_TF;

    @FXML
    private Button exitB;

    @FXML
    private DatePicker dep6_dobTF;

    @FXML
    private TextField education6_DiplomaTypeTF;

    @FXML
    private TextField education1_DiplomaTypeTF;

    @FXML
    private ComboBox dep6_relationCB;

    @FXML
    private TextField workExp9_JobTitleTF;

    @FXML
    private RadioButton sex_fRB;

    @FXML
    private TextField workExp3_CompCountryTF;

    @FXML
    private TextField dep10_birthTF;

    @FXML
    private ComboBox dep9_accCB;

    @FXML
    private ComboBox en_speak_CB;

    @FXML
    private TextField dep4_birthTF;

    @FXML
    private TextField education3_SpecializationTF;

    @FXML
    private ComboBox dep5_relationCB;

    @FXML
    private TextField workExp8_CompCountryTF;

    @FXML
    private DatePicker education3_ToTF;

    @FXML
    private ComboBox en_read_CB;

    @FXML
    private TextField education7_DiplomaTypeTF;

    @FXML
    private TextField dep2_fnameTF;

    @FXML
    private DatePicker workExp10_FromTF;

    @FXML
    private TextField workExp9_CompCountryTF;

    @FXML
    private ComboBox marital_statusCB;

    @FXML
    private TextField dep2_lnameTF;

    @FXML
    private TextField workExp3_JobTitleTF;

    @FXML
    private DatePicker workExp8_ToTF;

    @FXML
    private TextField dep9_birthTF;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField education2_SpecializationTF;

    @FXML
    private TextField citybirthTF;

    @FXML
    private DatePicker dateDocsRecDP;

    @FXML
    private DatePicker dep1_dobTF;

    @FXML
    private TextField workExp4_JobTitleTF;

    @FXML
    private ComboBox dep10_relationCB;

    @FXML
    private ComboBox dep4_accCB;

    @FXML
    private ComboBox fr_read_CB;

    @FXML
    private DatePicker education1_FromTF;

    @FXML
    private TextField dep3_birthTF;

    @FXML
    private TextField workExp5_JobTitleTF;

    @FXML
    private DatePicker dep7_dobTF;

    @FXML
    private DatePicker workExp9_FromTF;

    @FXML
    private DatePicker dep10_dobTF;

    @FXML
    private ComboBox dep4_relationCB;

    @FXML
    private TextField workExp2_JobTitleTF;

    @FXML
    private DatePicker workExp6_FromTF;

    @FXML
    private TextField dep10_fnameTF;

    @FXML
    private Button nextB;

    @FXML
    private DatePicker education9_FromTF;

    @FXML
    private DatePicker workExp4_ToTF;

    @FXML
    private TextField workExp2_CompCountryTF;

    @FXML
    private DatePicker education4_FromTF;

    @FXML
    private DatePicker education6_FromTF;

    @FXML
    private DatePicker education7_FromTF;

    @FXML
    private TextField dep9_lnameTF;

    @FXML
    private ComboBox familyMemNo_CB;

    @FXML
    private TextField workExp7_CompCountryTF;

    @FXML
    private GridPane educationGridPane;

    @FXML
    private TextField dep5_fnameTF;

    @FXML
    private TextField education1_InstNameTF;

    @FXML
    private TextField workExp5_CompNameTF;

    @FXML
    private TextField dep1_lnameTF;

    @FXML
    private ComboBox dep2_accCB;

    @FXML
    private GridPane workExpGridPane;

    @FXML
    private DatePicker workExp4_FromTF;

    @FXML
    private TextField dep8_fnameTF;

    @FXML
    private TextField education8_SpecializationTF;

    @FXML
    private TextField education6_SpecializationTF;

    @FXML
    private TextField dep6_birthTF;

    @FXML
    private DatePicker dobDP;

    @FXML
    private TextField education7_InstNameTF;

    @FXML
    private Label empAddressJobOfferL;

    @FXML
    private DatePicker workExp3_ToTF;

    @FXML
    private DatePicker education9_ToTF;

    @FXML
    private ComboBox dep1_accCB;

    @FXML
    private TextField workExp3_CompNameTF;

    @FXML
    private TextField lnameTF;

    @FXML
    private TextField workExp4_CompCountryTF;

    @FXML
    private TextField education5_InstNameTF;

    @FXML
    private DatePicker education8_ToTF;

    @FXML
    private DatePicker dateDiplomaObtDP;

    @FXML
    private ToggleGroup sexTG;

    @FXML
    private DatePicker dep5_dobTF;

    @FXML
    private ComboBox dep2_relationCB;

    @FXML
    private TextField address_zipTF;

    @FXML
    private TextField workExp5_CompCountryTF;

    @FXML
    private DatePicker dep4_dobTF;

    @FXML
    private TextField workExp10_CompCountryTF;

    @FXML
    private DatePicker workExp1_FromTF;

    @FXML
    private DatePicker education2_ToTF;

    @FXML
    private Button cancelSearchB;

    @FXML
    private TextField dep4_lnameTF;

    @FXML
    private ComboBox fr_write_CB;

    @FXML
    private TabPane tabPane;

    @FXML
    private ComboBox emp_statusCB;

    @FXML
    private RadioButton familyQC_noRB;

    @FXML
    private RadioButton familyQC_yesRB;

    @FXML
    private AnchorPane familyAnchorPane;

    @FXML
    private AnchorPane educationAnchorPane;

    @FXML
    private AnchorPane employmentAnchorPane;

    @FXML
    private AnchorPane languageAnchorPane;

    @FXML
    private MenuItem newEntryMI;

    @FXML
    private MenuItem updateMI;

    @FXML
    private MenuItem deleteMI;

    @FXML
    private MenuItem aboutMI;

    int userMode;

    //ObservableList<AreasOfTraining> areasOfTrainingArrayList;
    ObservableList<String> fam_relationList;
    ObservableList<String> fam_accompanList;

    ArrayList<Education> edu_field_array;
    ArrayList<Work> work_field_array;
    ArrayList<Family> family_field_array;

    Random randomSeed = new Random();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        userMode = LoginFXMLController.role;
        if (userMode == 0) {

            deleteMI.setDisable(true);
            newEntryMI.setDisable(false);
            updateMI.setDisable(false);

            saveB.setDisable(false);
        } else {
            clearAllFields();
            SetEditable(false);

            deleteMI.setDisable(false);
            newEntryMI.setDisable(true);
            updateMI.setDisable(true);
            saveB.setDisable(true);
        }

        //templorarily - to be deleted in final version and change calculatScore() line with **** comment
        //dateDocsRecDP.setValue(LocalDate.now());
        //dobDP.setValue(LocalDate.parse("1900-01-01"));
        //stayQC_fromDP.setValue(LocalDate.parse("1900-01-01"));
        //stayQC_toDP.setValue(LocalDate.parse("1900-01-01"));
        //dateDiplomaObtDP.setValue(LocalDate.parse("1900-01-01"));
       

        edu_field_array = makeArrayOfControlsForEducationTable();
        work_field_array = makeArrayOfControlsForEmploymentTable();
        family_field_array = makeArrayOfControlsForFamilyTable();

        areaOfTrainingCB.getItems().addAll(populateCBfromDB("select * from areas_of_training", "aot_name"));

        areaOfTrainingCB.setEditable(true);
        FxUtilTest.autoCompleteComboBoxPlus(areaOfTrainingCB, (typedText, itemToCompare) -> itemToCompare.toString().toLowerCase().contains(typedText.toLowerCase()));

        educationLevel_CB.getItems().addAll(populateCBfromDB("select * from edu_level", "edu_name"));
        //findB.setVisible(false);
        //cancelSearchB.setVisible(false);
        //familyMembersAllDisableHandler();
        //educationAllFieldsDisable();
        //workAllFieldsDisable();
        

        marital_statusCB.getItems().addAll(populateCBfromDB("select * from marital_status", "ms_name"));
        emp_statusCB.getItems().addAll(populateCBfromDB("select * from emp_status", "emp_name"));

        fam_relationList = FXCollections.observableList(Arrays.asList("mother", "father", "sister", "brother",
                "daughter", "son", "wife", "husband", "de facto spouse"));

        fam_accompanList = FXCollections.observableList(Arrays.asList("yes", "no"));

        fr_listen_CB.getItems().addAll("0 Level A-B1", "5 Level B2", "6 Level C1", "7 Level C2");
        fr_speak_CB.getItems().addAll("0 Level A-B1", "5 Level B2", "6 Level C1", "7 Level C2");
        fr_read_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "1 Level C2");
        fr_write_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "1 Level C2");

        en_listen_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "2 Level C2");
        en_speak_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "2 Level C2");
        en_read_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "1 Level C2");
        en_write_CB.getItems().addAll("0 Level A-B1", "1 Level B2", "1 Level C1", "1 Level C2");

        populatefamilyComboBoxes();

        familyMemNo_CB.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        familyMemNo_CB.setValue(0);
        numberOfEducInstitCB.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberOfEducInstitCB.setValue(0);
        emplNumLinesCB.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        emplNumLinesCB.setValue(0);
        intended_cityCB.getItems().addAll(populateCBfromDB("select * from qc_cities", "city_name"));
        intended_cityCB.setEditable(true);
        FxUtilTest.autoCompleteComboBoxPlus(intended_cityCB, (typedText, itemToCompare) -> itemToCompare.toString().toLowerCase().contains(typedText.toLowerCase()));
        whereDiplomaObtained_CB.getItems().addAll("Quebec/Canada/USA", "Other");
         newEntryHandler();
          Platform.runLater(() -> {
              fnameTF.requestFocus();
        });

    }

    @FXML
    public void newEntryHandler() {
        clearAllFields();
        tabPane.getSelectionModel().select(0);
        dateDocsRecDP.setValue(LocalDate.now());
        dobDP.setValue(LocalDate.parse("1900-01-01"));
        stayQC_fromDP.setValue(LocalDate.parse("1900-01-01"));
        stayQC_toDP.setValue(LocalDate.parse("1900-01-01"));
        dateDiplomaObtDP.setValue(LocalDate.parse("1900-01-01"));

        findB.setVisible(false);
        cancelSearchB.setVisible(false);
        familyMembersAllDisableHandler();
        educationAllFieldsDisable();
        workAllFieldsDisable();

        SetEditable(true);
        applicantNumberTF.setEditable(false);
        fnameTF.requestFocus();

    }

    private void populatefamilyComboBoxes() {
        for (Family el : family_field_array) {
            el.getFam_accompCB().getItems().addAll(fam_accompanList);
            el.getFam_relationCB().getItems().addAll(fam_relationList);

        }

    }

    private ArrayList<Work> makeArrayOfControlsForEmploymentTable() {

        ArrayList<Work> tempArr = new ArrayList<>();

        tempArr.add(new Work(workExp1_FromTF, workExp1_ToTF, workExp1_CompNameTF, workExp1_JobTitleTF, workExp1_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp2_FromTF, workExp2_ToTF, workExp2_CompNameTF, workExp2_JobTitleTF, workExp2_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp3_FromTF, workExp3_ToTF, workExp3_CompNameTF, workExp3_JobTitleTF, workExp3_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp4_FromTF, workExp4_ToTF, workExp4_CompNameTF, workExp4_JobTitleTF, workExp4_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp5_FromTF, workExp5_ToTF, workExp5_CompNameTF, workExp5_JobTitleTF, workExp5_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp6_FromTF, workExp6_ToTF, workExp6_CompNameTF, workExp6_JobTitleTF, workExp6_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp7_FromTF, workExp7_ToTF, workExp7_CompNameTF, workExp7_JobTitleTF, workExp7_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp8_FromTF, workExp8_ToTF, workExp8_CompNameTF, workExp8_JobTitleTF, workExp8_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp9_FromTF, workExp9_ToTF, workExp9_CompNameTF, workExp9_JobTitleTF, workExp9_CompCountryTF, applicantNumberTF));
        tempArr.add(new Work(workExp10_FromTF, workExp10_ToTF, workExp10_CompNameTF, workExp10_JobTitleTF, workExp10_CompCountryTF, applicantNumberTF));

        return tempArr;
    }

    private ArrayList<Education> makeArrayOfControlsForEducationTable() {

        ArrayList<Education> tempArr = new ArrayList<>();

        tempArr.add(new Education(education1_FromTF, education1_ToTF,
                education1_InstNameTF, education1_DiplomaTypeTF, education1_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education2_FromTF, education2_ToTF,
                education2_InstNameTF, education2_DiplomaTypeTF, education2_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education3_FromTF, education3_ToTF,
                education3_InstNameTF, education3_DiplomaTypeTF, education3_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education4_FromTF, education4_ToTF,
                education4_InstNameTF, education4_DiplomaTypeTF, education4_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education5_FromTF, education5_ToTF,
                education5_InstNameTF, education5_DiplomaTypeTF, education5_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education6_FromTF, education6_ToTF,
                education6_InstNameTF, education6_DiplomaTypeTF, education6_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education7_FromTF, education7_ToTF,
                education7_InstNameTF, education7_DiplomaTypeTF, education7_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education8_FromTF, education8_ToTF,
                education8_InstNameTF, education8_DiplomaTypeTF, education8_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education9_FromTF, education9_ToTF,
                education9_InstNameTF, education9_DiplomaTypeTF, education9_SpecializationTF, applicantNumberTF));
        tempArr.add(new Education(education10_FromTF, education10_ToTF,
                education10_InstNameTF, education10_DiplomaTypeTF, education10_SpecializationTF, applicantNumberTF));

        return tempArr;
    }

    private ArrayList<Family> makeArrayOfControlsForFamilyTable() {

        ArrayList<Family> tempArr = new ArrayList<>();

        tempArr.add(new Family(dep1_lnameTF, dep1_fnameTF, dep1_relationCB, dep1_dobTF, dep1_birthTF, dep1_accCB, applicantNumberTF));
        tempArr.add(new Family(dep2_lnameTF, dep2_fnameTF, dep2_relationCB, dep2_dobTF, dep2_birthTF, dep2_accCB, applicantNumberTF));
        tempArr.add(new Family(dep3_lnameTF, dep3_fnameTF, dep3_relationCB, dep3_dobTF, dep3_birthTF, dep3_accCB, applicantNumberTF));
        tempArr.add(new Family(dep4_lnameTF, dep4_fnameTF, dep4_relationCB, dep4_dobTF, dep4_birthTF, dep4_accCB, applicantNumberTF));
        tempArr.add(new Family(dep5_lnameTF, dep5_fnameTF, dep5_relationCB, dep5_dobTF, dep5_birthTF, dep5_accCB, applicantNumberTF));
        tempArr.add(new Family(dep6_lnameTF, dep6_fnameTF, dep6_relationCB, dep6_dobTF, dep6_birthTF, dep6_accCB, applicantNumberTF));
        tempArr.add(new Family(dep7_lnameTF, dep7_fnameTF, dep7_relationCB, dep7_dobTF, dep7_birthTF, dep7_accCB, applicantNumberTF));
        tempArr.add(new Family(dep8_lnameTF, dep8_fnameTF, dep8_relationCB, dep8_dobTF, dep8_birthTF, dep8_accCB, applicantNumberTF));
        tempArr.add(new Family(dep9_lnameTF, dep9_fnameTF, dep9_relationCB, dep9_dobTF, dep9_birthTF, dep9_accCB, applicantNumberTF));
        tempArr.add(new Family(dep10_lnameTF, dep10_fnameTF, dep10_relationCB, dep10_dobTF, dep10_birthTF, dep10_accCB, applicantNumberTF));

        return tempArr;
    }

    @FXML
    private void nextButtonHandler() {
        tabPane.getSelectionModel().selectNext();

    }

    @FXML
    private void prevButtonHandler() {
        tabPane.getSelectionModel().selectPrevious();
    }

    @FXML
    private void searchByApplNumberHandler() {
        SetEditable(true);
        HideShowFields(true);
        clearAllFields();
        applicantNumberTF.setEditable(true);
        applicantNumberTF.setDisable(false);
        applicantNumberTF.requestFocus();
        applicantNumberTF.setStyle("-fx-border-color: blue");
        applicantNumberTF.clear();
    }

    @FXML
    private void searchByNameAndDOBHandler() {
        SetEditable(true);
        HideShowFields(true);
        clearAllFields();
        fnameTF.setDisable(false);
        lnameTF.setDisable(false);
        dobDP.setDisable(false);
        fnameTF.requestFocus();
        fnameTF.setStyle("-fx-border-color: blue");
        lnameTF.setStyle("-fx-border-color: blue");
        dobDP.setStyle("-fx-border-color: blue; -fx-border-width: 2;-fx-border-radius: 3");
        fnameTF.clear();
        lnameTF.clear();
        dobDP.setValue(null);

    }

    @FXML
    private void searchByPassportHandler() {
        SetEditable(true);
        HideShowFields(true);
        clearAllFields();
        passportTF.setDisable(false);
        passportTF.requestFocus();
        passportTF.setStyle("-fx-border-color: blue");
        passportTF.clear();
    }

    @FXML
    private void SetEditable(boolean boo) {
        for (Node el : tabMainAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).setEditable(boo);
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setDisable(!boo);

            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setDisable(!boo);

            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setDisable(!boo);

            }
        }
        //System.out.println(Arrays.toString(familyMembGridPane.getChildren().toArray()));

        for (Node el : familyAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).setEditable(boo);
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setDisable(!boo);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setDisable(!boo);
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setDisable(!boo);
            } else if (el instanceof GridPane) {
                for (Node gridEl : ((GridPane) el).getChildren()) {
                    if (gridEl instanceof TextField) {
                        ((TextField) gridEl).setEditable(boo);
                    } else if (gridEl instanceof DatePicker) {
                        ((DatePicker) gridEl).setDisable(!boo);
                    } else if (gridEl instanceof ComboBox) {
                        ((ComboBox) gridEl).setDisable(!boo);
                    }
                }
            }
        }

        for (Node el : educationAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).setEditable(boo);
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setDisable(!boo);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setDisable(!boo);
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setDisable(!boo);
            } else if (el instanceof GridPane) {
                for (Node gridEl : ((GridPane) el).getChildren()) {
                    if (gridEl instanceof TextField) {
                        ((TextField) gridEl).setEditable(boo);
                    } else if (gridEl instanceof DatePicker) {
                        ((DatePicker) gridEl).setDisable(!boo);
                    } else if (gridEl instanceof ComboBox) {
                        ((ComboBox) gridEl).setDisable(!boo);
                    }
                }
            }
        }

        for (Node el : employmentAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).setEditable(boo);
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setDisable(!boo);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setDisable(!boo);
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setDisable(!boo);
            } else if (el instanceof GridPane) {
                for (Node gridEl : ((GridPane) el).getChildren()) {
                    if (gridEl instanceof TextField) {
                        ((TextField) gridEl).setEditable(boo);
                    } else if (gridEl instanceof DatePicker) {
                        ((DatePicker) gridEl).setDisable(!boo);
                    } else if (gridEl instanceof ComboBox) {
                        ((ComboBox) gridEl).setDisable(!boo);
                    }
                }
            }
        }

        for (Node el : languageAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).setDisable(!boo);
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setDisable(!boo);

            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setDisable(!boo);

            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setDisable(!boo);

            }
        }

    }

    @FXML
    private void HideShowFields(boolean boo) {

        findB.setVisible(boo);
        cancelSearchB.setVisible(boo);

        applicantNumberTF.setDisable(boo);
        fnameTF.setDisable(boo);
        lnameTF.setDisable(boo);
        passportTF.setDisable(boo);
        dobDP.setDisable(boo);

        tab_dependTAB.setDisable(boo);

        educationTAB.setDisable(boo);
        workTAB.setDisable(boo);
        languageTAB.setDisable(boo);

        dateDocsRecDP.setDisable(boo);

        sex_mRB.setDisable(boo);
        sex_fRB.setDisable(boo);

        sex_fRB.setDisable(boo);

        citybirthTF.setDisable(boo);

        provincebirthTF.setDisable(boo);

        countrybirthTF.setDisable(boo);

        address_bldTF.setDisable(boo);

        address_streetTF.setDisable(boo);

        address_appTF.setDisable(boo);

        address_cityTF.setDisable(boo);

        address_prvTF.setDisable(boo);

        address_countryTF.setDisable(boo);

        address_zipTF.setDisable(boo);

        intended_cityCB.setDisable(boo);

        intendedProf_TF.setDisable(boo);

        emp_statusCB.setDisable(boo);

        address_phoneTF.setDisable(boo);

        stayQC_yesRB.setDisable(boo);

        stayQC_noRB.setDisable(boo);

        stayQC_fromDP.setDisable(boo);

        stayQC_toDP.setDisable(boo);

        marital_statusCB.setDisable(boo);

        tab_dependTAB.setDisable(boo);

        nextB.setDisable(boo);

        saveB.setDisable(boo);

        exitB.setDisable(boo);

        prevB.setDisable(boo);
        searchMB.setDisable(boo);

    }

    @FXML
    private void exitBHandler() {
        Platform.exit();

    }

    @FXML
    private void cancelSearchBHandler() {

        findB.setVisible(false);
        cancelSearchB.setVisible(false);
        applicantNumberTF.setDisable(false);
        applicantNumberTF.setStyle(null);
        fnameTF.setStyle(null);
        lnameTF.setStyle(null);
        passportTF.setStyle(null);
        dobDP.setStyle(null);

        fnameTF.setDisable(false);
        lnameTF.setDisable(false);
        passportTF.setDisable(false);
        dobDP.setDisable(false);

        tab_dependTAB.setDisable(false);
        educationTAB.setDisable(false);
        workTAB.setDisable(false);
        languageTAB.setDisable(false);

        sex_mRB.setDisable(false);
        sex_fRB.setDisable(false);
        sex_fRB.setDisable(false);
        citybirthTF.setDisable(false);
        provincebirthTF.setDisable(false);
        countrybirthTF.setDisable(false);
        address_bldTF.setDisable(false);
        address_streetTF.setDisable(false);
        address_appTF.setDisable(false);
        address_cityTF.setDisable(false);
        address_prvTF.setDisable(false);
        address_countryTF.setDisable(false);
        address_zipTF.setDisable(false);
        intended_cityCB.setDisable(false);
        intendedProf_TF.setDisable(false);
        emp_statusCB.setDisable(false);

        address_phoneTF.setDisable(false);
        stayQC_yesRB.setDisable(false);
        stayQC_noRB.setDisable(false);
        stayQC_fromDP.setDisable(false);
        stayQC_toDP.setDisable(false);
        marital_statusCB.setDisable(false);
        tab_dependTAB.setDisable(false);
        nextB.setDisable(false);
        saveB.setDisable(false);
        exitB.setDisable(false);
        prevB.setDisable(false);
        searchMB.setDisable(false);
    }

    @FXML
    private void familyMembersCBHandler() {
        switch (Integer.parseInt(familyMemNo_CB.getValue().toString())) {
            case 0:
                familyMembersAllDisableHandler();
                break;
            case 1:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                break;
            case 2:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                break;
            case 3:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                break;
            case 4:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                break;
            case 5:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                break;
            case 6:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                dep6_lnameTF.setVisible(true);
                dep6_fnameTF.setVisible(true);
                dep6_relationCB.setVisible(true);
                dep6_dobTF.setVisible(true);
                dep6_birthTF.setVisible(true);
                dep6_accCB.setVisible(true);
                break;
            case 7:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                dep6_lnameTF.setVisible(true);
                dep6_fnameTF.setVisible(true);
                dep6_relationCB.setVisible(true);
                dep6_dobTF.setVisible(true);
                dep6_birthTF.setVisible(true);
                dep6_accCB.setVisible(true);
                dep7_lnameTF.setVisible(true);
                dep7_fnameTF.setVisible(true);
                dep7_relationCB.setVisible(true);
                dep7_dobTF.setVisible(true);
                dep7_birthTF.setVisible(true);
                dep7_accCB.setVisible(true);
                break;
            case 8:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                dep6_lnameTF.setVisible(true);
                dep6_fnameTF.setVisible(true);
                dep6_relationCB.setVisible(true);
                dep6_dobTF.setVisible(true);
                dep6_birthTF.setVisible(true);
                dep6_accCB.setVisible(true);
                dep7_lnameTF.setVisible(true);
                dep7_fnameTF.setVisible(true);
                dep7_relationCB.setVisible(true);
                dep7_dobTF.setVisible(true);
                dep7_birthTF.setVisible(true);
                dep7_accCB.setVisible(true);
                dep8_lnameTF.setVisible(true);
                dep8_fnameTF.setVisible(true);
                dep8_relationCB.setVisible(true);
                dep8_dobTF.setVisible(true);
                dep8_birthTF.setVisible(true);
                dep8_accCB.setVisible(true);
                break;
            case 9:
                familyMembersAllDisableHandler();
                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                dep6_lnameTF.setVisible(true);
                dep6_fnameTF.setVisible(true);
                dep6_relationCB.setVisible(true);
                dep6_dobTF.setVisible(true);
                dep6_birthTF.setVisible(true);
                dep6_accCB.setVisible(true);
                dep7_lnameTF.setVisible(true);
                dep7_fnameTF.setVisible(true);
                dep7_relationCB.setVisible(true);
                dep7_dobTF.setVisible(true);
                dep7_birthTF.setVisible(true);
                dep7_accCB.setVisible(true);
                dep8_lnameTF.setVisible(true);
                dep8_fnameTF.setVisible(true);
                dep8_relationCB.setVisible(true);
                dep8_dobTF.setVisible(true);
                dep8_birthTF.setVisible(true);
                dep8_accCB.setVisible(true);
                dep9_lnameTF.setVisible(true);
                dep9_fnameTF.setVisible(true);
                dep9_relationCB.setVisible(true);
                dep9_dobTF.setVisible(true);
                dep9_birthTF.setVisible(true);
                dep9_accCB.setVisible(true);
                break;
            case 10:

                familyMembGridPane.setVisible(true);
                dep1_lnameTF.setVisible(true);
                dep1_fnameTF.setVisible(true);
                dep1_relationCB.setVisible(true);
                dep1_dobTF.setVisible(true);
                dep1_birthTF.setVisible(true);
                dep1_accCB.setVisible(true);
                dep2_lnameTF.setVisible(true);
                dep2_fnameTF.setVisible(true);
                dep2_relationCB.setVisible(true);
                dep2_dobTF.setVisible(true);
                dep2_birthTF.setVisible(true);
                dep2_accCB.setVisible(true);
                dep3_lnameTF.setVisible(true);
                dep3_fnameTF.setVisible(true);
                dep3_relationCB.setVisible(true);
                dep3_dobTF.setVisible(true);
                dep3_birthTF.setVisible(true);
                dep3_accCB.setVisible(true);
                dep4_lnameTF.setVisible(true);
                dep4_fnameTF.setVisible(true);
                dep4_relationCB.setVisible(true);
                dep4_dobTF.setVisible(true);
                dep4_birthTF.setVisible(true);
                dep4_accCB.setVisible(true);
                dep5_lnameTF.setVisible(true);
                dep5_fnameTF.setVisible(true);
                dep5_relationCB.setVisible(true);
                dep5_dobTF.setVisible(true);
                dep5_birthTF.setVisible(true);
                dep5_accCB.setVisible(true);
                dep6_lnameTF.setVisible(true);
                dep6_fnameTF.setVisible(true);
                dep6_relationCB.setVisible(true);
                dep6_dobTF.setVisible(true);
                dep6_birthTF.setVisible(true);
                dep6_accCB.setVisible(true);
                dep7_lnameTF.setVisible(true);
                dep7_fnameTF.setVisible(true);
                dep7_relationCB.setVisible(true);
                dep7_dobTF.setVisible(true);
                dep7_birthTF.setVisible(true);
                dep7_accCB.setVisible(true);
                dep8_lnameTF.setVisible(true);
                dep8_fnameTF.setVisible(true);
                dep8_relationCB.setVisible(true);
                dep8_dobTF.setVisible(true);
                dep8_birthTF.setVisible(true);
                dep8_accCB.setVisible(true);
                dep9_lnameTF.setVisible(true);
                dep9_fnameTF.setVisible(true);
                dep9_relationCB.setVisible(true);
                dep9_dobTF.setVisible(true);
                dep9_birthTF.setVisible(true);
                dep9_accCB.setVisible(true);
                dep10_lnameTF.setVisible(true);
                dep10_fnameTF.setVisible(true);
                dep10_relationCB.setVisible(true);
                dep10_dobTF.setVisible(true);
                dep10_birthTF.setVisible(true);
                dep10_accCB.setVisible(true);
                break;

        }
    }

    private void familyMembersAllDisableHandler() {
        familyMembGridPane.setVisible(false);
        dep2_lnameTF.setVisible(false);
        dep1_lnameTF.setVisible(false);
        dep2_lnameTF.setVisible(false);
        dep3_lnameTF.setVisible(false);
        dep4_lnameTF.setVisible(false);
        dep5_lnameTF.setVisible(false);
        dep6_lnameTF.setVisible(false);
        dep7_lnameTF.setVisible(false);
        dep8_lnameTF.setVisible(false);
        dep9_lnameTF.setVisible(false);
        dep10_lnameTF.setVisible(false);

        dep1_fnameTF.setVisible(false);
        dep2_fnameTF.setVisible(false);
        dep3_fnameTF.setVisible(false);
        dep4_fnameTF.setVisible(false);
        dep5_fnameTF.setVisible(false);
        dep6_fnameTF.setVisible(false);
        dep7_fnameTF.setVisible(false);
        dep8_fnameTF.setVisible(false);
        dep9_fnameTF.setVisible(false);
        dep10_fnameTF.setVisible(false);

        dep1_relationCB.setVisible(false);
        dep2_relationCB.setVisible(false);
        dep3_relationCB.setVisible(false);
        dep4_relationCB.setVisible(false);
        dep5_relationCB.setVisible(false);
        dep6_relationCB.setVisible(false);
        dep7_relationCB.setVisible(false);
        dep8_relationCB.setVisible(false);
        dep9_relationCB.setVisible(false);
        dep10_relationCB.setVisible(false);

        dep1_dobTF.setVisible(false);
        dep2_dobTF.setVisible(false);
        dep3_dobTF.setVisible(false);
        dep4_dobTF.setVisible(false);
        dep5_dobTF.setVisible(false);
        dep6_dobTF.setVisible(false);
        dep7_dobTF.setVisible(false);
        dep8_dobTF.setVisible(false);
        dep9_dobTF.setVisible(false);
        dep10_dobTF.setVisible(false);

        dep1_birthTF.setVisible(false);
        dep2_birthTF.setVisible(false);
        dep3_birthTF.setVisible(false);
        dep4_birthTF.setVisible(false);
        dep5_birthTF.setVisible(false);
        dep6_birthTF.setVisible(false);
        dep7_birthTF.setVisible(false);
        dep8_birthTF.setVisible(false);
        dep9_birthTF.setVisible(false);
        dep10_birthTF.setVisible(false);

        dep1_accCB.setVisible(false);
        dep2_accCB.setVisible(false);
        dep3_accCB.setVisible(false);
        dep4_accCB.setVisible(false);
        dep5_accCB.setVisible(false);
        dep6_accCB.setVisible(false);
        dep7_accCB.setVisible(false);
        dep8_accCB.setVisible(false);
        dep9_accCB.setVisible(false);
        dep10_accCB.setVisible(false);
    }

    private void educationAllFieldsDisable() {
        educationGridPane.setVisible(false);
        education1_FromTF.setVisible(false);
        education2_FromTF.setVisible(false);
        education3_FromTF.setVisible(false);
        education4_FromTF.setVisible(false);
        education5_FromTF.setVisible(false);
        education6_FromTF.setVisible(false);
        education7_FromTF.setVisible(false);
        education8_FromTF.setVisible(false);
        education9_FromTF.setVisible(false);
        education10_FromTF.setVisible(false);

        education1_ToTF.setVisible(false);
        education2_ToTF.setVisible(false);
        education3_ToTF.setVisible(false);
        education4_ToTF.setVisible(false);
        education5_ToTF.setVisible(false);
        education6_ToTF.setVisible(false);
        education7_ToTF.setVisible(false);
        education8_ToTF.setVisible(false);
        education9_ToTF.setVisible(false);
        education10_ToTF.setVisible(false);

        education1_InstNameTF.setVisible(false);
        education2_InstNameTF.setVisible(false);
        education3_InstNameTF.setVisible(false);
        education4_InstNameTF.setVisible(false);
        education5_InstNameTF.setVisible(false);
        education6_InstNameTF.setVisible(false);
        education7_InstNameTF.setVisible(false);
        education8_InstNameTF.setVisible(false);
        education9_InstNameTF.setVisible(false);
        education10_InstNameTF.setVisible(false);

        education1_DiplomaTypeTF.setVisible(false);
        education2_DiplomaTypeTF.setVisible(false);
        education3_DiplomaTypeTF.setVisible(false);
        education4_DiplomaTypeTF.setVisible(false);
        education5_DiplomaTypeTF.setVisible(false);
        education6_DiplomaTypeTF.setVisible(false);
        education7_DiplomaTypeTF.setVisible(false);
        education8_DiplomaTypeTF.setVisible(false);
        education9_DiplomaTypeTF.setVisible(false);
        education10_DiplomaTypeTF.setVisible(false);

        education1_SpecializationTF.setVisible(false);
        education2_SpecializationTF.setVisible(false);
        education3_SpecializationTF.setVisible(false);
        education4_SpecializationTF.setVisible(false);
        education5_SpecializationTF.setVisible(false);
        education6_SpecializationTF.setVisible(false);
        education7_SpecializationTF.setVisible(false);
        education8_SpecializationTF.setVisible(false);
        education9_SpecializationTF.setVisible(false);
        education10_SpecializationTF.setVisible(false);
    }

    @FXML
    private void educationCBHandler() {
        switch (Integer.parseInt(numberOfEducInstitCB.getValue().toString())) {

            case 0:
                educationAllFieldsDisable();
                break;
            case 1:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);
                break;
            case 2:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);
                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);
                break;
            case 3:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);
                break;

            case 4:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);
                break;

            case 5:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);
                break;

            case 6:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);

                education6_FromTF.setVisible(true);
                education6_ToTF.setVisible(true);
                education6_InstNameTF.setVisible(true);
                education6_DiplomaTypeTF.setVisible(true);
                education6_SpecializationTF.setVisible(true);
                break;

            case 7:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);

                education6_FromTF.setVisible(true);
                education6_ToTF.setVisible(true);
                education6_InstNameTF.setVisible(true);
                education6_DiplomaTypeTF.setVisible(true);
                education6_SpecializationTF.setVisible(true);

                education7_FromTF.setVisible(true);
                education7_ToTF.setVisible(true);
                education7_InstNameTF.setVisible(true);
                education7_DiplomaTypeTF.setVisible(true);
                education7_SpecializationTF.setVisible(true);
                break;

            case 8:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);

                education6_FromTF.setVisible(true);
                education6_ToTF.setVisible(true);
                education6_InstNameTF.setVisible(true);
                education6_DiplomaTypeTF.setVisible(true);
                education6_SpecializationTF.setVisible(true);

                education7_FromTF.setVisible(true);
                education7_ToTF.setVisible(true);
                education7_InstNameTF.setVisible(true);
                education7_DiplomaTypeTF.setVisible(true);
                education7_SpecializationTF.setVisible(true);

                education8_FromTF.setVisible(true);
                education8_ToTF.setVisible(true);
                education8_InstNameTF.setVisible(true);
                education8_DiplomaTypeTF.setVisible(true);
                education8_SpecializationTF.setVisible(true);
                break;

            case 9:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);

                education6_FromTF.setVisible(true);
                education6_ToTF.setVisible(true);
                education6_InstNameTF.setVisible(true);
                education6_DiplomaTypeTF.setVisible(true);
                education6_SpecializationTF.setVisible(true);

                education7_FromTF.setVisible(true);
                education7_ToTF.setVisible(true);
                education7_InstNameTF.setVisible(true);
                education7_DiplomaTypeTF.setVisible(true);
                education7_SpecializationTF.setVisible(true);

                education8_FromTF.setVisible(true);
                education8_ToTF.setVisible(true);
                education8_InstNameTF.setVisible(true);
                education8_DiplomaTypeTF.setVisible(true);
                education8_SpecializationTF.setVisible(true);

                education9_FromTF.setVisible(true);
                education9_ToTF.setVisible(true);
                education9_InstNameTF.setVisible(true);
                education9_DiplomaTypeTF.setVisible(true);
                education9_SpecializationTF.setVisible(true);
                break;

            case 11:
                educationAllFieldsDisable();
                educationGridPane.setVisible(true);
                education1_FromTF.setVisible(true);
                education1_ToTF.setVisible(true);
                education1_InstNameTF.setVisible(true);
                education1_DiplomaTypeTF.setVisible(true);
                education1_SpecializationTF.setVisible(true);

                education2_FromTF.setVisible(true);
                education2_ToTF.setVisible(true);
                education2_InstNameTF.setVisible(true);
                education2_DiplomaTypeTF.setVisible(true);
                education2_SpecializationTF.setVisible(true);

                education3_FromTF.setVisible(true);
                education3_ToTF.setVisible(true);
                education3_InstNameTF.setVisible(true);
                education3_DiplomaTypeTF.setVisible(true);
                education3_SpecializationTF.setVisible(true);

                education4_FromTF.setVisible(true);
                education4_ToTF.setVisible(true);
                education4_InstNameTF.setVisible(true);
                education4_DiplomaTypeTF.setVisible(true);
                education4_SpecializationTF.setVisible(true);

                education5_FromTF.setVisible(true);
                education5_ToTF.setVisible(true);
                education5_InstNameTF.setVisible(true);
                education5_DiplomaTypeTF.setVisible(true);
                education5_SpecializationTF.setVisible(true);

                education6_FromTF.setVisible(true);
                education6_ToTF.setVisible(true);
                education6_InstNameTF.setVisible(true);
                education6_DiplomaTypeTF.setVisible(true);
                education6_SpecializationTF.setVisible(true);

                education7_FromTF.setVisible(true);
                education7_ToTF.setVisible(true);
                education7_InstNameTF.setVisible(true);
                education7_DiplomaTypeTF.setVisible(true);
                education7_SpecializationTF.setVisible(true);

                education8_FromTF.setVisible(true);
                education8_ToTF.setVisible(true);
                education8_InstNameTF.setVisible(true);
                education8_DiplomaTypeTF.setVisible(true);
                education8_SpecializationTF.setVisible(true);

                education9_FromTF.setVisible(true);
                education9_ToTF.setVisible(true);
                education9_InstNameTF.setVisible(true);
                education9_DiplomaTypeTF.setVisible(true);
                education9_SpecializationTF.setVisible(true);

                education10_FromTF.setVisible(true);
                education10_ToTF.setVisible(true);
                education10_InstNameTF.setVisible(true);
                education10_DiplomaTypeTF.setVisible(true);
                education10_SpecializationTF.setVisible(true);
                break;
        }
    }

    private void workAllFieldsDisable() {
        workExpGridPane.setVisible(false);
        workExp1_FromTF.setVisible(false);
        workExp2_FromTF.setVisible(false);
        workExp3_FromTF.setVisible(false);
        workExp4_FromTF.setVisible(false);
        workExp5_FromTF.setVisible(false);
        workExp6_FromTF.setVisible(false);
        workExp7_FromTF.setVisible(false);
        workExp8_FromTF.setVisible(false);
        workExp9_FromTF.setVisible(false);
        workExp10_FromTF.setVisible(false);

        workExp1_ToTF.setVisible(false);
        workExp2_ToTF.setVisible(false);
        workExp3_ToTF.setVisible(false);
        workExp4_ToTF.setVisible(false);
        workExp5_ToTF.setVisible(false);
        workExp6_ToTF.setVisible(false);
        workExp7_ToTF.setVisible(false);
        workExp8_ToTF.setVisible(false);
        workExp9_ToTF.setVisible(false);
        workExp10_ToTF.setVisible(false);

        workExp1_CompNameTF.setVisible(false);
        workExp2_CompNameTF.setVisible(false);
        workExp3_CompNameTF.setVisible(false);
        workExp4_CompNameTF.setVisible(false);
        workExp5_CompNameTF.setVisible(false);
        workExp6_CompNameTF.setVisible(false);
        workExp7_CompNameTF.setVisible(false);
        workExp8_CompNameTF.setVisible(false);
        workExp9_CompNameTF.setVisible(false);
        workExp10_CompNameTF.setVisible(false);

        workExp1_JobTitleTF.setVisible(false);
        workExp2_JobTitleTF.setVisible(false);
        workExp3_JobTitleTF.setVisible(false);
        workExp4_JobTitleTF.setVisible(false);
        workExp5_JobTitleTF.setVisible(false);
        workExp6_JobTitleTF.setVisible(false);
        workExp7_JobTitleTF.setVisible(false);
        workExp8_JobTitleTF.setVisible(false);
        workExp9_JobTitleTF.setVisible(false);
        workExp10_JobTitleTF.setVisible(false);

        workExp1_CompCountryTF.setVisible(false);
        workExp2_CompCountryTF.setVisible(false);
        workExp3_CompCountryTF.setVisible(false);
        workExp4_CompCountryTF.setVisible(false);
        workExp5_CompCountryTF.setVisible(false);
        workExp6_CompCountryTF.setVisible(false);
        workExp7_CompCountryTF.setVisible(false);
        workExp8_CompCountryTF.setVisible(false);
        workExp9_CompCountryTF.setVisible(false);
        workExp10_CompCountryTF.setVisible(false);
    }

    @FXML
    private void workCBHandler() {
        switch (Integer.parseInt(emplNumLinesCB.getValue().toString())) {
            case 0:
                workAllFieldsDisable();
                break;
            case 1:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);
                break;
            case 2:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);
                break;
            case 3:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);
                break;

            case 4:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);
                break;

            case 5:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);
                break;

            case 6:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);

                workExp6_FromTF.setVisible(true);
                workExp6_ToTF.setVisible(true);
                workExp6_CompNameTF.setVisible(true);
                workExp6_JobTitleTF.setVisible(true);
                workExp6_CompCountryTF.setVisible(true);
                break;

            case 7:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);

                workExp6_FromTF.setVisible(true);
                workExp6_ToTF.setVisible(true);
                workExp6_CompNameTF.setVisible(true);
                workExp6_JobTitleTF.setVisible(true);
                workExp6_CompCountryTF.setVisible(true);

                workExp7_FromTF.setVisible(true);
                workExp7_ToTF.setVisible(true);
                workExp7_CompNameTF.setVisible(true);
                workExp7_JobTitleTF.setVisible(true);
                workExp7_CompCountryTF.setVisible(true);
                break;

            case 8:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);

                workExp6_FromTF.setVisible(true);
                workExp6_ToTF.setVisible(true);
                workExp6_CompNameTF.setVisible(true);
                workExp6_JobTitleTF.setVisible(true);
                workExp6_CompCountryTF.setVisible(true);

                workExp7_FromTF.setVisible(true);
                workExp7_ToTF.setVisible(true);
                workExp7_CompNameTF.setVisible(true);
                workExp7_JobTitleTF.setVisible(true);
                workExp7_CompCountryTF.setVisible(true);

                workExp8_FromTF.setVisible(true);
                workExp8_ToTF.setVisible(true);
                workExp8_CompNameTF.setVisible(true);
                workExp8_JobTitleTF.setVisible(true);
                workExp8_CompCountryTF.setVisible(true);
                break;

            case 9:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);

                workExp6_FromTF.setVisible(true);
                workExp6_ToTF.setVisible(true);
                workExp6_CompNameTF.setVisible(true);
                workExp6_JobTitleTF.setVisible(true);
                workExp6_CompCountryTF.setVisible(true);

                workExp7_FromTF.setVisible(true);
                workExp7_ToTF.setVisible(true);
                workExp7_CompNameTF.setVisible(true);
                workExp7_JobTitleTF.setVisible(true);
                workExp7_CompCountryTF.setVisible(true);

                workExp8_FromTF.setVisible(true);
                workExp8_ToTF.setVisible(true);
                workExp8_CompNameTF.setVisible(true);
                workExp8_JobTitleTF.setVisible(true);
                workExp8_CompCountryTF.setVisible(true);

                workExp9_FromTF.setVisible(true);
                workExp9_ToTF.setVisible(true);
                workExp9_CompNameTF.setVisible(true);
                workExp9_JobTitleTF.setVisible(true);
                workExp9_CompCountryTF.setVisible(true);
                break;

            case 10:
                workAllFieldsDisable();
                workExpGridPane.setVisible(true);
                workExp1_FromTF.setVisible(true);
                workExp1_ToTF.setVisible(true);
                workExp1_CompNameTF.setVisible(true);
                workExp1_JobTitleTF.setVisible(true);
                workExp1_CompCountryTF.setVisible(true);

                workExp2_FromTF.setVisible(true);
                workExp2_ToTF.setVisible(true);
                workExp2_CompNameTF.setVisible(true);
                workExp2_JobTitleTF.setVisible(true);
                workExp2_CompCountryTF.setVisible(true);

                workExp3_FromTF.setVisible(true);
                workExp3_ToTF.setVisible(true);
                workExp3_CompNameTF.setVisible(true);
                workExp3_JobTitleTF.setVisible(true);
                workExp3_CompCountryTF.setVisible(true);

                workExp4_FromTF.setVisible(true);
                workExp4_ToTF.setVisible(true);
                workExp4_CompNameTF.setVisible(true);
                workExp4_JobTitleTF.setVisible(true);
                workExp4_CompCountryTF.setVisible(true);

                workExp5_FromTF.setVisible(true);
                workExp5_ToTF.setVisible(true);
                workExp5_CompNameTF.setVisible(true);
                workExp5_JobTitleTF.setVisible(true);
                workExp5_CompCountryTF.setVisible(true);

                workExp6_FromTF.setVisible(true);
                workExp6_ToTF.setVisible(true);
                workExp6_CompNameTF.setVisible(true);
                workExp6_JobTitleTF.setVisible(true);
                workExp6_CompCountryTF.setVisible(true);

                workExp7_FromTF.setVisible(true);
                workExp7_ToTF.setVisible(true);
                workExp7_CompNameTF.setVisible(true);
                workExp7_JobTitleTF.setVisible(true);
                workExp7_CompCountryTF.setVisible(true);

                workExp8_FromTF.setVisible(true);
                workExp8_ToTF.setVisible(true);
                workExp8_CompNameTF.setVisible(true);
                workExp8_JobTitleTF.setVisible(true);
                workExp8_CompCountryTF.setVisible(true);

                workExp9_FromTF.setVisible(true);
                workExp9_ToTF.setVisible(true);
                workExp9_CompNameTF.setVisible(true);
                workExp9_JobTitleTF.setVisible(true);
                workExp9_CompCountryTF.setVisible(true);

                workExp10_FromTF.setVisible(true);
                workExp10_ToTF.setVisible(true);
                workExp10_CompNameTF.setVisible(true);
                workExp10_JobTitleTF.setVisible(true);
                workExp10_CompCountryTF.setVisible(true);
                break;

        }
    }

    @FXML
    private void stayInQCYesHandler() {
        stayQC_fromDP.setDisable(false);
        stayQC_toDP.setDisable(false);
    }

    @FXML
    private void stayInQCNoHandler() {
        stayQC_fromDP.setDisable(true);
        stayQC_toDP.setDisable(true);
    }

    @FXML
    private void jobOffferNoHandler() {
        empNameJobOfferL.setDisable(true);
        empAddressJobOfferL.setDisable(true);
        empNameJobOfferTF.setDisable(true);
        empAddressJobOfferTF.setDisable(true);
        empNameJobOfferTF.clear();
        empAddressJobOfferTF.clear();
    }

    @FXML
    private void jobOffferYesHandler() {
        empNameJobOfferL.setDisable(false);
        empAddressJobOfferL.setDisable(false);
        empNameJobOfferTF.setDisable(false);
        empAddressJobOfferTF.setDisable(false);
    }

    private ObservableList<String> populateCBfromDB(String query, String field_name) {

        ObservableList<String> data = FXCollections.observableArrayList();

        ResultSet aotData = ConnectJavaOracle.retreivefromDB(query);
        try {
            while (aotData.next()) {
                data.addAll(aotData.getString(field_name));
            }
        } catch (SQLException ex) {
            System.out.println("combobox population error");
            ex.printStackTrace(System.out);
        }

        return data;
    }

    private int getRadiobuttonValue(RadioButton rb1, RadioButton rb2) {
        if (rb1.isSelected()) {
            return 1;
        }
        if (rb2.isSelected()) {
            return 0;
        } else {
            return -1;
        }

    }

    private void setRadiobuttonSelected(int res, RadioButton rb1, RadioButton rb2) {

        if (res == 1) {
            JOptionPane.showMessageDialog(null, "I'm where 1");
            rb1.setSelected(true);
            rb2.setSelected(false);
        }
        if (res == 0) {
            JOptionPane.showMessageDialog(null, "I'm where 0");
            rb1.setSelected(false);
            rb2.setSelected(true);
        }
    }

    @FXML
    private void updateRecordHandler() {
        SetEditable(true);
        applicantNumberTF.setDisable(true);
        saveB.setDisable(false);
        saveB.setText("Update");
        searchMB.setDisable(true);
    }

    @FXML
    private void deleteRecordHandler() {
        int response = JOptionPane.showConfirmDialog(null, "Applicant will be removed from the database FOREVER. Are you sure you want to do this?", "Remove Applicant",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            String str = applicantNumberTF.getText();
            ConnectJavaOracle.insertUpdateDB("delete from applicant_family where fam_appl_number='" + str + "'", false);
            ConnectJavaOracle.insertUpdateDB("delete from applicant_education where edu_appl_number='" + str + "'", false);
            ConnectJavaOracle.insertUpdateDB("delete from applicant_employment where emp_appl_number='" + str + "'", false);
            ConnectJavaOracle.insertUpdateDB("delete from applicant_info where appl_number='" + str + "'", false);
            clearAllFields();
        }
    }

    @FXML
    private void saveButtonHandler() {

        if (fnameTF.getText().isEmpty() || lnameTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First and Last Names are empty!");
        } else {
            String query1 = "", query2 = "", query3 = "", query4 = "";

            if (saveB.getText().equals("Save")) {
                generateApplId();
                calculateScore();

                query1 = "INSERT INTO applicant_info values ('" + applicantNumberTF.getText() + "','" + fnameTF.getText() + "', '" + lnameTF.getText() + "', " + getRadiobuttonValue(sex_mRB, sex_fRB) + ",'" + marital_statusCB.getValue() + "','"
                        + passportTF.getText() + "', to_date('" + dobDP.getValue() + "','yyyy/mm/dd'),'" + citybirthTF.getText() + "','" + provincebirthTF.getText() + "', '" + countrybirthTF.getText()
                        + "', to_date('" + dateDocsRecDP.getValue() + "','yyyy/mm/dd'),'" + address_bldTF.getText() + "', '" + address_streetTF.getText() + "', '" + address_appTF.getText()
                        + "', '" + address_cityTF.getText() + "', '" + address_prvTF.getText() + "', '" + address_countryTF.getText() + "', '" + address_zipTF.getText() + "', '" + address_phoneTF.getText()
                        + "', '" + emp_statusCB.getValue() + "','" + intended_cityCB.getValue() + "','" + intendedProf_TF.getText() + "'," + getRadiobuttonValue(stayQC_yesRB, stayQC_noRB)
                        + ",to_date(NVL('" + stayQC_fromDP.getValue() + "','01/01/1900'),'yyyy/mm/dd'),to_date(NVL('"
                        + stayQC_toDP.getValue() + "','01/01/1900'),'yyyy/mm/dd')," + getRadiobuttonValue(familyQC_yesRB, familyQC_noRB) + "," + getRadiobuttonValue(jobOffer_yesRB, jobOffer_noRB) + ",'"
                        + empNameJobOfferTF.getText() + "','" + empAddressJobOfferTF.getText() + "','" + educationLevel_CB.getValue()
                        + "','" + whereDiplomaObtained_CB.getValue() + "','" + areaOfTrainingCB.getValue() + "',to_date(NVL('" + dateDiplomaObtDP.getValue() + "','01/01/1900'),'yyyy/mm/dd'),'"
                        + en_listen_CB.getValue() + "','" + en_speak_CB.getValue() + "','" + en_read_CB.getValue() + "','" + en_write_CB.getValue() + "','"
                        + fr_listen_CB.getValue() + "','" + fr_speak_CB.getValue() + "','" + fr_read_CB.getValue() + "','" + fr_write_CB.getValue() + "'," + scoreL.getText() + ")";
            } else {
                query1 = "update applicant_info set appl_fname='" + fnameTF.getText() + "', appl_lname='" + lnameTF.getText() + "', appl_sex=" + getRadiobuttonValue(sex_mRB, sex_fRB) + ", appl_marital_status='" + marital_statusCB.getValue() + "',appl_passport='"
                        + passportTF.getText() + "',appl_dob= to_date('" + dobDP.getValue() + "','yyyy/mm/dd'), appl_city_birth='" + citybirthTF.getText() + "', appl_prov_birth='" + provincebirthTF.getText() + "', appl_country_birth='" + countrybirthTF.getText()
                        + "', appl_docs_received=to_date('" + dateDocsRecDP.getValue() + "','yyyy/mm/dd'),appl_address_bldn='" + address_bldTF.getText() + "', appl_address_street='" + address_streetTF.getText() + "', appl_address_appt='" + address_appTF.getText()
                        + "',appl_address_city= '" + address_cityTF.getText() + "', appl_address_prov='" + address_prvTF.getText() + "',appl_address_country= '" + address_countryTF.getText() + "', appl_address_zip='" + address_zipTF.getText() + "',appl_address_phone= '" + address_phoneTF.getText()
                        + "', appl_emp_status='" + emp_statusCB.getValue() + "', appl_intended_city='" + intended_cityCB.getValue() + "', appl_intended_prof='" + intendedProf_TF.getText() + "',appl_stay_qc=" + getRadiobuttonValue(stayQC_yesRB, stayQC_noRB)
                        + ",appl_stay_qc_from=to_date(NVL('" + stayQC_fromDP.getValue() + "','01/01/1900'),'yyyy/mm/dd'),appl_stay_qc_to=to_date(NVL('"
                        + stayQC_toDP.getValue() + "','01/01/1900'),'yyyy/mm/dd'), appl_family_qc=" + getRadiobuttonValue(familyQC_yesRB, familyQC_noRB) + ", appl_has_joboffer=" + getRadiobuttonValue(jobOffer_yesRB, jobOffer_noRB) + ",appl_joboffer_name='"
                        + empNameJobOfferTF.getText() + "',appl_joboffer_address='" + empAddressJobOfferTF.getText() + "',appl_educ_level='" + educationLevel_CB.getValue()
                        + "',appl_country_diploma='" + whereDiplomaObtained_CB.getValue() + "',appl_area_training='" + areaOfTrainingCB.getValue() + "',appl_date_diploma=to_date(NVL('" + dateDiplomaObtDP.getValue() + "','01/01/1900'),'yyyy/mm/dd'),appl_lang_en_listen='"
                        + en_listen_CB.getValue() + "',appl_lang_en_speak='" + en_speak_CB.getValue() + "',appl_lang_en_read='" + en_read_CB.getValue() + "',appl_lang_en_write='" + en_write_CB.getValue() + "',appl_lang_fr_listen='"
                        + fr_listen_CB.getValue() + "',appl_lang_fr_speak='" + fr_speak_CB.getValue() + "',appl_lang_fr_read='" + fr_read_CB.getValue() + "',appl_lang_fr_write='" + fr_write_CB.getValue() + "', appl_score=" + scoreL.getText() + " where appl_number='" + applicantNumberTF.getText() + "'";

            }
            ConnectJavaOracle.insertUpdateDB(query1, true);
            ConnectJavaOracle.insertUpdateDB("delete from applicant_education where edu_appl_number='" + applicantNumberTF.getText() + "'", false);
            for (Education el : edu_field_array) {
                if (el.getTEXTEdu_from_DP() != null) {
                    query2 = "INSERT INTO applicant_education values(" + el.toQuery() + "')";
                    ConnectJavaOracle.insertUpdateDB(query2, false);
                }
            }

            ConnectJavaOracle.insertUpdateDB("delete from applicant_family where fam_appl_number='" + applicantNumberTF.getText() + "'", false);

            for (Family el : family_field_array) {
                if (el.getTEXTFam_lnameTF().length() != 0) {
                    query3 = "INSERT INTO applicant_family values (" + el.toQuery() + "')";
                    ConnectJavaOracle.insertUpdateDB(query3, false);
                }
            }

            ConnectJavaOracle.insertUpdateDB("delete from applicant_employment where emp_appl_number='" + applicantNumberTF.getText() + "'", false);

            for (Work el : work_field_array) {
                if (el.getTEXTWork_from_DP() != null) {
                    query4 = "INSERT INTO applicant_employment values (" + el.toQuery() + "')";
                    ConnectJavaOracle.insertUpdateDB(query4, false);

                }
            }
        }

        saveB.setText("Save");
        saveB.setDisable(true);
        searchMB.setDisable(false);
        SetEditable(false);

    }

    private void calculateScore() {
        int edu_level_score = Integer.parseInt(educationLevel_CB.getValue().toString().charAt(0) + "");
        int area_of_training_score = Integer.parseInt(areaOfTrainingCB.getValue().toString().substring(0, areaOfTrainingCB.getValue().toString().indexOf(" ")));
        LocalDate min_work_date = dateDocsRecDP.getValue(); //***** change to LocalDate.now() in final version

        for (Work el : work_field_array) {
            if (el.getTEXTWork_from_DP() != null) {
                if (el.getTEXTWork_from_DP().isBefore(min_work_date)) {
                    min_work_date = el.getTEXTWork_from_DP();
                }
            }
        }

        int years_work_experience = (int) MONTHS.between(dateDocsRecDP.getValue(), min_work_date);
        int work_exp_score = 0;
        if (years_work_experience >= 6 && years_work_experience < 24) {
            work_exp_score = 4;
        } else if (years_work_experience >= 24 && years_work_experience < 48) {
            work_exp_score = 6;
        } else if (years_work_experience >= 48) {
            work_exp_score = 8;
        }

        int age_score = (int) YEARS.between(dobDP.getValue(), dateDocsRecDP.getValue());

        int fr_listen = Integer.parseInt(fr_listen_CB.getValue().toString().charAt(0) + "");
        int fr_speak = Integer.parseInt(fr_speak_CB.getValue().toString().charAt(0) + "");
        int fr_read = Integer.parseInt(fr_read_CB.getValue().toString().charAt(0) + "");
        int fr_write = Integer.parseInt(fr_write_CB.getValue().toString().charAt(0) + "");

        int en_listen = Integer.parseInt(en_listen_CB.getValue().toString().charAt(0) + "");
        int en_speak = Integer.parseInt(en_speak_CB.getValue().toString().charAt(0) + "");
        int en_read = Integer.parseInt(en_read_CB.getValue().toString().charAt(0) + "");
        int en_write = Integer.parseInt(en_write_CB.getValue().toString().charAt(0) + "");

        int lang_score = en_listen + en_speak + en_read + en_write + fr_listen + fr_speak + fr_read + fr_write;
        int stay_QC_score;
        if (stayQC_yesRB.isSelected()) {
            int stay_QC_month = (int) MONTHS.between(stayQC_fromDP.getValue(), stayQC_toDP.getValue());

            if (stay_QC_month < 3) {
                stay_QC_score = 1;
            } else if (stay_QC_month >= 3 && stay_QC_month < 6) {
                stay_QC_score = 2;
            } else {
                stay_QC_score = 5;
            }

        } else {
            stay_QC_score = 0;
        }
        int fam_qc_score = getRadiobuttonValue(familyQC_yesRB, familyQC_noRB);
        int children_score = 0;
        for (Family el : family_field_array) {

            if (!el.getTEXTFam_lnameTF().equals("")) {
                if (el.getFam_relationCB().getValue().equals("daughter") || el.getFam_relationCB().getValue().equals("son")) {
                    int ch_age = (int) YEARS.between(el.getTEXTFam_dob_DP(), dateDocsRecDP.getValue());
                    // System.out.println("age: "+ch_age);
                    if (ch_age < 12) {
                        children_score = children_score + 4;
                    } else if (ch_age >= 12 && ch_age < 18) {
                        children_score = children_score + 2;
                    }
                }
            }
        }

        scoreL.setText(edu_level_score + area_of_training_score + work_exp_score + age_score + lang_score + stay_QC_score + fam_qc_score + children_score + "");
    }

    private void generateApplId() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        applicantNumberTF.setText(fnameTF.getText().substring(0, 1) + lnameTF.getText().substring(0, 1) + dobDP.getValue().format(formatter) + randomSeed.nextInt(999));

    }

    private void populateTabsAfterSearch(ResultSet searchResultAppl, ResultSet searchResultFam, ResultSet searchResultEdu, ResultSet searchResultEmp) {
        try {

            while (searchResultAppl.next()) {
                applicantNumberTF.setText(searchResultAppl.getString("appl_number"));
                applicantNumberTF.setEditable(false);// should be implemented in separate method for all controls
                fnameTF.setText(searchResultAppl.getString("appl_fname"));
                lnameTF.setText(searchResultAppl.getString("appl_lname"));
                if (searchResultAppl.getInt("appl_sex") == 1) {
                    sexTG.selectToggle(sex_mRB);
                } else {
                    sexTG.selectToggle(sex_fRB);
                }
                marital_statusCB.setValue(searchResultAppl.getString("appl_marital_status"));

                passportTF.setText(searchResultAppl.getString("appl_passport"));
                dobDP.setValue(LocalDate.parse(searchResultAppl.getString("appl_dob").substring(0, 10)));
                citybirthTF.setText(searchResultAppl.getString("appl_city_birth"));
                provincebirthTF.setText(searchResultAppl.getString("appl_prov_birth"));
                countrybirthTF.setText(searchResultAppl.getString("appl_country_birth"));
                dateDocsRecDP.setValue(LocalDate.parse(searchResultAppl.getString("appl_docs_received").substring(0, 10)));
                address_bldTF.setText(searchResultAppl.getString("appl_address_bldn"));
                address_streetTF.setText(searchResultAppl.getString("appl_address_street"));
                address_appTF.setText(searchResultAppl.getString("appl_address_appt"));
                address_cityTF.setText(searchResultAppl.getString("appl_address_city"));
                address_prvTF.setText(searchResultAppl.getString("appl_address_prov"));
                address_countryTF.setText(searchResultAppl.getString("appl_address_country"));
                address_zipTF.setText(searchResultAppl.getString("appl_address_zip"));
                address_phoneTF.setText(searchResultAppl.getString("appl_address_phone"));
                emp_statusCB.setValue(searchResultAppl.getString("appl_emp_status"));
                intended_cityCB.setValue(searchResultAppl.getString("appl_intended_city"));
                intendedProf_TF.setText(searchResultAppl.getString("appl_intended_prof"));
                if (searchResultAppl.getInt("appl_stay_qc") == 1) {
                    stayTG.selectToggle(stayQC_yesRB);
                    stayInQCYesHandler();
                } else {
                    stayTG.selectToggle(stayQC_noRB);
                    stayInQCNoHandler();
                }
                stayQC_fromDP.setValue(LocalDate.parse(searchResultAppl.getString("appl_stay_qc_from").substring(0, 10)));
                stayQC_toDP.setValue(LocalDate.parse(searchResultAppl.getString("appl_stay_qc_from").substring(0, 10)));
                if (searchResultAppl.getInt("appl_family_qc") == 1) {
                    familyQC_yesRB.setSelected(true);
                    familyQC_noRB.setSelected(false);
                } else {
                    familyQC_yesRB.setSelected(false);
                    familyQC_noRB.setSelected(true);
                }

                if (searchResultAppl.getInt("appl_has_joboffer") == 1) {
                    jobOfferTG.selectToggle(jobOffer_yesRB);
                    jobOffferYesHandler();
                } else {
                    jobOfferTG.selectToggle(jobOffer_noRB);
                    jobOffferNoHandler();
                }

                empNameJobOfferTF.setText(searchResultAppl.getString("appl_joboffer_name"));
                empAddressJobOfferTF.setText(searchResultAppl.getString("appl_joboffer_address"));
                educationLevel_CB.setValue(searchResultAppl.getString("appl_educ_level"));
                whereDiplomaObtained_CB.setValue(searchResultAppl.getString("appl_country_diploma"));
                areaOfTrainingCB.setValue(searchResultAppl.getString("appl_area_training"));
                dateDiplomaObtDP.setValue(LocalDate.parse(searchResultAppl.getString("appl_date_diploma").substring(0, 10)));
                en_speak_CB.setValue(searchResultAppl.getString("appl_lang_en_listen"));
                en_read_CB.setValue(searchResultAppl.getString("appl_lang_en_speak"));
                en_write_CB.setValue(searchResultAppl.getString("appl_lang_en_read"));
                en_listen_CB.setValue(searchResultAppl.getString("appl_lang_en_write"));

                fr_speak_CB.setValue(searchResultAppl.getString("appl_lang_fr_listen"));
                fr_read_CB.setValue(searchResultAppl.getString("appl_lang_fr_speak"));
                fr_write_CB.setValue(searchResultAppl.getString("appl_lang_fr_read"));
                fr_listen_CB.setValue(searchResultAppl.getString("appl_lang_fr_write"));
                scoreL.setText(searchResultAppl.getInt("appl_score") + "");

            }

            List<Education> eduList = new ArrayList<>();

            while (searchResultEdu.next()) {

                String from = searchResultEdu.getString("edu_from");
                String to = searchResultEdu.getString("edu_to");
                String name = searchResultEdu.getString("edu_name");
                String diploma = searchResultEdu.getString("edu_diploma");
                String spec = searchResultEdu.getString("edu_specialization");
                String app_no = searchResultEdu.getString("edu_appl_number");
                Education el = new Education(from, to, name, diploma, spec, app_no);
                eduList.add(el);

            }

            numberOfEducInstitCB.setValue(eduList.size() + "");
            for (int i = 0; i < eduList.size(); i++) {
                edu_field_array.get(i).setFieldsVisible();
                edu_field_array.get(i).setEdu_from_DP(eduList.get(i).getEdu_from());
                edu_field_array.get(i).setEdu_to_DP(eduList.get(i).getEdu_to());
                edu_field_array.get(i).setEdu_nameTF(eduList.get(i).getEdu_name());
                edu_field_array.get(i).setEdu_diplomaTF(eduList.get(i).getEdu_diploma());
                edu_field_array.get(i).setEdu_specTF(eduList.get(i).getEdu_spec());

            }

            List<Family> famList = new ArrayList<>();

            while (searchResultFam.next()) {

                String fam_lname = searchResultFam.getString("fam_lname");
                String fam_fname = searchResultFam.getString("fam_fname");
                String fam_relation = searchResultFam.getString("fam_relation");
                String fam_dob = searchResultFam.getString("fam_dob");
                String fam_birth_place = searchResultFam.getString("fam_birth_place");
                String fam_accompany = searchResultFam.getString("fam_accompany");
                String fam_appl_number = searchResultFam.getString("fam_appl_number");
                Family el = new Family(fam_lname, fam_fname, fam_relation, fam_dob, fam_birth_place, fam_accompany, fam_appl_number);
                famList.add(el);

            }
            //System.out.println(Arrays.toString(famList.toArray()));
            familyMemNo_CB.setValue(famList.size() + "");
            for (int i = 0; i < famList.size(); i++) {
                family_field_array.get(i).setFieldsVisible();
                family_field_array.get(i).setFam_lnameTF(famList.get(i).getFam_lname());
                family_field_array.get(i).setFam_fnameTF(famList.get(i).getFam_fname());
                family_field_array.get(i).setFam_relationCB(famList.get(i).getFam_relation());
                family_field_array.get(i).setFam_place_birthTF(famList.get(i).getFam_place_birth());
                family_field_array.get(i).setFam_dob_DP(famList.get(i).getFam_dob());
                family_field_array.get(i).setFam_accompCB(famList.get(i).getFam_accomp());
            }

            List<Work> empList = new ArrayList<>();

            while (searchResultEmp.next()) {

                String emp_from = searchResultEmp.getString("emp_from");
                String emp_to = searchResultEmp.getString("emp_to");
                String emp_company_name = searchResultEmp.getString("emp_company_name");
                String emp_title = searchResultEmp.getString("emp_title");
                String emp_country = searchResultEmp.getString("emp_country");
                String emp_appl_number = searchResultEmp.getString("emp_appl_number");
                Work el = new Work(emp_from, emp_to, emp_company_name, emp_title, emp_country, emp_appl_number);
                empList.add(el);

            }
            emplNumLinesCB.setValue(empList.size() + "");
            for (int i = 0; i < empList.size(); i++) {
                work_field_array.get(i).setFieldsVisible();
                work_field_array.get(i).setWork_from_DP(empList.get(i).getEmp_from());
                work_field_array.get(i).setWork_to_DP(empList.get(i).getEmp_to());
                work_field_array.get(i).setWork_nameTF(empList.get(i).getEmp_name());
                work_field_array.get(i).setWork_titleTF(empList.get(i).getEmp_title());
                work_field_array.get(i).setWork_countryTF(empList.get(i).getEmp_country());

            }

        } catch (SQLException ex) {
            System.out.println("find.error\n");
            ex.printStackTrace(System.out);
        }

    }

    @FXML
    public void findButtonHandler() throws SQLException {
        HideShowFields(false);
        String searchApplicantQuery;
        String searchApplicantEducationQuery;
        String searchApplicantEmploymentQuery;
        String searchApplicantFamilyQuery;

        if (!applicantNumberTF.getText().isEmpty()) {

            searchApplicantQuery = "select * from applicant_info where appl_number='" + applicantNumberTF.getText()
                    + "'";
            searchApplicantEducationQuery = "select * from applicant_education where edu_appl_number='" + applicantNumberTF.getText()
                    + "'";
            searchApplicantEmploymentQuery = "select * from applicant_employment where emp_appl_number='" + applicantNumberTF.getText()
                    + "'";
            searchApplicantFamilyQuery = "select * from applicant_family where fam_appl_number='" + applicantNumberTF.getText()
                    + "'";
        } else if (!fnameTF.getText().isEmpty()) {
            searchApplicantQuery = "select * from applicant_info where appl_fname='" + fnameTF.getText()
                    + "' and appl_lname='" + lnameTF.getText() + "' and appl_dob=to_date('" + dobDP.getValue() + "','yyyy/mm/dd')";
            searchApplicantEducationQuery = "select * from applicant_education where edu_appl_number=(select appl_number from applicant_info where appl_fname='" + fnameTF.getText()
                    + "' and appl_lname='" + lnameTF.getText() + "' and appl_dob=to_date('" + dobDP.getValue() + "','yyyy/mm/dd'))";
            searchApplicantEmploymentQuery = "select * from applicant_employment where emp_appl_number=(select appl_number from applicant_info where appl_fname='" + fnameTF.getText()
                    + "' and appl_lname='" + lnameTF.getText() + "' and appl_dob=to_date('" + dobDP.getValue() + "','yyyy/mm/dd'))";
            searchApplicantFamilyQuery = "select * from applicant_family where fam_appl_number=(select appl_number from applicant_info where appl_fname='" + fnameTF.getText()
                    + "' and appl_lname='" + lnameTF.getText() + "' and appl_dob=to_date('" + dobDP.getValue() + "','yyyy/mm/dd'))";
        } else {
            searchApplicantQuery = "select * from applicant_info where appl_passport='" + passportTF.getText()
                    + "'";
            searchApplicantEducationQuery = "select * from applicant_education where edu_appl_number=(select appl_number from applicant_info where appl_passport='" + passportTF.getText() + "')";
            searchApplicantEmploymentQuery = "select * from applicant_employment where emp_appl_number=(select appl_number from applicant_info where appl_passport='" + passportTF.getText() + "')";
            searchApplicantFamilyQuery = "select * from applicant_family where fam_appl_number=(select appl_number from applicant_info where appl_passport='" + passportTF.getText() + "')";

        }

        ResultSet searchResultAppl = ConnectJavaOracle.retreivefromDB(searchApplicantQuery);
        clearAllFields();

        searchResultAppl.last();
        int resultLength = searchResultAppl.getRow();
        searchResultAppl.beforeFirst();
        System.out.println("length= " + resultLength);
        if (resultLength == 0) {
            JOptionPane.showMessageDialog(null, "Applicant not found!");
            applicantNumberTF.setStyle(null);
            fnameTF.setStyle(null);
            lnameTF.setStyle(null);
            dobDP.setStyle(null);
            passportTF.setStyle(null);
        } else if (resultLength > 1) {
            JOptionPane.showMessageDialog(null, "Search returned more than one applicant. Try another criteria!");
            applicantNumberTF.setStyle(null);
            fnameTF.setStyle(null);
            lnameTF.setStyle(null);
            dobDP.setStyle(null);
            passportTF.setStyle(null);

        } else {
            ResultSet searchResultEdu = ConnectJavaOracle.retreivefromDB(searchApplicantEducationQuery);
            ResultSet searchResultEmp = ConnectJavaOracle.retreivefromDB(searchApplicantEmploymentQuery);
            ResultSet searchResultFam = ConnectJavaOracle.retreivefromDB(searchApplicantFamilyQuery);
            populateTabsAfterSearch(searchResultAppl, searchResultFam, searchResultEdu, searchResultEmp);
            SetEditable(false);
            saveB.setDisable(true);
            applicantNumberTF.setStyle(null);
            fnameTF.setStyle(null);
            lnameTF.setStyle(null);
            dobDP.setStyle(null);
            passportTF.setStyle(null);
        }

    }

    private void clearAllFields() {
        scoreL.setText("");

        for (Node el : tabMainAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).clear();
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setValue(null);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setValue(null);
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setSelected(false);
            }
        }

        for (Node el : familyAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).clear();
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setValue(null);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setValue("0");
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setSelected(false);
            }
        }

        for (Node gridEl : familyMembGridPane.getChildren()) {
            if (gridEl instanceof TextField) {
                ((TextField) gridEl).clear();
            } else if (gridEl instanceof DatePicker) {
                ((DatePicker) gridEl).setValue(null);
            } else if (gridEl instanceof ComboBox) {
                ((ComboBox) gridEl).setValue(null);
            }
        }
        familyMembersAllDisableHandler();

        for (Node el : educationAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).clear();
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setValue(null);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setValue("0");
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setSelected(false);
            }
        }

        for (Node gridEl : educationGridPane.getChildren()) {
            if (gridEl instanceof TextField) {
                ((TextField) gridEl).clear();
            } else if (gridEl instanceof DatePicker) {
                ((DatePicker) gridEl).setValue(null);
            } else if (gridEl instanceof ComboBox) {
                ((ComboBox) gridEl).setValue(null);
            }
        }
        educationAllFieldsDisable();

        for (Node el : employmentAnchorPane.getChildren()) {
            if (el instanceof TextField) {
                ((TextField) el).clear();
            } else if (el instanceof DatePicker) {
                ((DatePicker) el).setValue(null);
            } else if (el instanceof ComboBox) {
                ((ComboBox) el).setValue("0");
            } else if (el instanceof RadioButton) {
                ((RadioButton) el).setSelected(false);
            }
        }

        for (Node gridEl : workExpGridPane.getChildren()) {
            if (gridEl instanceof TextField) {
                ((TextField) gridEl).clear();
            } else if (gridEl instanceof DatePicker) {
                ((DatePicker) gridEl).setValue(null);
            } else if (gridEl instanceof ComboBox) {
                ((ComboBox) gridEl).setValue(null);
            }
        }
        workAllFieldsDisable();

        for (Node el : languageAnchorPane.getChildren()) {
            if (el instanceof ComboBox) {
                ((ComboBox) el).setValue(null);
            }

        }
    }

    @FXML
    public void printJob() {
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            job.showPrintDialog(rootPane.getScene().getWindow()); // Window must be your main Stage
            job.printPage(tabMainAnchorPane);
            job.endJob();
        }
    }

    @FXML
    public void aboutWindow() {
        String str = "iMigrate\n©2017 Volodymyr Yesin\n ver. 1.0";
        JOptionPane.showMessageDialog(null, str);
    }

}
