package sample.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-11 9:16
 */
public class AppUI implements Initializable {
    public Label text;
    private final AppModel model = new AppModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text.textProperty().bindBidirectional(model.textProperty());
        model.setText("Hello JavaFX.");
    }

    public void click(ActionEvent event) {
        String[] lArr = new String[] {"A", "B", "C", "D"};
        model.setText(lArr[new Random().nextInt(lArr.length)]);
    }

    public static Parent load() throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(AppUI.class.getResource(AppUI.class.getSimpleName() + ".fxml")));
    }
}
