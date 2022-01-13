package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class InputText extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public InputText() {
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
		
		// chuyen doi giao dien khi thay doi trong menu
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				int selection = comboBox.getSelectedIndex();
				switch(selection) {
				case 0:
					setVisible(true);
					
					break;
				case 1:
					new InputFile().setVisible(true);
					setVisible(false);
					
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Nhập văn bản", "Tải file lên"}));
		comboBox.setBounds(75, 29, 679, 22);
		contentPane_1.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Binary");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(366, 58, 128, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hexa");
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(236, 58, 128, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Text");
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(104, 58, 130, 23);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Text");
		rdbtnNewRadioButton_2_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_2_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton_2_1.setSelected(true);
		buttonGroup_1.add(rdbtnNewRadioButton_2_1);
		rdbtnNewRadioButton_2_1.setBounds(104, 236, 130, 23);
		contentPane_1.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Hexa");
		rdbtnNewRadioButton_1_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1_1.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(236, 236, 128, 23);
		contentPane_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Binary");
		rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_3.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(366, 236, 128, 23);
		contentPane_1.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("V\u0103n b\u1EA3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 90, 55, 108);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kh\u00F3a");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 209, 55, 20);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblResult = new JLabel("K\u1EBFt qu\u1EA3");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResult.setBounds(10, 264, 55, 110);
		contentPane_1.add(lblResult);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBounds(63, 11, 591, 108);
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(679, 108);
		scrollPane.setLocation(75, 88);
		contentPane_1.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		contentPane_1.add(textArea_1);
		textArea_1.setBounds(75, 207, 679, 22);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea_2.setBounds(63, 161, 591, 110);
		textArea_2.setLineWrap(true);
		scrollPane = new JScrollPane(textArea_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(679, 108);
		scrollPane.setLocation(75, 266);
		contentPane_1.add(scrollPane, BorderLayout.CENTER);
		
		// action nhan vao ma hoa
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
				
				MaHoa.maHoaText(textArea, textArea_1, textArea_2, coSoVao, coSoRa);
			}
		});
		
		btnNewButton_2.setBounds(236, 405, 89, 23);
		contentPane_1.add(btnNewButton_2);
		
		// action nhan vao giai ma
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
				
				MaHoa.maHoaText(textArea, textArea_1, textArea_2, coSoVao, coSoRa);
			}
		});
		btnNewButton_2_1.setBounds(452, 405, 89, 23);
		contentPane_1.add(btnNewButton_2_1);
	}

}