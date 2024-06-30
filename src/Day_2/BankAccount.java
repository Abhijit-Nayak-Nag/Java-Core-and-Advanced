//package Day_2;
//
//public class BankAccount {
//    private int accountNumber;
//    private double balance;
//    private String accountPassword;
//    public BankAccount(int accountNumber, double balance, String accountPassword){
//        this.accountNumber=accountNumber;
//        this.balance = balance;
//        this.accountPassword = accountPassword;
//    }
//    public int getAccountNumber(){
//        return accountNumber;
//    }
//    public void deposit(double amount){
//        if(amount>0){
//            balance+=amount;
//            System.out.println(amount + "deposit successfully.");
//        } else {
//            System.out.println("invalid deposit amount");
//
//        }
//    }
//    public void withdraw (double amount){
//        if (amount>0 && amount <=-balance){
//            balance-=amount;
//            System.out.println(amount+"withdrawn successfully.");
//        }else {
//            System.out.println("invalid withdrawn amount");
//    }
//}
//public void changePassword(String newPassword){
//    this.accountPassword=newPassword;
//    System.out.println("password changed successfully");
//    }
//
//    public static void main(String[] args) {
//        BankAccount myAccount= new BankAccount("123456789", 1000.0, "password123" );
//        System.out.println("Account Number :" + myAccount.getAccountNumber());
//        myAccount.deposit(500.0);
//        myAccount.withdraw(200.0);
//        myAccount.changePassword("newpassword456");
//
//    }
//}
