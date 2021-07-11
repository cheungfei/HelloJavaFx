package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        FlowPane root = new FlowPane();
//
//        root.setHgap(10);
//        root.setVgap(20);
//        root.setPadding(new Insets(15,15,15,15));
//
//        // Button 1
//        Button button1= new Button("Button1");
//        root.getChildren().add(button1);
//
//        // Button 2
//        Button button2 = new Button("Button2");
//        button2.setPrefSize(100, 100);
//        root.getChildren().add(button2);
//
//        // TextField
//        TextField textField = new TextField("Text Field");
//        textField.setPrefWidth(110);
//        root.getChildren().add(textField);
//
//        // CheckBox
//        CheckBox checkBox = new CheckBox("Check Box");
//        root.getChildren().add(checkBox);
//
//        // RadioButton
//        RadioButton radioButton = new RadioButton("Radio Button");
//        root.getChildren().add(radioButton);
//
//        Scene scene = new Scene(root, 550, 250);
//
//        primaryStage.setTitle("FlowPane Layout Demo");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root, 260, 80);
//        stage.setScene(scene);
//
//        Group g = new Group();
//        ProgressBar p2 = new ProgressBar();
//        g.getChildren().add(p2);
//        scene.setRoot(g);
//        stage.show();
//    }

}
