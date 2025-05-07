package test;

public class Train implements Vehicle{
    private String name;
    private int ID;

    public Train(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public void drive() {
        System.out.println("This train is driving");
    }
}
