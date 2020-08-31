package snackBar;

public class Main {
    private static void manipulateSnackBar() {
        System.out.println("Welcome to le Snack Bar");

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.0, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Vater", 20, 2.75, v2.getId());

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        c1.buySnacks(s4.getCost() * 3);
        s4.buySnack(3);
        System.out.println(c1);
        System.out.println(s4);

        c1.buySnacks(s3.getCost() * 1);
        s3.buySnack(1);
        System.out.println(c1);
        System.out.println(s3);

        c2.buySnacks(s4.getCost() * 2);
        s4.buySnack(2);
        System.out.println(c2);
        System.out.println(s4);

        c1.addCash(10);
        System.out.println(c1);

        c1.buySnacks(s2.getCost() * 1);
        s2.buySnack(1);
        System.out.println(c1);
        System.out.println(s2);

        s3.addQuantity(12);
        System.out.println(s3);

        c2.buySnacks(s3.getCost() * 3);
        s3.buySnack(3);
        System.out.println(c2);
        System.out.println(s3);

    }
    public static void main(String[] args) {
        manipulateSnackBar();
    }
}

// * [ ] Customer 1 (Jane) buys 3 of snack 4 (Soda).
//   * [ ] Print Customer 1 (Jane) Cash on hand.
//   * [ ] Print quantity of snack 4 (Soda).
// * [ ] Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
//   * [ ] Print Customer 1 (Jane) Cash on hand.
//   * [ ] Print quantity of snack 3 (Pretzel).
// * [ ] Customer 2 (Bob) buys 2 of snack 4 (Soda).
//   * [ ] Print Customer 2 (Bob) Cash on Hand.
//   * [ ] Print quantity of snack 4 (Soda).
// * [ ] Customer 1 (Jane) finds $10.
//   * [ ] Print Customer 1 (Jane) Cash on Hand.
// * [ ] Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
//   * [ ] Print Customer 1 (Jane) Cash on Hand.
//   * [ ] Print quantity of snack 2 (Chocolate Bar).
// * [ ] Add 12 more items to snack 3 (Pretzel).
//   * [ ] Print quantity of snack 3 (Pretzel).
// * [ ] Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
//   * [ ] Print Customer 2 (Bob) Cash on hand.
//   * [ ] Print quantity of snack 3 (Pretzel).

// ```TEXT
// Customer 1 cash on hand 37.75
// Quantity of snack 4 is 21

// Customer 1 cash on hand 35.75
// Quanity of snack 3 is 29

// Customer 2 cash on hand 28.14
// Quantity of snack 4 is 19

// Customer 1 cash on hand 45.75

// Customer 1 cash on hand 44.75
// Quantity of snack 2 is 35

// Quantity of snack 3 is 41

// customer 2 cash on hand 22.14
// Quantity of snack 3 is 38
// ```