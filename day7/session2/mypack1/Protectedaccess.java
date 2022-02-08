package mypack1;

import pack1.Protectedclass;

public class Protectedaccess extends Protectedclass{
    
    public static void main(String[] args) {
        Protectedaccess pa = new Protectedaccess();
        Protectedclass p = new Protectedclass();
        pa.show();
    }
}
