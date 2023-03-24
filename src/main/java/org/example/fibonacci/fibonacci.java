package org.example.fibonacci;


    import java.util.Scanner;

    public class fibonacci {
        public static int[] fibonacciSeries(int n) {
            int[] series = new int[n];
            series[0] = 0;
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
            return series;
        }

        public static void main(String[] args) {
            fibonacci fib=new fibonacci();

            int printSeries[]=fib.fibonacciSeries(7);

            for (int i=0; i<printSeries.length; i++){
                System.out.println(printSeries[i]);
            }
        }
    }


