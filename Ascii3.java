package Datatypes;

public class Ascii3 {
    public static void main(String[] args) {
       
        int c='A';
        int C='a';

        int res=(c++ + ++C);
        System.out.println(res);
        System.out.println(c);
        System.out.println(C);

    }
}
