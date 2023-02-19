public class CarOwner extends Cars{
    private String name;

    public CarOwner(String type, String color, int speed, int year, String model, double engineCapacity, String name) {
        super(type, color, speed, year, model, engineCapacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" The owner is %s.", getName());
    }
}
