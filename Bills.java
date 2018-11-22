package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Bills {


    public void log(ActionEvent event) throws IOException {{
        Parent home_parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene home_scen = new Scene(home_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_scen);
        app_stage.show();}

    }
}
