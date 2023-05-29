package company.service;

public class Manager {
    private String login;
    private String password;

//    public Manager(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }

    public String getLogin() {
        return login;
    }

    public Object setLogin(String login) {
        this.login = login;
        return null;
    }

    public String getPassword() {
        return password;
    }

    public Object setPassword(String password) {
        this.password = password;
        return null;
    }
}
