import java.util.ArrayList;
import java.util.Random;

public class Situations {
    public static final String a2 = "\033[0m";  // Text Reset
    public static final String a1 = "\033[0;97m";  // WHITE

    public static void GiveMeSituation (){
        Random RND = new Random();
        int StoryNuber = RND.nextInt(1);
        if (StoryNuber==0){Situation0();}
    }
    public static void Situation0(){
        boolean MobTurn,Ended=false;
        String Mob1,Mob2;
        ArrayList<CharactersMobs> Persons = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Persons.add(NewMob.GiveMeMob());
            }
        CharactersMobs.OccupyIndex(Persons.get(0));CharactersMobs.OccupyIndex(Persons.get(1));
        Mob1 =(a1+CharactersMobs.GetName(Persons.get(0))+"("+CharactersMobs.GetIdIndex(Persons.get(0))+")"+a2);
        Mob2 =(a1+CharactersMobs.GetName(Persons.get(1))+"("+CharactersMobs.GetIdIndex(Persons.get(1))+")"+a2);

                System.out.println("Вы выходите на центральную площадь города, перед вами открывается несколько путей: !!!Replace me!!! вы замечаете, что на площади находится одинокий "+Mob1+" и "+Mob2+"\n");



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

