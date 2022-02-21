public class Single3 {
    
    public static void main(String[] args) {
        
        try {
            int ar[] = new int[5];
            ar[3] = 19;
            String s = "icecream";
            ar[2] = 20/2;
            System.out.println(ar[2]);
            int i = Integer.parseInt(s);
            System.out.println(i + " "+s.length());

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("invalid index");
        }
        catch (ArithmeticException ai) {
            System.out.println("donot take 0 as denominator");
        }
        catch (NumberFormatException ne) {
            System.out.println("cannot convert int to string");
        }
        catch (Exception e) {
            System.out.println("unable to find length of string");
        }
        finally{
            System.out.println("executes to close ");
        }
        System.out.println("rem lines of code");

    }

}
