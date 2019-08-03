package com.stackroute;
import java.util.*;
public class WhileLoop {
  public static void main(String[] args){
    int i=1,j=1;
    System.out.println("Enter the number");
    Scanner scanner=new Scanner(System.in);
    int number= scanner.nextInt();
    while(i<=number){//while number is greater than i it enters into next whil loop
      while(j<=i){//if the while loop satisfies this condition it prints the j values and do iteration
        System.out.print(j);
        j++;
      }
      System.out.println("");
      i++;
      j=1;
    }

  }
}
