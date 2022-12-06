import java.util.ArrayList;
import java.util.Random;

public class Situations {

    public static void GiveMeSituation (){
        Random RND = new Random();
        int StoryNuber = RND.nextInt(1);
        if (StoryNuber==0){Situation0();}
    }
    public static void Situation0(){
        boolean MobTurn,Ended=false;
        ArrayList<CharactersMobs> Persons = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            assert false;
            Persons.add(NewMob.GiveMeMob());
            CharactersMobs.SetName(CharactersMobs.GetName(Persons.get(i))+" "+utility.character_New_Name(),Persons.get(i));
            }

           System.out.println("Вы выходите на центральную площадь города, перед вами открывается несколько путей: !!!Replace me!!! вы замечаете, что на площади находится одинокий "+CharactersMobs.GetName(Persons.get(0))+" и "+CharactersMobs.GetName(Persons.get(1))+"\n");



            MobTurn=utility.FirstTurner(Persons);
        while (!Ended){
            if (!MobTurn){
                actions.ActionDetector(Persons);
                MobTurn=true;
            }
            else {MobActions.MobActionChoiser(Persons);MobTurn=false;}
        }
    }//Ситуация с площадью и двумя существами
    }

