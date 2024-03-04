/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathisorthat;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.Action;
import javax.swing.JOptionPane;
//import javafx.scene.text.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Alexander Jon
 */
public class DisOrDatGUI{
    
    private static JLabel labelDis;
    private static JLabel labelQuestion;
    private static JLabel labelOr;
    private static JLabel labelDat;
    private static JLabel labelAnswer;
    private static JTextField disOption;
    private static JTextField questionField;
    private static JTextField datOption;
    private static JPasswordField answerOption;
    private static JButton btnEnter;
    public static JButton btnEnter2;
    
    public static void guiDOrD(){
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.add(panel);
            
            panel.setLayout(null);
            //setBounds(x,y,width,height);
            //text fields for options given by the first user
            //and password field for the answer that the second user will guess
            
            labelQuestion = new JLabel("Question");
            labelQuestion.setBounds(10,20,80,25);
            panel.add(labelQuestion);
            
            questionField = new JTextField(20);
            questionField.setBounds(100,20,165,25);
            panel.add(questionField);
            
            labelDis = new JLabel("Dis");
            labelDis.setBounds(10,50,80,25);
            panel.add(labelDis);
            
            disOption = new JTextField(20);
            disOption.setBounds(100,50,165,25);
            panel.add(disOption);
            
            labelOr = new JLabel("or");
            labelOr.setBounds(10,80,80,25);
            panel.add(labelOr);
            
            labelDat = new JLabel("Dat");
            labelDat.setBounds(10,110,80,25);
            panel.add(labelDat);
            
            datOption = new JTextField(20);
            datOption.setBounds(100,110,165,25);
            panel.add(datOption);
            
            labelAnswer = new JLabel("Answer");
            labelAnswer.setBounds(10,140,80,25);
            panel.add(labelAnswer);
            
            answerOption = new JPasswordField(20);
            answerOption.setBounds(100,140,165,25);
            panel.add(answerOption);
            
            btnEnter = new JButton("Enter");
            btnEnter.setBounds(100,170,80,25);
            panel.add(btnEnter);
            
            btnEnter.addActionListener(new ActionListener() { 
                private JLabel userAnswer;
                private JTextField userAnswer01;
                private JLabel userQuestion;
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame frame2 = new JFrame();
                    JPanel panel2 = new JPanel();
                    frame2.setSize(400,300);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.add(panel2);
                    
                    panel2.setLayout(null);
                    
                    //getting the user input from the first frame as reference
                    String optionDis = disOption.getText();
                    String optionDat = datOption.getText();
                    String optionAnswer = String.valueOf(answerOption.getText());
                    String question = questionField.getText();
                    
                    userQuestion = new JLabel(question);
                    userQuestion.setBounds(150,20,165,25);
                    panel2.add(userQuestion);
                    
                    userAnswer = new JLabel("Type your answer :");
                    userAnswer.setBounds(10,70,165,25);
                    panel2.add(userAnswer);
                    
                    userAnswer01 = new JTextField();
                    userAnswer01.setBounds(175,70,165,25);
                    panel2.add(userAnswer01);

                    JButton btnEnter2 = new JButton("Enter");
                    btnEnter2.setBounds(100,150,80,25);
                    panel2.add(btnEnter2);
                    
                    //After clicking enter it should check if the user input is the same with the answer entered by another user on the first jframe.
                    btnEnter2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent f) {
                            frame2.dispose();
                            if(optionAnswer.equalsIgnoreCase(userAnswer01.getText())){ 
                                JOptionPane.showMessageDialog(frame, "You are Correct");
                            } else {
                                JOptionPane.showMessageDialog(frame, "You are Incorrect");
                            }
                        }
                    });
                    frame2.setVisible(true);
                }
            });
                        
            btnEnter.addActionListener((ActionEvent event) -> {
                frame.dispose();
            });
            frame.setVisible(true);      
    }
}
