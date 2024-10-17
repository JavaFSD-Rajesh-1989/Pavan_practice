package basic;

import java.util.HashMap;

public class One {
	public static void main(String[] args) {
		 String input = "Evaru";
	       // output: 3?4??7
		 StringBuilder output = new StringBuilder();
	       HashMap<Character,Integer> map = new HashMap<>();
	       map.put('A',1);
	       map.put('B',2);
	       map.put('C',3);
	       map.put('D',4);
	       map.put('E',5);
	       map.put('F',6);
	       map.put('G',7);
	       map.put('a', 1);
	       map.put('b', 2);
	       map.put('c', 3);
	       map.put('d', 4);
	       map.put('e', 5);
	       map.put('f', 6);
	       map.put('g', 7);
	       int j = 0;
	       int n = map.size();
	       for(int i = 0; i< input.length(); i++)
	       {
	    	   char ch = input.charAt(i);
	    	   if(map.containsKey(ch))
	    	   {
	    		 output.append(map.get(ch));
	    	   }
	    	   else {
                   output.append('?');
               }
	       }
	      String output1 = output.toString();
	       System.out.println(output1);   
	}
}
