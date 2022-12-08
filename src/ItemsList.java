import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;

public class ItemsList {

    public static String GiveMeMelee(){
        String[] AllMelees = new String[]{"Меч", "Топор", "Копье", "Сабля","Боевой Молот"};
        Random RND = new Random();
        return (AllMelees[RND.nextInt(AllMelees.length)]);}

    public static String GiveMeWand(){
       String[] AllStones = new String[]{"Изумрудом", "Рубином", "Алмазом", "Жемчужиной","Бриллиантом"};
        Random RND = new Random();
        String Stone = AllStones[RND.nextInt(AllStones.length)];
        return ("Посох с "+Stone);}


    public static void NewWand(){


    }
    public static int GetPhysicalDamage(String item){


        return 0;
    }
}
