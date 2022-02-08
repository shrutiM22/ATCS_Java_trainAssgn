public class Second {
    public static int addNum(int a,int b){
        return a+b;
    }

    void binadd(){
        String b1 = "1010";
        String b2 = "0010";
        int n1= Integer.parseInt(b1,2);
        int n2 = Integer.parseInt(b2,2);
        int sum = n1+n2;
        String b3 = Integer.toBinaryString(sum);
        System.out.println(b1 + " + " + b2+  ": " +b3);
    }

    void charadd(){
        char a= 'a',b='b';
        int s = (int) a + (int) b;
        System.out.println(a + "+" + b + ": "+ s);

    }

    public static void main(String[] args) {
        System.out.println("addition of two numbers: " +Second.addNum(60,11));
        Second aa = new Second();
        aa.binadd();
        aa.charadd();
    }
}
