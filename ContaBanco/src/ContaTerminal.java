import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        userManager.addUser(new UserAccount("Mario Andrade", 1021, 237.48, "067-8"));
        userManager.addUser(new UserAccount("Mario", 1022, 237.48, "067-7"));

        System.out.println("Programa: Por favor, digite o número da conta:");
        Scanner s = new Scanner(System.in);
        int numeroConta = s.nextInt();

        boolean contaEncontrada = false;
        for (UserAccount userAccount : userManager.getUsers()) {
            if (numeroConta == userAccount.getNumber()) {
                System.out.println("Olá " + userAccount.getClientName()
                        + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + userAccount.getAgency() + ", conta "
                        + userAccount.getNumber() + " e seu saldo "
                        + userAccount.getBalance() + " já está disponível para saque");
                contaEncontrada = true;
                break;
            }
        }

        if (!contaEncontrada) {
            System.out.println("Conta não encontrada.");
        }
    }
}

class UserManager {
    private List<UserAccount> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(UserAccount user) {
        users.add(user);
    }

    public List<UserAccount> getUsers() {
        return users;
    }
}

class UserAccount {
    private String clientName;
    private int number;
    private double balance;
    private String agency;

    public UserAccount(String clientName, int number, double balance, String agency) {
        this.clientName = clientName;
        this.number = number;
        this.balance = balance;
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getAgency() {
        return agency;
    }
}
