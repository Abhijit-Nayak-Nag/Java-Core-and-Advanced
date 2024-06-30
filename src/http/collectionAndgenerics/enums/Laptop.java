package http.collectionAndgenerics.enums;

public enum Laptop {

    // these are the objects
    MACBOOOK(2000), XPS(1000), SURFACE(1500), THINKPAD(1000);

    private int price;

    Laptop(int price) {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
