public class Stringmethod6 {
    String str = "Presentation";
    public static void main(String[] args) {
        Stringmethod6 s = new Stringmethod6();
        System.out.println("Original String: "+s.str);
        System.out.println("Uppercase: "+s.str.toUpperCase());
        System.out.println("New: "+s.str.concat(" day"));
        System.out.println("Char at 4: "+s.str.charAt(4));
        System.out.println("String length "+s.str.length());
        System.out.println("T is at: "+s.str.indexOf("t"));
        System.out.println(" String is empty?: "+s.str.isEmpty());
        System.out.println("get bytes- "+s.str.getBytes());
    }
}
