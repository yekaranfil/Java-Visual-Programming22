package javaodev4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.SpinnerNumberModel;



public class odev4_1 extends JFrame {
	
	
	private JPanel contentPane;
	private JTable table;
	private JTable table2;
	private JTable table3;
	DefaultTableModel model = new DefaultTableModel();
	DefaultTableModel model2 = new DefaultTableModel();
	DefaultTableModel model3 = new DefaultTableModel();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev4_1 frame = new odev4_1();
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
	public odev4_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setForeground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner satirspin = new JSpinner();
		
		satirspin.setBounds(69, 11, 74, 47);
		contentPane.add(satirspin);
		
		JSpinner sutunspin = new JSpinner();
		sutunspin.setModel(new SpinnerNumberModel(0, null, 24, 1));
		sutunspin.setBounds(214, 11, 74, 47);
		contentPane.add(sutunspin);
		
		JLabel satýrlbl = new JLabel("Sat\u0131r");
		satýrlbl.setFont(new Font("Tahoma", Font.BOLD, 17));
		satýrlbl.setBounds(10, 21, 68, 26);
		contentPane.add(satýrlbl);
		
		JLabel lblStun = new JLabel("S\u00FCtun");
		lblStun.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStun.setBounds(154, 22, 68, 26);
		contentPane.add(lblStun);
		
		JButton btnNewButton = new JButton("OLU\u015ETUR");
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(316, 20, 148, 26);
		contentPane.add(btnNewButton);
		
		JSpinner aralikspin = new JSpinner();
		aralikspin.setBounds(1194, 24, 55, 34);
		contentPane.add(aralikspin);
		
		JSpinner aralikspin2 = new JSpinner();
		aralikspin2.setBounds(1263, 24, 55, 34);
		contentPane.add(aralikspin2);
		
		JLabel lblAralk = new JLabel("Aral\u0131k");
		lblAralk.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAralk.setBounds(1116, 25, 68, 26);
		contentPane.add(lblAralk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 436, 278);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.YELLOW);
		table.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(456, 82, 436, 278);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		table2.setBackground(Color.DARK_GRAY);
		table2.setForeground(new Color(30, 144, 255));
		scrollPane_1.setViewportView(table2);
		table2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(899, 82, 436, 278);
		contentPane.add(scrollPane_2);
		
		table3 = new JTable();
		table3.setBackground(Color.BLACK);
		scrollPane_2.setViewportView(table3);
		table3.setFont(new Font("Tahoma", Font.BOLD, 11));
		table3.setForeground(Color.GREEN);
		
		JLabel lblNewLabel = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(1126, 371, 297, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TABLO 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 66, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TABLO 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(457, 66, 96, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TOPLAM TABLO");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(899, 66, 148, 14);
		contentPane.add(lblNewLabel_1_1_1);
		

		
		
		
		satirspin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
			}
		});
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int satir,sutun,i,j,aralik,aralik2;
				satir = (int) satirspin.getValue();
				sutun = (int) sutunspin.getValue();
				aralik = (int)aralikspin.getValue();
				aralik2 = (int)aralikspin2.getValue();
				model.setColumnCount(sutun);
				model.setRowCount(satir);
				model2.setColumnCount(sutun);
				model2.setRowCount(satir);
				model3.setColumnCount(sutun);
				model3.setRowCount(satir);
				int[][] m = Matris.ciz(satir, sutun, aralik,aralik2);
				int[][] m2 = Matris.ciz(satir, sutun, aralik,aralik2);
				
				//tablo1 
				for(i=0; i<satir; i++) {
					for(j=0; j< sutun; j++) {
						model.setValueAt(m[i][j], i, j);
						
					}
				}
				//tablo2
				for(i=0; i<satir; i++) {
					for(j=0; j< sutun; j++) {
						model2.setValueAt(m2[i][j], i, j);
						
					}
				}
				//tablo3 
				for(i=0; i<satir; i++) {
					for(j=0; j< sutun; j++) {
						model3.setValueAt(m[i][j]+m2[i][j], i, j);
						
					}
				}
				table.setModel(model);
				table2.setModel(model2);
				table3.setModel(model3);
				
				
			
			}
		});
		
		
		
		
		
	}
}
