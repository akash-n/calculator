package phase1_assisted_project;

public class K4thSmallestEle  
{  
public void sortArr(int arr[])  
{  
int size = arr.length; 
for(int i = 0; i < size; i++)  
{  
int temp = i;  
for(int j = i + 1; j < size; j++)  
{  
if(arr[temp] > arr[j])  
{  
temp = j;  
}    
}    
if(temp != i)  
{  
int t = arr[i];  
arr[i] = arr[temp];  
arr[temp] = t;   
}  
}  
}  
 
public int findKthSmallest(int arr[], int k)  
{  
sortArr(arr);  
  
  
return arr[k - 1];  
}   
public static void main(String argvs[])  
{  
  
 
K4thSmallestEle obj = new K4thSmallestEle();  
  
int arr[] = {56, 34, 7, 9, 0, 48, 41, 8};  
  
int size = arr.length;  
int k = 4;  
  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr[i] + " ");
  

}int ele = obj.findKthSmallest(arr, k);  

System.out.println();
System.out.println("the required 4th smallest ement in unsorted list is: "+ele);
 }}