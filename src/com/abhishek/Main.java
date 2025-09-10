package com.abhishek;

import java.lang.foreign.SegmentAllocator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

            System.out.println("Hello and welcome!");

            //If statement

            int Salary = 25000;
//            if (Salary>10000) {
//                System.out.println(Salary + 2000);
//            }
//            else{
//                    System.out.println(Salary + 1000);
//                }


            //Multiple if else

            if (Salary > 20000) {
                Salary += 4000;
            } else if (Salary >= 15000) {
                Salary += 2000;
            }
            else{
                System.out.println("Nothing is there");
            }
            System.out.println(Salary);
        }
}





