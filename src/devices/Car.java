package devices;

public class Car {
    private static final String MODEL = "Mustang";
    private static final String PRODUCER = "Ford";
    private final String yearOfManufacture;
    private final Double cost;

    public Car(String yearOfManufacture) {
        this.cost = 2200.0;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getFullCarSpecs() {
        return MODEL + " " +PRODUCER + " " + yearOfManufacture;
    }

    public Double getCost() {
        return this.cost;
    }
}
