/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lamdalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author soblab
 */
public class Main {

    public static void main(String[] args) {

        fInt taxes1;

        taxes1 = (double grosspay, double taxrate) -> {
            Double netPay = grosspay * taxrate;
            return grosspay - netPay;
        };

        double result = 0;

        result = taxes1.taxes(100, 0.3);

        System.out.println("the net pay is: " + result);

        Assignment w;
        List<Assignment> l1 = new ArrayList<Assignment>();

        w = new Assignment("Homework 1", 85);
        l1.add(w);
        w = new Assignment("Homework 2", 80);
        l1.add(w);
        w = new Assignment("Homework 3", 100);
        l1.add(w);
        w = new Assignment("Exam 1", 75);
        l1.add(w);
        w = new Assignment("Exam 2", 90);
        l1.add(w);

        //this will print out the default toString, it will print out the class name and memory location
        l1.stream().forEach(System.out::println);

        //show only grades
        l1.stream().map(a -> a.getGrade()).forEach(System.out::println);

        //show only high grades
        l1.stream().map(a -> a.getGrade()).filter(a-> a >= 90).forEach(System.out::println);
        
        //show letter grades 
        l1.stream().map(a -> a.getGrade()).map(a -> {
            if(a >= 90)
                return "A";
            else if( a >= 80)
                return "B";
            else if (a >= 70)
                return "C";
            else if (a >= 60)
                return "D";
            else 
                return "Not A";
        }
        ).forEach(System.out::println);
     
    }   
 
}
