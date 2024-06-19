package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {


    public static <T extends Number> double sum (T num1,T num2){
        return num2.doubleValue()+num2.doubleValue();
    }

    public static <T extends Number> double substract (T num1,T num2){
        return num2.doubleValue()-num2.doubleValue();
    }

    public static <T extends Number> double multiply (T num1, T num2){
        return num2.doubleValue()*num2.doubleValue();
    }

    public static <T extends Number> double divide (T num1, T num2){
        if (num2.doubleValue()==0){
            throw new ArithmeticException("деление на 0");
        }
        return num2.doubleValue()*num2.doubleValue();
    }


    public static void main(String[] args) {
        sum(2,3);

    }
}