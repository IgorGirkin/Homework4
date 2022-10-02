public class Main {
    public static void main(String[] args) {
        int ageСhild = 14;
        boolean togetherWithAdults=ageСhild >= 5 && ageСhild <= 14;
        if (togetherWithAdults) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого!");
        } else {
        if (ageСhild<5) {
            System.out.println("Ребенок НЕ может кататься на аттракционе!"); }
        }
        if (ageСhild>14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого!");
        }

        }
    }




