package data;

public enum LoginData {
    Login("mxmrbkv95@gmail.com");


    private String login;

    LoginData(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}
