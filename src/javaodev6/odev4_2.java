package javaodev4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JLabel;

public class odev4_2 extends JFrame {

	private JPanel contentPane;
	private JTextField aratxt;
	Random r = new Random();
	int sayac = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev4_2 frame = new odev4_2();
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
	public odev4_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 716);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		aratxt = new JTextField();
		aratxt.setBackground(new Color(105, 105, 105));
		aratxt.setFont(new Font("Tahoma", Font.BOLD, 14));
		aratxt.setBounds(10, 23, 179, 48);
		contentPane.add(aratxt);
		aratxt.setColumns(10);

		JButton arabtn = new JButton("NORMAL HIZLA ARA");

		arabtn.setForeground(new Color(25, 25, 112));

		arabtn.setBounds(280, 11, 185, 49);
		contentPane.add(arabtn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 455, 510);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 255, 0));
		textArea.setFont(new Font("Microsoft YaHei", Font.BOLD, 26));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);

		JButton btnUltraHzlaAra = new JButton("ULTRA HIZLA ARA");

		btnUltraHzlaAra.setForeground(new Color(255, 0, 0));
		btnUltraHzlaAra.setBounds(280, 71, 185, 49);
		contentPane.add(btnUltraHzlaAra);

		JButton btnYeniden = new JButton("TEM\u0130ZLE");

		btnYeniden.setForeground(Color.RED);
		btnYeniden.setBounds(9, 76, 179, 49);
		contentPane.add(btnYeniden);
		
		JLabel lblNewLabel = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(257, 643, 213, 23);
		contentPane.add(lblNewLabel);

		Thread t = new Thread() {
			public void run() {

				sayac = 0;
				textArea.setText("");
				contentPane.setBackground(Color.red);
				int sayi;
				String rs = "";
				String metin = "";
				String sayactxt = "";
				metin = aratxt.getText().toUpperCase();

				while (true) {
					for (int i = 0; i < metin.length(); i++) {
						sayi = r.nextInt(90 - 65) + 65;
						rs += (char) sayi;

					}
					sayac += 1;
					System.out.println(sayac + ". deneme" + " " + rs + " " + metin);
					textArea.setText(textArea.getText() + "\n" + sayac + ". deneme" + " " + rs + " = " + metin);

					if (rs.equals(metin)) {
						contentPane.setBackground(Color.green);
						textArea.setText(textArea.getText() + "\n" + "  EŞLEŞME TAMAMLANDI \n" + "\n\n\n Yusuf Emre Karanfil");

						break;
					} else {
						rs = "";
						continue;

					}

				}

			}

		};

		Thread t1 = new Thread() {
			public void run() {
				sayac = 0;
				textArea.setText("");
				contentPane.setBackground(Color.red);
				int sayi;
				String rs = "";
				String metin = "";
				String sayactxt = "";
				metin = aratxt.getText().toUpperCase();

				while (true) {
					for (int i = 0; i < metin.length(); i++) {
						sayi = r.nextInt(90 - 65) + 65;
						rs += (char) sayi;

					}
					sayac += 1;
					System.out.println(sayac + ". deneme" + " " + rs + " " + metin);
					textArea.setText("\n" + sayac + ". deneme" + " " + rs + " = " + metin);

					if (rs.equals(metin)) {
						contentPane.setBackground(Color.green);
						textArea.setText("\n" + sayac + ". deneme" + " " + rs + " = " + metin + "  EŞLEŞME TAMAMLANDI \n" + "\n\n\n\n\n\n\n\n\n\n Yusuf Emre Karanfil");
						break;

					} else {
						rs = "";
						continue;
					}

				}

			}

		};

		btnUltraHzlaAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				t1.start();
			}
		});
		arabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
				t.start();
			}
		});
		btnYeniden.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				t.stop();
				t1.stop();
				textArea.setText("");
				contentPane.setBackground(new Color(105, 105, 105));

			}
		});

	}
}
