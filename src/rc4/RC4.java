package rc4;

import java.util.ArrayList;

import javax.swing.JTextArea;

public class RC4 {
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
			System.out.println(s[temp] + " " + input.get(l));
			res = res + (s[temp] ^ input.get(l)) + " ";
		}
		
		return res;
	}
	
	public static void maHoaText(JTextArea text, JTextArea key, JTextArea result, String coSoVao, String coSoRa) {
		// chuyen doi co so cua van ban dau vao
		String str = text.getText();
		ArrayList<Integer> input = new ArrayList<>();
		
		// neu la text
		if ("Text".equals(coSoVao)) {
			for (int i = 0; i < str.length(); i++) {
				input.add((int)(str.charAt(i)));
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoVao)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				input.add(Integer.parseInt(arr[i], 16));
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoVao)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				input.add(Integer.parseInt(arr[i], 2));
			}
		}
		
		result.setText("");
		byte[] k = key.getText().getBytes();
		String res = rc4(k, input);
		
		if ("Error Key".equals(res)) {
			result.setText("Do dai cua khoa trong khoang 1 den 256.\nKhong the ma hoa!");
			return;
		}
		
		// chuyen doi co so cua van ban dau ra
		
		// neu la kieu Text
		if ("Text".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + (char)(Integer.parseInt(arr[i]));
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toBinaryString((Integer.parseInt(arr[i]))) + " ";
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toHexString((Integer.parseInt(arr[i]))) + " ";
			}
		}
				
		result.setText(res);
	}

	public static void maHoaFile(StringBuffer text, JTextArea key, JTextArea result, String coSoVao,
			String coSoRa) {
		// chuyen doi co so cua van ban dau vao
		String str = text.toString();
		ArrayList<Integer> input = new ArrayList<>();
		
		// neu la text
		if ("Text".equals(coSoVao)) {
			for (int i = 0; i < str.length(); i++) {
				input.add((int)(str.charAt(i)));
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoVao)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				input.add(Integer.parseInt(arr[i], 16));
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoVao)) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				input.add(Integer.parseInt(arr[i], 2));
			}
		}
		
		result.setText("");
		byte[] k = key.getText().getBytes();
		String res = rc4(k, input);
		
		if ("Error Key".equals(res)) {
			result.setText("Do dai cua khoa trong khoang 1 den 256.\nKhong the ma hoa!");
			return;
		}
		
		// chuyen doi co so cua van ban dau ra
		
		// neu la kieu Text
		if ("Text".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + (char)(Integer.parseInt(arr[i]));
			}
		}
		
		// neu la co so 2
		if ("Binary".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toBinaryString((Integer.parseInt(arr[i]))) + " ";
			}
		}
		
		// neu la co so 16
		if ("Hexa".equals(coSoRa)) {
			String[] arr = res.split(" ");
			res = "";
			for (int i = 0; i < arr.length; i++) {
				res = res + Integer.toHexString((Integer.parseInt(arr[i]))) + " ";
			}
		}
				
		result.setText(res);
	}

}
