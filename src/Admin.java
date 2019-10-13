import java.util.Scanner;

public class Admin implements AdminMenu {

    @Override
    public void showAdminMenu() {
        System.out.println("\n1. Add new product \n" +
                "2. Add quantity product\n" +
                "3. Delete product\n" +
                "4. Otchet\n" +
                "0. Exit");
    }

    @Override
    public void showAllProducts() {
        System.out.print("\n");
        for (int i = 0; i < Main.products.size(); i++) {
            System.out.println(i + 1 + ". " + Main.products.get(i));
        }
    }

    @Override
    public void addNewProduct(Scanner scanner) {
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

                Main.products.add(smartPhone);
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

                Main.products.add(computer);
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

                Main.products.add(laptop);
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

                Main.products.add(sn);
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

                Main.products.add(tsh);
            }
            default:
                break;
        }
    }

    @Override
    public void addQuantityProduct(Scanner scanner) {
        showDeviceMenu();
        System.out.print("Enter ind: ");
        int num = scanner.nextInt() - 1;
        System.out.print("Enter count: ");
        int cnt = scanner.nextInt();
        Main.products.get(num).setCount(Main.products.get(num).getCount() + cnt);
    }

    @Override
    public void deleteProduct(Scanner scanner) {
        showAllProducts();
        System.out.print("\nEnter stroka dlya remove: ");
        int position = scanner.nextInt() - 1;
        Main.products.remove(position);
        System.out.println();
    }

    @Override
    public void otcetDoxodov() {
        double allSum = 0;
        for (int i = 0; i < Main.otchet.size(); i++) {
            double prrice = Main.otchet.get(i).getPrice() * Main.otchet.get(i).getSold();
            allSum += prrice;
            System.out.println(i + 1 + "." + Main.otchet.get(i).getModel() + " " + prrice + "$");
        }
        System.out.println("\nVse doxodi = " + allSum + "$\n");
    }

    private void showDeviceMenu() {
        System.out.println("1. Smartphone \n" +
                "2. Computer\n" +
                "3. Laptop\n" +
                "4. Sneakers\n" +
                "5. Tshirt\n" +
                "0. Exit\n");
    }
}
