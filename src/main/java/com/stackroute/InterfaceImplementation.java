package com.stackroute;

import java.sql.SQLOutput;

interface Animal {
  void eat();
}
interface Dog{
  void bow();
}
public class InterfaceImplementation implements Animal,Dog {
  @Override
  public void eat() {
    System.out.println("eating");
      }
      @Override
      public void bow(){
    System.out.println("bowing");
      }
      public static void main(String[] args){
      InterfaceImplementation interfaceImplementation=new InterfaceImplementation();
      interfaceImplementation.eat();
      interfaceImplementation.bow();
      }
}
