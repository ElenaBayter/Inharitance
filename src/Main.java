public class Main {
    public static void main(String[] args) {
        AviaTransport avia = new AviaTransport("avia", "grey", 1000, 2020, true, true);
        AviaTransport helicopter = new AviaTransport("avia", "green", 250, 2010, false, false);
        Cars car = new Cars("cars", "red", 150, 2020, "Mazda", 1.6);
        CarOwner owner = new CarOwner("cars", "blue", 180, 2019, "Jeep", 2, "Elena");

        avia.display();
        System.out.println();;
        helicopter.display();
        System.out.println();
        car.display();
        System.out.println();
        owner.display();

    }
}