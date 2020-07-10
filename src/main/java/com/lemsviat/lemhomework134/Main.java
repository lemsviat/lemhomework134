package main.java.com.lemsviat.lemhomework134;

public class Main {
    public static void main(String[] args) {
        UserConsole userConsole = new UserConsole();

        while (! userConsole.isQuit()) {
            userConsole.renderMenu();
            userConsole.readUserInput();
            userConsole.handleUserInput();
        }
    }
}