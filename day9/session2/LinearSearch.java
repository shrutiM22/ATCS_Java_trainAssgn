/**
 * LinearSearch
 */
public class LinearSearch {

    int linear(int arr[],int k){
        int i;
        for( i=0; i<arr.length; i++){
            if(arr[i] == k){
                return i+1;
            }
        }
        return -1;
        
        
        
    }

    public static void main(String[] args) {
        int a[]= {12,89,46,67,2,70,43};
        int key = 2;
        LinearSearch l = new LinearSearch();
        if(l.linear(a,key) == -1)
            System.out.println("Key not found");
        else
            System.out.println("key found at: " +l.linear(a,key)); 
    }
}