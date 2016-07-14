public class Tile {
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
