public class Seller {
    String name;
    long phone;

    public Seller(String name) {
        this.name = name;
    }

    public void sellShoe(Shoe shoe) {
        System.out.println("Seller " + name + " sold " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
    }

    public void exchangeShoe(Shoe shoe) {
        System.out.println("Seller " + name + " exchanged " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
    }

    public void helpClient() {
        System.out.println("Seller " + name + " helped a client");
    }

    public int searchShoe(Shoe shoe) {
        System.out.println("Seller " + name + " searched for " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
        return shoe.stock;
    }
}
