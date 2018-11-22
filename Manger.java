package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Manger implements Initializable{


    @FXML
    private JFXButton ex;
    @FXML
    private JFXButton in;
    @FXML
    private JFXButton emo;
    @FXML
    AnchorPane container;

    public void exh(ActionEvent event) throws IOException {{
       /* Parent home_parent = FXMLLoader.load(getClass().getResource("Exhibition.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();*/

        try {
            Parent inventory = FXMLLoader.load(getClass().getResource("Exhibition.fxml"));
            container.getChildren().add(inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    public void inv(ActionEvent event) throws IOException {{
        /*Parent home_parent = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();*/
        try {
            Parent inventory = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
            container.getChildren().add(inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
    public void out(ActionEvent event) throws IOException {{
        Parent home_parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();}

    }


    public void empo(ActionEvent event) throws IOException {{
      /*  Parent home_parent = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();*/
        try {
            Parent inventory = FXMLLoader.load(getClass().getResource("Employee.fxml"));
            container.getChildren().add(inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }





    public void Bill(ActionEvent event) throws IOException {{
       /* Parent home_parent = FXMLLoader.load(getClass().getResource("Bills.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();
        */
        }
        try {
            Parent inventory = FXMLLoader.load(getClass().getResource("Bills.fxml"));
            container.getChildren().add(inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
