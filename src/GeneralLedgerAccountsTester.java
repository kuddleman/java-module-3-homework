import java.sql.SQLOutput;
import java.util.Scanner;

public class GeneralLedgerAccountsTester {
    public static void main(String[] args) {
        GeneralLedgerAccounts branch520 = new GeneralLedgerAccounts();

        AccountFees myAcctFees = new AccountWithoutFees();
        TaxStatus myTaxStatus = TaxStatus.NO_WITHHOLDING_REQUIRED;

        // M3 USING FACTORY
        for (int i = 0; i < 2; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the name");
            String name1 = scan.nextLine();
            System.out.println("Enter the account number");
            int acctNum = Integer.parseInt(scan.nextLine());
            System.out.println("Enter initial deposit");
            int initialDeposit = Integer.parseInt(scan.nextLine());
            System.out.println("Enter type of account.  Enter CHECKING or SAVINGS or MONEY_MARKET");
            String type = scan.nextLine();
             // String type, String name1, int accountNumber, int initialDeposit, AccountFees accountFees, TaxStatus taxStatus)
            branch520.addAccount(type, name1, acctNum, initialDeposit, myAcctFees, myTaxStatus);
        }




    }
}
