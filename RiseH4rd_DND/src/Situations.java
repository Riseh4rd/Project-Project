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
           System.out.println("�� �������� �� ����������� ������� ������, ����� ���� ����������� ��������� ����� !!!Replace me!!! �� ���������, ��� �� ������� ��������� �������� "+Name+"\n"
           +"������� ���, "+Name+" ��������� �������� � ���");
        actions.ActionDetector(Person1);






        return new String[]{};


    }//�������� � �������� � �������� ���������
    }

