package pack;

import java.util.HashMap;
import java.util.Iterator;

public class First {
            public static void main(String args[]){
            	HashMap<String,String> hm = new HashMap<>();
            	hm.put("English","apple");
            	hm.put("Tamil","grapes");  
            	hm.put("Telugu","papaya");  
            	hm.put("kannada", "orange");    
            	hm.put("Malyalam", "");  
            	hm.put("Hindi", "Watermelon");  
            	Iterator<String> it=hm.keySet().iterator();
            	while(it.hasNext())  
            	{  
            	String key=(String)it.next();  
            	System.out.println("Langauge: "+key+" Fruits: "+hm.get(key));  
            	}  
            	}  
            	}  
            

