import javax.swing.*;
import java.awt.event.*;

public class ArtificialIntelligenceChatbot extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendBtn;

    public ArtificialIntelligenceChatbot() {

        setTitle("AI Chatbot");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        chatArea = new JTextArea();
        chatArea.setBounds(10, 10, 360, 350);
        chatArea.setEditable(false);
        add(chatArea);

        inputField = new JTextField();
        inputField.setBounds(10, 370, 250, 40);
        add(inputField);

        sendBtn = new JButton("Send");
        sendBtn.setBounds(270, 370, 100, 40);
        add(sendBtn);

        sendBtn.addActionListener(e -> getResponse());
        inputField.addActionListener(e -> getResponse());

        setVisible(true);
    }

    private void getResponse() {

        String msg = inputField.getText().toLowerCase().trim();

        if (msg.isEmpty()) return;

        chatArea.append("You: " + msg + "\n");

        String reply = botReply(msg);

        chatArea.append("Bot: " + reply + "\n\n");

        inputField.setText("");
    }

    private String botReply(String msg) {

        if (msg.contains("hi") || msg.contains("hello")) {
            return "Hello! How can I help you?";
        }
        else if (msg.contains("name")) {
            return "I am your Java Chatbot.";
        }
        else if (msg.contains("how are you")) {
            return "I am fine, just running as code!";
        }
        else if (msg.contains("java")) {
            return "Java is a powerful programming language.";
        }
        else if (msg.contains("time")) {
            return "Check your system time!";
        }
        else if (msg.contains("bye")) {
            return "Goodbye! Take care!";
        }
        else {
            return "Sorry, I don't understand that.";
        }
    }

    public static void main(String[] args) {
        new ArtificialIntelligenceChatbot();
    }
}