
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    /*
    87.1: Larger
    Implement the method public boolean larger(Apartment otherApartment) 
    that returns true if the Apartment object for which the method is called (this)
    is larger than the apartment object given as parameter (otherApartment).
    
    87.2: Price difference
    Implement the method public int priceDifference(Apartment otherApartment) 
    that returns the absolute value of the price difference of the Apartment object 
    for which the method is called (this) and the apartment object given as parameter (otherApartment).
    The price of an apartment is squareMeters * pricePerSquareMeter.
    
    87.3: more expensive than
    Implement the method public boolean moreExpensiveThan(Apartment otherApartment)
    that returns true if the Apartment-object for which the method is called (this)
    has a higher price than the apartment object given as parameter (otherApartment).
    */
    
    //BEGIN SOLUTION
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int thisBuffer = this.squareMeters * this.pricePerSquareMeter;
        int Buffer = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return Math.abs(thisBuffer - Buffer);
        //return thisBuffer - Buffer;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        //int thisBuffer = this.squareMeters * this.pricePerSquareMeter;
        //int Buffer = otherApartment. * otherApartment.pricePerSquareMeter;
        int Buffer2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int Buffer1 = this.squareMeters * this.pricePerSquareMeter;
        
        //if()
        if (Buffer1> Buffer2)
            return true;
        else
            return false;
    }
    //END SOLUTION
}
