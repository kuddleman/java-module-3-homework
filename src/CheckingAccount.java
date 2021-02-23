public class CheckingAccount extends DemandDeposit{


    // M3 USING STRATEGY
    public CheckingAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus, new AccountFeesAverageBalance());

    }

    // constructor for joint-owner account
    // M3 USING STRATEGY
    public CheckingAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus, new AccountFeesAverageBalance());

    }

    @Override
    public void accountFees(){
        System.out.println("Checking account fee is based on average monthly balance.");
    }

}

