public class Cars extends Transport {
    private String model;
    private double engineCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Cars(String type, String color, int speed, int year, String model, double engineCapacity) {
        super(type, color, speed, year);
        this.model = model;
        this.engineCapacity = engineCapacity;

    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" Model %s has engine capacity %f.", getModel(), getEngineCapacity());
    }
}

