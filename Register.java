public class Register {
    Client[] clients = new Client[100];
    Seller[] sellers = new Seller[100];
    Shoe[] shoes = new Shoe[100];

    public void addClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) {
                clients[i] = client;
                break;
            }
        }
    }

    public void addSeller(Seller seller) {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] == null) {
                sellers[i] = seller;
                break;
            }
        }
    }

    public void addShoe(Shoe shoe) {
        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i] == null) {
                shoes[i] = shoe;
                break;
            }
        }
    }

    public void showClients() {
        for (Client client : clients) {
            if (client != null) {
                System.out.println("Client: " + client.name);
            }
        }
    }

    public void showSellers() {
        for (Seller seller : sellers) {
            if (seller != null) {
                System.out.println("Seller: " + seller.name);
            }
        }
    }

    public void showShoes() {
        for (Shoe shoe : shoes) {
            if (shoe != null) {
                System.out.println("Shoe: " + shoe.brand + " " + shoe.model + " " + shoe.color + " " + shoe.size);
            }
        }
    }

    public void showStock() {
        for (Shoe shoe : shoes) {
            if (shoe != null) {
                System.out.println("Stock of " + shoe + ": " + shoe.stock);
            }
        }
    }

    public void sellShoe(Shoe shoe, Seller seller, Client client) {
        seller.sellShoe(shoe);
        client.buyShoe(shoe);
        shoe.updateStock();
    }

}
