package _01_WorkingWithAbstraction.hotelReservation;

public class PriceCalculator {

    public  static  double calculateFinalPrice (double pricePerDay, int numberOfNights, Season season, DiscountType discountType){
        double price = pricePerDay*numberOfNights;
        price= price*season.getMultiplier();
        price= price* (100-discountType.getDiscount())/100.0;

        return price;

    }

}
