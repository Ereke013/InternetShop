import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Customer implements CustomerMenu{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void showConsumerMenu() { //TODO MENU 1 and 3 Show and View
        System.out.println("\n1. Show all products \n" +
                "2. Buy product \n" +
                "3. View all products\n" +
                "4. Sort products\n" +
                "5. Search\n" +
                "6. Korzina\n" +
                "0. Exit\n");
    }

    @Override
    public void showAllProducts() {
        System.out.print("\n");
        if(Main.products.size() == 0){
            System.out.println("НЕТУ ПРОДУКТА!!!!");
        }
        else {
            for (int i = 0; i < Main.products.size(); i++) {
                System.out.println(i + 1 + ". " + Main.products.get(i));
            }
        }
    }

    @Override
    public void buyProduct(Scanner scanner) {
        showAllProducts();
        System.out.print("Enter product index: ");
        int position = scanner.nextInt();
        System.out.print("Enter kolichestvo: ");
        int cc = scanner.nextInt();
        Main.kolichestvo.add(cc);
        System.out.println();
        Main.zapas.add(Main.products.get(position - 1));

        if (Main.products.get(position - 1).getCount() == 0) {
            Main.products.remove(position - 1);
        }
    }

    @Override
    public void sortProducts() {
        Collections.sort(Main.products, new Comparator<Good>() {
            @Override
            public int compare(Good good, Good t1) {
                return (int) (good.getPrice() - t1.getPrice());
            }
        });
    }

    @Override
    public void searchProduct(String str) {
        int existsCount = 0;
        for (int i = 0; i < Main.products.size(); i++) {
            if (Main.products.get(i).getModel().toLowerCase().contains(str)) {
                System.out.println(i + 1 + ". " + Main.products.get(i).getModel() + " " + Main.products.get(i).getPrice() + "$");
                existsCount++;
            }
        }

        if (existsCount == 0) {
            System.out.println("Нет совпадении");
        }
    }

    @Override
    public void showKorzina() {
        if (Main.zapas.size() > 0) {
            System.out.println("Здесь ваш выбранный товар!!!");
            for (int i = 0; i < Main.zapas.size(); i++) {
                if (Main.zapas.get(i) instanceof Wearing) {
                    System.out.println(i + 1 + "." + Main.zapas.get(i).getModel() + ": " +
                            "kategoria: " + (((Wearing) Main.zapas.get(i)).getKategoria()) + ", kolichestvo: " + Main.kolichestvo.get(i) +
                            ", " + Main.zapas.get(i).getPrice() + "$");
                } else {
                    System.out.println(i + 1 + "." + Main.zapas.get(i).getModel() + ", kolichestvo: " + Main.kolichestvo.get(i) + " " + Main.zapas.get(i).getPrice() + "$");
                }
                System.out.print("\n1. Buy product" +
                        "\n2. Delete product iz spiska" +
                        "\n0. Exit\n");
                System.out.print("Enter index iz spiska: ");
                int numm = scanner.nextInt();
                System.out.print("\n");
                switch (numm) {
                    case 1:
                        buyProductIzKorzini(scanner);
                        System.out.println("Uspeshno kupleno");
                        break;
                    case 2:
                        deleteProductIzKorzini(scanner);
                        break;
                    case 0:
                        break;
                }
            }
            System.out.println();
        } else {
            System.out.println("Корзина пустой!!");
        }
    }

    private void deleteProductIzKorzini(Scanner scanner) {
        if (Main.zapas.size() > 0) {
            showKorzina();
            System.out.print("\nEnter stroka dlya remove: ");
            int position = scanner.nextInt() - 1;
            Main.zapas.remove(position);
            System.out.println();
        } else {
            System.out.println("Корзина пустой!!");
        }
    }

    private void buyProductIzKorzini(Scanner scanner) {
        if (Main.zapas.size() > 0) {
            System.out.print("Enter product index: ");
            int position = scanner.nextInt() - 1;

            System.out.print("\nEnter kolichestvo etogo produkta: ");
            int kolich = scanner.nextInt();

            Good product = Main.products.get(position);
            product.setSold(product.getSold() + kolich);
            product.setCount(product.getCount() - kolich);
            product.add20Discount();

            Main.otchet.add(product);

            Main.zapas.remove(product);

            if (product.getCount() == 0) {
                Main.products.remove(position);
            }
        }

        else {
            System.out.println("Корзина пустой!!");
        }
    }
}

