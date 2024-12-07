/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

/**
 *
 * @author Vedika
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare the variables
        int  row= 0;
        int  star = 0;
        int AlignSpace = 0;


        //triangle 1 (row is getting larger )
        for (row = 1; row <=10; row++)
        {
            for (star = 1 ;star <= row; star++)
            {
                System.out.print("*");
            }
            //to print an extra line(space)
            System.out.println( );
        }


        //the for loop for the stars only stays the same no matter the triangle

        System.out.println("");
        //triangle2 (row is getting smaller)
        for ( row=10 ; row>=1 ; row--){

            for ( star=1; star<=row ;star++){

                System.out.print("*");

                // System.out.println( );
            }
            System.out.println("");
        }


        //triangle 4 (the row is getting smaller, but space in front)
        for (row=10; row>=1; row--){

            for ( AlignSpace=1; AlignSpace<=10-row; AlignSpace++)
            {
                System.out.print(" ");
            }
            for ( star= 1; star <= row; star++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

        System.out.println("");
        //traingle 3 (the rows are getting larger, but space in front)(align)
        for (row=1 ; row <=10 ; row++)
        {
            for(AlignSpace = 1; AlignSpace <= 10- row ;AlignSpace++)
            {
                System.out.print(" ");
            }
            for (star=1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println( );
        }




    }
}


