package com.stackroute;
import java.util.*;
public class Arrays {
  public static void main(String [] args){
    System.out.println("Enter the number");
    Scanner scanner=new Scanner(System.in);
    int[] number=new int[4];
  int sum=0;
  for(int i=0;i<=5;i++){
number[i]=scanner.nextInt();
  }
  for(int num:number){
sum=sum+num;
  }
  System.out.println(sum);

  }
}
