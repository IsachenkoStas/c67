package Lessons;

public class SecondClass {
    public static void main(String[] args) {
/*        int x = 6;
        if(x==5){
            System.out.println("X = 5!!!!!");
        } else {
            System.out.println("X не равен 5");
        }*/
/*
        int x = 13;
        if (x % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
*/

/*        int a = 4;
        switch (a) {
            case 1:
                System.out.println("Это 1");
                break;
            case 3:
                System.out.println("eto 3");
                break;
            case 5:
                System.out.println("eto 5");
                break;
            default:
                System.out.println("I dont know XD");



        }*/

/*       int i = 6;
        switch (i) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("ERROR 404 XDDDDDDDDDD");

        }*/
/*        int number = 99;
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("idk");

        }*/

/*
        int x = 0;
        while (x <= 25) {
            System.out.print(x++ + " ");
        }
        System.out.println("The end");
*/
/*
        int a = 1;
        do {
            System.out.println(a++);
        } while (a <= 5);
*/
/*        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 ) {
                System.out.println(i);
            }

        }*/

/*        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }*/
        for (int i = 1; i < 20; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End....");
    }
}
