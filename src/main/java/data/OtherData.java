package data;

public enum OtherData {

    COMPANY("company"),
    WORK("work");


    private String name;

    OtherData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
