package HomeTask6;

public class MainBankomat {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(10, 10, 10);
        bankomat.amount = bankomat.banknote20 + bankomat.banknote50 + bankomat.banknote100;
        bankomat.chargeAmount(500);
    }
}
