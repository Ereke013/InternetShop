import java.util.Scanner;

public interface AdminMenu {
    void showAdminMenu();
    void showAllProducts();
    void addNewProduct(Scanner scanner);
    void addQuantityProduct(Scanner scanner);
    void deleteProduct(Scanner scanner);
    void otcetDoxodov();
}
