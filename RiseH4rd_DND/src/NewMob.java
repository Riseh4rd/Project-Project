import java.util.ArrayList;
import java.util.Random;

public class NewMob {

    public static CharactersMobs GiveMeMob(){
        Random RND = new Random();
        int MobsNuber = RND.nextInt(1)+1;
        if (MobsNuber==1){CharactersMobs Mouse = Mouse();return Mouse;}
        else {return null;}
    }


    public static CharactersMobs CreateNewMob(String Type, String Team, String Name, ArrayList<String> Condition, ArrayList<String> Ability, int Agility, int Intellect, int Health, int Strength, int Moral, int Respect, int Rage, int Magic, boolean Alive, boolean CanSpeak) {

        return new CharactersMobs(Type, Team, Name, Condition, Ability, Agility, Intellect, Health, Strength, Moral, Respect, Rage, Magic, Alive, CanSpeak);

    }

    public static CharactersMobs Mouse () {
        ArrayList<String> Condition = new ArrayList<>();
        ArrayList<String> Ability = new ArrayList<>();
        Condition.add("Маленький");Ability.add("Живое");
        return CreateNewMob("Mouser",null,"Мышка",Condition,Ability,10,1,5,1,0,2,0,0,true,false);
    }
}
