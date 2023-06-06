package assignment2;

public class BMW extends Cars {
    public BMW() {
    }

    public int speed(int topspeed, int pickup) {
        int i=topspeed + pickup;
        return i;
    }
}