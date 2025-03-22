// This program creates a simple calculator window that divides two numbers. Here's how it works:

// 1. The window has:
//    - Two text boxes where users can type numbers
//    - A "Divide" button
//    - A result box that shows the answer
//    - Labels to explain what each box is for

// 2. When someone clicks the "Divide" button:
//    - The program takes the numbers from both text boxes
//    - Tries to divide the first number by the second number
//    - Shows the result in the result box

// 3. The program handles two types of errors:
//    - If someone types something that's not a number, it shows an error message
//    - If someone tries to divide by zero, it shows an error message

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionGUI {

    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Add first number input field and label
        JLabel label1 = new JLabel("Enter num1:");
        label1.setBounds(20, 20, 80, 25);
        frame.add(label1);
        JTextField num1Field = new JTextField();
        num1Field.setBounds(100, 20, 160, 25);
        frame.add(num1Field);

        // Add second number input field and label
        JLabel label2 = new JLabel("Enter num2:");
        label2.setBounds(20, 60, 80, 25);
        frame.add(label2);
        JTextField num2Field = new JTextField();
        num2Field.setBounds(100, 60, 160, 25);
        frame.add(num2Field);

        // Add result field and label
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 80, 25);
        frame.add(resultLabel);
        JTextField resultField = new JTextField();
        resultField.setBounds(100, 100, 160, 25);
        resultField.setEditable(false); // Users can't type in the result box
        frame.add(resultField);

        // Add the divide button
        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(100, 140, 80, 25);
        frame.add(divideButton);

        // What happens when the divide button is clicked
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers and calculate
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    // Show error if input isn't a number
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid integers.", "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Show error if trying to divide by zero
                    JOptionPane.showMessageDialog(frame, "Error: Division by zero is not allowed.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the window visible
        frame.setVisible(true);
    }
}
