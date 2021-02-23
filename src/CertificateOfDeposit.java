public class CertificateOfDeposit extends Account {

    private String endDate;  // date funds in CD can be withdrawn

    // constructor for single owner account

    // M3 USING STRATEGY
    public CertificateOfDeposit (String firstName, int anAccountNumber, int anInitialDeposit, String anEndDate, TaxStatus aTaxStatus) {
        super(firstName, anAccountNumber, anInitialDeposit, aTaxStatus, new AccountWithoutFees());
        this.endDate = anEndDate;
    }

    // constructor for joint-owner account
    // M3 USING STRATEGY
    public CertificateOfDeposit (String firstName, String secondName, int anAccountNumber, int anInitialDeposit, String anEndDate, TaxStatus aTaxStatus) {
        super(firstName,secondName,anAccountNumber,anInitialDeposit, aTaxStatus, new AccountWithoutFees());
        this.endDate = anEndDate;

        //M2 HOMEWORK STATIC
        Account.increaseTotalDepositsInAllAccounts(anInitialDeposit);
    }

    public String getEndDate() {
        return this.endDate;
    }

    @Override
    public String toString() {


        String s = super.toString();
        return s += "\nEnd Date: " + getEndDate() ;

    }

    public void extendTermOfCd(String newDate) {
        this.endDate = newDate;
        System.out.println("Your Certificate of Deposit has been extended to " + newDate);

    }

    @Override
    public void accountFees(){
        System.out.println("Certificate of Deposit only incurs a fee for early withdrawal.");
    }
}
