package data;

public enum ContactData {

    TELEGRAM("Тelegram"),
    VK("VK");

    private String name;

    ContactData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
