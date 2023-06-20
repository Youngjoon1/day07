package String;

public class TestClass01 {

	public static void main(String[] args) {

		String str;
		String str2 = new String();
		
		String str3 = "test";
		String str4 = new String("Java programming");
		//수강하는 과목 저장 : Java, java, JAVA
		String s1 = str4.toUpperCase();
		System.out.println(s1);
		String s2 = str4.toLowerCase();
		System.out.println(s2);
		System.out.println(str4);
		
		//수강하는 과목 저장 : Java, java, JAVA
		str3 = "Java";
		if(str3.toLowerCase().equals("java")) {
			System.out.println("수강 괴목은 자바군요");
		}
		
		
		
	}

}
