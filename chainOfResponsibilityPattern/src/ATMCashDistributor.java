import java.util.Scanner;

public class ATMCashDistributor {
    private CashDistributor cashDistributorFirst;

    public ATMCashDistributor() {
        this.cashDistributorFirst = new Dollar50();
        CashDistributor cashDistributorSecond = new Dollar20();
        CashDistributor cashDistributorThird = new Dollar10();

        cashDistributorFirst.setNext(cashDistributorSecond);
        cashDistributorSecond.setNext(cashDistributorThird);
    }

    public static void main(String[] args) {
        ATMCashDistributor atmCashDistributor = new ATMCashDistributor();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to distribute");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmCashDistributor.cashDistributorFirst.distribute(new Currency(amount));
        }

    }

}
