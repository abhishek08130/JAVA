// Design a program that creates a user interface to perform integer divisions. the user enters two numbers in the text fields, num1 and num2. the division of num1 and num2 is displayed in the result field when the divide button is clicked. if num1 or num2 were not an integer, the program would throw a number format exception. if num2 were zero, the program would throw an arithmetic exception display the exception in a message dialog box.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);
        JLabel label1 = new JLabel("Enter num1:");
        label1.setBounds(20, 20, 80, 25);
        frame.add(label1);
        JTextField num1Field = new JTextField();
        num1Field.setBounds(100, 20, 160, 25);
        frame.add(num1Field);
         JLabel label2 = new JLabel("Enter num2:");
        label2.setBounds(20, 60, 80, 25);
        frame.add(label2);
        JTextField num2Field = new JTextField();
        num2Field.setBounds(100, 60, 160, 25);
        frame.add(num2Field);
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 80, 25);
        frame.add(resultLabel);

        JTextField resultField = new JTextField();
        resultField.setBounds(100, 100, 160, 25);
        resultField.setEditable(false); // Make result field non-editable
        frame.add(resultField);
        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(100, 140, 80, 25);
        frame.add(divideButton);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid integers.", "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Division by zero is not allowed.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}
