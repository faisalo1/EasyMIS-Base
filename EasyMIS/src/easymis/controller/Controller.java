package easymis.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btnEventbooking;
    @FXML
    private Button btnExpenses;
    @FXML
    private Button btnReports;
    @FXML
    private Button btnEmployee;
    @FXML
    private Button btnInventory;
    @FXML
    private Button btnAdminsettings;
    @FXML
      
        private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btnEventbooking) {
            loadStage("/easymis/view/eventbooking.fxml");
                   
        } else if (mouseEvent.getSource() == btnExpenses) {
            loadStage("/easymis/view/expenses.fxml");
        } else if (mouseEvent.getSource() == btnReports) {
            loadStage("/easymis/view/reports.fxml");
                  }
        else if (mouseEvent.getSource() == btnEmployee) {
            loadStage("/easymis/view/employee.fxml");
                  }
        else if (mouseEvent.getSource() == btnInventory) {
            loadStage("/easymis/view/inventory.fxml");
                  }
        else if (mouseEvent.getSource() == btnAdminsettings) {
            loadStage("/easymis/view/adminsettings.fxml");
                  }
        
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/easymis/view/icons/icon.png"));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
