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

    public static void printCarActions(ActionsOnCars actionsOnCars, int enumCarMenu, Car car) {

        switch (enumCarMenu) {
            case 1:
                actionsOnCars.addCar(car);
                System.out.println("Car was added");
                break;
            case 2:
                actionsOnCars.removeCar(car);
                System.out.println("Car was removed");
                break;
            case 3:
                actionsOnCars.showCars();
                System.out.println("List of all cars");
                break;
            case 4:
                actionsOnCars.sortCars();
                System.out.println("Sorted list of cars");
                break;
            default:
                System.out.println("Wrong operation");
                break;
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
