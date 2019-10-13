import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static ArrayList<Good> products = new ArrayList<>();
    static ArrayList<Good> otchet = new ArrayList<>();
    static ArrayList<Good> zapas = new ArrayList<>();
    static ArrayList<Integer> kolichestvo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ************************************** \n" +
                " *   WELCOME ERLAN'S INTERNET SHOP!!  *\n" +
                " **************************************\n");
        showMenu();
        System.out.print("Enter index: ");
        Customer customer = new Customer();
        Admin admin = new Admin();
        int num = scanner.nextInt();
        while (num != 0) {
            switch (num) {
                case 1:
                    admin.showAdminMenu();
                    System.out.println();
                    System.out.print("Enter index: ");
                    int ent = scanner.nextInt();
                    System.out.print("\n");
                    while (ent != 0) {
                        switch (ent) {
                            case 1:
                                admin.addNewProduct(scanner);
                                break;
                            case 2:
                                admin.addQuantityProduct(scanner);
                                break;
                            case 3:
                                admin.deleteProduct(scanner);
                                break;
                            case 4:
                                admin.otcetDoxodov();
                                break;
                        }
                        admin.showAdminMenu();
                        System.out.print("Enter index: ");
                        ent = scanner.nextInt();
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    customer.showConsumerMenu();
                    System.out.print("Enter index: ");
                    int entr = scanner.nextInt();
                    while (entr != 0) {
                        switch (entr) {
                            case 1:
                                customer.showAllProducts();
                                break;
                            case 2:
                                customer.buyProduct(scanner);
                                break;
                            case 3:
                                customer.showAllProducts();
                                System.out.println();
                                break;
                            case 4:
                                customer.sortProducts();
                                break;
                            case 5:
                                String str = scanner.next().toLowerCase();
                                customer.searchProduct(str);
                                break;
//                            case 6:
//                                showAllProducts();
//                                addKorzinaga(scanner);
//                                break;
                            case 6:
                                System.out.println();
                                customer.showKorzina();

                                break;
                        }
                        customer.showConsumerMenu();
                        entr = scanner.nextInt();
                    }
                    break;
            }

            showMenu();
            System.out.print("Enter index: ");
            num = scanner.nextInt();
        }
    }

    private static void showMenu() {
        System.out.println("1. Admin \n" +
                "2. Consumer\n" +
                "0. Exit\n");
    }

}
//    private static void addKorzinaga(Scanner scanner) {
//        if (products.size() > 0){
//            System.out.print("Enter position for korzinaga: ");
//            int position = scanner.nextInt() - 1;
//            Good product = products.get(position);
//            product.setKorzina(product.getKorzina() + 1);
//            zapas.add(product);
//        }
//        else{
//            System.out.println("На данном магазине нету товаров!!!");
//        }
//    }
