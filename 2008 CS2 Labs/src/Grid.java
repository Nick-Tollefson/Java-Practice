public class Grid {
    private Tile[][] grid;

    public Grid(int size){
        grid = new Tile[size][size];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Tile();
            }
        }
    }

    public Tile[][] getTiles()
    {
        return this.grid;
    }

    public void display_grid(){
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
