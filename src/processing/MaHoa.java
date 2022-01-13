package processing;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MaHoa {
	// thuat toan RC4
	public static String rc4(byte[] k, ArrayList<Integer> input) {
		String res = "";
		int N = k.length;
		
		if (N < 1 || N > 256) {
			return "Error Key";
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
		for (int l = 0; l < input.size(); l++) {
			i = (i + 1) % 256;
			j = (j + s[i]) % 256;
			temp = s[i]; 
			s[i] = s[j];
			s[j] = temp;
			temp = (s[i] + s[j]) % 256;
			res = res + (s[temp] ^ input.get(l)) + " ";
		}
		
		return res;
	}
	
	// Ma hoa van ban nhap tu ban phim
	public static void maHoaText(JTextArea text, JTextArea key, JTextArea result, String coSoVao, String coSoRa) {
		String str = text.getText();
		
		// nguoi dung khong nhap gi ca
		if (str == null || "".equals(str)) {
			return;		
		}

		// xoa bo khoang trong thua
		str = dinhDang(str);
		
		// chuyen input tu co so dau vao thanh mang so nguyen la ma cua cac ki tu
		ArrayList<Integer> input = xuLyDauVao(str, coSoVao);
		
		// loi khi chuyen co so
		if (input == null) {
			result.setText("");
			JOptionPane.showMessageDialog(null, "Cơ số đã chọn không phù hợp!");
			return;
		}
		
		// xoa noi dung truoc do
		result.setText("");
		
		// tien hanh ma hoa
		byte[] k = key.getText().getBytes();
		String res = rc4(k, input);
		
		// neu ma hoa khong thanh cong
		if ("Error Key".equals(res)) {
			result.setText("");
			JOptionPane.showMessageDialog(null, "Độ dài của khóa trong khoảng từ 1 đến 256.\nKhông thể mã hóa!");
			return;
		}
		
		// chuyen output tu String thanh co so dau ra
		res = xuLyDauRa(res, coSoRa);
			
		// hien thi ket qua
		result.setText(res);
	}

	// ma hoa file tai len
	public static void maHoaFile(StringBuffer text, JTextArea key, JTextArea result, String coSoVao,
			String coSoRa) {
		String str = text.toString();
		
		// nguoi dung khong nhap gi ca
		if (str == null || "".equals(str)) {
			return;		
		}

		// xoa bo khoang trong thua
		str = dinhDang(str);
		
		// chuyen input tu co so dau vao thanh mang so nguyen la ma cua cac ki tu
		ArrayList<Integer> input = xuLyDauVao(str, coSoVao);
		
		// loi khi chuyen co so
		if (input == null) {
			result.setText("");
			JOptionPane.showMessageDialog(null, "Cơ số đã chọn không phù hợp!");
			return;
		}
		
		// xoa noi dung truoc do
		result.setText("");
		
		// tien hanh ma hoa
		byte[] k = key.getText().getBytes();
		String res = rc4(k, input);
		
		// neu ma hoa khong thanh cong
		if ("Error Key".equals(res)) {
			result.setText("");
			JOptionPane.showMessageDialog(null, "Độ dài của khóa trong khoảng từ 1 đến 256.\nKhông thể mã hóa!");
			return;
		}
		
		// chuyen output tu String thanh co so dau ra
		res = xuLyDauRa(res, coSoRa);
			
		// hien thi ket qua
		result.setText(res);
	}
	
	// ham xu ly dau vao tu co so ban dau
	public static ArrayList<Integer> xuLyDauVao(String str, String coSoVao) {
		ArrayList<Integer> input = new ArrayList<>();
		
		// neu la text
		if ("Text".equals(coSoVao)) {
			try {
				for (int i = 0; i < str.length(); i++) {
					input.add((int)(str.charAt(i)));
				}
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoVao)) {
			String[] arr = str.split(" ");
			try {
				for (int i = 0; i < arr.length; i++) {
					input.add(Integer.parseInt(arr[i], 16));
				}
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoVao)) {
			String[] arr = str.split(" ");
			try {
				for (int i = 0; i < arr.length; i++) {
					input.add(Integer.parseInt(arr[i], 2));
				}
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		
		return input;
	}
	
	// ham xu ly dau ra thanh co so da chon
	public static String xuLyDauRa(String str, String coSoRa) {
		String res = "";
		
		// neu la kieu Text
		if ("Text".equals(coSoRa)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				res = res + (char)(Integer.parseInt(arr[i]));
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoRa)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toBinaryString((Integer.parseInt(arr[i]))) + " ";
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoRa)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toHexString((Integer.parseInt(arr[i]))) + " ";
			}
		}
		
		return res;
	}
	
	// ham cat bo khoang trong thua trong dau vao
	public static String dinhDang(String str) {
		str = str.trim();
		
		while (str.contains("  ")) {
			str = str.replaceAll("  ", " ");
		}
		
		return str;
	}

}