public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");

        int age = 10; // Введи возраст

        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием");
        }
        if (age < 18) {
            System.out.println("Извини, но возраст совершеннолетия ещё не наступил, придется немного подождать.");
        }

        //Задание 2
        System.out.println("Задание 2");

        int age1 = 87; // Введи возраст

        if (age1 < 7) {
            System.out.println("С такими запросами конечно рановато думать даже о школе сопляк");
        }
        if (age1 >= 7) {
            System.out.println("Школьник");
        }
        if (age1 >= 18) {
            System.out.println("Последний звонок прозвенел и пора в университет");
        }
        if (age1 >= 24) {
            System.out.println("Забудешь все, чему учили и найди уже работу наконец");
        }

        //Задание 3
        System.out.println("Задание 3");

        int NumberInTheQueue = 103; // Укажите номер в очереди в вагон

        int carCapacity = 102;
        int sittingPlaces = 60;
        if (NumberInTheQueue <= sittingPlaces) {
            System.out.println ("Добро пожаловать! Пока еще есть сидячие места");
        }
        if (NumberInTheQueue >= sittingPlaces) {
            System.out.println ("Добро пожаловать! В вагоне остались только стоячие места");
        }
        if (NumberInTheQueue > carCapacity) {
            System.out.println ("Извините, но мест больше нет! Пройдите в следующий вагон");
        }
    }
}