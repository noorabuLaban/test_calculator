/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_calculater;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author noora
 */
public class Test_calculater extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //node
        TextField result = new TextField("");
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btn10 = new Button(".");
        Button clear = new Button("AC");
        Button add = new Button("+");
        Button sub  = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button equal = new Button("=");
      
//pane
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.add(btn0,0,6);
        btn0.setPrefSize(100, 90);
        btn0.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        root.add(btn1,0,5);
        btn1.setPrefSize(100, 90);
        btn1.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        root.add(btn2,1,5);
        btn2.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn2.setPrefSize(100, 90);
        root.add(btn3,2,5);
        btn3.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn3.setPrefSize(100, 90);
        root.add(btn4,0,4);
        btn4.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn4.setPrefSize(100, 90);
        root.add(btn5,1,4);
        btn5.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn5.setPrefSize(100, 90);
        root.add(btn6,2,4);
        btn6.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn6.setPrefSize(100, 90);
        root.add(btn7,0,3);
        btn7.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
       // btn7.setStyle("-fx-text-fill: black");
        btn7.setPrefSize(100, 90);
        btn7.setShape(new Circle(2));
  //     btn7.setText("-fx-text-fill: black");
        root.add(btn8,1,3);
        btn8.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn8.setPrefSize(100, 90);
        root.add(btn9,2,3);
        btn9.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn9.setPrefSize(100, 90);
        root.add(btn10,1,6);
        btn10.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        btn10.setPrefSize(100, 90);
        root.add(add,3,6);
        add.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        add.setPrefSize(100, 90);
        root.add(sub,3,5);
        sub.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        sub.setPrefSize(100, 90);
        root.add(mul,3,3);
        mul.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        mul.setPrefSize(100, 90);
        root.add(div,3,4);
        div.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        div.setPrefSize(100, 90);
        root.add(clear,3,7);
        clear.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        clear.setPrefSize(100, 90);
        root.add(equal,2,6);
        equal.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #60605f, #60605f)");
        equal.setPrefSize(100, 90);
        root.add(result, 0, 0, 4, 2);
        result.setPrefSize(550, 130);
        
       // root.setPadding(new Insets(5));
        root.setVgap(5);
        root.setHgap(5);
        root.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #ffec5e, #ffec5e)");
        root.setOpacity(0.1);
        
        Scene scene = new Scene(root, 500, 600);
        primaryStage.setTitle("Calculater");
        primaryStage.setScene(scene);
        primaryStage.show();
       
          
        //handle
        btn0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("0");
            }});
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("1");
            }});
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("2");
            }});
        btn3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("3");
            }});       
        btn4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("4");
            }});
        btn5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("5");
            }});
        btn6.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("6");
            }});
        btn6.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("6");
            }});
        btn7.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("7");
            }});
          btn8.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("8");
            }});
          btn9.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("9");
            }});
          btn10.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText(".");
            }});
          equal.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("=");
            }});
          clear.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.clear();
            }});
          
         add.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               result.appendText("+");
               double num1=Double.parseDouble(result.getText());
               result.clear();
          //answer 
          equal.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent arg0) {
               result.appendText("=");
               double num2=Double.parseDouble(result.getText());
               result.clear();
               double answer=num1+num2;
               result.setText(String.valueOf(answer));
               result.appendText(String.valueOf(answer));
            }}); }});
          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
