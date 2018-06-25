package com.example.demo;

public class Factorize {

    private static String result;
    private static int intTemp;

    public static String answer(int input) {
        result = "";
        intTemp = input;
        foctory();

        return result;
    }

    private static void foctory() {
        int[] factor = { 2, 3, 5, 7, 11, 13, 17 };
        int len = factor.length;

        for (int i = 0; i < len; i++) {
            if (intTemp % factor[i] == 0) {

                if (result == "") {
                    result = String.valueOf(factor[i]);
                } else {
                    result = result + "," + String.valueOf(factor[i]);
                }

                intTemp /= factor[i];

                if (intTemp != 1) {
                    foctory();
                } else {
                    return;
                }
            }
        }
    }

}
