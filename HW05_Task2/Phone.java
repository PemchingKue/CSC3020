/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05_task2;

/**
 *
 * @author pk
 */

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Phone extends JFrame{

    private int phoneNumber[];
    private JTextField input;
    private JLabel prompt;
    public Phone()
    {
    super( "Phone" );
    input = new JTextField(15);
    
    input.addActionListener(
    new ActionListener() {
    public void actionPerformed( ActionEvent event ){
        calculate();
            }
        }
    );

    prompt = new JLabel("Enter the last 4 digits of the phone number (must be greater than 1):" );

    Container container = getContentPane();
    container.setLayout(new FlowLayout());
    container.add(prompt);
    container.add(input);

    setSize(400, 100);
    setVisible(true);
}

// output letter combinations to file
private void calculate(){
    String letters[][] = {{ "" },
    { "" }, { "A", "B", "C" }, { "D", "E", "F" },
    { "G", "H", "I" }, { "J", "K", "L" }, { "M", "N", "O" },
    { "P", "R", "S" }, { "T", "U", "V" }, { "W", "X", "Y" }};

    long phoneNumber = Long.parseLong(input.getText());
    int digits[] = new int[4];
        for (int i = 0; i < 4; i++) {
        digits[i] = (int)(phoneNumber % 10);
        phoneNumber /= 10;
        }

    PrintStream output = null;

    try {
    output = new PrintStream(new FileOutputStream("phone.txt"));
    }
    catch( IOException exception ){
    JOptionPane.showMessageDialog( null, exception.toString(),
    "Exception", JOptionPane.ERROR_MESSAGE );
    System.exit(1);
    }

    input.setText("Please wait...");

    int loop[] = new int[4];

    for ( loop[ 0 ] = 0; loop[ 0 ] <= 2; loop[ 0 ]++ )
    for ( loop[ 1 ] = 0; loop[ 1 ] <= 2; loop[ 1 ]++ )
    for ( loop[ 2 ] = 0; loop[ 2 ] <= 2; loop[ 2 ]++ )
    for ( loop[ 3 ] = 0; loop[ 3 ] <= 2; loop[ 3 ]++ ){
        for ( int i = 3; i >= 0; i-- )
            output.print(letters[digits[i]] [loop[i]]);
            output.println();
    }
    input.setText( "Done Printing!" );
    output.close();

}

    public static void main(String[] args) {
    Phone application = new Phone();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
