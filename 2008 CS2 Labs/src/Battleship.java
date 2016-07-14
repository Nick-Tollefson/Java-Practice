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

class Tile {
    private String tile = "░ ";
    private char ship = '!';

    Tile() {}

    void get_tile() {
        System.out.print(tile);
    }

    void ship_tile (char letter) {
        ship = letter;
    }

    char fire_tile() {
        char status = 'g';

        if (ship == '!') {

        }
        return status;
    }
}

class Ship{
    static int letter = 0;
    char ship_letter;
    int x;
    int y;
    String direction;
    int size;
    int hits = 0;
    String status = "Alive";

    Ship(String cords){
        letter++;
        ship_letter = (char)(letter +'A' - 1);
        y = (int)cords.charAt(0) - 65;
        x = cords.charAt(1) - 65;

        if(cords.charAt(0) == cords.charAt(2)) {
            direction = "horizontal";
            size = (cords.charAt(3) - cords.charAt(1)) + 1;
        }
        else {
            direction = "vertical";
            size = (cords.charAt(2) - cords.charAt(0)) + 1;
        }
    }

    Grid place(Grid grid[][]) {
        if (direction.equals("horizontal")) {
            for (int i = 0; i < size; i++) {
                grid[x + i][y] = grid[x + i][y].ship_tile(ship_letter);
            }
        }
        return grid[][];
    }
}

class Grid {
    Tile[][] grid;

    Grid(int size){
        grid = new Tile[size][size];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Tile();
            }
        }
    }

    void display_grid(){
        System.out.println("  A  B  C  D  E");
        for (int i = 0; i < grid.length; i++) {
            System.out.print(((char)(i+'A'))+ " ");
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j].get_tile();
            }
            System.out.println();
        }
    }
}