package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public void Str(ActionEvent actionEvent) {
        System.out.println("test");
    }


    @FXML
    public TextField sear;

    @FXML
    public TableView tableAddressBook;
    @FXML
    public Label labelCount;




    @FXML
    public void ShovEdit(ActionEvent actionEvent){
        Stage primaryStage=new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../FXML/Edit.fxml"));
            primaryStage.setTitle("Редактор заметок");
            primaryStage.setMinHeight(73);
            primaryStage.setMinWidth(343);
            primaryStage.setResizable(false);
            primaryStage.setScene(new Scene(root));
            primaryStage.initModality(Modality.WINDOW_MODAL);
            primaryStage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
