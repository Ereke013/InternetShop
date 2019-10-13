import java.util.Scanner;

public interface CustomerMenu {
    void showConsumerMenu();
    void showAllProducts();
    void buyProduct(Scanner scanner);
    void sortProducts();
    void searchProduct(String str); //TODO change parameter
    void showKorzina();
}
