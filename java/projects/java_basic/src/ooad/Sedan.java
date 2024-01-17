package ooad;

public class Sedan extends Car {
    String brand;
    void accelerate() {
        super.setSpeed(this.getSpeed()*2);
    }

}
