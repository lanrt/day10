package demo02;

public class Duotai {
    public static void main(String[] args) {
        Fu fu = new Zi();

        System.out.println(fu.c);
        System.out.println();
        Zi zi = (Zi) fu;
        System.out.println(zi.a);
    }
}
