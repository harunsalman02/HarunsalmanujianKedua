package com.juaracoding;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--){
            if(i % 2 == 1){
                for(int j = 1; j <= i  ; j++){
                    if(j % 2 == 1){
                        System.out.print(j+ " _");
                    }
                }
            }
            System.out.println();
        }
    }
}