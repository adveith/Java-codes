import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Project
{
    private static Frame frame;
    private static Panel mainPanel;
    private static Panel loginPanel;

    public static void main(String args[]) 
    {
        frame = new Frame("Welcome to Disha Computer Institute");
        frame.addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(WindowEvent windowEvent) 
            {
                System.exit(0);
            }
        });

        Panel displayPanel = createDisplayPanel();
        mainPanel = createMainPanel();
        loginPanel = createLoginPanel();

        frame.add(displayPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
    { 
        Panel displayPanel = createDisplayPanel();
        Panel mainPanel = createMainPanel();
        Panel loginPanel = createLoginPanel();
        Panel studentPanel = createStudentPanel();
        Panel facultyPanel = createFacultyPanel();
        Panel freeResourcesPanel = createFreeResourcesPanel();
        Panel announcementsPanel = createAnnouncementsPanel();
        Panel signupPanel = createSignupPanel();
        Panel selectCoursePanel = createSelectCoursePanel();
        Panel feePaymentPanel = createFeePaymentPanel();
        Panel enquiryPanel = createEnquiryPanel();

        frame.add(displayPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private static Panel createDisplayPanel()
    {
        Panel displayPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };

        Button enterButton = new Button("Enter");
        Button exitButton = new Button("Exit");
        enterButton.setBounds(150, 100, 80, 30);
        exitButton.setBounds(50, 150, 80, 30);

        enterButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                frame.remove(displayPanel);
                frame.add(mainPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });

        displayPanel.add(enterButton);
        displayPanel.add(exitButton);

        return displayPanel;
    }

    private static Panel createMainPanel() 
    {
        Panel mainPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g)
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };

        mainPanel.setLayout(new GridLayout(0, 1));
        Button b1, b2, b4, b5, b6, b7, b8;

        b1 = new Button("Student Resources");
        b2 = new Button("Faculty Resources");
        b4 = new Button("Free Resources");
        b5 = new Button("Announcements");
        b6 = new Button("New Register");
        b7 = new Button("Buy Course");
        b8 = new Button("Enquiry");

        b6.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                frame.remove(mainPanel);
                frame.add(loginPanel);
                frame.revalidate();
                frame.repaint();
            }
        });


        mainPanel.add(b1);
        mainPanel.add(b2);
        mainPanel.add(b4);
        mainPanel.add(b5);
        mainPanel.add(b6);
        mainPanel.add(b7);
        mainPanel.add(b8);

        return mainPanel;
    }

    private static Panel createLoginPanel() 
    {
        Panel loginPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };

        Label l1 = new Label("Enter Your Username");
        Label l2 = new Label("Enter Your Password");
        TextField usernameField = new TextField(20);
        TextField passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        Button b3 = new Button("Enter");

        b3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                System.out.println("Login button clicked");
            }
        });

        l1.setBounds(50, 100, 150, 30);
        l2.setBounds(50, 150, 150, 30);

        loginPanel.add(l1);
        loginPanel.add(usernameField);
        loginPanel.add(l2);
        loginPanel.add(passwordField);
        loginPanel.add(b3);

        return loginPanel;
    }

    private static Panel createStudentPanel() 
    {
        Panel studentPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return studentPanel;
    }

    private static Panel createFacultyPanel() 
    {
        Panel facultyPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return facultyPanel;
    }

    private static Panel createFreeResourcesPanel() 
    {
        Panel freeResourcesPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };


        return freeResourcesPanel;
    }

    private static Panel createAnnouncementsPanel()
    {
        Panel announcementsPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return announcementsPanel;
    }

    private static Panel createSignupPanel() 
    {
        Panel signupPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return signupPanel;
    }

    private static Panel createSelectCoursePanel() 
    {
        Panel selectCoursePanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return selectCoursePanel;
    }

    private static Panel createFeePaymentPanel() 
    {
        Panel feePaymentPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return feePaymentPanel;
    }

    private static Panel createEnquiryPanel() 
    {
        Panel enquiryPanel = new Panel() 
        {
            @Override
            public void paint(Graphics g) 
            {
                Image backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\advei\\Downloads\\angryimg.png");
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                super.paint(g);
            }
        };
        return enquiryPanel;
    }
}
