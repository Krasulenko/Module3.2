package classwork.phones;

public class Phone {
    private String manufacturer;
    private String operatingSystem;
    private String model;
    private int cost;

    // private
    // public
    // protected
    // (defauly-package private)

    public Phone(String manufacturer, String operatingSystem, String model, int cost) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.cost = cost;
    }

    void test () {
        System.out.println("test");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
