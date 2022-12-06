import java.util.ArrayList;
import java.util.Scanner;

public class actions {

    public static void ActionDetector(ArrayList<CharactersMobs> Mobs){
        System.out.println("Ваши действия?");
        Scanner in = new Scanner(System.in);
        String Input = in.nextLine();
        String[] Words = Input.split(" ");


        if (Words.length==1){ActionsType1(Words[0],Mobs);}
        else if (Words.length==2){ActionsType2(Words[0],Words[1],Mobs);}
        else if (Words.length==3){ActionsType3(Words[0],Words[1],Words[2],Mobs);}
        else {ActionsType4(Words[0],Words[1],Words[2],Words[3],Mobs);}

    }

    public static CharactersMobs ActionsType1(String Word1,ArrayList<CharactersMobs> Mobs) {
        return null;
    }
    public static CharactersMobs ActionsType2(String Word1,String Word2,ArrayList<CharactersMobs> Mobs) {

        Word2 = Word2.replace("_"," ");
        boolean Found = utility.FindByName(Word2,Mobs);
        CharactersMobs Mob = CharactersMobs.PersonA;
        if (Found){
        if (Word1.equalsIgnoreCase("бить")){Mob=Punch(Mob);}

        }
        return Mob;
    }
    public static CharactersMobs ActionsType3(String Word1,String Word2,String Word3,ArrayList<CharactersMobs> Mobs) {
        return null;
    }
    public static CharactersMobs ActionsType4(String Word1,String Word2,String Word3,String Word4,ArrayList<CharactersMobs> Mobs) {
        return null;
    }

    public static CharactersMobs Punch(CharactersMobs Mob) {

        if (!CharactersMobs.GetAlive(Mob)){System.out.println(CharactersMobs.GetName(Mob)+" Уже Мертв!");}
        else {
        boolean hit = false; int damage;
        String MobName = CharactersMobs.GetName(Mob);
        int MobMoral = CharactersMobs.GetMoral(Mob);
        int PlayerAgility = EnternalBuffer.PlayerAgility; int MobAgility = CharactersMobs.GetAgility(Mob);
        int PlayerStrength = EnternalBuffer.PlayerStrength; int MobStrength = CharactersMobs.GetStrength(Mob);
        int MobHealth = CharactersMobs.GetHealth(Mob);
        int MobRage = CharactersMobs.GetRage(Mob); int MobRespect = CharactersMobs.GetRespect(Mob);
        if (EnternalBuffer.getPlayerWeapon() != null) {System.out.println("вы замахиваетесь на "+MobName+" используя "+EnternalBuffer.getPlayerWeapon());}
        else {System.out.println("вы замахиваетесь на "+MobName+" Рукой");}

        if (MobMoral < 0) {System.out.println(MobName+" растерян! Все характиристики "+MobName+" Снижаются на "+Math.abs(MobMoral)+" !!!");}

        if (PlayerAgility < MobAgility+MobMoral) {System.out.println(MobName+" имеет большую ловкость("+(MobAgility+MobMoral)+"), чем вы("+PlayerAgility+")!\n" +
                "вы имеете шанс промахнуться, равный "+((MobAgility+MobMoral)-(PlayerAgility))+" !");
            hit = utility.RollDice(((MobAgility+MobMoral)-(PlayerAgility)));
        if (hit){System.out.println("Вы успешно поподаете по "+MobName+"! "+MobName+" Получает "+PlayerStrength+"!!!Вставить сюда урон оружия!!! урона!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        else {System.out.println("Вы промахнулись!");}}
        else{ System.out.println("Вы успешно поподаете по "+MobName+"! "+MobName+" Получает "+PlayerStrength+"!!!Вставить сюда урон оружия!!! урона!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        System.out.println("Теперь у "+MobName+" осталось "+MobHealth+" Здоровья");CharactersMobs.SetHealth(MobHealth,Mob);utility.CheckDeath(Mob);
        if (MobHealth<=0){ System.out.println(MobName+" Погибает! ");}
        }
        return Mob;
    }



}
