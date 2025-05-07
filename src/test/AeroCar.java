package test;

public class AeroCar extends Car{
    public AeroCar(int ID, String name) {
        super(ID, name);
    }

    public void fly() {
        System.out.println("This car is flying");
    }
}
