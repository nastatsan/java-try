public class Dollar10 implements CashDistributor {
    private CashDistributor cashDistributor;

    @Override
    public void setNext(CashDistributor next) {
        this.cashDistributor = next;
    }


    @Override
    public void distribute(Currency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.println(num + " pieces of 10$ bill");
            if (remainder != 0) this.cashDistributor.distribute(new Currency(remainder));
        } else {
            this.cashDistributor.distribute(cur);
        }
    }
}