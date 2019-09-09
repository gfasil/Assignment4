package lesson4;

public class Problem2 {
		
	
	public static char min(String input) {
		if(input==null ||input=="") return '\u0000';
		if(input.length()==1) return input.charAt(0);
	else if(input.charAt(0)<input.charAt(input.length()-1))
		
	{
		return min(input.substring(0, input.length()-1));}
		
	
	else {
		return min(input.substring(1, input.length()));}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min("fasil"));
	}

}
