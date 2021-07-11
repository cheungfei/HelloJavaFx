package sample.control;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-12 5:39
 */
public class HBoxMain extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        Group root = new Group();
//        Scene scene = new Scene(root, 300, 250);
//        // 5 pixels space between child nodes
//        HBox hbox = new HBox(5);
//        // 1 pixel padding between child nodes only
//        hbox.setPadding(new Insets(1));
//        Rectangle r1 = new Rectangle(10, 10);
//        Rectangle r2 = new Rectangle(20, 100);
//        Rectangle r3 = new Rectangle(50, 20);
//        Rectangle r4 = new Rectangle(20, 50);
//
//        HBox.setMargin(r1, new Insets(2, 2, 2, 2));
//
//        hbox.getChildren().addAll(r1, r2, r3, r4);
//        root.getChildren().add(hbox);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) {
//        Group root = new Group();
//        Scene scene = new Scene(root, 300, 250);
//        // 5 pixels space between child nodes
//        HBox hbox = new HBox(5);
//        // 1 pixel padding between child nodes only
//        hbox.setPadding(new Insets(1));
//        Rectangle r1 = new Rectangle(10, 10);
//        Rectangle r2 = new Rectangle(20, 100);
//        Rectangle r3 = new Rectangle(50, 20);
//        Rectangle r4 = new Rectangle(20, 50);
//
//        HBox.setMargin(r1, new Insets(2, 2, 2, 2));
//
//        hbox.getChildren().addAll(r1, r2, r3, r4);
//        root.getChildren().add(hbox);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) {
//        TextField myTextField = new TextField();
//        HBox hbox = new HBox();
//        hbox.getChildren().add(myTextField);
//        HBox.setHgrow(myTextField, Priority.ALWAYS);
//        Scene scene = new Scene(hbox, 320, 112, Color.rgb(0, 0, 0, 0));
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("");
//        Group root = new Group();
//        Scene scene = new Scene(root, 300, 250, Color.WHITE);
//        HBox hbox = new HBox();
//        Button button1 = new Button("Add               ");
//        Button button2 = new Button("Remove   ");
//        HBox.setHgrow(button1, Priority.ALWAYS);
//        HBox.setHgrow(button2, Priority.ALWAYS);
//        button1.setMaxWidth(Double.MAX_VALUE);
//        button2.setMaxWidth(Double.MAX_VALUE);
//        hbox.getChildren().addAll(button1, button2);
//
//        root.getChildren().add(hbox);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HBox Test");

        // HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(15, 12, 15, 12));
        hb.setSpacing(10);

        // Buttons
        Button btn1 = new Button();
        btn1.setText("Button1");
        hb.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("Button2");
        hb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("Button3");
        hb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        hb.getChildren().add(btn4);

        // Adding HBox to the scene
        Scene scene = new Scene(hb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
