import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class main {
    static EnternalBuffer Buffer = new EnternalBuffer();
    public static void main(String[] args) {
        System.out.println("".repeat(3));
        System.out.print("Здравствуйте, игрок!");
        while (true) {
            System.out.print(" Пожалуйста введите имя своего персонажа: ");
            Scanner in = new Scanner(System.in);
            EnternalBuffer.PlayerName = in.nextLine();
            System.out.println("Ваше имя - " + EnternalBuffer.PlayerName + ", Продолжить? <Да>/<Нет>\n");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("Да")){ System.out.println("Отлично, начинаем...");System.out.println(" ".repeat(3));
                try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}break;}
            else if (input.equalsIgnoreCase("Нет")){continue;}
            else {System.err.println("Ошибка ввода, расценивается как <Нет> ");continue;}
        }
        CharactersMobs.MobsIdIndex.add(-1);
        utility.Hello();
        utility.ClearAll();
        BackStoryScenario.GiveMeStory(EnternalBuffer.PlayerName);
       EnternalBuffer.LookPlayer();
       System.out.println(); Situations.GiveMeSituation();
    }
}
