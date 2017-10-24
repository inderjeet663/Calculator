package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextField resultField; // for  cal text Field
    private double num1; // first number
    private double num2; // for second number
    private String op = null; // for Operand

    public void onNumberKeyPress(ActionEvent e) {
        int num = Integer.parseInt(((Button) e.getSource()).getText()); //getting Value on the key pressed
        String temp; //for accessing entered value in Text Field
        //Check which key is pressed
        if (num == 1) {
            temp = resultField.getText() + "1";
            resultField.setText(temp);
        }
        if (num == 2) {
            temp = resultField.getText()+ "2";
            resultField.setText(temp);
        }
        if (num == 3) {
            temp = resultField.getText() + "3";
            resultField.setText(temp);
        }
        if (num == 4) {
            temp = resultField.getText() + "4";
            resultField.setText(temp);
        }
        if (num == 5) {
            temp = resultField.getText() + "5";
            resultField.setText(temp);
        }
        if (num == 6) {
            temp = resultField.getText() + "6";
            resultField.setText(temp);
        }
        if (num == 7) {
            temp = resultField.getText() + "7";
            resultField.setText(temp);
        }
        if (num == 8) {
            temp = resultField.getText()+"8";
            resultField.setText(temp);
        }
        if (num == 9) {
            temp = resultField.getText() + "9";
            resultField.setText(temp);
        }
        if (num == 0) {
            temp = resultField.getText() + "0";
            resultField.setText(temp);
        }
    }

    public void onOperandButtonClick(ActionEvent e) {

        if (!resultField.getText().equals("")) {
            num1 = Double.valueOf(resultField.getText());
            op = ((Button) e.getSource()).getText();
            resultField.setText("");
        }
    }
    public void onEqualButtonClick() {
        double result;
        num2 = Double.valueOf(resultField.getText());
        if(op.equals("*")) {
            result = num1*num2;
            resultField.setText(String.valueOf(result));
        }
        if(op.equals("-")) {
            result = num1-num2;
            resultField.setText(String.valueOf(result));
        }
        if(op.equals("+")) {
            result = num1+num2;
            resultField.setText(String.valueOf(result));
        }
        if(op.equals("/")) {
            result = num1/num2;
            resultField.setText(String.valueOf(result));
        }
    }
    public void onSqrtClick() {
        num1 = Double.valueOf(resultField.getText());
        resultField.setText(String.valueOf(Math.sqrt(num1)));
    }
    public void onDotButtonClick() {
        resultField.setText(resultField.getText()+".");
    }
    public void onDeleteButtonClick() {
        resultField.setText("");
    }
    public void onExitButtonClick(ActionEvent e) {
       Stage stage = (Stage)((Button)e.getSource()).getScene().getWindow();
    stage.close();
    }

}
