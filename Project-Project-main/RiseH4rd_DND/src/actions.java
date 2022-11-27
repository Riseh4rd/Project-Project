import java.util.ArrayList;

public class actions {

    public void Punch( String PlayerName, ArrayList<String> PlayerConditions,ArrayList<String> PlayerAbilities,String PlayerItem,
                       int PlayerAgility,int PlayerIntellect,int PlayerHealth,int PlayerStrength,int PlayerMagic,

                      String MobName, ArrayList<String> MobConditions,ArrayList<String> MobAbilities,String MobItem,
                      int MobAgility,int MobIntellect,int MobHealth,int MobStrength,int MobMoral,int MobRespect,int MobRage,int MobMagic,
                      boolean MobAlive, boolean MobCanSpeak)
    {
        boolean hit = false; int damage;
        if (PlayerItem != null) {System.out.println("вы замахиваетесь на "+MobName+" используя "+PlayerItem);}
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
