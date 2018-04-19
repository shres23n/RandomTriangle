/**
 * The class program generates three random (x,y) coordinates and
 * checks whether they form a triangle or not.
 * 
 * Author: Nista Shrestha
 **/

import java.util.*;
import java.awt.Point;

public class RandomTriangle {
  public static void main (String[] args) {
    
    //get random number generator and generate x and y values to create 3 different Point objects
    Random randnum = new Random();
    int x1 = randnum.nextInt(100);
    int y1 = randnum.nextInt(100);
    int x2 = randnum.nextInt(100);
    int y2 = randnum.nextInt(100);
    int x3 = randnum.nextInt(100);
    int y3 = randnum.nextInt(100);
    
    //place randomly generated numbers to x,y coordinates of 3 different Points objects
    Point pt1 = new Point(x1, y1);
    Point pt2 = new Point(x2, y2);
    Point pt3 = new Point(x3, y3);
    
    //call triangle method to pass the 3 Point objects 
    triangle(pt1, pt2, pt3);
    
  }
  // calculte slopes of the coordiantes to check whether they form a triangle or not, and print accordingly
  public static void triangle(Point pt1, Point pt2, Point pt3){
    
    //calculate slope of Point 1 and Point 2
    int numerator1 = pt2.y - pt1.y;
    int denominator1 = pt2.x - pt1.x;
    double slope1 =  numerator1/denominator1;
    
    //calculate slope of Point 1 and Point 3
    int numerator2 = pt3.y - pt1.y;
    int denominator2 = pt3.x - pt1.x;
    double slope2 = numerator2/denominator2;
    
    //calculate slope of Point 3 and Point 2
    int numerator3 = pt3.y - pt2.y;
    int denominator3 = pt3.x - pt2.x;
    double slope3 = numerator3/denominator3;
    
    //check whether two slopes are equal or not, if equal print can't form triagnle, else print can form a triangle
    if (slope1 != slope2 && slope1 != slope3){
      System.out.println(pt1);
      System.out.println(pt2);
      System.out.println(pt3);
      System.out.println("Points can form a valid triangle");
    }
    else{
      System.out.println("Points can't form a valid triangle");
    }
  } 
}

