import java.util.ArrayList;
import java.util.Random;

public class NewMob {

    public static CharactersMobs GiveMeMob(){
        Random RND = new Random();
        int MobsNumber = RND.nextInt(2);
        if (MobsNumber==0){CharactersMobs Mouse = Mouse();return Mouse;}
        if (MobsNumber==1){CharactersMobs Man = Man();return Man;}
        else {return null;}
    }


    public static CharactersMobs CreateNewMob(String Type, String Team, String Name, ArrayList<String> Condition, ArrayList<String> Ability, int Agility, int Intellect, int Health, int Strength, int Moral, int Respect, int Rage, int Magic, boolean Alive, boolean CanSpeak) {
        CharactersMobs Mob = new CharactersMobs( );
        Mob.SetType(Type);Mob.SetTeam(Team);Mob.SetName(Name);
        Mob.SetCondition(Condition); Mob.SetAbility(Ability);
        Mob.SetAgility(Agility);Mob.SetIntellect(Intellect);
        Mob.SetHealth(Health);Mob.SetStrength(Strength);
        Mob.SetMoral(Moral);Mob.SetRespect(Respect);
        Mob.SetRage(Rage);Mob.SetMagic(Magic);
        Mob.SetAlive(Alive);Mob.SetCanSpeak(CanSpeak);
        return Mob;

    }

    public static CharactersMobs Mouse () {
        ArrayList<String> Condition = new ArrayList<>();
        ArrayList<String> Ability = new ArrayList<>();
        Condition.add("?????");Ability.add("?????????");
        return CreateNewMob("Mouse",null,"?????",Condition,Ability,10,1,5,1,0,2,0,0,true,false);
    }
    public static CharactersMobs Man () {
        ArrayList<String> Condition = new ArrayList<>();
        ArrayList<String> Ability = new ArrayList<>();
        Condition.add("?????");Ability.add("???????");
        return CreateNewMob("Man",null,"?????",Condition,Ability,4,5,50,6,5,6,0,0,true,true);
    }
}
