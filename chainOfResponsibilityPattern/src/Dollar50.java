public class Dollar50 implements CashDistributor {
    private CashDistributor cashDistributor;

    @Override
    public void setNext(CashDistributor next) {
        this.cashDistributor = next;
    }


    @Override
    public void distribute(Currency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println(num + " pieces of 50$ bill");
            if (remainder != 0) this.cashDistributor.distribute(new Currency(remainder));
        } else {
            this.cashDistributor.distribute(cur);
        }
    }
}
