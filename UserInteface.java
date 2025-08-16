import java.util.*;
public class UserInteface {
    public static void main(String[] args) {
        ATMOperations operation = new ATMOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome to the Rajesh ATM ");
        //int atmPIN=123;
        //int cardNumber=123456;

        System.out.println("Please Enter your Card Number : ");
        int card=sc.nextInt();
        System.out.println("Enter the ATM PIN : ");
        int pin = sc.nextInt();
        Set<Integer> cardNumber=new HashSet<>();
        cardNumber.add(123456);
        cardNumber.add(234567);
        Set<Integer> atmPIN=new HashSet<>();
        atmPIN.add(123);
        atmPIN.add(234);

        if(cardNumber.contains(card) && atmPIN.contains(pin)){
            System.out.println("Authentication Successfull");
            while(true){
                System.out.println(" ");
                System.out.println("Please Enter your Option :");
                System.out.println(" 1.ViewBalance\n 2.WithdrawAmount\n 3.DepositAmount\n 4.MiniStatement\n 5.Exit");
                System.out.println(" ");
                int option = sc.nextInt();
                switch(option){
                    case 1:
                        operation.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter the withdrawl amount : ");
                        double withdrawAmount=sc.nextDouble();
                        operation.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter the deposit Amount : ");
                        double depositAmount = sc.nextDouble();
                        operation.depositAmount(depositAmount);
                        break;              
                    case 4:
                        operation.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect Your ATM Card\nThankYou");
                        sc.close();
                        return; 
                    default:                       
                        System.out.println("Please Enter the Valid Optioin");
                }
            }  
        }
        else{
            System.out.println("Enter the correct atmPIN?");
        }
    }
}