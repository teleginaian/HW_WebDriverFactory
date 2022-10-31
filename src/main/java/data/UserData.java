package data;

public enum UserData {
    Fname("Егор"),
    FnameLatin("Egor"),
    Lname("Степанов"),
    LnameLatin("Stepanov");

    private String userData;

    UserData(String userData) {
        this.userData = userData;
    }

    public String getUserData() {
        return this.userData;
    }

}
