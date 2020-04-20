package ecsasize;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Onefrontend {

	private JFrame frmClassEvaluationForm;
	static JPanel panel_1 = new JPanel();
	private static JTextField numb;
	private static JTextField firstNames;
	private static JTextField lastNames;
	private static JTextField theirMarks;
	private static JTextField conclusion;
	private static JLabel lblNewLabel_2;
	private static JLabel lblNewLabel_3;
	private static JLabel lblNewLabel_4;
	private static JButton button_2;
	public static int studNum = 1;
	public static int i = 1;
	public static String[] fNames = new String[studNum + 1];
	public static String[] lNames = new String[studNum + 1];
	public static int[] marks = new int[studNum + 1];
	public int sum = 0;
	public double f = 0;
	public double var = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Onefrontend window = new Onefrontend();
					window.frmClassEvaluationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Onefrontend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClassEvaluationForm = new JFrame();
		frmClassEvaluationForm.getContentPane().setBackground(new Color(255, 255, 255));
		frmClassEvaluationForm.setTitle("CLASS EVALUATION FORM");
		frmClassEvaluationForm.setBounds(100, 100, 771, 551);
		frmClassEvaluationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClassEvaluationForm.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 0, 745, 113);
		frmClassEvaluationForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the number of students in your class:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 52, 302, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("CLASS EVALUATION FORM");
		lblNewLabel.setBounds(217, 11, 271, 30);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		numb = new JTextField();
		numb.setBounds(413, 55, 74, 33);
		panel.add(numb);
		numb.setColumns(10);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					studNum = Integer.parseInt(numb.getText());
					while ( i<= studNum) {
						enterStudents(i);
						i++;
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter a Valid Number");
				}
		}
		});
		btnNewButton.setBounds(545, 55, 121, 33);
		panel.add(btnNewButton);
			
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 113, 745, 179);
		frmClassEvaluationForm.getContentPane().add(panel_1);
		panel_1.setLayout(null);
			
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(64, 224, 208));
		panel_2.setBounds(0, 293, 745, 209);
		frmClassEvaluationForm.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
	}
	
	public static int enterStudents(int a) {
		lblNewLabel_2 = new JLabel("\nEnter student " + a + "'s First Name: ");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(34, 11, 326, 27);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Enter student " + a + "'s Second Name: ");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(34, 49, 326, 27);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Enter student " + a + "'s Marks: ");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(34, 92, 326, 27);
		panel_1.add(lblNewLabel_4);
		
		firstNames = new JTextField();
		firstNames.setBounds(412, 11, 115, 27);
		panel_1.add(firstNames);
		firstNames.setColumns(10);
		
		
		lastNames = new JTextField();
		lastNames.setBounds(412, 49, 115, 27);
		panel_1.add(lastNames);
		lastNames.setColumns(10);
		
		
		theirMarks = new JTextField();
		theirMarks.setBounds(412, 92, 115, 27);
		panel_1.add(theirMarks);
		theirMarks.setColumns(10);
		
		conclusion = new JTextField();
		conclusion.setBounds(34, 130, 493, 31);
		panel_1.add(conclusion);
		conclusion.setColumns(10);
		conclusion.setText(fNames[a] + " " + lNames[a] + " got " + grade(marks[a]) + "\n");
		
		button_2 = new JButton("ENTER");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					fNames[a] = firstNames.getText();
					lNames[a] = lastNames.getText();
					marks[a] = Integer.parseInt(theirMarks.getText());
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter the correct Marks");		
				}
			}
		});
		button_2.setBounds(546, 92, 115, 27);
		panel_1.add(button_2);
		
		return 0;
		
	}
	
	public static String grade(int a) {
		String grade;
		if(a >= 80){
			grade= "A"; 
		}else if (a >= 75){
			grade= "B+";	
		}else if(a >= 70){
			grade= "B";
		}else if(a >= 65){
			grade= "C+";
		}else if(a >= 60){
			grade= "C";
		}else if(a >= 55){
			grade= "D+";
		}else if(a >=50){
			grade= "D";
		}else {
			grade= "F";
		}
		return grade;
	}
}
