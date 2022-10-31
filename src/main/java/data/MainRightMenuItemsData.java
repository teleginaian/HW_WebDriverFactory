package data;

public enum MainRightMenuItemsData {

    PersonalAerea("Имя профиля");

    private String name;

    MainRightMenuItemsData(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }



}
