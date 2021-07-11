package sample.app;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-11 9:28
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = AppUI.load();
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
