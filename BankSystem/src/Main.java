import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        BankClient client = BankClient.find("A07", "125");
        if (client.getAccountNumber().isEmpty()) {
            System.out.println("Client not found");
        } else {
            System.out.println("Client found: " + client);
        }
    }
}