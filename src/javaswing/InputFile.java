package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import processing.MaHoa;
import java.awt.Font;

public class InputFile extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public InputFile() {
		setTitle("M\u00E3 h\u00F3a RC4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(224, 255, 255));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane_1.setBounds(10, 11, 764, 439);
		contentPane.add(contentPane_1);
		
		// thay doi giao dien khi chon trong phan menu
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int selection = comboBox.getSelectedIndex();
				switch(selection) {
				case 0:
					setVisible(true);
					
					break;
				case 1:
					new InputText().setVisible(true);
					setVisible(false);
					
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Tải file lên", "Nhập văn bản"}));
		comboBox.setBounds(75, 29, 679, 22);
		contentPane_1.add(comboBox);
		
		// xu ly phan tai file len
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBounds(75, 90, 562, 22);
		contentPane_1.add(textArea);
		StringBuffer input = new StringBuffer();
		JButton btnNewButton = new JButton("Tải file");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setMultiSelectionEnabled(false);
				
				int x = fileChooser.showOpenDialog(null);
				if (x == fileChooser.APPROVE_OPTION) {
					input.delete(0, input.length());
					File f = fileChooser.getSelectedFile();
					textArea.setText(f.getPath());
					String s = null;
					InputStream in;
					Reader reader;
					BufferedReader br;
					try {
						in = new FileInputStream(f.getPath());
						reader = new InputStreamReader(in, "UTF-8");
						br = new BufferedReader(reader);
						
						while ((s = br.readLine()) != null) {
							input.append(s);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		btnNewButton.setBounds(647, 90, 107, 22);
		contentPane_1.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Binary");
		rdbtnNewRadioButton.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(366, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hexa");
		rdbtnNewRadioButton_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(236, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Text");
		rdbtnNewRadioButton_2.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(104, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Text");
		rdbtnNewRadioButton_2_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_2_1.setSelected(true);
		buttonGroup_1.add(rdbtnNewRadioButton_2_1);
		rdbtnNewRadioButton_2_1.setBounds(104, 152, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Hexa");
		rdbtnNewRadioButton_1_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(236, 152, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Binary");
		rdbtnNewRadioButton_3.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(366, 152, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("Tên file");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 90, 55, 22);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kh\u00F3a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 125, 55, 20);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblResult = new JLabel("K\u1EBFt qu\u1EA3");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResult.setBounds(10, 235, 55, 110);
		contentPane_1.add(lblResult);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane_1.add(textArea_1);
		textArea_1.setBounds(75, 123, 679, 22);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea_2.setBounds(63, 161, 591, 110);
		textArea_2.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(679, 212);
		scrollPane.setLocation(75, 182);
		contentPane_1.add(scrollPane, BorderLayout.CENTER);
		
		// xu ly action chon ma hoa
		JButton btnNewButton_2 = new JButton("M\u00E3 h\u00F3a");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String coSoVao = "Text";
				if (rdbtnNewRadioButton_1.isSelected()) {
					coSoVao = "Hexa";
				}
				if (rdbtnNewRadioButton.isSelected()) {
					coSoVao = "Binary";
				}
				
				String coSoRa = "Text";
				if (rdbtnNewRadioButton_1_1.isSelected()) {
					coSoRa = "Hexa";
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					coSoRa = "Binary";
				}
				
				MaHoa.maHoaFile(input, textArea_1, textArea_2, coSoVao, coSoRa);
			}
		});
		
		btnNewButton_2.setBounds(236, 405, 89, 23);
		contentPane_1.add(btnNewButton_2);
		
		// xu ly action chon giai ma
		JButton btnNewButton_2_1 = new JButton("Gi\u1EA3i m\u00E3");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String coSoVao = "Text";
				if (rdbtnNewRadioButton_1.isSelected()) {
					coSoVao = "Hexa";
				}
				if (rdbtnNewRadioButton.isSelected()) {
					coSoVao = "Binary";
				}
				
				String coSoRa = "Text";
				if (rdbtnNewRadioButton_1_1.isSelected()) {
					coSoRa = "Hexa";
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					coSoRa = "Binary";
				}
				
				MaHoa.maHoaFile(input, textArea_1, textArea_2, coSoVao, coSoRa);
			}
		});
		btnNewButton_2_1.setBounds(452, 405, 89, 23);
		contentPane_1.add(btnNewButton_2_1);
	}
	
}