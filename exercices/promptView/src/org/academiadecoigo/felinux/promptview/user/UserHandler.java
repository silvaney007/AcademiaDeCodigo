package org.academiadecoigo.felinux.promptview.user;

import java.util.ArrayList;

public class UserHandler {

    private ArrayList<User> users;
    private UserInterface userInterface;

    public UserHandler() {
        super();
        users = new ArrayList<>();
        userInterface = new UserInterface();
    }

    public void init() {

        createUser();
        System.out.println("\nWelcome to your first Prompt-View Experience!\n");

        do {
            System.out.println("Insert your login credentials below:");
            userInterface.askName();
            userInterface.askPassword();
        } while (!login());
    }


    public boolean login() {
        for (User user : users) {
            if (user.getUserName().equals(userInterface.getUserName())){
                if (user.getPassword().equals(userInterface.getPassword())) {
                    System.out.println("\nLogin Successful!");
                    System.out.println("Welcome home, " + user.getUserName() + "!");
                    return true;
                }
            }
        }
        System.out.println("Login fail, user and/or password wrong\n");
        return false;
    }

    private void createUser() {
        users.add(new User("Rui", "123456"));
        users.add(new User("Jp", "123456"));
        users.add(new User("Ferrinhos", "123456"));
        users.add(new User("Neide", "123456"));
        users.add(new User("Adriana", "123456"));
        users.add(new User("Joana", "123456"));
    }
}
