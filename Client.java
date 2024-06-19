public class Client {
    String name;
    String email;
    long phone;
    History history;

    public Client(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void buyShoe(Shoe shoe) {
        System.out.println("Client " + name + " bought " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
    }

    public void contactSeller(Seller seller) {
        System.out.println("Client " + name + " contacted " + seller.name + "at" + seller.phone);
    }

    public void returnShoe(Shoe shoe) {
        System.out.println("Client " + name + " returned " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
    }

    public void askForHelp() {
        System.out.println("Client " + name + " asked for help");
    }

    public void searchShoe(Shoe shoe) {
        System.out.println("Client " + name + " searched for " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
    }
}
