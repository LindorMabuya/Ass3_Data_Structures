package za.ac.cput.domain;

import java.io.Serializable;

/**
 * Created by LILO on 2016/03/13.
 */
public class invoice implements Serializable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int count) {
        if (count >= 0)
            quantity = count;
        else
            throw new IllegalArgumentException("Quantity must be > 0");
    }

    public void setPricePerItem(double price) {
        if (price >= 0.0)
            pricePerItem = price;
        else
            throw new IllegalArgumentException("Price must be > 0");
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getTotalPrice()
    {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return "Part number: " + getPartNumber() + "\n" + "Description: " + getPartDescription() + "\n" + "Quantity: " + getQuantity() + "\n" + "Price: " + getPricePerItem() + "\n";
    }

}
