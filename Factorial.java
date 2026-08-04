/*import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;*/

/*<applet code="Factorial" width=500 height=250></applet>*/
/*public class Factorial extends Applet implements ActionListener{
    Label L1, L2;
    TextField T1,T2;
    Button B1;
    public void init(){
        L1= new Label("Enter the number");
        add(L1);
        T1= new TextField(10);
        add(T1);
        L2= new Label("Factorial is ");
        add(L2);
        T2= new TextField(10);
        add(T2);
        B1 = new Button("Compute");
        add(B1);
        B1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==B1){
            int value = Integer.parseInt(T1.getText());
            int fact = factorial(value);
            T2.setText(String.valueOf(fact));
        }
    }

    int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

}*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//import javafx.scene.text.Text;

/*<applet code="Factorial" width=500 height=250></applet>*/
public class Factorial extends Applet implements ActionListener{
    Label L1, L2,L3;
    TextField T1,T2,T3;
    Button B1;
    Choice ch;
    public void init(){
        L1 = new Label("Enter the number1");
        add(L1);
        T1 = new TextField(10);
        add(T1);
        L2 = new Label("Enter the number2");
        add(L2);
        T2 = new TextField(10);
        add(T2);
        L3= new Label("Answer is ");
        add(L3);
        T3= new TextField(10);
        add(T3);
        ch = new Choice();
        ch.add("Addition");
        ch.add("Subtraction");
        ch.add("Multiplication");
        ch.add("Division");
        add(ch);
        B1 = new Button("result");
        add(B1);
        /*B2 = new Button("compute");
        add(B2);*/
        B1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==B1){

        int a = Integer.parseInt(T1.getText());
        int b = Integer.parseInt(T2.getText());

        String operation = ch.getSelectedItem();
        int result = 0;

        switch(operation){
            case "Addition":
                result = a + b;
                System.out.println(result);
                break;

            case "Subtraction":
                result = a - b;
                break;

            case "Multiplication":
                result = a * b;
                break;

            case "Division":
                try{
                    result = a / b;
                }
                catch(Exception ae){
                    JOptionPane.showMessageDialog(this,"Division by Zero");
                }
                break;

            default:
                System.out.println("Invalid Operation");
         }

        T3.setText(String.valueOf(result));  //  show answer here
       }
    }
}


