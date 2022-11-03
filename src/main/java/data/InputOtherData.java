package data;

public enum InputOtherData {

    COMPANY("company"),
    WORK("work");


    private String name;

    InputOtherData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
