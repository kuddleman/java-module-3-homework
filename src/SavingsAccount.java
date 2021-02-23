public class SavingsAccount extends DemandDeposit{
    // M3 USING STRATEGY
    public SavingsAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus, new AccountFeesMinimumBalance());
    }

    // constructor for joint-owner account
    // M3 USING STRATEGY
    public SavingsAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus, new AccountFeesMinimumBalance());
    }

    @Override
    public void accountFees(){
        System.out.println("Savings account fee is based on minimal monthly balance.");
    }
}
