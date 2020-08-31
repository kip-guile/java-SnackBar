package snackBar;

public class Main {
    private static void manipulateSnackBar() {
        System.out.println("Welcome to le Snack Bar");
        VendingMachine v1 = new VendingMachine("FatBoy");
        Snack s1 = new Snack("Milky way", 8, 2.4, v1.getId());
        Snack s2 = new Snack("Oreos", 8, 2.4, v1.getId());
        Snack s3 = new Snack("Snickers", 8, 2.4, v1.getId());
        Snack s4 = new Snack("Mars", 21, 2.4, v1.getId());
        Customer c1 = new Customer("Jimmy", 37.75);
        System.out.println(c1);
        System.out.println(s4);
    }
    public static void main(String[] args) {
        manipulateSnackBar();
    }
}

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