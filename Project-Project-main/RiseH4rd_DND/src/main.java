import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class main {
    private static String PlayerName;
    private String PlayerTeam;
    private ArrayList<String> PlayerConditions,PlayerAbilities;
    private int PlayerAgility,PlayerIntellect,PlayerHealth,PlayerStrength,PlayerLuck,PlayerMagic;
    private  boolean PlayerAlive,PlayerCanSpeak;
    public static void main(String[] args) {
        System.out.println("".repeat(3));
        System.out.print("������������, �����!");
        while (true) {
            System.out.print(" ���������� ������� ��� ������ ���������: ");
            Scanner in = new Scanner(System.in);
            PlayerName = in.nextLine();
            System.out.println("���� ��� - " + PlayerName + ", ����������? <��>/<���>\n");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("��")){ System.out.println("�������, ��������...");System.out.println(" ".repeat(3));
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}break;}
            else if (input.equalsIgnoreCase("���")){continue;}
            else {System.err.println("������ �����, ������������� ��� <���> ");continue;}
        }
        utility.ClearAll();
        BackStoryScenario.GiveMeStory(PlayerName);
       System.out.println(); Situations.GiveMeSituation();
    }
}
