public class Dollar20 implements CashDistributor {
    private CashDistributor cashDistributor;

    @Override
    public void setNext(CashDistributor next) {
        this.cashDistributor = next;
    }


    @Override
    public void distribute(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println(num + " pieces of 20$ bill");
            if (remainder != 0) this.cashDistributor.distribute(new Currency(remainder));
        } else {
            this.cashDistributor.distribute(cur);
        }
    }
}
