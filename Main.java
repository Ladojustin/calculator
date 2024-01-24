import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main extends Frame implements ActionListener {
    Frame f = new Frame("Lado btn");
    TextField tf = new TextField();
    double num1;
    double num2;
    char operator;


    public Main(){

        tf = new TextField();
        Button btn0 = new Button("jhl");
        Button btn1 = new Button("/");
        Button btn2 = new Button("*");
        Button btn3 = new Button("-");
        Button btn4 = new Button("9");
        Button btn5 = new Button("8");
        Button btn6 = new Button("7");
        Button btn7 = new Button("+");
        Button btn8 = new Button("4");
        Button btn9 = new Button("5");
        Button btn10 = new Button("6");
        Button btn11 = new Button("=");
        Button btn12 = new Button("3");
        Button btn13 = new Button("2");
        Button btn14 = new Button("1");


        f.setLayout(new GridLayout(4,4));
        f.setSize(100, 200);
        f.setTitle("Lado");
        f.add(tf);
        f.pack();
        f.setVisible(true);
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(btn10);
        f.add(btn11);
        f.add(btn12);
        f.add(btn13);
        f.add(btn14);
        f.add(btn0);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();
        if(str.matches("[0-9]")){
            tf.setText(tf.getText() +str);

        } else if (str.matches("[/*\\-+=]")) {
            if (operator == 0) {
                num1 = Double.parseDouble(tf.getText());
                operator = str.charAt(0);
                tf.setText("  ");
            }else{
                num2 = Double.parseDouble(tf.getText());
                switch(operator){
                    case '+':
                        num1 += num2;
                        break;
                    case '-':
                        num1 -= num2;
                        break;
                    case '*':
                        num1 *= num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            num1 /= num2;
                        } else {
                            tf.setText("Error: Division by zero");
                            return;
                        }
                        break;

                }
                operator = str.charAt(0);
                tf.setText(Double.toString(num1));
                num2 = 0.0;
            }

        }

    }

    public static void main(String[] args) {
        new Main();
    }

}
