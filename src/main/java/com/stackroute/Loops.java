package com.stackroute;
import java.util.*;
public class Loops {
  public static void main(String[] args){
    System.out.println("Enter the number");
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    for(int i=0;i<=number;i++){//if the number greater than equal to 0 the loop satisfies and enters into next for loop
      for(int j=1;j<=i;j++){ //if the for loop satisfies here j value gets printed.
        System.out.print(j);
      }
      System.out.println("");
    }
  }
}
