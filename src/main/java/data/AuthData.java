package data;

    public enum AuthData {
        Login("mxmrbkv95@gmail.com"),
        Password("AutoTestOtus2022!");


    private String auth;

    AuthData(String auth) {
        this.auth = auth;
    }

    public String getAuth() {
        return this.auth;
    }
}
