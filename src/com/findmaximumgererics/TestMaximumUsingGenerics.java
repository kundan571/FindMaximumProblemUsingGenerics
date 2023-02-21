package com.findmaximumgererics;

public class TestMaximumUsingGenerics<T extends Comparable<T>> {
    private T X ,Y, Z;

    public TestMaximumUsingGenerics(T x,T y,T z) {
       this.X = x;
       this.Y = y;
       this.Z = z;
       findMaximum(x, y, z);
    }

    private static  <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        System.out.println("Maximum of: " + x + ", " + y + ", " + z + " is: " + max);
        return max;
    }


    public static void main(String[] args) {
        new TestMaximumUsingGenerics<>(30,200,12);

    }
}
