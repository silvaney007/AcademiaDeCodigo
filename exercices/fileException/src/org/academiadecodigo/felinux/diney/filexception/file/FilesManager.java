package org.academiadecodigo.felinux.diney.filexception.file;

import org.academiadecodigo.felinux.diney.filexception.exceptions.*;


public class FilesManager {

    private static File[] files;
    private boolean logUser;


    public FilesManager(File[] files) {
        this.files = files;
        this.logUser = false;
    }

    public void login() throws FileException {
        logUser = true;
        System.out.println("login success");
    }

    public void logout() {
        logUser = false;
        System.out.println("Logout success");
    }

    public File getFile(String file) throws FileNotFoundException, NotEnoughPermissionException {
        if (logUser) {
            for (int index = 0; index < files.length; index++) {
                if (files[index].getFile().equals(file)) {
                    return files[index];
                }
            }
            throw new FileNotFoundException();
        }
        throw new NotEnoughPermissionException();
    }

    public void createFile(String file) throws FileException {
        if (logUser) {
            for (int index = 0; index < files.length; index++) {
                if (files[index].getFile().equals("")) {
                    files[index] = new File(file);
                    return;
                }
            }
            throw new NotEnoughSpaceException();
        }
        throw new NotEnoughPermissionException();
    }

    public void deleteFile(File file) throws FileNotFoundException, NotEnoughPermissionException {
        if (logUser) {
            for (int index = 0; index < files.length; index++) {
                if (files[index].getFile().equals(file)) {
                    files[index] = new File("");
                }
            }
            throw new FileNotFoundException();
        }
        throw new NotEnoughPermissionException();
    }
}