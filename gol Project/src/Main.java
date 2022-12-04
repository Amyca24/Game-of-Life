import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner s = new Scanner(System.in);

        int row = 10, col = 10;

        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };


        System.out.println("Welcome to game of life!");
        System.out.println("Do you want to start?  y/n?");
        char ans = s.findInLine(".").charAt(0);
        if (ans == 'y'){
            int a = 0;
            while(a<3){
                menu.display();
                int c = s.nextInt();
                a = c;
                menu.DisplayMainMenu(c);
                if (a == 1){
                    grid = gol.nextGeneration(grid, row, col);

                }
            }



        }else if (ans == 'n'){
            System.exit(0);

        }else System.out.println("Incorrect answer");



    }


}