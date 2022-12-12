import java.util.ArrayList;
import java.util.Random;

public class MobActions {

    public static void PickRandomMob(ArrayList<CharactersMobs> Mobs){
        Random RND = new Random();
        MobActionChoiser(Mobs.get(RND.nextInt(Mobs.size())));
    }
    public static void MobActionChoiser(CharactersMobs Mob){
        String Type=CharactersMobs.GetType(Mob);
        if (Type.equals(TCA.SmallAnimal)){SmlAMAL(Mob);}
    }//Метод выбирает случайного моба из списка сцены и дает ему действие
    public static void SmlAMAL(CharactersMobs Mob){
        Random RND = new Random();
      int ActionNum = RND.nextInt(1);
      if (ActionNum==0){Byte(Mob);}

    }

    public static void Byte(CharactersMobs Mob){
       int Strength=CharactersMobs.GetStrength(Mob);
       String Name=CharactersMobs.GetName(Mob);
        int ID=CharactersMobs.GetIdIndex(Mob);
       System.out.println(CLR.WHITE_BRIGHT+Name+"("+ID+")"+CLR.RED+" Кусает вас"+CLR.RESET+" нанося "+CLR.RED+Strength+" Урона!"+CLR.RESET);

    }
}
