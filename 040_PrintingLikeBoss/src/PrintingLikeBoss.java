public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        // 40.1
        //print one star "*" in same line with the command
        // call this command amount times
        //BEGIN SOLUTION
        for (int i=0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println("");
        //END SOLUTION
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        //print withe space in same line without line break
        //BEGIN SOLUTION
        for (int i=0; i<amount; i++){
            System.out.print(" ");
        }
        //END SOLUTION
    }

    public static void printTriangle(int size) {
        // 40.2
         //print a triangle like boss example size 3:
        //  *
        // **
        //***
        //BEGIN SOLUTION
        for (int i=1; i<=size; i++){
            printWhitespaces(size-i);
            printStars(i);
        }
        //END SOLUTION
    }

    public static void xmasTree(int height) {
        // 40.3
         //print xmas treee like a boss examples:
        /* 
        when height =4
           *
          ***
         *****
        *******
          ***
          ***
        when height =10
                 *
                ***
               *****
              *******
             *********
            ***********
           *************
          ***************
         *****************
        *******************
                ***
                ***
        */
        //BEGIN SOLUTION
        int space = (height)-1;
        int star = 1;
        
        for (int i=0; i < height;i++){
            
            printWhitespaces(space);
            printStars(star);
            space--;
            star=star+2;
        }
        
        for (int i=0; i < 2;i++){
            
            printWhitespaces((height)-2);
            printStars(3);
        }
        //END SOLUTION
   
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

    }
}
