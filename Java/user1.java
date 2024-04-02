import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class user1 
{ 
    Frame mainframe;
    Frame afterloginframe;
    Frame signupframe;
    Frame secondframe;
    TextField inputTextField;

    public user1() 
    {
        //abhi main frame ka kam
        mainframe = new Frame("welcome");
        mainframe.setLayout(new BorderLayout());
        mainframe.setSize(400, 300);
        mainframe.addWindowListener(new WindowAdapter()
        
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
        mainframe.setVisible(true);
        //ye second frame
        secondframe = new Frame("Textogram");
        secondframe.setLayout(new BorderLayout());
        secondframe.setSize(400, 300);
        inputTextField = new TextField();
        secondframe.add(inputTextField, BorderLayout.CENTER);
        
        Button sendButton = new Button("Send");               
        secondframe.add(sendButton, BorderLayout.SOUTH);
        secondframe.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new user1();
    }
}
