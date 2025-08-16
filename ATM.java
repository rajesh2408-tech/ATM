public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    public ATM(){
        super();
    } 
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getdepositAmount(){
        return depositAmount;
    }
    public void setdepositAmount(double depositAmount){
        this.depositAmount=depositAmount;
    }
    public double getwithdrawAmount(){
        return withdrawAmount;
    }
    public void setwithdrawAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }
    public String toString(){
        return "ATM [balance : "+balance+", depositedAmount : "+depositAmount+", withdrawAmount : "+withdrawAmount+"]";
    }
}