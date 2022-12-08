import java.util.ArrayList;
import java.util.Random;

public class BackStoryScenario {
    public static final String a2 = "\033[0m";  // Text Reset
    public static final String a1 = "\033[0;97m";  // WHITE

    public static String PlayersStartingConfiguration (){
        String[] StartClass = new String[]{"���","����"};
        Random RND = new Random();
        String Class = StartClass[RND.nextInt(StartClass.length)];
        ArrayList<String> Inventory = new ArrayList<>(){};
        if (Class.equals("���"))    {EnternalBuffer.SetInventory(Inventory); EnternalBuffer.SetPlayerWeapon(ItemsList.GiveMeWand());    }
        if (Class.equals("����"))   {EnternalBuffer.SetInventory(Inventory); EnternalBuffer.SetPlayerWeapon(ItemsList.GiveMeMelee());    }

        return Class;
    }

    public static void GiveMeStory(String Name){
        Random RND = new Random();
       int StoryNumber = RND.nextInt(1)+1;
       if (StoryNumber==1){BackStory1(Name);}
    }
    public static void BackStory1(String PlayerName){
        EnternalBuffer.SetPlayerName(PlayerName);

        String Year = "��-�� �������� ���!";
        String PlayerClass=PlayersStartingConfiguration();
        utility ImportUtility = new utility();
        String Antagonist = ImportUtility.character_New_Name();
        String TheGoodGod = ImportUtility.character_New_Name();
        String Town = ImportUtility.Town_New_Name(Antagonist);
        System.out.println("���� ������� �� ����� "+a1+Antagonist+a2+" ���������� ������ ���� �� ������, ��������� ���� ����� ����. \n" +
                "� � ������� ���� ��������� ������������� �����, �������� ����� "+a1+TheGoodGod+a2+", � ��� "+a1+Year+a2+", \n" +
                "��,  "+a1+PlayerClass+a2+", �� ����� "+a1+PlayerName+a2+", ���� ���������� �������� ��������, ��� �� ������� ����� �������. �� �������� �� ��,\n" +
                "��� �� �� ������� ��������� ������� ��������� ������� � "+a1+Town+a2+", �� ���������� �������� ���� ����� ������,\n" +
                "��� ����� ������� ������ � ������ �� �����. ��� ������ �� ���������� ����� ��� ������� �� ������ ������� �����...");
    }// ������ ������� 1


}
