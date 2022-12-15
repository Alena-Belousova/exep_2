import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        // вместо этого, необходимо повторно запросить у пользователя ввод данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (с запятой): ");
        if (scanner.hasNextFloat()) {
            float i = scanner.nextFloat();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели ерунду! введите число");

        }
    }

}