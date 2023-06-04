import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("ваш баланс");

        int amount = 100;
        int contributed = 5500;

        int precent;
        if (contributed > 1_000) {
            precent = contributed / 100;
        } else {
            precent = 0;
        }
        int newAmount = amount + contributed + precent;
        System.out.println("баланс: " + newAmount);
    }

}