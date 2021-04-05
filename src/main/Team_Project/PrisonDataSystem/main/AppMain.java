package PrisonDataSystem.main;

public class AppMain {

    public static void main(String[] args) {

        while (true) {
            startScreen();
            int selection = inputInteger(">>>");

            FrontController.chooseSystem(selection);
        }
    }

}

