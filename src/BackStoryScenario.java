import java.util.ArrayList;
import java.util.Random;

public class BackStoryScenario {
    public static final String a2 = "\033[0m";  // Text Reset
    public static final String a1 = "\033[0;97m";  // WHITE

    public static String PlayersStartingConfiguration (){
        String[] StartClass = new String[]{"Маг","Воин"};
        Random RND = new Random();
        String Class = StartClass[RND.nextInt(StartClass.length)];
        ArrayList<String> Inventory = new ArrayList<>(){};
        if (Class.equals("Маг"))    {EnternalBuffer.SetInventory(Inventory); EnternalBuffer.SetPlayerWeapon(ItemsList.GiveMeWand());    }
        if (Class.equals("Воин"))   {EnternalBuffer.SetInventory(Inventory); EnternalBuffer.SetPlayerWeapon(ItemsList.GiveMeMelee());    }

        return Class;
    }

    public static void GiveMeStory(String Name){
        Random RND = new Random();
       int StoryNumber = RND.nextInt(1)+1;
       if (StoryNumber==1){BackStory1(Name);}
    }
    public static void BackStory1(String PlayerName){
        EnternalBuffer.SetPlayerName(PlayerName);

        String Year = "хуё-моё ПОМЕНЯТЬ ЭТО!";
        String PlayerClass=PlayersStartingConfiguration();
        utility ImportUtility = new utility();
        String Antagonist = ImportUtility.character_New_Name();
        String TheGoodGod = ImportUtility.character_New_Name();
        String Town = ImportUtility.Town_New_Name(Antagonist);
        System.out.println("Злой чародей по имени "+a1+Antagonist+a2+" захватывал города один за другим, возрождая свою армию тьмы. \n" +
                "И в десятом году правления божественного вождя, которого звали "+a1+TheGoodGod+a2+", в год "+a1+Year+a2+", \n" +
                "Вы,  "+a1+PlayerClass+a2+", по имени "+a1+PlayerName+a2+", были отправлены небесным владыкой, что бы одолеть злого колдуна. Но несмотря на то,\n" +
                "что вы по приказу небесного владыки захватили столицу — "+a1+Town+a2+", Вы умудрились потерять всех своих солдат,\n" +
                "вам чудом удалось выжить в борьбе за город. Вам ничего не оставалось кроме как бродить по руинам великой битвы...");
    }// Легион Колдуна 1


}
