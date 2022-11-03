package data;

public enum InputContactInformationData {

    VK("id_contact-0-value"),
    TELEGRAM("id_contact-1-value");


    private String name;

    InputContactInformationData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
