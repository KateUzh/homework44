public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершеннолетия \n");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать \n");
        }
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку \n");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки \n");
        }
        System.out.println("Задача 3");
        int speedKmPerHour = 60;
        if (speedKmPerHour > 60) {
            System.out.println("Если скорость " + speedKmPerHour + " км/ч, то придется заплатить штраф \n");
        } else {
            System.out.println("Если скорость " + speedKmPerHour + " км/ч, то можно ездить спокойно \n");
        }
        System.out.println("Задача 4");
        int ageNew = 50;
        if (ageNew >= 2 && ageNew <= 6) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в детский сад \n");
        }
        if (ageNew >= 7 && ageNew <= 17) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить в школу \n");
        }
        if (ageNew >= 18 && ageNew <= 24) {
            System.out.println("Если возраст человека равен " + ageNew + ", то его место в университете \n");
        }
        if (ageNew > 24) {
            System.out.println("Если возраст человека равен " + ageNew + ", то ему нужно ходить на работу \n");
        }
        System.out.println("Задача 5");
        int kidAge = 5;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то ему нельзя кататься на аттракционе \n");
        }
        if (kidAge >= 5 && kidAge <= 14) {
            System.out.println("Если возраст ребенка равен " + kidAge +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого \n");
        }
        if (kidAge > 14) {
            System.out.println("Если возраст ребенка равен " + kidAge +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого \n");
        }
        System.out.println("Задача 6");
        int passenger = 59;
        int totalCapacity = 102;
        int seatingPlace = 60;
        if (passenger < seatingPlace) {
            System.out.println("Если количество пассажиров в вагоне равно " + passenger +
                    ", то в вагоне еще есть сидячие места \n");
        } else if (passenger >= seatingPlace && passenger < totalCapacity) {
            System.out.println("Если количество пассажиров в вагоне равно " + passenger +
                    ", то в вагоне остались только стоячие места \n");
        } else {
            System.out.println("Если количество пассажиров в вагоне равно " + passenger +
                    ", то вагон уже полностью забит \n");
        }
        System.out.println("Задача 7");
        int one = 5;
        int two = -20;
        int three = 10;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше, чем " + two + " и больше, чем " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше, чем " + one + " и больше, чем " + three);
        } else {
            System.out.println("Число " + three + " больше, чем " + one + " и больше, чем " + two);
        }
    }
}