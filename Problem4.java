package lesson4;

public class Problem4 {
	static boolean isPalondrome(String word) {
		
		if(word.length()<=1) return true;
		if(word=="") return true;
		else if(word.charAt(0)!=word.charAt(word.length()-1)) return false;
		else {
			
		return	isPalondrome(word.substring(1,word.length()-1));
		}
		
		
	}
public static void main(String[] args) {
	boolean ispal=isPalondrome("mo");
	if(ispal) {
	System.out.println("\n input is palindrome");
	}
	else {
		System.out.println("\n input is not palindrome");
		
	}
	
}


}
