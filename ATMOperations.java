import java.util.*;
public class ATMOperations implements ATMInterface{
    ATM atm = new ATM();
    HashMap<Double,String> miniStatement = new HashMap<>();
    public void viewBalance(){
        System.out.println("Available Balance : "+atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount%500==0){
            if(withdrawAmount <= atm.getBalance()){
                double balance=atm.getBalance() - withdrawAmount;
                atm.setBalance(balance);
                miniStatement.put(withdrawAmount," Withdraw");
                viewBalance();
            }
            else{
                System.out.println("Insufficant Balance ?");
            }
        }
        else{
            System.out.println("Enter the amount in terms of 500");
        }
    }

    public void depositAmount(double depositAmount){
        System.out.println("Deposited Amount is : "+depositAmount);
        atm.setBalance(atm.getBalance()+depositAmount);
        miniStatement.put(depositAmount, " deposited");
        viewBalance();
    }

    public void viewMiniStatement(){
        System.out.println("Mini Statement : ");
        for(double i:miniStatement.keySet()){
            System.out.printf("%.2f\t%s\n",i,miniStatement.get(i));
        }
    }
}