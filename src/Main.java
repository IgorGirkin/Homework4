public class Main {
    public static void main(String[] args) {
        int wagonСapacity=102;
        int seatPlace=60;
        if (wagonСapacity>=102) {
        System.out.println("Мест нет, вагон уже полностью забит!");
        }
        if (wagonСapacity<102) {System.out.println("Есть свободные места!");
        }
        if (wagonСapacity<seatPlace) {
            System.out.println("Есть сидячие места!");
        }
        if (wagonСapacity>=seatPlace) {
            System.out.println("Только стоячие места!");
        }

    }
}