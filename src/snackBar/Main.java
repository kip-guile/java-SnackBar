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
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

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

        System.out.println(s1.snackState(v1.getName()));
        System.out.println(s2.snackState(v1.getName()));
        System.out.println(s3.snackState(v1.getName()));
        System.out.println(s4.snackState(v2.getName()));
        System.out.println(s5.snackState(v2.getName()));

    }
    public static void main(String[] args) {
        manipulateSnackBar();
    }
}