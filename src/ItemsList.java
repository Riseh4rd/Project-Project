import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;

public class ItemsList {

    public static String GiveMeMelee(){
        String[] AllMelees = new String[]{"���", "�����", "�����", "�����","������ �����"};
        Random RND = new Random();
        return (AllMelees[RND.nextInt(AllMelees.length)]);}

    public static String GiveMeWand(){
       String[] AllStones = new String[]{"���������", "�������", "�������", "����������","�����������"};
        Random RND = new Random();
        String Stone = AllStones[RND.nextInt(AllStones.length)];
        return ("����� � "+Stone);}


    public static void NewWand(){


    }
    public static int GetPhysicalDamage(String item){


        return 0;
    }
}
