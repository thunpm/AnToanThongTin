package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("M\u00E3 h\u00F3a RC4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane_1.setBounds(10, 11, 764, 439);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("V\u0103n b\u1EA3n");
		lblNewLabel.setBounds(10, 90, 55, 108);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kh\u00F3a");
		lblNewLabel_1.setBounds(10, 209, 43, 20);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblResult = new JLabel("K\u1EBFt qu\u1EA3");
		lblResult.setBounds(10, 264, 43, 110);
		contentPane_1.add(lblResult);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 11, 591, 108);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(679, 108);
		scrollPane.setLocation(75, 88);
		contentPane_1.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea_1 = new JTextArea();
		contentPane_1.add(textArea_1);
		textArea_1.setBounds(75, 207, 679, 22);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(63, 161, 591, 110);
		scrollPane = new JScrollPane(textArea_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(679, 108);
		scrollPane.setLocation(75, 266);
		contentPane_1.add(scrollPane, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("M\u00E3 h\u00F3a");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maHoa(textArea, textArea_1, textArea_2);
			}
		});
		btnNewButton_2.setBounds(236, 405, 89, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Gi\u1EA3i m\u00E3");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				giaiMa(textArea, textArea_1, textArea_2);
			}
		});
		btnNewButton_2_1.setBounds(452, 405, 89, 23);
		contentPane_1.add(btnNewButton_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nhập văn bản", "Tải file lên"}));
		comboBox.setBounds(75, 29, 679, 22);
		contentPane_1.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Binary");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(366, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hexa");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(236, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Text");
		rdbtnNewRadioButton_2.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(104, 58, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Text");
		rdbtnNewRadioButton_2_1.setSelected(true);
		buttonGroup_1.add(rdbtnNewRadioButton_2_1);
		rdbtnNewRadioButton_2_1.setBounds(104, 236, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Hexa");
		buttonGroup_1.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setBounds(236, 236, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Binary");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(366, 236, 109, 23);
		contentPane_1.add(rdbtnNewRadioButton_3);
	}
	
	public static void maHoa(JTextArea text, JTextArea key, JTextArea result) {
		result.setText("");
		byte[] text_ = text.getText().getBytes();
		byte[] k = key.getText().getBytes();
		String res = "";
	
		int N = k.length;
		
		if (N < 1 || N > 256) {
			result.setText("Do dai cua khoa trong khoang 1 den 256.\nKhong the ma hoa!");
			return;
		}

		int[] s = new int[256], t = new int[256];
		int i, j, temp;
		
		// khoi tao s va t
		for (i = 0; i < 256; i++) {
			s[i] = i;
			t[i] = k[i % N];
		}
		
		// hoa vi day s
		j = 0;
		for (i = 0; i < 256; i++) {
			j = (j + s[i] + t[i]) % 256;
			temp = s[i]; 
			s[i] = s[j];
			s[j] = temp;
		}
		
		// sinh so
		i = 0; j = 0;
		for (int l = 0; l < text_.length; l++) {
			i = (i + 1) % 256;
			j = (j + s[i]) % 256;
			temp = s[i]; 
			s[i] = s[j];
			s[j] = temp;
			temp = (s[i] + s[j]) % 256;
			System.out.println(s[temp] + " " + text_[l]);
			res = res + " " + hex(s[temp] ^ text_[l]);
		}
		
		result.setText(res);
	}
	
	public static void giaiMa(JTextArea text, JTextArea key, JTextArea result) {
		result.setText("");
		String[] textt = text.getText().split(" ");
		byte[] k = key.getText().getBytes();
		String res = "";
		
		char[] text_ = new char[textt.length];
		
		for (int i = 0; i < textt.length; i++) {
			int decimal = Integer.parseInt(textt[i], 16);
			text_[i] = (char) decimal;
			System.out.print(decimal + " ");
		}
	
		int N = k.length;
		
		if (N < 1 || N > 256) {
			result.setText("Do dai cua khoa trong khoang 1 den 256.\nKhong the ma hoa!");
			return;
		}

		int[] s = new int[256], t = new int[256];
		int i, j, temp;
		
		// khoi tao s va t
		for (i = 0; i < 256; i++) {
			s[i] = i;
			t[i] = k[i % N];
		}
		
		// hoa vi day s
		j = 0;
		for (i = 0; i < 256; i++) {
			j = (j + s[i] + t[i]) % 256;
			temp = s[i]; 
			s[i] = s[j];
			s[j] = temp;
		}
		
		// sinh so
		i = 0; j = 0;
		for (int l = 0; l < text_.length; l++) {
			i = (i + 1) % 256;
			j = (j + s[i]) % 256;
			temp = s[i]; 
			s[i] = s[j];
			s[j] = temp;
			temp = (s[i] + s[j]) % 256;
			System.out.println(s[temp] + " " + text_[l]);
			res = res + (char)(s[temp] ^ text_[l]);
		}
		
		result.setText(res);
	}

	private static String hex(int j) {
		String bi = "";
		while (j > 0) {
			if (j % 16 > 9) {
				bi = (char)((j % 16) - 10 + 97) + bi;
			} else {
				bi = (j % 16) + bi;
			}
			j /= 16;
		}
		
		while (bi.length() < 2) {
			bi = "0" + bi;
		}
		
		return bi;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
