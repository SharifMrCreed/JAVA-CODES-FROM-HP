package fs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Scrollbar;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel img1 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/IMG_20190823_165304.JPG")).getImage();
		img1.setIcon(new ImageIcon(image1));
		img1.setBounds(10, 11, 175, 221);
		contentPane.add(img1);
		
		JLabel img2 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/IMG_20191215_200019.JPG")).getImage();
		img2.setIcon(new ImageIcon(image2));
		img2.setBounds(195, 11, 175, 221);
		contentPane.add(img2);
		
		JLabel img3 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/PicsArt_08-23-08.22.47.png")).getImage();
		img3.setIcon(new ImageIcon(image3));
		img3.setBounds(380, 11, 175, 221);
		contentPane.add(img3);
		
		JLabel img4 = new JLabel("");
		Image image4 = new ImageIcon(this.getClass().getResource("/PicsArt_08-23-08.36.30.png")).getImage();
		img4.setIcon(new ImageIcon(image4));
		img4.setBounds(10, 265, 175, 221);
		contentPane.add(img4);
		
		JLabel img5 = new JLabel("");
		Image image5 = new ImageIcon(this.getClass().getResource("/PicsArt_08-23-08.46.12.png")).getImage();
		img5.setIcon(new ImageIcon(image5));
		img5.setBounds(195, 265, 175, 221);
		contentPane.add(img5);
		
		JLabel img6 = new JLabel("");
		Image image6 = new ImageIcon(this.getClass().getResource("/PicsArt_08-23-08.53.15.png")).getImage();
		img6.setIcon(new ImageIcon(image6));
		img6.setBounds(380, 265, 175, 221);
		contentPane.add(img6);
		
		
	}
}
