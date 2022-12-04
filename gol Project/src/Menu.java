public class Menu {


    public void display(){
        System.out.println("1. Print next generation");
        System.out.println("2. Display Rules");
        System.out.println("3. Exit");
    }

    public void DisplayMainMenu(int c){


        switch (c) {
            case 2:
                System.out.println("**Rules**\n" +
                        "    1.Death: If a cell is alive (1) it will die (0) due :\n" +
                        "     -  Loneliness (1,0 alive neighbors)\n" +
                        "     -  Overpopulation (four or more alive neighbours)\n" +
                        "    2.Birth: If a cell is dead (0) it becomes alive (1) due:\n" +
                        "     -  three alive neighbors\n" +
                        "    3.Stasis: In all other cases, the cell state does not change.");
                break;
            case 3:
                System.exit(0);

        }
    }

}
