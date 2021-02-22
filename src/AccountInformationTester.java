public class AccountInformationTester {
    public static void main(String[] args) {
        /*
         private int bankRoutingNumber; //ok  required
        private String bankName = "Bank of Seven Seas";
        private int swiftBankCode;  //ok  required
        private String localBranchAddress = "";
        private String mainBranchAddress = "";
         */

        // M3 USING BUILDER
        AccountInformation ai1 = new AccountInformation.AccountInformationBuilder(345,578)
                .bankName("Another Bank Name")
                .localBranchAddress("924 Presidio Ave, SF, CA  94115")
                .mainBranchAddress("1 California Ave, SF CA 94115")
                .build();
    }
}
