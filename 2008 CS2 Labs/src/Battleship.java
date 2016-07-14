/**
 * Created by clatech on 7/13/2016.
 */

import java.io.*;

public class Battleship {
    public static void main(String[] args) {
        Ship my = new Ship("DHHH");
        System.out.println(my.direction);
        System.out.println(my.size);
        System.out.println(my.x);
        System.out.println(my.y);

        Ship my2 = new Ship("CBFB");
        System.out.println(my2.direction);
        System.out.println(my2.size);

        Ship my3 = new Ship("cdcf");
        System.out.println(my3.direction);
        System.out.println(my3.size);
    }
}