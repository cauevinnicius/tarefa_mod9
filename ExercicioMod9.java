public class ExercicioMod9 {

    public static void main(String[] args) {

        int num1 = 10;
        Integer num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 20;
        long num4 = num3;
        System.out.println(num3);
        System.out.println(num4);

        long num5 = 30;
        int num6 = (int) num5;
        System.out.println(num5);
        System.out.println(num6);

        Integer num7 = 40;
        Long num8l = Long.valueOf(num7);
        System.out.println(num7);
        System.out.println(num8l);
    }
}