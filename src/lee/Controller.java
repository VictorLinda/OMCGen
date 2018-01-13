package lee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class Controller {
    private ObservableList<String> bbPortsList = FXCollections.observableArrayList("-","A","B","C","D","E","F");
    private ObservableList<String> rruTypeList = FXCollections.observableArrayList("-","4415","2217","2219");
    private ObservableList<String> rruSectorList = FXCollections.observableArrayList("-","Sector 1","Sector 2","Sector 3","Sector 4");

    @FXML
    ChoiceBox<String> chBxRru1Data1, chBxRru1Data2, chBxRru2Data1, chBxRru2Data2, chBxRru3Data1, chBxRru3Data2, chBxRru4Data1, chBxRru4Data2;

    @FXML
    ChoiceBox<String> chBxRru1Type, chBxRru2Type, chBxRru3Type, chBxRru4Type;

    @FXML
    ChoiceBox<String> chBxRru1RfAB, chBxRru1RfCD, chBxRru2RfAB, chBxRru2RfCD, chBxRru3RfAB, chBxRru3RfCD, chBxRru4RfAB, chBxRru4RfCD;

    @FXML
    private void initialize(){
        chBxRru1Data1.setItems(bbPortsList);
        chBxRru1Data2.setItems(bbPortsList);
        chBxRru2Data1.setItems(bbPortsList);
        chBxRru2Data2.setItems(bbPortsList);
        chBxRru3Data1.setItems(bbPortsList);
        chBxRru3Data2.setItems(bbPortsList);
        chBxRru4Data1.setItems(bbPortsList);
        chBxRru4Data2.setItems(bbPortsList);

        chBxRru1Data1.setValue("A");
        chBxRru1Data2.setValue("-");
        chBxRru2Data1.setValue("B");
        chBxRru2Data2.setValue("-");
        chBxRru3Data1.setValue("C");
        chBxRru3Data2.setValue("-");
        chBxRru4Data1.setValue("-");
        chBxRru4Data2.setValue("-");

        chBxRru1Type.setItems(rruTypeList);
        chBxRru2Type.setItems(rruTypeList);
        chBxRru3Type.setItems(rruTypeList);
        chBxRru4Type.setItems(rruTypeList);

        chBxRru1Type.setValue("4415");
        chBxRru2Type.setValue("4415");
        chBxRru3Type.setValue("4415");
        chBxRru4Type.setValue("-");

        chBxRru1RfAB.setItems(rruSectorList);
        chBxRru1RfCD.setItems(rruSectorList);
        chBxRru2RfAB.setItems(rruSectorList);
        chBxRru2RfCD.setItems(rruSectorList);
        chBxRru3RfAB.setItems(rruSectorList);
        chBxRru3RfCD.setItems(rruSectorList);
        chBxRru4RfAB.setItems(rruSectorList);
        chBxRru4RfCD.setItems(rruSectorList);

        chBxRru1RfAB.setValue("Sector 1");
        chBxRru1RfCD.setValue("Sector 1");
        chBxRru2RfAB.setValue("Sector 2");
        chBxRru2RfCD.setValue("Sector 2");
        chBxRru3RfAB.setValue("Sector 3");
        chBxRru3RfCD.setValue("Sector 3");
        chBxRru4RfAB.setValue("-");
        chBxRru4RfCD.setValue("-");

    }


}
