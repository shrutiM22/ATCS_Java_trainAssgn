public class Minnum {
    
    public static void main(String[] args) {
        int n[] = {12,78,36,40,3,66};
        int min=n[0];
        for(int i=1;i<n.length;i++)
            if(n[i]<min)
                min = n[i];
            
        System.out.println(min);
    }
}
