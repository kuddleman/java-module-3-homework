public abstract class DemandDeposit extends Account {

    // constructor for single owner account
    // M3 USING STRATEGY
    public DemandDeposit(String firstName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus, AccountFees accountFees) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus, accountFees);


    }

    // constructor for joint-owner account
    // M3 USING STRATEGY
    public DemandDeposit(String firstName, String secondName, int anAccountNumber, int anInitialDeposit, TaxStatus aTaxStatus, AccountFees accountFees) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus, accountFees);

    }

    public void withdraw(int amount){
        System.out.println("$" + amount + " has been withdrawn from your account.");

        // M2 HOMEWORK STATIC
        Account.increaseTotalDepositsInAllAccounts(amount);

    }

    public void deposit(int amount) {
        System.out.println("$" + amount + " has been deposited your account.");

        // M2 HOMEWORK STATIC
        Account.increaseTotalDepositsInAllAccounts(amount);
    }

    public abstract void accountFees();

}
