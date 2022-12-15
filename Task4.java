import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Разработайте программу, которая выбросит Exception,
        // когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение,
        // что пустые строки вводить нельзя.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            String abc = scanner.nextLine();
            if (abc.isEmpty()) {
                throw new Exception("не введено число ");
            }
            System.out.println(abc);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}






