package basic;

public class Two {
	 public static void main(String[] args) {
	        String b = "abababa";
	        boolean isPalindrome = true;
	        
	        for (int i = 0, j = b.length() - 1; i < j; i++, j--) {
	            if (b.charAt(i) != b.charAt(j)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        
	        if (isPalindrome) {
	            System.out.println("True");
	        } else {
	            System.out.println("false");
	        }
	    }
}
