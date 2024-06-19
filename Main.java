public class Main {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike", "Air Force 1", "White", 42, 10, 100);
        Shoe shoe2 = new Shoe("Adidas", "Campus 00", "Black", 41, 5, 80);
        Shoe shoe3 = new Shoe("Nike", "Jordan 4 Retro", "Green", 42, 11, 200);

        Seller seller1 = new Seller("Michael");
        Seller seller2 = new Seller("Jose");

        Client client1 = new Client("Joserh", "joserh@gmail.com", 123456789);
        Client client2 = new Client("Jean", "jean@gmail.com", 987654321);

        Register register = new Register();

        register.addClient(client1);
        register.addClient(client2);
        register.addSeller(seller1);
        register.addSeller(seller2);
        register.addShoe(shoe1);
        register.addShoe(shoe2);
        register.addShoe(shoe3);

        register.showClients();
        System.out.println();
        register.showSellers();
        System.out.println();
        register.showShoes();
        System.out.println();
        register.showStock();
        System.out.println();

        register.sellShoe(shoe1, seller1, client1);
//        client1.history.addShoe(shoe1, "2024-06-19");
        System.out.println();

        register.sellShoe(shoe2, seller2, client2);
//        client2.history.addShoe(shoe2, "2024-06-19");
        System.out.println();

        register.sellShoe(shoe3, seller1, client2);
//        client2.history.addShoe(shoe3, "2024-06-19");
        System.out.println();

        client1.askForHelp();
        seller1.helpClient();
        seller1.exchangeShoe(shoe1);
        System.out.println("Stock of " + shoe3 + ": " + seller1.searchShoe(shoe3));
        shoe1.addStock();
        shoe3.updateStock();
//        client1.history.returnShoe(shoe1, "2024-06-19");
//        client1.history.addShoe(shoe3, "2024-06-19");
        System.out.println();

        client2.contactSeller(seller1);
        client2.returnShoe(shoe2);
//        client2.history.returnShoe(shoe2, "2024-06-19");
        shoe2.addStock();
        System.out.println();

        register.showStock();

//        client1.history.showHistory();
//        client1.history.showTotalSpends();
//        client1.history.showLastPurchase();
//        System.out.println();
//
//        client2.history.showHistory();
//        client2.history.showTotalSpends();
//        client2.history.showLastPurchase();
//        System.out.println();
    }
}
