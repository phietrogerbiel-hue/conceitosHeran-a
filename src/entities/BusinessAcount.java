package entities;

public class BusinessAcount extends Account{

     private Double loanLimit;

     public BusinessAcount(){

     }

    public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
}
