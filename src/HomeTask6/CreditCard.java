package HomeTask6;

public class CreditCard {
    String accNumber;
    double balance;
    double currBalance;

    public CreditCard(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    double chargeBalance(int cash) {
        return currBalance = balance + cash;
    }

    double withdrawMoney(int cash) {
        return currBalance = balance - cash;
    }

    void info() {
        System.out.println("Текущая информация о карте: " + '\n' + accNumber + " - Номер счета " + '\n' + currBalance + " - Текущий баланс");
    }
}
