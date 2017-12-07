public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star "*"  with the command
        // call this command amount times without line break
        //BEGIN SOLUTION
        for (int i=0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println("");
        //END SOLUTION
    }   

    public static void printSquare(int sideSize) {
        // 39.2
        //print a Square with printStars example size 2:
        //**
        //**
        //BEGIN SOLUTION
        for (int i=0; i<sideSize; i++){
            printStars(sideSize);
        }
        //END SOLUTION
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        //print a Rectangle with printStars example 3X2:
        //***
        //***
        //BEGIN SOLUTION
        for (int i=0; i<height; i++){
            printStars(width);
        }
        //END SOLUTION
        
    }

    public static void printTriangle(int size) {
        // 39.4
        //print a Trinagle with printStars example size 3:
        //*
        //**
        for (int i=1; i<=size; i++){
            printStars(i);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
    }

}
