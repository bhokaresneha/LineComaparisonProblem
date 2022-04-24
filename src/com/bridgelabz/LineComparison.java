
package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    static int x1,y1,x2,y2,x3,y3,x4,y4;
    static void displayMessage() {
        System.out.println("Welcome to Line Comparison Computation");
    }
    static void calculation(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){

    //Displaying co-ordinated taken by user
        System.out.println("Co-ordinates  of Line1 are :\nx1=" + x1+"  y1="+y1+"\nx2="+x2+"  y2="+y2);
        System.out.println("Co-ordinates  of Line2 are :\nx3=" + x3+"  y3="+y3+"\nx4="+x3+"  y4="+y4);


    }

    public static void main(String[] args) {

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


