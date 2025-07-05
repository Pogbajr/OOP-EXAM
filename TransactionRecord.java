public class TransactionRecord {
    // Private fields to encapsulate sensitive data
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String transactionTimestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String transactionTimestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.transactionTimestamp = transactionTimestamp;
    }

    // Public getter for buyerTIN
    public String getBuyerTIN() {
        return buyerTIN;
    }

    // Public setter for buyerTIN with validation
    public void setBuyerTIN(String buyerTIN) {
        if (buyerTIN != null && !buyerTIN.isEmpty()) {
            this.buyerTIN = buyerTIN;
        } else {
            throw new IllegalArgumentException("Buyer TIN cannot be null or empty");
        }
    }

    // Public getter for sellerTIN
    public String getSellerTIN() {
        return sellerTIN;
    }

    // Public setter for sellerTIN with validation
    public void setSellerTIN(String sellerTIN) {
        if (sellerTIN != null && !sellerTIN.isEmpty()) {
            this.sellerTIN = sellerTIN;
        } else {
            throw new IllegalArgumentException("Seller TIN cannot be null or empty");
        }
    }

    // Public getter for invoiceAmount
    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    // Public setter for invoiceAmount with validation
    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount >= 0) {
            this.invoiceAmount = invoiceAmount;
        } else {
            throw new IllegalArgumentException("Invoice amount cannot be negative");
        }
    }

    // Public getter for transactionTimestamp
    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    // Public setter for transactionTimestamp with validation
    public void setTransactionTimestamp(String transactionTimestamp) {
        if (transactionTimestamp != null && !transactionTimestamp.isEmpty()) {
            this.transactionTimestamp = transactionTimestamp;
        } else {
            throw new IllegalArgumentException("Transaction timestamp cannot be null or empty");
        }
    }
}