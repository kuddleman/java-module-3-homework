public class AccountInformation {
    private int bankRoutingNumber;
    private String bankName;
    private int swiftBankCode;
    private String localBranchAddress;
    private String mainBranchAddress;

    private AccountInformation(AccountInformationBuilder builder){
        this.bankRoutingNumber = builder.bankRoutingNumber;
        this.bankName = builder.bankName;
        this.swiftBankCode = builder.swiftBankCode;
        this.localBranchAddress = builder.localBranchAddress;
        this.mainBranchAddress = builder.mainBranchAddress;
    }

    public static class AccountInformationBuilder {
        private int bankRoutingNumber; //ok  required
        private String bankName = "Bank of Seven Seas";
        private int swiftBankCode;  //ok  required
        private String localBranchAddress = "";
        private String mainBranchAddress = "";



        public AccountInformationBuilder(int bankRoutingNumber, int swiftBankCode){
            this.bankRoutingNumber = bankRoutingNumber;
            this.swiftBankCode = swiftBankCode;
        }

        public AccountInformationBuilder bankName(String var) {
            this.bankName = var;
            return this;
        }

        public AccountInformationBuilder localBranchAddress(String var) {
            this.localBranchAddress = var;
            return this;
        }

        public AccountInformationBuilder mainBranchAddress(String var) {
            this.mainBranchAddress = var;
            return this;
        }

        public AccountInformation build(){
           return new AccountInformation(this);
        }



    }
}
