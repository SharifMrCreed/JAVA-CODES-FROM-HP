package fs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frmFashionStrikeUg;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmFashionStrikeUg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFashionStrikeUg = new JFrame();
		frmFashionStrikeUg.getContentPane().setBackground(Color.DARK_GRAY);
		frmFashionStrikeUg.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFashionStrikeUg.setBackground(SystemColor.desktop);
		frmFashionStrikeUg.setTitle("FASHION STRIKE UG");
		frmFashionStrikeUg.setBounds(100, 100, 450, 367);
		frmFashionStrikeUg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFashionStrikeUg.getContentPane().setLayout(null);
		
		JLabel welcomeLbl = new JLabel("Welcome to the FashionStrike App");
		welcomeLbl.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		welcomeLbl.setForeground(Color.WHITE);
		welcomeLbl.setBounds(78, 11, 308, 33);
		frmFashionStrikeUg.getContentPane().add(welcomeLbl);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblUserName.setBounds(174, 66, 86, 24);
		frmFashionStrikeUg.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(264, 66, 160, 27);
		frmFashionStrikeUg.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(174, 133, 86, 24);
		frmFashionStrikeUg.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(264, 133, 160, 24);
		frmFashionStrikeUg.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmFashionStrikeUg.dispose();
				Frame2 two = new Frame2();
				two.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		btnLogin.setBounds(223, 185, 89, 23);
		frmFashionStrikeUg.getContentPane().add(btnLogin);
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		btnCreateAccount.setBounds(199, 262, 154, 23);
		frmFashionStrikeUg.getContentPane().add(btnCreateAccount);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblOr.setForeground(Color.WHITE);
		lblOr.setBounds(252, 230, 46, 14);
		frmFashionStrikeUg.getContentPane().add(lblOr);
		
		JLabel im1 = new JLabel("");
		Image imag1 = new ImageIcon(this.getClass().getResource("/8T6onLKRcN.png")).getImage();
		im1.setIcon(new ImageIcon(imag1));
		im1.setBounds(23, 34, 154, 248);
		frmFashionStrikeUg.getContentPane().add(im1);
	}
}
