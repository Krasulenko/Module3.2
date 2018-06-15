package classwork.phones;

public class IPhone extends Phone {
    private String displayModel;

    public IPhone(String manufacturer, String operatingSystem, String model, int cost, String displayModel) {
        super(manufacturer, operatingSystem, model, cost);
        this.displayModel = displayModel;
    }
}
