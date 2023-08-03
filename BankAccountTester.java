import com.xworkz.bankaccount.BankAccount;
import com.xworkz.currentaccount.CurrentAcccount;
import com.xworkz.savingsaccount.SavingsAccount;

import java.time.LocalDate;

public class BankAccountTester {
    public static void main(String[] args){

        BankAccount myAccount = new SavingsAccount();
         myAccount.credit( 2000); //(1-8-2023)
        System.out.println("The amount credit@" + LocalDate.now()+ " " + myAccount.getBalance());
        myAccount.debit( 500);
        System.out.println("The amount debit@" + LocalDate.now()+ " " + myAccount.getBalance());

        BankAccount friendsAccount = new BankAccount();
        myAccount.transfer(500.00,friendsAccount);
        System.out.println("The balance in myAccount is : " +myAccount.getBalance());
        System.out.println("The balance in friendsAccount is : " +friendsAccount.getBalance());

        BankAccount friendsAccount1 = new CurrentAcccount();
        myAccount.transfer(500.00,friendsAccount);
        System.out.println("The balance in myAccount is : " +myAccount.getBalance());
        System.out.println("The balance in friendsAccount is : " +friendsAccount.getBalance());

        BankAccount hotelAccount= new CurrentAcccount();
        myAccount.transfer(300,hotelAccount);
        System.out.println("The balance in myAccount is : " + myAccount.getBalance());
        System.out.println("The balance in hotelAccount is : " +hotelAccount.getBalance());

        BankAccount rentAccount = new SavingsAccount();
        myAccount.transfer(100,rentAccount);
        System.out.println("The balance in myAccount is : " +myAccount.getBalance());
        System.out.println("The balance in rentAccount is : " +rentAccount.getBalance());

        BankAccount rentAccount1 = new BankAccount();
        myAccount.transfer(50,rentAccount1);
        System.out.println("The balance in myAccount is : " +myAccount.getBalance());
        System.out.println("The balance in rentAccount is : " +rentAccount1.getBalance());

        BankAccount rentAccount2 = new SavingsAccount();
        myAccount.transfer(50,rentAccount2);
        System.out.println("The balance in myAccount is : " +myAccount.getBalance());
        System.out.println("The balance in rentAccount is : " +rentAccount2.getBalance());












    }
}
