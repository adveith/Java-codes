import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class SimpleTextMessagingApp {
    private Frame frame;
    private TextArea chatArea;
    private TextField messageField;
    private Button sendButton;

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public SimpleTextMessagingApp() {
        initializeGUI();
        connectToServer();
        receiveMessages();
    }

    private void initializeGUI() {
        frame = new Frame("Simple Chat App");
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 300);

        chatArea = new TextArea();
        chatArea.setEditable(false);
        frame.add(chatArea, BorderLayout.CENTER);

        Panel bottomPanel = new Panel();
        bottomPanel.setLayout(new BorderLayout());

        messageField = new TextField();
        bottomPanel.add(messageField, BorderLayout.CENTER);

        sendButton = new Button("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        bottomPanel.add(sendButton, BorderLayout.EAST);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeClient();
            }
        });

        frame.setVisible(true);
    }

    private void connectToServer() {
        try {
            String serverAddress = "127.0.0.1";
            int serverPort = 12345;

            clientSocket = new Socket(serverAddress, serverPort);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            out.println(message);
            messageField.setText("");
        }
    }

    private void receiveMessages() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        chatArea.append(message + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void closeClient() {
        try {
            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.dispose();
    }

    public static void main(String[] args) {
        new SimpleTextMessagingApp();
    }
}