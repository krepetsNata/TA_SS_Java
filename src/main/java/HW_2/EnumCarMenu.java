package HW_2;

enum EnumCarMenu {
    ADD_CAR("add_car", 1),
    REMOVE_CAR("remove_car", 2),
    SHOW_CARS("show_cars", 3),
    SORT_CARS("sort_cars", 4);

    private String title;
    private int numOfOperation;
    private ActionsOnCars actionsOnCars;

    EnumCarMenu(String title, int numOfOperation) {
        this.title = title;
        this.numOfOperation = numOfOperation;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfOperation() {
        return numOfOperation;
    }

    public static EnumCarMenu setNumOfOperation(int value) {
        switch (value) {
            case 1:
                return EnumCarMenu.ADD_CAR;
            case 2:
                return EnumCarMenu.REMOVE_CAR;
            case 3:
                return EnumCarMenu.SHOW_CARS;
            case 4:
                return EnumCarMenu.SORT_CARS;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "\nEnumCarMenu{" +
                "title='" + title + '\'' +
                ", numOfOperation=" + numOfOperation +
                "}";
    }
}
