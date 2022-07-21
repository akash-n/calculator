package unit_2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class map_1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		HashMap<Integer,String> me=new HashMap<Integer,String>();
				me.put(5, "alex");
				me.put(22, "alex");
				me.put(4, "ananruska");
				
				System.out.println(me);
				
	
	Hashtable<Integer,String> mine=new Hashtable<Integer,String>();
	           mine.put(2,"maxella");
	           mine.put(3, "abc");
	           mine.put(4, "cde");
	           mine.put(5, "efg");
	           mine.put(6, "mng");
	           mine.put(7, "jkh");
	          
	           System.out.println(mine);
	          for(Map.Entry n:mine.entrySet()){    
	    	       System.out.println(n.getKey()+" "+n.getValue());    

	           
	           TreeMap<Integer,String> map=new TreeMap<Integer,String>();    {
	        	   map.put(98, "alex");
					map.put(122, "alex");
	 
	    System.out.println(map);
	        	   for(Map.Entry k:map.entrySet()){    
		    	       System.out.println(k.getKey()+" "+k.getValue());
	           }
	           }}}}
