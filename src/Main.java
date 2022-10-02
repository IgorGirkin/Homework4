public class Main {
    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        int free = 10;
        boolean more = one > two && one > free;
        boolean more2 = two > one && two > free;
        boolean more3 = free > two && free > one;
        if (more) {
            System.out.println("Первое чило болше!");
        } else if (more2) {
            System.out.println("Второе число болше!"); {
            }
        } else if (more3) {
                System.out.println("Третее число больше!");
            } else {
              System.out.println("Все три числа равны.");
        }
    }
    }



