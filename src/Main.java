public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age1 = 18;
        int age2 = 16;
        if (age1 >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }

        if (age2 < 18) {
            System.out.println("Ваш возраст совершеннолетия еще не наступил и Вам нужно немного подождать");
        }


        // Задание 2
        System.out.println("Задание 2");
        int age3 = 30;
        if (age3 >= 7) {
            System.out.println("Ребенок может ходить в школу");
        }
        if (age3 >= 18) {
            System.out.println("Человек закончил школу и может отправиться в университет");
        }
        if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int capacityMans = 102;
        int carriageSitPlace = 60;
        int carriageStandPlace = capacityMans - carriageSitPlace;
        int personsSitPlace = 50;
        int personsStandPlace = 40;
        int persons = personsSitPlace + personsSitPlace;
        if (persons >= 102) {
            System.out.println("Вагон полностью забит");
        }
        if (personsSitPlace < carriageSitPlace) {
            System.out.println("В вагоне имеется свободное сидячее место");
        }
        if (personsStandPlace < carriageStandPlace) {
            System.out.println("В вагоне имеется свободное стоячее место");
        }
    }
}