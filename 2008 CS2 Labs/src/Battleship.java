/**
 * Created by clatech on 7/13/2016.
 */

import java.io.*;

public class Battleship {
    public static void main(String[] args) {
        Ship my = new Ship("DHHH");
        System.out.println(my.direction);
        System.out.println(my.size);
    }
}

class Tile {
    private String tile = "░ ";

    Tile() {
    }

    void set_tile() {
        tile = "winner";
    }

    void get_tile() {
        System.out.print(tile);
    }
}

class Ship{
    static int letter = 0;
    char ship_letter;
    String direction;
    int size;
    int hits = 0;
    String status = "Alive";

    Ship(String cords){
        letter++;
        ship_letter = (char)(letter +'A' - 1);
        String[] coordinates = cords.split("(?!^)");
        if(coordinates[0] == coordinates[2]) {
            direction = "vertical";
            size = (Integer.valueOf(coordinates[2]) - Integer.valueOf(coordinates[0]));
        }
        else {
            direction = "horizontal";
            size = (Integer.valueOf(coordinates[3]) - Integer.valueOf(coordinates[1]));
        }
    }

    Grid place(Grid grid) {

        return grid;
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