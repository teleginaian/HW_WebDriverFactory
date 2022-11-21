package data;

public enum GenderData {

    MAN("m"),
    WOMAN("f");

    private String name;

    GenderData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
