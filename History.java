public class History {
    Shoe[] shoes = new Shoe[100];
    String[] dates = new String[100];
    int totalSpends;

    public void addShoe(Shoe shoe, String date) {
        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i] == null) {
                shoes[i] = shoe;
                dates[i] = date;
                totalSpends += shoe.price;
                break;
            }
        }
    }

    public void returnShoe(Shoe shoe, String date) {
        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i] != null && shoes[i].equals(shoe) && dates[i].equals(date)) {
                totalSpends -= shoe.price;
                shoes[i] = null;
                dates[i] = null;
                break;
            }
        }
    }

    public void showHistory() {
        for (int i = 0; i < shoes.length; i++) {
            if (shoes[i] != null) {
                System.out.println("Bought " + shoes[i] + " on " + dates[i]);
            }
        }
        System.out.println("Total spends: " + totalSpends);
    }

    public void showTotalSpends() {
        System.out.println("Total spends: " + totalSpends);
    }

    public void showLastPurchase() {
        for (int i = shoes.length - 1; i >= 0; i--) {
            if (shoes[i] != null) {
                System.out.println("Last purchase: " + shoes[i] + " on " + dates[i]);
                break;
            }
        }
    }
}
