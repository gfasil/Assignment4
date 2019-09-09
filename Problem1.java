package lesson4;

public class Problem1 {
	
	public static String sort(String st1,String st2) {
		
		if(st1==null || st1=="") return st2;
		if(st2==null || st2=="") return st1;
		
		
			
			if(st1.charAt(0)<st2.charAt(0)) {
				if(st1.length()>1) 
					
				return st1.charAt(0) + sort(st1.substring(1),st2);
			
				else  return st1 + st2;
			}
		
		else {
			if(st2.length()>1) 
			 return st2.charAt(0) + sort(st1,st2.substring(1));
			else return st2+st1;
		}
		
		

	}
	public static void main(String[] args) {
		
		System.out.println(sort("f","def"));
	}

}
