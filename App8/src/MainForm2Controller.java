import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainForm2Controller {
    public TextField txtInputLanguages;
    public ListView<String> lstLanguages;

    public void addDataOnAction(ActionEvent actionEvent) {
        String value = txtInputLanguages.getText();
        if (isExists(value)) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Alerady exists");
            alert.show();
            return;
        }
        lstLanguages.getItems().add(txtInputLanguages.getText());
        //txtInputLanguages.setText("");
        txtInputLanguages.clear(); // new java fx code
    }

    private boolean isExists(String value) {
        for (String tempData : lstLanguages.getItems()) {
            if (tempData.equalsIgnoreCase(value)) return true;
        }
        return false;
    }
}
