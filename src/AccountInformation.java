public class AccountInformation {
    private int bankRoutingNumber;
    private String bankName;
    private int swiftBankCode;
    private String localBranchAddress;
    private String mainBranchAddress;

    public static class AccountInformationBuilder {
        private int bankRoutingNumber; //ok
        private String bankName = "Bank of Seven Seas";
        private int swiftBankCode;  //ok
        private String localBranchAddress = "";
        private String mainBranchAddress = "";



        public AccountInformationBuilder(int bankRoutingNumber, int swiftBankCode){
            this.bankRoutingNumber = bankRoutingNumber;
            this.swiftBankCode = swiftBankCode;

        }



    }
}
