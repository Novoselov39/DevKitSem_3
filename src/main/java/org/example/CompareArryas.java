package org.example;

public class CompareArryas {

    public static boolean compareArrays(T[] array1, T[] array2){
        if (array1.length!=array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if(!array1.getClass().equals(array2.getClass())){
                return false
            }
        }
        return true;

    }


    public static void main(String[] args) {

    }
}