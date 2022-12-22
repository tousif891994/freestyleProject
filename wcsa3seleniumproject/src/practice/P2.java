package practice;

public class P2 {
	public static void main(String[] args) {
		String s="Hello1234";
		String []part=s.split("(?<=\\D)(?=\\d)");
		System.out.println(part[0]);
		System.out.println(part[1]);
	}

}
