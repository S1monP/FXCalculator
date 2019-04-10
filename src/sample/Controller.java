package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;


public class Controller {
    @FXML
    TextField txtEnter;

    @FXML
    TextField txtResult;

    @FXML
    Button btn1;

    @FXML
    Button btn2;

    @FXML
    Button btn3;

    @FXML
    Button btn4;

    @FXML
    Button btn5;

    @FXML
    Button btn6;

    @FXML
    Button btn7;

    @FXML
    Button btn8;

    @FXML
    Button btn9;

    @FXML
    Button btn0;

    @FXML
    Button btnC;

    @FXML
    Button btnPls;

    @FXML
    Button btnMin;

    @FXML
    Button btnMnoz;

    @FXML
    Button btnDel;

    @FXML
    Button btnRovn;

    @FXML
    Button btnRoot;

    @FXML
    Button btnSquare;

    @FXML
    Button btnSquare2;

    @FXML
    Button btnAve;

    @FXML
    ToggleButton bbtnPow;

    @FXML
    TextField txtPower;


    double a, b;
    String Result, Vrm, Vrm2;
    int dey;

    public void ButtonPress(ActionEvent actionEvent) {
        txtPower.setText("Калькулятор2000 Выключен");
        while (bbtnPow.isSelected()) {
            txtPower.setText("Калькулятор2000 Включен");
            if (actionEvent.getSource() == btn1) {
                txtEnter.setText(txtEnter.getText() + "1");
            } else if (actionEvent.getSource() == btn2) {
                txtEnter.setText(txtEnter.getText() + "2");
            } else if (actionEvent.getSource() == btn3) {
                txtEnter.setText(txtEnter.getText() + "3");
            } else if (actionEvent.getSource() == btn4) {
                txtEnter.setText(txtEnter.getText() + "4");
            } else if (actionEvent.getSource() == btn5) {
                txtEnter.setText(txtEnter.getText() + "5");
            } else if (actionEvent.getSource() == btn6) {
                txtEnter.setText(txtEnter.getText() + "6");
            } else if (actionEvent.getSource() == btn7) {
                txtEnter.setText(txtEnter.getText() + "7");
            } else if (actionEvent.getSource() == btn8) {
                txtEnter.setText(txtEnter.getText() + "8");
            } else if (actionEvent.getSource() == btn9) {
                txtEnter.setText(txtEnter.getText() + "9");
            } else if (actionEvent.getSource() == btn0) {
                txtEnter.setText(txtEnter.getText() + "0");
            } else if (actionEvent.getSource() == btnC) {
                txtEnter.setText("");
                txtResult.setText("");
            } else if (actionEvent.getSource() == btnPls) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "+");
                txtEnter.setText("");
                dey = 1;
            } else if (actionEvent.getSource() == btnMin) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "-");
                txtEnter.setText("");
                dey = 2;
            } else if (actionEvent.getSource() == btnMnoz) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "*");
                txtEnter.setText("");
                dey = 3;
            } else if (actionEvent.getSource() == btnDel) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "/");
                txtEnter.setText("");
                dey = 4;
            } else if (actionEvent.getSource() == btnRoot) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "ROOT");
                txtEnter.setText("");
                dey = 5;
            }else if (actionEvent.getSource() == btnSquare) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "^2");
                txtEnter.setText("");
                dey = 6;
            }else if (actionEvent.getSource() == btnSquare2) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "^x");
                txtEnter.setText("");
                dey = 7;
            }else if (actionEvent.getSource() == btnAve) {
                a = Float.parseFloat(txtEnter.getText());
                txtResult.setText(txtEnter.getText() + "Average of");
                txtEnter.setText("");
                dey = 8;
            }
            else if (actionEvent.getSource() == btnRovn) {
                if (dey != 5 && dey !=6)b = Float.parseFloat(txtEnter.getText());
                Vrm = txtEnter.getText();
                Vrm2 = txtResult.getText();
                txtEnter.setText("");
                Calculator clc = new Calculator(a, b);
                switch (dey) {
                    case 1:
                        Result = clc.Plus();
                        break;
                    case 2:
                        Result = clc.Minus();
                        break;
                    case 3:
                        Result = clc.Mnoz();
                        break;
                    case 4:
                        Result = clc.Delenie();
                        break;
                    case 5:
                        Result = clc.Root();
                        break;
                    case 6:
                        Result = clc.Square(2);
                        break;
                    case 7:
                        Result = clc.Square((int)b);
                        break;
                    case 8:
                        Result = clc.Average();
                        break;
                }
                txtResult.setText(Vrm2 + Vrm + Result);
            }
            break;
        }
   }
}

