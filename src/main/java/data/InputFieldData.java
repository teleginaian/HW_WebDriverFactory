package data;

public enum InputFieldData {

    FNAME("fname"),
    FNAMELATIN("fname_latin"),
    LNAME("lname"),
    LNAMELATIN("lname_latin"),
    BLOGNAME("blog_name"),
    DATAOFBIRTH("18.04.1995");


    private String name;

    InputFieldData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
