public interface CashDistributor {

    void setNext(CashDistributor next);

    void distribute(Currency cur);
}
