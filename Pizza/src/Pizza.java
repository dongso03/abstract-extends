import java.util.Scanner;

abstract class Pizza {
    protected int price;
    protected String size;
    protected boolean toppingAdded;

    public Pizza(int price, String size) {
        this.price = price;
        this.size = size;
        this.toppingAdded = false;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public abstract void addToppings();

    public abstract void cook();

    public boolean isToppingAdded() {
        return toppingAdded;
    }
}