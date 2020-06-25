import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		String word = "Amarelo";
		System.out.println(isograms(word));
		
		String word2 = "mouse";
		System.out.println(isograms(word2));
		
	//	System.out.println(word.length());
		
	//	System.out.println(word.substring(0,4));
		
		List<String> c = new ArrayList<>();
		
		System.out.println();
		
	    }
	
	/*public static boolean isograms(String str) {
		String word = str.toLowerCase();
		
		for(int i = 0; i < word.length(); i++){
	        
	          for(int j = 0; j < i; j++) {
	        	  if(word.charAt(i) == (word.charAt(j))){
	        		  return false;	        		  
	        	  }
	          }
	        }
		return true;
	}*/
	
	public static boolean isograms(String str) {
		 return str.length() == str.toLowerCase().chars().distinct().count();
	}
}