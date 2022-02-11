public class BinarySearch {
    
    int binary(int a[],int k){
        int l=1;
        int h=a.length;
        while(l <= h) {
            int mid = (l+h)/2;
            if(a[mid] == k)
                return mid;
            if(a[mid] < k)
                l = mid + 1;
            else 
                h = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {

        BinarySearch b = new BinarySearch();
        int arr[]= {1,2,3,4,5,6,7,8,9};

        if(b.binary(arr, 7) == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at: " + b.binary(arr, 7));
    }

}
