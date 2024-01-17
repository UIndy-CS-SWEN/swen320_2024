package ex;

import java.util.ArrayList;

public class a {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i <args.length; i++) {
			al.add(args[i]);
			System.out.println(args[i]);
		}

		for (String s: al) {
			System.out.println(s);
		}
	}
}
