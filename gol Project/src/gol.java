/* **Rules**
    1.Death: If a cell is alive (1) it will die (0) due :
     -  Loneliness (1,0 alive neighbors)
     -  Overpopulation (four or more alive nrighbours)
    2.Birth: If a cell is dead (0) it becomes alive (1) due:
     -  three alive neighbors
    3.Stasis: In all other cases, the cell state does not change.

    */

public class gol {


    static int[][] nextGeneration(int grid[][], int row, int col) {


        int[][] future = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //checking the nb of neighbours that are alive
                int aliveNeighbours = 0;
                for (int inb = -1; inb <= 1; inb++)
                    for (int jnb = -1; jnb <= 1; jnb++)
                        if ((i + inb >= 0 && i + inb < row) && (j + jnb >= 0 && j + jnb < col))
                            aliveNeighbours += grid[i + inb][j + jnb];

                aliveNeighbours -= grid[i][j];


                // loneliness
                if ((grid[i][j] == 1) && (aliveNeighbours < 2))
                    future[i][j] = 0;

                // overpopulation
                else if ((grid[i][j] == 1) && (aliveNeighbours > 3))
                    future[i][j] = 0;

                //new cell
                else if ((grid[i][j] == 0) && (aliveNeighbours == 3))
                    future[i][j] = 1;


                else
                    future[i][j] = grid[i][j];
            }


        }
        System.out.println("Next Generation");
        for (int ii = 0; ii < row; ii++) {
            for (int jj = 0; jj < col; jj++)
            {
                grid[ii][jj] = future[ii][jj];
                if (grid[ii][jj] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        return grid;

    }

}
