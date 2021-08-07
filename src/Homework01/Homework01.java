package Homework01;

public class Homework01 {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println(arithmeticOperations(1f,20f,30f,40f));
        System.out.println(checkResultInterval(10,2));
        checkPositiveNumberVoid(-10);
        System.out.println(checkPositiveNumberBoolean(-100));
        sayHello("Анечка");
        checkLeapYear(800);
    }
    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void varsInit () {
        byte var1 = 1;
        short var2 = 2;
        int val3 = -42000;
        long val4 = 2500000L;
        float val5 = 1.502f;
        double val6 = 100002.73;
        boolean val7 = true;
        char val8 = 55;
        char val9 = 'y';
        String val10 = "Строка из символов";
    }
    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float arithmeticOperations(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
    // лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkResultInterval (int a, int b) {
        return a + b > 10 && a + b < 20;
    }
    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkPositiveNumberVoid (int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным");
        } else {
            System.out.println("Число " + a + " является отрицательным");
        }
    }
    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    public static boolean checkPositiveNumberBoolean (int a) {
        return a < 0;
    }
    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен
    // вывести в консоль сообщение «Привет, указанное_имя!».
    public static void sayHello (String name) {
        System.out.println("Привет, " + name + "!");
    }
    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkLeapYear (int year) {
        if (year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным");
        } else if (year % 4 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
}
