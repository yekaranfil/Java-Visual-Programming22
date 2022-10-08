package javaodev6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class odev6_1 extends JFrame {

	private JPanel contentPane;
	JButton[][] buton = new JButton[4][4];
	int i,j,islem;
	float sayi1,sayi2,sonuc;
	private JTextField txt;
	
	
	String[][] numaralar = {{"7","8","9","+"},
							{"4","5","6","-"},
							{"1","2","3","*"},
							{"0",",","=","/"},
							
	};
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev6_1 frame = new odev6_1();
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
	public odev6_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt = new JTextField();
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt.setBounds(10, 11, 256, 46);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(92, 398, 177, 36);
		contentPane.add(lblNewLabel);
		
		
		for(i = 0; i<4; i++) {
			for(j =0; j<4; j++) {
				buton[i][j]= new JButton();
				buton[i][j].setFont(new Font("Tahoma", Font.BOLD,20));
				buton[i][j].setBounds(j*65+10,i*80+80,60,60);
				buton[i][j].setText(numaralar[i][j]);
				contentPane.add(buton[i][j]);
				
				
			}
		};
		
		
		ActionListener bl1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(i=0; i<3; i++) {
					for(j=0; j<3; j++) {
						
						if(e.getSource() == buton[i][j]) txt.setText(txt.getText()+buton[i][j].getText());
					}
				}
				if(e.getSource()== buton[3][0]) txt.setText(txt.getText()+"0");
				if(e.getSource()== buton[3][1]) txt.setText(txt.getText()+".");
								
				if(e.getSource()== buton[0][3]) {
					islem = 1;
					sayi1= Float.parseFloat(txt.getText());
					txt.setText("");
				}
				if(e.getSource()== buton[1][3]) {
					islem = 2;
					sayi1= Float.parseFloat(txt.getText());
					txt.setText("");
				}
				if(e.getSource()== buton[2][3]) {
					islem = 3;
					sayi1= Float.parseFloat(txt.getText());
					txt.setText("");
				}		
				if(e.getSource()== buton[3][3]) {
					islem = 4;
					sayi1= Float.parseFloat(txt.getText());
					txt.setText("");
				}		
					
				
				if(e.getSource()== buton[3][2]) {
					
					sayi2= Float.parseFloat(txt.getText());
					txt.setText("");
					if(islem==1) sonuc = sayi1+sayi2;
					if(islem==2) sonuc = sayi1-sayi2;
					if(islem==3) sonuc = sayi1*sayi2;
					if(islem==4) sonuc = sayi1/sayi2;
					txt.setText(Float.toString(sonuc));
					
				}
				
				}
			
			
		};
			
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				buton[i][j].addActionListener(bl1);
			}
		}
		
		
		
		
		
		
		
		
	}
}

