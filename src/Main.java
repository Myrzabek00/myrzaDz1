import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String someWord;
        int NUM = 10;
        String word = "Sorry for late HW";
        someWord = NUM + word;
        System.out.println(NUM + word + someWord);
        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }



        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String myName = scan.nextLine();
        System.out.println("Привет " + myName);
    }
}