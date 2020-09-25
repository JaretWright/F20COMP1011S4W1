import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HandSanitizerBottle {
    private String brand;
    private int bottleCapacityML, volumeRemaining;
    private float alcoholPercentage;
    private LocalDate expirationDate;
    private double price;

    public HandSanitizerBottle(String brand, int bottleCapacityML, float alcoholPercentage, LocalDate expirationDate, double price) {
        setBrand(brand);
        setbottleCapacityML(bottleCapacityML);
        setAlcoholPercentage(alcoholPercentage);
        setExpirationDate(expirationDate);
        setPrice(price);
        setVolumeRemaining(bottleCapacityML);
    }

    public String getBrand() {
        return brand;
    }

    /**
     * This will validate that the argument matches one of the following brands:
     * ->'Utsav's Elixer'
     * ->'Bikers' Clean Hand'
     * ->'Coffee Scent'
     * @param brand a String representing the brand
     */
    public void setBrand(String brand) {
        List<String> validBrands = Arrays.asList("Utsav's Elixer","Bikers' Clean Hand",
                                                "Coffee Scent");
        if (validBrands.contains(brand))
            this.brand = brand;
        else
            throw new IllegalArgumentException("Valid brands are: "+ validBrands);
    }

    public int getbottleCapacityML() {
        return bottleCapacityML;
    }

    /**
     * This method sets the total volume of hand sanitizer that the bottle can hold
     * @param bottleCapacityML-the max volume of liquid in the bottle
     */
    public void setbottleCapacityML(int bottleCapacityML) {
        if (bottleCapacityML>=10 && bottleCapacityML <=5000)
            this.bottleCapacityML = bottleCapacityML;
        else
            throw new IllegalArgumentException("volume must be 10-5000");
    }

    public int getVolumeRemaining() {
        return volumeRemaining;
    }

    /**
     * This will reduce until the bottle is empty
     * @param volumeRemaining
     */
    public void setVolumeRemaining(int volumeRemaining) {
        if (volumeRemaining<= 0 || volumeRemaining<bottleCapacityML)
            throw new IllegalArgumentException("volume remaining must be 0->"+bottleCapacityML);
        else
            this.volumeRemaining = volumeRemaining;
    }

    public float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(float alcoholPercentage) {
        if (alcoholPercentage>=60 && alcoholPercentage<=99)
            this.alcoholPercentage = alcoholPercentage;
        else
            throw new IllegalArgumentException("alcohol percentage must be 90-99");
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if (expirationDate.isAfter(LocalDate.now()))
            this.expirationDate = expirationDate;
        else
            throw new IllegalArgumentException("Expiration date needs to be in the future");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >=0 && price <= 100)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be 0-100");
    }

    public String toString()
    {
       return String.format("%s, holds %d ml and costs $%.2f", brand, bottleCapacityML, price);
    }

    /**
     * This method will validate that there is liquid left in the bottle and dispense
     * 5 ml.
     * @return the amount of hand sanitizer dispensed
     */
    public int dispense()
    {
        if (volumeRemaining>=5)
        {
            volumeRemaining-=5;
            return 5;
        }
        int dispenseAmount = volumeRemaining;
        volumeRemaining=0;
        return dispenseAmount;
    }

    public void refill()
    {
        volumeRemaining = bottleCapacityML;
    }
}
