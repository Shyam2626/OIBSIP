import java.util.*;

public class atm {
    Scanner sc = new Scanner(System.in);
    // intialising amount
    int balance = 100000, wdamount, damount, tamount;
    // intialising transaction history
    String thistory = "";

    public boolean logindRegister() {

        System.out.println("Welcome to the ATM services");
        System.out.println(".....REGISTRATION.....");
        System.out.println("Enter your name: ");
        String uname = sc.nextLine();
        System.out.println("Enter your userid: ");
        String uid = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        System.out.println("you are Successfully registered");

        System.out.println(".....LOGIN....");
        boolean b = false;
        while (!b) {
            System.out.println("Enter your userid : ");
            String UID = sc.nextLine();
            if (UID.equals(uid)) {
                while (!b) {
                    System.out.println("Enter your password: ");
                    String PWD = sc.nextLine();
                    if (PWD.equals(password)) {
                        System.out.println("Login successful");
                        b = true;
                    } else {
                        System.out.println("Enter valid password");
                    }
                }
            } else {
                System.out.println("Enter valid userid");
            }
        }
        return b;
    }

    public void withdrawl() {
        System.out.println("Enter amount to withdraw: ");
        wdamount = sc.nextInt();
        if (wdamount > balance) {
            System.out.println("Not sufficient balance to withdraw\n");
        } else {
            balance -= wdamount;
            thistory += wdamount + " withdrawed ";
            System.out.println("Successfully withdrawed\n");
        }
    }

    public void deposit() {
        System.out.println("Enter amount to deposit: ");
        damount = sc.nextInt();
        balance += damount;
        thistory += damount + " deposited ";
        System.out.println("Successfully deposited amount\n");
    }

    public void transfer() {
        System.out.println("Enter amount to transfer: ");
        tamount = sc.nextInt();
        sc.nextLine();
        if (tamount > balance) {
            System.out.println("Low balance !! cannot transfer\n");
        } else {
            System.out.println("Enter account number of person to transfer money: ");
            String accnum = sc.nextLine();
            balance -= tamount;
            thistory += tamount + " transferred ";
            System.out.println("Successfully transferred amount to " + accnum + "\n");
        }
    }

    public void transactionhistory() {
        System.out.println("Transaction History " + thistory);
    }

    public void Balance() {
        System.out.println("The balance in your account is : " + balance);
    }

    public void quit() {
        System.out.println("Thank you for coming.....\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atm at = new atm();
        System.out.println("Choose the option below: \n1. Register and Login \n2.Exit \n");
        int option = sc.nextInt();
        if (option == 1) {
            boolean t = at.logindRegister();
            if (t) {
                while (true) {
                    System.out.println(
                            "Allowable actions: \n1. Withdraw \n2.Deposit \n3.Transfer  \n4.Balance \n5.TransactionHistory \n6.Quit \n");
                    System.out.println("Enter correct number: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            at.withdrawl();
                            break;
                        case 2:
                            at.deposit();
                            break;
                        case 3:
                            at.transfer();
                            break;
                        case 4:
                            at.Balance();
                            break;
                        case 5:
                            at.transactionhistory();
                            break;
                        case 6:
                            System.out.println("Thankyou for coming");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter a valid number to proceed");
                    }
                }
            }
        } else {
            System.out.println("Thank you for coming");

            System.exit(0);
        }
        sc.close();
    }
}
