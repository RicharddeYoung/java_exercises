package com.qa.helloworld;

public class MultiDeimensionalArrays {

	public static int ageArray[] = {1,1,2,1,3};

    public static void process(int ageArray) {
        System.out.println(ageArray);
    }

    public static void main(String[] args) {
        for(int i = 0; i < ageArray.length; i++) {
           int j=ageArray[i]*10;
           System.out.println(j);
           
        }
    }

}
