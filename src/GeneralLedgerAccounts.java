import java.util.ArrayList;
import java.util.List;

public class GeneralLedgerAccounts {
    private List<Account> generalLedgerAccountList;

    public GeneralLedgerAccounts() {
        generalLedgerAccountList = new ArrayList<>();
    }

    public void addAccount(Account acct) {
        generalLedgerAccountList.add(acct);
    }

    public void addAccount(String type, String name1, int accountNumber, int initialDeposit, AccountFees accountFees, TaxStatus taxStatus) {
        Account acct;
        if(type.equalsIgnoreCase("CHECKING")) {
            acct = new CheckingAccount(name1, accountNumber, initialDeposit,  taxStatus);
        } else if (type.equalsIgnoreCase("SAVINGS")) {
            acct = new SavingsAccount(name1, accountNumber, initialDeposit,  taxStatus);
        } else if (type.equalsIgnoreCase("MONEY_MARKET")){
            acct = new MoneyMarketAccount(name1, accountNumber, initialDeposit,  taxStatus);
        } else {
            throw new IllegalArgumentException();
        }

        addAccount(acct);
    }

    public void addAccount(String type, String firstName, int anAccountNumber, int anInitialDeposit, String anEndDate, TaxStatus aTaxStatus){
        Account acct;
        if(type.equalsIgnoreCase("CERTIFICATE_OF_DEPOSIT")) {
            acct = new CertificateOfDeposit(firstName, anAccountNumber, anInitialDeposit, anEndDate, aTaxStatus);
        } else {
            throw new IllegalArgumentException();
        }

        addAccount(acct);

    }



}
