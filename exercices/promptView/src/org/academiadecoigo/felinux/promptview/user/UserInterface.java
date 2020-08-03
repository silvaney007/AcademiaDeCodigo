package org.academiadecoigo.felinux.promptview.user;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class UserInterface {

    private Prompt prompt;
    private String userName;
    private String password;


    public UserInterface() {
        prompt = new Prompt(System.in, System.out);
    }

    public void askName() {
        StringInputScanner user = new StringInputScanner();
        user.setMessage("Username: ");
        this.userName = prompt.getUserInput(user);
    }

    public void askPassword() {
        PasswordInputScanner pass = new PasswordInputScanner();
        pass.setMessage("Password: ");
        this.password = prompt.getUserInput(pass);
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}
