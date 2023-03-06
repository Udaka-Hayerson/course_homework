package jvastartitvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bank {

    public static double amount = 0;


    public static void issueALoanOrRepayALoan() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("(The bank manager fills out this form) For what amount did the client take a loan? " +
                "For what amount does the client take a loan? ");
        String s_credit = reader.readLine();
        double credit = Double.parseDouble(s_credit);

        System.out.println("Enter the amount of the loan payment just made: ");
        String str_rec_a = reader.readLine();
        double rec_a = Double.parseDouble(str_rec_a);
        if (rec_a < credit) {
            credit -= rec_a;
            System.out.println("Balance of debt :" + credit);
            issueALoanOrRepayALoan();
        }
        else if (rec_a > credit) {
            rec_a -= credit;
            System.out.println("The loan is repaid. On the account : " + rec_a);
            System.out.println("If you want to open a savings account, click - Y/y/yes");
            String ansv = reader.readLine();
            if ((ansv.equals("Y")) || (ansv.equals("y")) || (ansv.equals("yes"))) {
                openSavingsAccount(rec_a);
            } else {
                rec_a = 0;
                System.out.println(" On the account "+ rec_a +" your money turned you");
            }
        }
        else {
            System.out.println("The loan is repaid. On the account : 0.00");
        }

    }

    public static void openSavingsAccount(double amount_plus) throws  Exception{
        amount += amount_plus;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "On the account : " + amount + " If you want to top up your savings account , click - Y/y/yes");
        String answer_top = reader.readLine();
        if ((answer_top.equals("Y")) || (answer_top.equals("y")) || (answer_top.equals("yes"))) {
            String s_top = reader.readLine();
            double top = Double.parseDouble(s_top);
            openSavingsAccount(top);
        }
        else {
            System.out.println("If you want to withdraw money from the savings account, enter: T/t/take." +
                    "If you want to withdraw money from a savings account and then take a loan, enter: C/c/credit.");
            String answer_t_or_c = reader.readLine();
            if ((answer_t_or_c.equals("T")) || (answer_t_or_c.equals("t")) || (answer_t_or_c.equals("take"))) {
                System.out.println("You have withdrawn from the account: " + amount + "  . On the account : 0.00");
                amount = 0;
            }
            else if ((answer_t_or_c.equals("C")) || (answer_t_or_c.equals("c")) || (answer_t_or_c.equals("credit"))) {
                System.out.println("You have withdrawn from the account: " + amount + "  . On the account : 0.00");
                amount = 0;
                issueALoanOrRepayALoan();

            }

        }
    }

    public static void main(String[] args) throws  Exception{

        issueALoanOrRepayALoan();

    }

}
