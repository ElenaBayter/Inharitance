public class AviaTransport extends Transport{
    private boolean plane;
    private boolean civil;

    public AviaTransport(String type, String color, int speed, int year, boolean plane, boolean civil) {
        super(type, color, speed, year);
        this.plane = plane;
        this.civil = civil;
    }

    public boolean isPlane() {
        return plane;
    }

    public void setPlane(boolean plane) {
        this.plane = plane;
    }

    public boolean isCivil() {
        return civil;
    }

    public void setCivil(boolean civil) {
        this.civil = civil;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" Is it plane: %b, is it civil transport: %b.", isPlane(), isCivil());
    }
}
