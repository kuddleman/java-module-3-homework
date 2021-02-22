public class MoneyMarketAccount extends DemandDeposit {

    public MoneyMarketAccount (String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus);
    }

    // constructor for joint-owner account
    public MoneyMarketAccount (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber, anInitialDeposit, aTaxStatus);
    }

    @Override
    public void accountFees(){
        System.out.println("Money Market Account account fee is based on average monthly balance.");
    }


}
