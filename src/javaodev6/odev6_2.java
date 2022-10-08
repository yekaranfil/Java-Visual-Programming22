package javaodev6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;

public class odev6_2 extends JFrame {
	String sql_sorgu;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev6_2 frame = new odev6_2();
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
	public odev6_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();

		comboBox.setBounds(38, 24, 141, 30);
		contentPane.add(comboBox);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(10, 91, 110, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(10, 116, 227, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(10, 141, 169, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(10, 166, 169, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setBounds(10, 65, 150, 14);
		contentPane.add(lbl5);
		
		JLabel lblNewLabel = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(247, 225, 177, 36);
		contentPane.add(lblNewLabel);
		
		sql_sorgu = "select * from isimler";
		ResultSet myRs = baglantiodev.yap(sql_sorgu);
		

			try {
				while(myRs.next()) {
					comboBox.addItem(myRs.getString("ogr_no"));
				}
			} catch (SQLException e1) {					
				e1.printStackTrace();
			}
			
			
			
			
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					String no;
					no = (String) comboBox.getSelectedItem();
					
					sql_sorgu = "select * from isimler where ogr_no="+no+"";
					ResultSet myRs = baglantiodev.yap(sql_sorgu);
					try {
						if(myRs.next()) {
							lbl1.setText("AD : "+myRs.getString("ogr_ad"));
							lbl2.setText("SOYAD : "+myRs.getString("ogr_soyad"));
							lbl3.setText("YAÞ : "+myRs.getString("ogrenci_yas"));
							lbl4.setText("VELÝ AD : "+myRs.getString("ogr_veli"));
							lbl5.setText("NUMARA : "+myRs.getString("ogr_no"));
						}
					} catch (SQLException e1) {					
						e1.printStackTrace();
					}
				}
			});	
			
			
		}
	}

