import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.applet.Applet;
import java.awt.*;
import java.applet.*;
/*<applet code="Applet1" width=400 height=300></applet>*/
public class First extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.blue);
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("this is First APPLET ",100,110);
    }
}

/*import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import javafx.scene.text.Text;

/*<applet code="First" width=500 height=250></applet>*/
public class First extends Applet implements ActionListener{
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
    System.out.println("This is CSE branch");
}*/