import java.util.ArrayList;
import java.util.Scanner;

public class actions {

    public static void ActionDetector(CharactersMobs Mob){
        System.out.println("���� ��������?");
        Scanner in = new Scanner(System.in);
        String Input = in.nextLine();
        String[] Word = Input.split(" ");
        if (Word[0].equalsIgnoreCase("����")|Word[0].equalsIgnoreCase("�������")){
            if (Word[1].equalsIgnoreCase(CharactersMobs.GetName(Mob))){
                Punch(Mob);}
        }

    }

    public static void Punch(CharactersMobs Mob)
    {
        EnternalBuffer Buffer = new EnternalBuffer();
        boolean hit = false; int damage;
        String MobName = CharactersMobs.GetName(Mob);
        int MobMoral = CharactersMobs.GetMoral(Mob);
        int PlayerAgility = Buffer.PlayerAgility; int MobAgility = CharactersMobs.GetAgility(Mob);
        int PlayerStrength = Buffer.PlayerStrength; int MobStrength = CharactersMobs.GetStrength(Mob);
        int MobHealth = CharactersMobs.GetHealth(Mob);
        int MobRage = CharactersMobs.GetRage(Mob); int MobRespect = CharactersMobs.GetRespect(Mob);
        if (Buffer.Inventory.get(0) != null) {System.out.println("�� ������������� �� "+MobName+" ��������� "+Buffer.Inventory.get(0));}
        else {System.out.println("�� ������������� �� "+MobName+" �����");}

        if (MobMoral < 0) {System.out.println(MobName+" ��������! ��� �������������� "+MobName+" ��������� �� "+Math.abs(MobMoral)+" !!!");}

        if (PlayerAgility < MobAgility+MobMoral) {System.out.println(MobName+" ����� ������� ��������("+(MobAgility+MobMoral)+"), ��� ��("+PlayerAgility+")!\n" +
                "�� ������ ���� ������������, ������ "+((MobAgility+MobMoral)-(PlayerAgility))+" !");
            hit = utility.RollDice(((MobAgility+MobMoral)-(PlayerAgility)));
        if (hit){System.out.println("�� ������� ��������� �� "+MobName+"! "+MobName+" �������� "+PlayerStrength+"!!!�������� ���� ���� ������!!! �����!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        else {System.out.println("�� ������������!");}}
        else{ System.out.println("�� ������� ��������� �� "+MobName+"! "+MobName+" �������� "+PlayerStrength+"!!!�������� ���� ���� ������!!! �����!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
    }
}
