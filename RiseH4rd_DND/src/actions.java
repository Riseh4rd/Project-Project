import java.util.ArrayList;
import java.util.Scanner;

public class actions {

    public static void ActionDetector(CharactersMobs Mob){
        System.out.println("Ваши действия?");
        Scanner in = new Scanner(System.in);
        String Input = in.nextLine();
        String[] Word = Input.split(" ");
        if (Word[0].equalsIgnoreCase("Бить")|Word[0].equalsIgnoreCase("Ударить")){
            if (Word[1].equalsIgnoreCase(CharactersMobs.GetName(Mob))){
                Punch(Mob);}
        }

    }

    public static void Punch(CharactersMobs Mob)
    {
        EnternalBuffer Buffer = new EnternalBuffer();
        boolean hit = false; int damage;
        String MobName = CharactersMobs.GetName(Mob);
        int MobMoral = CharactersMobs.GetMoral(Mob);
        int PlayerAgility = Buffer.PlayerAgility; int MobAgility = CharactersMobs.GetAgility(Mob);
        int PlayerStrength = Buffer.PlayerStrength; int MobStrength = CharactersMobs.GetStrength(Mob);
        int MobHealth = CharactersMobs.GetHealth(Mob);
        int MobRage = CharactersMobs.GetRage(Mob); int MobRespect = CharactersMobs.GetRespect(Mob);
        if (Buffer.Inventory.get(0) != null) {System.out.println("вы замахиваетесь на "+MobName+" используя "+Buffer.Inventory.get(0));}
        else {System.out.println("вы замахиваетесь на "+MobName+" Рукой");}

        if (MobMoral < 0) {System.out.println(MobName+" растерян! Все характиристики "+MobName+" Снижаются на "+Math.abs(MobMoral)+" !!!");}

        if (PlayerAgility < MobAgility+MobMoral) {System.out.println(MobName+" имеет большую ловкость("+(MobAgility+MobMoral)+"), чем вы("+PlayerAgility+")!\n" +
                "вы имеете шанс промахнуться, равный "+((MobAgility+MobMoral)-(PlayerAgility))+" !");
            hit = utility.RollDice(((MobAgility+MobMoral)-(PlayerAgility)));
        if (hit){System.out.println("Вы успешно поподаете по "+MobName+"! "+MobName+" Получает "+PlayerStrength+"!!!Вставить сюда урон оружия!!! урона!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        else {System.out.println("Вы промахнулись!");}}
        else{ System.out.println("Вы успешно поподаете по "+MobName+"! "+MobName+" Получает "+PlayerStrength+"!!!Вставить сюда урон оружия!!! урона!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
    }
}
