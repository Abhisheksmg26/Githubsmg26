package Test.Selenium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacetr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name  is Abhishek";
		
		HashMap<Character,Integer> hm=new LinkedHashMap<>();
		
		  char[] arr=str.toCharArray();
		  
		  for(char  ch:arr)
		  {
			  if(hm.containsKey(ch))
			  {
				  hm.put(ch,hm.get(ch)+1);
			  }
			  else
			  {
				  hm.put(ch, 1);
			  }
		  }
		  
		  
		//  System.out.println(hm);
		  
		  for(Map.Entry<Character,Integer> eset:hm.entrySet())
			  
		  {
			  if(eset.getValue()==1)
			  {
				  System.out.println(eset.getKey()+" ");
			  }
			  
		  }

	}

}
