package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 100,i = 2;
        System.out.print("2 3 5 7 ");
        for (; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }

        }
    }
}
//internette bu programı düzgün şekilde yazan şekiller vardı ama anlamadım ve ben kendi yazdığım programı göndermek istedim.