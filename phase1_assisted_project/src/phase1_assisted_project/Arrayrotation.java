package phase1_assisted_project;

public class Arrayrotation {
	public static void Arrayrotate(int[] arr,int d,int n) {
		int p=1;
		if(p<=d) {
		int last=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[n-1]= last;
	}for(int i=0;i<n;i++) {System.out.println(arr[i]);
	}}
	public static void main(String[] args)
	{
	    int arr[] = { 11, 32, 23, 46 };
	    int N = arr.length;
	   
	    int d = 2;

	    
	    Arrayrotate(arr, d, N);
	}}


