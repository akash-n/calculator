package phase1_assisted_project;

import java.util.Queue;
import java.util.LinkedList;
public class QueueExample 
{
public static void main(String[] args) 
{
        		Queue<Integer> Q
                = new LinkedList<Integer>();
        		  
                // Add numbers to end of Queue
                Q.add(7855642);
                Q.add(35658786);
                Q.add(5278367);
                Q.add(74381793);
          
                // print queue
                System.out.println("Queue: " + Q); 
                System.out.println("Queue's head: " + Q.remove());
                
                // print head and deleted the head
                System.out.println("Queue's head: " + Q.remove());
            }

          
    	}
