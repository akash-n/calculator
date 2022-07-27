package subsequece;
class Longest_subsequence{
public int Solution(int arr[]){
    int sr[] = new int[arr.length];
    int actualSolution[] = new int[arr.length];{
    for(int i=0; i < arr.length; i++){
        sr[i] = 1;
        actualSolution[i] = i;
    }
    
    for(int i=1; i < arr.length; i++){
        for(int j=0; j < i; j++){
            if(arr[i] > arr[j]){
                if(arr[j] + 1 > arr[i]){
                    arr[i] = arr[j] + 1;
                   
                    actualSolution[i] = j;
                }
            }
        }
    }
    int maxIndex = 0;
    for(int i=0; i < sr.length; i++){
        if(sr[i] > sr[maxIndex]){
            maxIndex = i;
        }
    }
    
    //lets print the actual solution
    int t = maxIndex;
    int newT = maxIndex;
    do{
        t = newT;
        System.out.print(arr[t] + " ");
        newT = actualSolution[t];
    }while(t != newT);
    System.out.println();

    return sr[maxIndex];
}
}

/**
 * Recursive way of solving LIS
 */
public int longestSubsequenceRecursive(int arr[]){
    int maxLen = 0;
    for(int i=0; i < arr.length-1; i++){
        int len = longestSubsequenceRecursive(arr,i+1,arr[i]);
        if(len > maxLen){
            maxLen = len;
        }
    }
    return maxLen + 1;
}

private int longestSubsequenceRecursive(int arr[], int pos, int lastNum){
    if(pos == arr.length){
        return 0;
    }
    int t1 = 0;
    if(arr[pos] > lastNum){
        t1 = 1 + longestSubsequenceRecursive(arr, pos+1, arr[pos]);
    }
    int t2 = longestSubsequenceRecursive(arr, pos+1, lastNum);
    return Math.max(t1, t2);
}

public static void main(String args[]){
    Longest_subsequence lis = new Longest_subsequence();
    int arr[] = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
    int result = lis.longestSubsequenceRecursive(arr);
    int result1 = lis.longestSubsequenceRecursive(arr);
    System.out.println(result);
    System.out.println(arr);
    System.out.println(result1);
System.out.println(lis);
}
}