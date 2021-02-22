public class AccountInformationOld {
    private int bankRoutingNumber;
    private String bankName;
    private int swiftBankCode;
    private String localBranchAddress;
    private String mainBranchAddress;

    private static final String DEFAULT_BANK_NAME = "Bank of Seven Seas";

    public AccountInformationOld( int bankRoutingNumber,
                               String bankName,
                               int swiftBankCode,
                               String localBranchAddress,
                               String mainBranchAddress
                             )
                             {
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankName = bankName;
        this.swiftBankCode = swiftBankCode;
        this.localBranchAddress = localBranchAddress;
        this.mainBranchAddress = mainBranchAddress;
    }

    public AccountInformationOld( int bankRoutingNumber,
                               int swiftBankCode,
                               String localBranchAddress,
                               String mainBranchAddress
                              )
                              {
        this(bankRoutingNumber, DEFAULT_BANK_NAME, swiftBankCode,
                localBranchAddress, mainBranchAddress);
    }








}
