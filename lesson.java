package ru.sbrf.lesson;

public class lesson {



    public static void main(String[] args)  {



        byte a = 30;
        short b = 15;
        int c = 16;
        int d = 89;
        char e = 'A';


        System.out.println(sum(a,b));
        System.out.println(multiple(c,d));
        System.out.println(getMaxNumber(c,d));
        System.out.println(isCharA(e));
        System.out.println(isCharNumber(e));
        toBinaries();
        maxToBinaries();
        System.out.println(CharToInt(e));
        System.out.println(IntToChar(d));

    }

    public static byte sum (byte a, short b) {
        int c = a + b;
        System.out.println("Задание №4");
        return (byte) c;
    }

    public static int multiple (int a, long b) {
        System.out.println("Задание №5");
        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b) {
        System.out.println("Задание №6");
        return a > b ? a : b;
    }

    public static boolean isCharA(char a) {
        System.out.println("Задание №7");
        return a == 'A';
    }

    public static boolean isCharNumber(char a) {
        System.out.println("Задание №8");
        return Character.isDigit(a);
    }

    public static void toBinaries() {
        System.out.println("Задание №9");
        for (int i=0; i<31; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void maxToBinaries() {
        System.out.println("Задание №10");
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
    }

    public static int CharToInt (char a) {
        System.out.println("Задание №11");
        return (int) a;
    }

    public static char IntToChar (int a) {
        System.out.println("Задание №12");
        return (char) a;
    }

}