public class Transport {
    private String type;
    private String color;
    private int speed;
    private int year;

    public Transport(String type, String color, int speed, int year) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }


    public int getYear() {
        return year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void display(){
        System.out.printf("Transport with type: %s, color: %s, has speed: %d km/h and year of manufacturing: %d.", getType(), getColor(), getSpeed(), getYear());
    }
}
