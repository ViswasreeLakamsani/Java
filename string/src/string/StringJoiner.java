package string;

public class StringJoiner {

	public static void main(String[] args) {
		String str=joinStrings("Hello, ","world!");
		System.out.println(str);
	}
		
	
	public static String joinStrings(String str1, String str2) {
		return(str1+str2);

}
}
