import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
class Account{
    private int accno;
    private String accname;
    private int balance;
    public Account(int accno,String accname,int bal)
    {
        this.accno=accno;
        this.accname=accname;
        this.balance=bal;
    }
    public int getBalance()
    {
        return balance;
    }
    public String toString(){
        return "Account Number: "+accno+" Account Name: "+accname+" Balance: "+balance;
    }
}


public class CollectionClass2 {
    
    public static void main(String[] args) {
    //     ArrayList<Account>accounts=new ArrayList<>();
    //     accounts.add(new Account(101,"Rahul",1500));
    //     accounts.add(new Account(102,"Rohan",700));
    //     accounts.add(new Account(103,"Rahul",3400));
    //     accounts.add(new Account(104,"Rohan",2000));
    //     System.out.println(accounts);
    //     System.out.println(accounts.get(1));
    //     Collections.sort(accounts,new Comparator<Account>() {
    //         public int compare(Account a,Account b)
    //         {
    //             return a.getBalance()-b.getBalance();
    //         }
    //     });
    //    System.out.println(accounts);
       int[] arr={3,4,8,2};
       System.out.println(Arrays.toString(arr));
    }
}
