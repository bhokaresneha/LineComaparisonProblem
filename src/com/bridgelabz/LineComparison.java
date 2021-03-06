/* Problem Statement=>
*As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than the other line.
* - Using Java compareTo method to compare 2 Lengths is preferable.*
 */
package com.bridgelabz;

import java.util.Scanner;

public class LineComparison
{
        static int x1,y1,x2,y2,x3,y3,x4,y4;

        // Dispay message method
        static void displayMessage()
        {
        System.out.println("Welcome to Line Comparison Computation");
        }

        static void calculation(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
        {

            //Displaying co-ordinated taken by user
            System.out.println("Co-ordinates  of Line1 are :\nx1=" + x1 + "  y1=" + y1 + "\nx2=" + x2 + "  y2=" + y2);
            System.out.println("Co-ordinates  of Line2 are :\nx3=" + x3 + "  y3=" + y3 + "\nx4=" + x3 + "  y4=" + y4);

            //calculating length of Line 1
            Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
            System.out.println("Length of First line is : " + length1);

            // calculating length of Line 2
            Integer length2 = (int) Math.sqrt((x4 - x3) * 2 + (y4 - y3) * 2);
            System.out.println("Length of second line is : " + length2);

            //Passing parameter to the another method
                    checkEqualityofLine(length1,length2);
                     compareTwoLines(length1,length2);
        }
        static void checkEqualityofLine(Integer length1,Integer length2)
        {
            // checking length is equal or not using equals method
            boolean result = length1.equals(length2);
            if (result == false)
                System.out.println("Both Lines are not Same");
            else
                System.out.println("Both lines are same");
        }
        static void compareTwoLines(Integer length1,Integer length2)
        {
            //comparing both lines using compareTo method
            int result2 = length1.compareTo(length2);
            if (result2>0)
                System.out.println("Line 1 is greater than line 2");
            else if (result2 < 0)
                System.out.println("Line 2 is greater than line1");
            else
                System.out.println("Both lines are parallel");
        }

        public static void main(String[] args)
        {

            // Creating object of class
            LineComparison lc=new LineComparison();

            //Calling static displayMessage method()
            displayMessage();

            //creating object of scanner class to take input from user
            Scanner sc=new Scanner(System.in);

            //taking co-ordinates from user
            System.out.println("Enter the value for co-ordinates x1 and y1");
            x1=sc.nextInt();
            y1=sc.nextInt();
            System.out.println("Enter the value for co-ordinates x2 and y2");
            x2=sc.nextInt();
            y2=sc.nextInt();
            System.out.println("Enter the value for co-ordinates x3 and y3");
            x3=sc.nextInt();
            y3=sc.nextInt();
            System.out.println("Enter the value for co-ordinates x4 and y4");
            x4=sc.nextInt();
            y4=sc.nextInt();

            //passing co-ordinates to calculation method
            calculation(x1,y1,x2,y2,x3,y3,x4,y4);

        }
}


