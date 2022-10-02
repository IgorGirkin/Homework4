public class Main {
    public static void main(String[] args) {
        int generalWorker = 24;
        if (generalWorker >= 24) {
            System.out.println("А вот и пришла пора отправляться на поиски приключений, " +
                    "там ты найдешь золотые монеты на поле чудес!... пора искать первую " +
                    "работу.");
        } else {
            if (generalWorker>= 18) {
                System.out.println("Возраст совершеннолетия, привет общага, " +
                        "можешь отправляться в университет!");
            } else {
                if (generalWorker >= 7) {
                    System.out.println("Ребенок ходит в школу!");
                }
            }
        }
    }
}