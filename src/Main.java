public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        System.out.println("Домашнее задание 1");

        // Задание 1
        System.out.println("Задание 1");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }

        if (age1 < 18) {
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

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");
        int age5 = 16;
        if (age5 >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        } else {
            System.out.println("Ваш возраст совершеннолетия еще не наступил и Вам нужно немного подождать");
                        }
        // Задание 2
        System.out.println("Задание 2");
        int age6 = 25;
        if (age6 < 7) {
        } else {
            System.out.println("Ребенок может ходить в школу");
        }
        if (age6 < 18) {
        } else {
            System.out.println("Человек закончил школу и может отправиться в университет");
        }
        if (age6 < 24) {
        } else {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int capacityMans2 = 102;
        int carriageSitPlace2 = 60;
        int carriageStandPlace2 = capacityMans2 - carriageSitPlace2;
        int personsSitPlace2 = 58;
        int personsStandPlace2 = 40;
        int persons2 = personsStandPlace2 + personsSitPlace2;
        if (persons2 < capacityMans2) {
        } else {
            System.out.println("Вагон полностью забит");
        }
        if (personsSitPlace2 >= carriageSitPlace2) {
        } else {
            System.out.println("В вагоне имеется свободное сидячее место");
        }
        if (personsStandPlace2 >= carriageStandPlace2) {
        } else {
            System.out.println("В вагоне имеется свободное стоячее место");
        }

        // Домашнее задание 3

        // Задание 1
        System.out.println("Задание 1");
        int age7 = 7;
        if (age7 < 2 || age7 >= 6) {
        } else {
            System.out.println("Если возраст человека равен " + age7 + " ,то тебе нужно ходить в детcкий садик");
        }
        if (age7 < 7 || age7 >= 18) {
        } else {
            System.out.println("Если возраст человека равен " + age7 + " ,то тебе нужно ходить в школу");
        }
        if (age7 < 18 || age7 >= 24) {
        } else {
            System.out.println("Если возраст человека равен " + age7 + " ,то тебе нужно ходить в университет");
        }
        if (age7 < 24) {
        } else {
            System.out.println("Если возраст человека равен " + age7 + " ,то тебе нужно ходить на работу");
        }

        //Задание 2
        System.out.println("Задание 2");
        int age8 = 10;
        if (age8 >= 5) {

        } else {
            System.out.println("Вы не можете кататься на аттракционе");
        }
        if (age8 < 5 || age8 >= 14) {

        } else {
            System.out.println("Вы можете кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age8 < 14) {

        } else {
            System.out.println("Вы можете кататься без сопровождения взрослого");
        }

        // Задание 3
        System.out.println("Задание 3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one < two || one < free) {
        } else {
            System.out.println("Первое число больше");
        }
        if (two < one || two < free) {
        } else {
            System.out.println("Второе число больше");
        }
        if (free < one || free < two) {
        } else {
            System.out.println("Третье число больше");
        }






        }
}