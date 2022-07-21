package unit_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class collections {

	public static void main(String[] args) {
		ArrayList<String>lisr=new ArrayList<String>();
		lisr.add("AKASH");
		lisr.add("KUUTUS");
		lisr.add("ABISHEK");
		System.out.println(lisr);
//the above program states about the modulation of array list.
		Vector<String>list=new Vector<String>();
		list.add("max");
		list.add("tull");
		list.add("2, maxzander");
		System.out.println(list);
		//this states about the vector modulation of the list
		LinkedList<Integer>list1=new LinkedList<Integer>();
        list1.add(21);
        
        list1.addAll(list1);
        System.out.println(list1);
        //states LInked list modulation
        Stack<Integer>list2=new Stack<Integer>();
        //states stack methodology
        list2.add(212);
        list2.addElement(21);
        list2.capacity();
        list2.hashCode();
        System.out.println(list2);
        //queue
        PriorityQueue<String>queuelist3=new PriorityQueue<String>();
        queuelist3.add("MAHESHWARN");
        queuelist3.add("Vishnu Raj");
        System.out.println("head"+ queuelist3.element());
        System.out.println(queuelist3);
        //hashset
        HashSet<String> set=new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        
        System.out.println(set);
        
        
	}

}
