import java.util.Random;

public class BackStoryScenario {
    public static final String a2 = "\033[0m";  // Text Reset
    public static final String a1 = "\033[0;97m";  // WHITE
    public static void GiveMeStory(String Name){
        Random RND = new Random();
       int StoryNuber = RND.nextInt(1)+1;
       if (StoryNuber==1){BackStory1(Name);}
    }
    public static void BackStory1(String PlayerName){ // ������ ������� 1
        String[] Player = new String[]{"����","�������","�����","��������","����������","����","��������","�������","������","��������","�����","������","������","�����","������������","����",};
        String[] Years = new String[]{"�����","�����","�������","������","����","�����","������","���������", "���", "���� � ������", "��������� ������", "�����", "������", "������", "�����", "������", "�������", "�������", "�������", "����������� ����", "�����","������","�����"
                ,"������","�������","�����","�������","�����","�����","������","��������"};
Random RND = new Random();
        utility ImportUtility = new utility();
        String Antagonist = ImportUtility.character_New_Name();
        String Year = Years[RND.nextInt(Years.length)];
        String TheGoodGod = ImportUtility.character_New_Name();
        String Town = ImportUtility.Town_New_Name(Antagonist);
        String PlayerType =Player[RND.nextInt(Player.length)];
        System.out.println("���� ������� �� ����� "+a1+Antagonist+a2+" ���������� ������ ���� �� ������, ��������� ���� ����� ����. \n" +
                "� � ������� ���� ��������� ������������� �����, �������� ����� "+a1+TheGoodGod+a2+", � ��� "+a1+Year+a2+", ����� � ���� �������� �������� �����, \n" +
                "�������� ������� ������ ������ ����������� "+a1+PlayerType+a2+", �� ����� "+a1+PlayerName+a2+" ��� �� ������� ����� �������. �� �������� �� ��,\n" +
                "��� �� �� ������� ��������� ������� ��������� ������� � "+a1+Town+a2+", �� ���������� �������� ���� ����� ������,\n" +
                "��� ����� ������� ������ � ������ �� �����. ��� ������ �� ���������� ����� ��� ������� �� ������ ������� �����...");
    }


}
