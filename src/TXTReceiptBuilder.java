public class TXTReceiptBuilder implements IReceiptBuilder {

    StringBuilder sb = new StringBuilder();

    public TXTReceiptBuilder() {
        System.out.println("Text Receipt Builder Initialized");
    }

    public void appendHeader(String header) {
        sb.append(header).append("\n");
    }


    public void appendCustomer(CustomerModel customer) {
        sb.append("Customer ID: ").append(customer.mCustomerID).append("\n");
        sb.append("Customer Name: ").append(customer.mName).append("\n");
        sb.append("**********************************************\n");
    }


    public void appendProduct(ProductModel product) {
        sb.append("Product ID: ").append(product.mProductID).append("\n");
        sb.append("Product Name: ").append(product.mName).append("\n");
        sb.append("**********************************************\n");
    }


    public void appendPurchase(PurchaseModel purchase) {
        sb.append("Purchase ID: ").append(purchase.mPurchaseID).append("\n");
        sb.append("Price Per: ").append(purchase.mPrice).append("\n");
        sb.append("Quantity: ").append(purchase.mQuantity).append("\n");
        sb.append("Subtotal: ").append(purchase.mCost).append("\n");
        sb.append("Tax: ").append(purchase.mTax).append("\n");
        sb.append("Total Price: ").append(purchase.mTotal).append("\n");
        sb.append("Purchase Date: ").append(purchase.mDate).append("\n");
        sb.append("**********************************************\n");


    }


    public void appendFooter(String footer) {
        sb.append(footer).append("\n");
    }


    public String toString() {
        return sb.toString();
    }
}
