import java.util.Arrays;
import java.util.Scanner;
/*
The template you get from the test automaton has a start for an implementation of binary search.
The class BinarySearch holds a method public static boolean search(int[] array, int searchedValue), 
the job of which is to figure out, by using binary search, 
if the value given as a parameter is in the sorted array that is also given as parameter.

The method search does not work yet, however. Finish the method's implementation into a real binary search.
*/
public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {-3, 2, 3, 4, 7, 8, 12};
        Scanner lukija = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(taulukko, Integer.parseInt(etsittavaLuku));

        // Print here the result
    }
}
