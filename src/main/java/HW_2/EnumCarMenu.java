package HW_2;

enum EnumCarMenu {
    ADD_CAR("add_car"),
    REMOVE_CAR("remove_car"),
    SHOW_CAR("show_car"),
    SORT_CARS("sort_cars");

    private String title;

    EnumCarMenu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "\nEnumCarMenu{" +
                "title='" + title + '\'' +
                "}";
    }
}
