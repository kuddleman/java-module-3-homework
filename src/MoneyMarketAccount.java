public class MoneyMarketAccount extends DemandDeposit {
    // M3 USING STRATEGY
    public MoneyMarketAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus, new AccountFeesAverageBalance());
    }

    // constructor for joint-owner account
    // M3 USING STRATEGY
    public MoneyMarketAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber, anInitialDeposit, aTaxStatus, new AccountFeesAverageBalance());
    }

    @Override
    public void accountFees(){
        System.out.println("Money Market Account account fee is based on average monthly balance.");
    }


}
