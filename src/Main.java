public class Main {
    public static void main(String[] args) {
        int age = 25;
        boolean goesToKinderGarten = age >= 2 && age <= 6;
        boolean schoolboy = age >= 7 && age <= 18;
        boolean student = age > 18 && age <=24;
        if (goesToKinderGarten) {
            System.out.println("Нужно ходить в детский сад!");
        }
        if (schoolboy) {
            System.out.println("Нужно ходить в школу!");
        }
        if(student) {
            System.out.println("Твое место в университете!");
        } else {
            if (age > 24) {
                System.out.println("Пора ходить на работу!");
            }
        }
    }
}



