package module6.task1.bean;

import module6.task1.util.FileReaderAndWriter;

import java.io.FileNotFoundException;
import java.util.Set;

public class UserSet {
    static String from = "catalogBooks@mail.ru";
    private static Set<User> userSet;

    static {
        try {
            userSet = FileReaderAndWriter.getUserFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public UserSet() {
    }

    public UserSet(Set<User> userSet) {
        UserSet.userSet = userSet;
    }

    public User authorization() {
        User activeUser = null;
        boolean authorization = false;
        User userInit = new User();
        userInit.setLogin(User.inputLogin());
        userInit.setPassword(User.inputPassword());
        for (User user : userSet) {
            if (user.getLogin().equals(userInit.getLogin()) && user.getPassword().equals(userInit.getPassword())) {
                activeUser = user;
                authorization = true;
                break;
            } else {
                continue;
            }
        }
        if (authorization == false) {
            System.out.println("Вы не авторизованы.");
        } else {
            System.out.println("Вы авторизованы. Добрый день пользователь " + activeUser.getLogin());
        }
        return activeUser;
    }
}
