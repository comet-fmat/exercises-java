/*
104: Sorting
Note: in this assignment you're supposed to sort the array yourself.
You can't use the help of the Arrays.sort()-method or ArrayLists!

104.1: Smallest
Implement a method smallest, which returns the smallest value in the array.
NOTE: You can't change the array that gets passed into the method!

104.2: The index of the smallest
Implement a method indexOfTheSmallest, 
which returns the index of the smallest value in the array 
(the position of the value in the array, that is).
NOTE: You can't change the array that gets passed into the method!

104.3: Index of the smallest at the end of an array
Implement a method indexOfTheSmallestStartingFrom, which works just like the method of the previous assignment,
but only takes into consideration the end of an array starting from a certain index. 
In addition to the array the method gets as parameter an index,
from which the search for the smallest will be started.
NOTE: You can't change the array that gets passed into the method as a parameter!

104.4: Swapping values
Create a method swap, to which will be passed an array and two of its indexes. 
The method swaps the values in the indexes around.

 104.5: Sorting
Now we've got a set of useful methods, with which we can implement a sorting algorithm known as selection sorting.

The idea of selection sorting is this:
Move the smallest number of the array to index 0.
Move the second smallest number to the index 1.
Move the third smallest number to the index 2.
and so forth
Implement the method public static void sort(int[] array), which is based on the idea above. 
The method ought to have a loop that goes through the indexes of the array. 
The methods smallestIndexStartingFrom and swap are surely useful. 
Also print the contents of the array before sorting and after each round to be able to 
make sure that the algorithm works correctly.
*/
public class Main {
    //BEGIN SOLUTION
    public static void main(String[] args) {

        int[] values = {-1, 6, 9, 8, 12};
System.out.println(indexOfTheSmallestStartingFrom(values, 1));
System.out.println(indexOfTheSmallestStartingFrom(values, 2));
System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i : array){
            if(i<smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = smallest(array);
        int buffer = 0;
        
        for(int i : array){
            
            if(i == smallest){
                break;
            }
            buffer++;
        }
        
        return buffer;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int[] buffer2 = new int[20];
        int small;
        int buff = 0;
        int elem = index + 1;
        
        for (int i = index; i< array.length; i++){
            if(array[i]<array[i+1]){
                buff++;
            } 
        }
        
        //small = indexOfTheSmallest(buffer2);
        return buff;
        
    }
    //END SOLUTION
}
