import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * 1. Создать приложение, которое отображает в окне консоли аргументы командной строки метода main() в обратном порядке.
         * */
        /*for(int i = args.length-1; i >=0 ; i--) {
            System.out.println(args[i]);
        }*/

        /**
         * 2. Создать приложение для ввода пароля из командной строки и сравнения его со строкой-образцом.
         * */

        /*final String pass = "123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String str = scanner.next();
        if (str.equals(pass)) {
            System.out.println("Пароль введен верно");
        }
        else   {
            System.out.println("Пароль введен не верно");
        }*/


        /**
         * 3. Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы (произведения) и вывода результата на консоль.
         * */


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для подсчета суммы, или 2 для подсчета произведения");
        boolean isInt = scanner.hasNextInt();
        int x = 0;
        if (isInt)
        {
            x = scanner.nextInt();
        }
        else
        {
            System.out.println("Это не целое число");
        }

        int result = 0;
        for(int i = 0; i < args.length; i++) {
            if(x == 1) {
                result += Integer.valueOf(args[i]);
            }
            else if(x == 2){
                if(i == 0) {
                    result = 1;
                }
                result *= Integer.valueOf(args[i]);
            }
        }

        System.out.println(result);*/


        /**
         * 6. Написать тестовую программу, которая продемонстрирует работу класса.
         */
        CarsFactory factory = new SimpleCar();
        CarsBuilder redCar = factory.createCar();
        redCar.build(1);


    }

}

interface CarsFactory
{
    public CarsBuilder createCar();
}

class SimpleCar implements CarsFactory {
    @Override
    public CarsBuilder createCar() {
        return new Cars();
    }
}

abstract class CarsBuilder {
    public abstract void build(int type);
}

/**
 * 5. Создать класс, хранящий в себе данное перечисление. При написании использовать архитектуру проектирования «Фабрика» (Factory)
 */
class Cars extends CarsBuilder{

    @Override
    public void build(int type) {
        if(Car.BLUE.getType() == type) {
            System.out.println(Car.BLUE.getCode());
        }
        else if(Car.RED.getType() == type) {
            System.out.println(Car.RED.getCode());
        }
        else if(Car.GREEN.getType() == type) {
            System.out.println(Car.GREEN.getCode());
        }
        else  {
            System.out.println("Type error");
        }
    }

    /**
     * 4. Реализовать класс перечисление, обладающий конструктором, набором методов get\set, и содержащий в себе два поля: числовое и строковое.
     */
    enum Car {
        RED("red",1), BLUE("blue",2), GREEN("green",3);

        private String code;
        private int type;
        Car(String code, int type) {
            this.code = code;
            this.type = type;
        }

        public String getCode() {
            return code;
        }

        public int getType() {
            return type;
        }
    }

    public Cars() {
    }
}
