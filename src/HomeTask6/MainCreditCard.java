package HomeTask6;

public class MainCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("1111", 150.5);
        CreditCard creditCard2 = new CreditCard("2222", 1400);
        CreditCard creditCard3 = new CreditCard("3333", 5);
        creditCard1.chargeBalance(50);
        creditCard2.chargeBalance(5000);
        creditCard3.withdrawMoney(5);
        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
