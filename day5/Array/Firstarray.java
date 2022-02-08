package Array;

public class Firstarray {
    
    public int average(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum += a[i];
        int av =sum/a.length;
        return av;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] =50;
        //q1
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        System.out.println(" "); 
        //avgerage q2
        Firstarray fa = new Firstarray();
        System.out.println(fa.average(arr));   
        //for each loop q3
        for(int i: arr)
            System.out.println(i);

    }
}
