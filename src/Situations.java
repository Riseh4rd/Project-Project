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
        String Mob1,Mob2;
        ArrayList<CharactersMobs> Persons = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Persons.add(NewMob.GiveMeMob());
            }
        CharactersMobs.OccupyIndex(Persons.get(0));CharactersMobs.OccupyIndex(Persons.get(1));
        Mob1 =(CLR.WHITE_BRIGHT+CharactersMobs.GetName(Persons.get(0))+"("+CharactersMobs.GetIdIndex(Persons.get(0))+")"+CLR.RESET);
        Mob2 =(CLR.WHITE_BRIGHT+CharactersMobs.GetName(Persons.get(1))+"("+CharactersMobs.GetIdIndex(Persons.get(1))+")"+CLR.RESET);

                System.out.println("Вы выходите на центральную площадь города, перед вами открывается несколько путей: !!!Replace me!!! вы замечаете, что на площади находится одинокий "+Mob1+" и "+Mob2+"\n");



            MobTurn=utility.FirstTurner(Persons);
        while (!Ended){
            if (!MobTurn){
                actions.ActionDetector(Persons);
                MobTurn=true;
            }
            else {MobActions.PickRandomMob(Persons);MobTurn=false;}
        }
    }//Ситуация с площадью и двумя существами
    }

