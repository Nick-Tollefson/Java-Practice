public class Ship{
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

    Grid place(Grid grid) {
        if (direction.equals("horizontal")) {
            for (int i = 0; i < size; i++) {
                grid.getTiles()[x + i][y].ship_tile(ship_letter);
            }
        }
        return grid;
    }
}
