package module6.task3.server.bean;

public class Account {
    private boolean admin;
    private String login;
    private String password;

    public Account(boolean admin, String login, String password) {
        this.admin = admin;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String setAdmin(boolean admin) {
        this.admin = admin;
        return null;
    }

    @Override
    public String toString() {
        return "\nAccount {" +
                "admin: " + admin +
                ", login: " + login +
                ", password: " + password + "}";
    }
}
