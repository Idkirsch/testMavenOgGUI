import gui_main.GUI;



public class Main {




    public static void main(String[] args) {
         GUI gui = new GUI();
         gui.setDie(6);
         gui.getUserButtonPressed("press");
         gui.setDie(5);
    }
}

