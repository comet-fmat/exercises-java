
public class Main {
    /*
    The information system of a Housing service represents the apartments it 
    has for sale using objects of the Apartment class:
    */

    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1, 16, 5500);
Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true

    }
}
