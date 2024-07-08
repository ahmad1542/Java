import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BankClient extends Person {
    private String accountNumber;
    private String pinCode;
    private double balance;

    public BankClient(String firstName, String lastName, String email, String phoneNumber,
                      String accountNumber, String pinCode, double balance) {
        super(firstName, lastName, email, phoneNumber);
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public static BankClient find(String accountNumber, String pinCode) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\GitHub Repository\\Programming-Save\\Java\\Clients.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                BankClient client = convertLineToClientObject(line);
                if (client.getAccountNumber().equals(accountNumber) && client.getPinCode().equals(pinCode)) {
                    return client;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getEmptyClientObject();
    }

    private static BankClient convertLineToClientObject(String line) {
        // Assuming the line is in the format "firstName#//#lastName#//#email#//#phone#//#accountNumber#//#pinCode#//#balance"
        String[] parts = line.split("#//#");
        String firstName = parts[0];
        String lastName = parts[1];
        String email = parts[2];
        String phoneNumber = parts[3];
        String accountNumber = parts[4];
        String pinCode = parts[5];
        double balance = Double.parseDouble(parts[6]);
        return new BankClient(firstName, lastName, email, phoneNumber, accountNumber, pinCode, balance);
    }

    private static BankClient getEmptyClientObject() {
        return new BankClient("", "", "", "", "", "", 0.0);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
