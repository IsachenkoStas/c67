package HomeTask6;

public class Bankomat {
    int banknote20;
    int banknote50;
    int banknote100;
    int amount;
    int newAmount;
    boolean operationSuccess;

    public Bankomat(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    int chargeAmount(int cash) {
        return newAmount = amount + cash;
    }
}
