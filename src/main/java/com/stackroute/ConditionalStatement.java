package com.stackroute;
import java.util.*;
public class ConditionalStatement {
  public static void main(String[] args) {
    System.out.println("Enter the value of a");
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    if (a % 2 == 0) {//if the number is even it prints as even number
      System.out.println("Even number");
    }
    else if(a%2!=0){
      System.out.println("Odd number");//if the number is odd it prints as odd number
    }
    else{
      System.out.println("Invalid number");//else it prints invalid
    }
    //Switch conditional statement
   switch(a){
     case 1:System.out.println("hello");//if the user give the value as 1 case:1 gets printed
     break;
     case 2 :System.out.println("welcome");//if the user give the value as 2 case:2 gets printed
     break;
     case 3:System.out.println("to stackroute");//if the user give the value as 3 case:3 gets printed
     break;
     default:System.out.println("not a valid number");//if the user give the value as some other default gets printed
   }
  }
}
