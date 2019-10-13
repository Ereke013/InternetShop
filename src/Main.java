import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Good> products = new ArrayList<>();
    public static ArrayList<Good> otchet = new ArrayList<>();
    public static ArrayList<Good> zapas = new ArrayList<>();
    public static ArrayList<Integer> kolichestvo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ************************************** \n" +
                " *   WELCOME ERLAN'S INTERNET SHOP!!  *\n" +
                " **************************************\n");
        showMenu();
        System.out.print("Enter index: ");
        int num = scanner.nextInt();
        while (num != 0) {
            switch (num) {
                case 1:
                    showAdminMenu();
                    System.out.println();
                    System.out.print("Enter index: ");
                    int ent = scanner.nextInt();
                    System.out.print("\n");
                    while (ent != 0) {
                        switch (ent) {
                            case 1:
                                addNewProduct(scanner);
                                break;
                            case 2:
                                addQuantityProduct(scanner);
                                break;
                            case 3:
                                deleteProduct(scanner);
                                break;
                            case 4:
                                otcetDoxodov();
                                break;
                            case 0:
                                break;
                        }
                        showAdminMenu();
                        System.out.print("Enter index: ");
                        ent = scanner.nextInt();
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    showConsumerMenu();
                    System.out.print("Enter index: ");
                    int entr = scanner.nextInt();
                    while (entr != 0) {
                        switch (entr) {
                            case 1:
                                showAllProducts();
                                break;
                            case 2:
                                buyProduct(scanner);
                                break;
                            case 3:
                                showAllProducts();
                                System.out.println();
                                break;
                            case 4:
                                sortProducts();
                                break;
                            case 5:
                                String str = scanner.next().toLowerCase();
                                searchProduct(str);
                                break;
//                            case 6:
//                                showAllProducts();
//                                addKorzinaga(scanner);
//                                break;
                            case 6:
                                System.out.println();
                                showKorzina();
                                System.out.print("\n1. Buy product"+
                                        "\n2. Delete product iz spiska"+
                                        "\n0. Exit\n");
                                System.out.print("Enter index iz spiska: ");
                                int numm = scanner.nextInt();
                                System.out.print("\n");
                                while(numm != 0){
                                    switch(numm){
                                        case 1:
                                            buyProductIzKorzini(scanner);
                                            System.out.println("Uspeshno kupleno");
                                            break;
                                        case 2:
                                            deleteProductIzKorzini(scanner);
                                            break;
                                    }
                                    break;
                                }
                                break;
                        }
                        showConsumerMenu();
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

    private static void showConsumerMenu() {
        System.out.println("\n1. Show all products \n" +
                "2. Buy product \n" +
                "3. View all products\n" +
                "4. Sort products\n" +
                "5. Search\n" +
                "6. Korzina\n" +
                "0. Exit\n");
    }

    private static void showAdminMenu() {
        System.out.println("\n1. Add new product \n" +
                "2. Add quantity product\n" +
                "3. Delete product\n" +
                "4. Otchet\n" +
                "0. Exit");
    }

    private static void showDeviceMenu() {
        System.out.println("1. Smartphone \n" +
                "2. Computer\n" +
                "3. Laptop\n" +
                "4. Sneakers\n" +
                "5. Tshirt\n" +
                "0. Exit\n");
    }

    private static void addNewProduct(Scanner scanner) {
        showDeviceMenu();
        System.out.print("Enter index: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                boolean check = false;
//                for (int i = 0; i < products.size(); i++) {
//                    if (products.get(i) instanceof SmartPhone) {
//                        products.get(i).setCount(products.get(i).getCount() + 1);
//                        check = true;
//                        break;
//                    }
                // }
                //  if (!check) {
                SmartPhone smartPhone = new SmartPhone();
                System.out.print("\nEnter model(Samsung, Iphone etc.): ");
                String model = scanner.next();
                smartPhone.setModel(model);

                System.out.print("\nEnter generation(S9+, XR, J7 etc.): ");
                String generation = scanner.next();
                smartPhone.setGeneration(generation);

                System.out.print("\nEnter ram(2-4-6-8-12): ");
                int ram = scanner.nextInt();
                smartPhone.setRam(ram);

                System.out.print("\nEnter mgpx(5 <-> 32): ");
                int mgpx = scanner.nextInt();
                smartPhone.setMgpx(mgpx);

                System.out.print("\nEnter count: ");
                int count = scanner.nextInt();
                smartPhone.setCount(count);

                System.out.print("\nEnter price: ");
                int price = scanner.nextInt();
                smartPhone.setPrice(price);

                products.add(smartPhone);
                //}
                break;
            }
            case 2: {
//                boolean check = false;
//                for (int i = 0; i < products.size(); i++) {
//                    if (products.get(i) instanceof Computer) {
//                        products.get(i).setCount(products.get(i).getCount() + 1);
//                        check = true;
//                        break;
//                    }
//                }
                //if (!check) {
                Computer computer = new Computer();

                System.out.print("\nEnter model(Lenovo, LG, Samsung etc.): ");
                String model = scanner.next();
                computer.setModel(model);

                System.out.print("\nEnter cpu(core i3, core i5, core i7, core i9): ");
                String cpu = scanner.next();
                computer.setCpu(cpu);

                System.out.print("\nEnter ram(2-4-6-8-12): ");
                int ram = scanner.nextInt();
                computer.setRam(ram);

                System.out.print("\nEnter ssd(true(1) or false(0)): ");
                boolean ssd = scanner.nextBoolean();
                computer.setSsd(ssd);

                System.out.print("\nEnter memory: ");
                int memory = scanner.nextInt();
                computer.setMemory(memory);

                System.out.print("\nEnter count: ");
                int count = scanner.nextInt();
                computer.setCount(count);

                System.out.print("\nEnter price: ");
                int price = scanner.nextInt();
                computer.setPrice(price);

                products.add(computer);
                // }
                System.out.println();
                break;
            }

            case 3: {
//                boolean check = false;
//                for (int i = 0; i < products.size(); i++) {
//                    if (products.get(i) instanceof Laptop) {
//                        products.get(i).setCount(products.get(i).getCount() + 1);
//                        check = true;
//                        break;
//                    }
//                }
                // if (!check) {
                Laptop laptop = new Laptop();

                System.out.print("\nEnter model: ");
                String model = scanner.next();
                laptop.setModel(model);

                System.out.print("\nEnter cpu(corei3, corei5, corei7, corei9): ");
                String cpu = scanner.next();
                laptop.setCpu(cpu);

                System.out.print("\nEnter ram(2-4-6-8-12): ");
                int ram = scanner.nextInt();
                laptop.setRam(ram);

                System.out.print("\nEnter ssd(true(1) or false(0)): ");
                boolean ssd = scanner.nextBoolean();
                laptop.setSsd(ssd);

                System.out.print("\nEnter memory: ");
                int memory = scanner.nextInt();
                laptop.setMemory(memory);

                System.out.print("\nEnter price: ");
                int price = scanner.nextInt();
                laptop.setPrice(price);

                System.out.print("\nEnter weight: ");
                double weight = scanner.nextDouble();
                laptop.setWeight(weight);

                System.out.print("\nEnter touch(true or false): ");
                boolean touch = scanner.nextBoolean();
                laptop.setTouch(touch);

                products.add(laptop);
                // }
                break;
            }
            case 4: {
                Sneakers sn = new Sneakers();

                System.out.print("\nEnter model(\"Sneakers\" or \"Tshirt\"): ");
                String model = scanner.next();
                sn.setModel(model);

                System.out.print("\nEnter kategoria(\"men\", \"women\", \"kids\"): ");
                String kategoria = scanner.next();
                sn.setKategoria(kategoria);

                System.out.print("\nEnter season(\"winter\", \"summer\", \"multi\"): ");
                String season = scanner.next();
                sn.setSeason(season);

                System.out.print("\nEnter size(\"20\"-\"50\"): ");
                String size = scanner.next();
                sn.setSize(size);

                System.out.print("\nEnter color: ");
                String color = scanner.next();
                sn.setColor(color);

                System.out.print("\nEnter kolichestvo: ");
                int count = scanner.nextInt();
                sn.setCount(count);

                System.out.print("\nEnter price: ");
                int price = scanner.nextInt();
                sn.setPrice(price);

                products.add(sn);
                break;
            }
            case 5: {
                Tshirt tsh = new Tshirt();

                System.out.print("\nEnter model(\"Sneakers\" or \"Tshirt\"): ");
                String model = scanner.next();
                tsh.setModel(model);

                System.out.print("\nEnter kategoria(\"men\", \"women\", \"kids\"): ");
                String kategoria = scanner.next();
                tsh.setKategoria(kategoria);

                System.out.print("\nEnter size(\"20\"-\"50\"): ");
                String size = scanner.next();
                tsh.setSize(size);

                System.out.print("\nEnter color: ");
                String color = scanner.next();
                tsh.setColor(color);

                System.out.print("\nEnter material(\"cotton\", \"silk\", \"polyester\", \"viscose\"): ");
                String material = scanner.next();
                tsh.setMaterial(material);

                System.out.print("\nEnter kolichestvo: ");
                int count = scanner.nextInt();
                tsh.setCount(count);

                System.out.print("\nEnter price: ");
                int price = scanner.nextInt();
                tsh.setPrice(price);

                products.add(tsh);
            }
            default:
                break;
        }

    }

    private static void addQuantityProduct(Scanner scanner) {
        showDeviceMenu();
        System.out.print("Enter ind: ");
        int num = scanner.nextInt() - 1;
        System.out.print("Enter count: ");
        int cnt = scanner.nextInt();
        products.get(num).setCount(products.get(num).getCount() + cnt);
    }

    private static void deleteProduct(Scanner scanner) {
        showAllProducts();
        System.out.print("\nEnter stroka dlya remove: ");
        int position = scanner.nextInt() - 1;
        products.remove(position);
        System.out.println();
    }

    private static void showAllProducts() {
        System.out.print("\n");
        for (int i = 0; i < products.size(); i++) {

            System.out.println(i + 1 + ". " + products.get(i));
        }

    }

    private static void buyProduct(Scanner scanner) {
        showAllProducts();
        System.out.print("Enter product index: ");
        int position = scanner.nextInt();
        System.out.print("Enter kolichestvo: ");
        int cc = scanner.nextInt();
        kolichestvo.add(cc);
        System.out.println();
        zapas.add(products.get(position-1));

        if (products.get(position-1).getCount() == 0) {
            products.remove(position-1);
        }
    }

    private static void otcetDoxodov() {
        double allSum = 0;
        for (int i = 0; i < otchet.size(); i++) {
            double prrice = otchet.get(i).getPrice() * otchet.get(i).getSold();
            allSum += prrice;
            System.out.println(i + 1 + "." + otchet.get(i).getModel() + " " + prrice + "$");
        }
        System.out.println("\nVse doxodi = " + allSum + "$\n");


    }

    private static void sortProducts() {
        Collections.sort(products, new Comparator<Good>() {
            @Override
            public int compare(Good good, Good t1) {
                return (int) (good.getPrice() - t1.getPrice());
            }
        });
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

    private static void searchProduct(String str) {
        int existsCount = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getModel().toLowerCase().contains(str)) {
                System.out.println(i + 1 + ". " + products.get(i).getModel() + " " + products.get(i).getPrice() + "$");
                existsCount++;
            }
        }

        if (existsCount == 0) {
            System.out.println("Нет совпадении");
        }
    }

    private static void showKorzina() {
        if(zapas.size()>0) {
            System.out.println("Здесь ваш выбранный товар!!!");
            for (int i = 0; i < zapas.size(); i++) {
                if (zapas.get(i) instanceof Wearing) {
                    System.out.println(i + 1 + "." + zapas.get(i).getModel() + ": " +
                            "kategoria: " + (((Wearing) zapas.get(i)).getKategoria()) + ", kolichestvo: " + kolichestvo.get(i) +
                            ", " + zapas.get(i).getPrice() + "$");
                } else {
                    System.out.println(i + 1 + "." + zapas.get(i).getModel() + ", kolichestvo: " + kolichestvo.get(i)+ " " + zapas.get(i).getPrice() + "$");
                }
            }
            System.out.println();
        }
        else{
            System.out.println("Корзина пустой!!");
        }
    }

    private static void deleteProductIzKorzini(Scanner scanner) {
        if(zapas.size() > 0) {
            showKorzina();
            System.out.print("\nEnter stroka dlya remove: ");
            int position = scanner.nextInt() - 1;
            zapas.remove(position);
            System.out.println();
        }
        else{
            System.out.println("Корзина пустой!!");
        }
    }

    private static void buyProductIzKorzini(Scanner scanner) {
        if(zapas.size() > 0) {
            System.out.print("Enter product index: ");
            int position = scanner.nextInt() - 1;

            System.out.print("\nEnter kolichestvo etogo produkta: ");
            int kolich = scanner.nextInt();

            Good product = products.get(position);

            product.setSold(product.getSold() + kolich);

            product.setCount(product.getCount() - kolich);

            otchet.add(product);

            zapas.remove(product);

            if (product.getCount() == 0) {
                products.remove(position);
            }
        }
        else{System.out.println("Корзина пустой!!");}

    }
}


