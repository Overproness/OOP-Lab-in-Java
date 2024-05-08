package lab_13.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private TextField textField=new TextField();
    private long num1=0;
    private String op="";
    private boolean start=true;

    @Override
    public void start(Stage primaryStage) throws  Exception {

        textField.setFont(Font.font(20));
        textField.setPrefHeight(50);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);

        StackPane stackPane=new StackPane();
        stackPane.setPadding(new Insets(10));
        stackPane.getChildren().add(textField);

        TilePane tile =new TilePane();
        tile.setHgap(10);
        tile.setVgap(10);
        tile.setAlignment(Pos.TOP_CENTER);
        tile.getChildren().addAll(
                createButtonForNumber("1"),
                createButtonForNumber("2"),
                createButtonForNumber("3"),
                createButtonForOperation("+"),
                createButtonForNumber("4"),
                createButtonForNumber("5"),
                createButtonForNumber("6"),
                createButtonForOperation("-"),
                createButtonForNumber("7"),
                createButtonForNumber("8"),
                createButtonForNumber("9"),
                createButtonForOperation("*"),
                createButtonForClear("C"),
                createButtonForNumber("0"),
                createButtonForOperation("="),
                createButtonForOperation("/")
        );


        BorderPane root = new BorderPane();
        root.setCenter(tile);
        root.setTop(stackPane);
        Scene scene = new Scene(root, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    private Button createButtonForNumber(String ch){
        Button button =new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50,50);

        button.setOnAction(this::processNumbers);

        return button;

    }

    private Button createButtonForOperation(String ch){
        Button button =new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50,50);
        button.setOnAction(this::processOperators);
        return button;
    }

    private Button createButtonForClear(String ch ){
        Button button =new Button(ch);
        button.setFont(Font.font(18));
        button.setPrefSize(50,50);
        button.setOnAction(e->{
            textField.setText("");
            op="";
            start=true;
        });
        return button;
    }

    private void processNumbers(ActionEvent e){
        if(start){
            textField.setText("");
            start=false;
        }
        String value=((Button)e.getSource()).getText();
        textField.setText(textField.getText()+value);
    }

    private void processOperators(ActionEvent e){
        String value=((Button)e.getSource()).getText();
        if(!"=".equals(value)){
            if(!op.isEmpty())
                return;
            op=value;
            num1=Long.parseLong(textField.getText());
            textField.setText("");
        }else{
            if(op.isEmpty())
                return;
            long num2=Long.parseLong(textField.getText());
            float output=calculate(num1,num2,op);
            textField.setText(String.valueOf(output));
            op="";
            start=true;
        }
    }

    private float calculate(long num1,long num2, String Operator){
        switch(Operator){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                if(num2==0)
                    return 0;
                return num1/num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
