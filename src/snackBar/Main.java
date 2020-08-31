package snackBar;

public class Main {
    private static void manipulateSnackBar() {
        System.out.println("Welcome to le Snack Bar");
        VendingMachine v1 = new VendingMachine("FatBoy");
        Snack s1 = new Snack("Milky way", 8, 2.4, v1.getId());
        System.out.println(s1);
    }
    public static void main(String[] args) {
        manipulateSnackBar();
    }
}