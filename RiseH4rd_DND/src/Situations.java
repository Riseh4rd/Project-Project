import java.util.Random;

public class Situations {

    public static void GiveMeSituation (){
        Random RND = new Random();
        int StoryNuber = RND.nextInt(1);
        if (StoryNuber==0){Situation0();}
    }

    public static void PlayerAction(String[] Actual){

    }
    public static String[] Situation0(){
        CharactersMobs Person1 = NewMob.GiveMeMob();
        assert Person1 != null;
        String Name = CharactersMobs.GetName(Person1);
           System.out.println("Вы выходите на центральную площадь города, перед вами открывается несколько путей !!!Replace me!!! вы замечаете, что на площади находится одинокий "+Name+"\n"
           +"Заметив вас, "+Name+" Осторожно подходит к вам");
        actions.ActionDetector(Person1);






        return new String[]{};


    }//Ситуация с площадью и одиноким существом
    }

