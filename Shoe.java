public class Shoe {
    String brand;
    String model;
    String color;
    int size;
    int stock;
    int price;

    public Shoe(String brand, String model, String color, int size, int stock, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.stock = stock;
        this.price = price;
    }

    public void updateStock() {
        this.stock--;
    }

    public void addStock() {
        this.stock++;
    }

    public String toString() {
        return brand + " " + model + " " + color + " " + size;
    }
}
