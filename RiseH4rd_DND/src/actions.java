import java.util.ArrayList;

public class actions {

    public void Punch( String PlayerName, ArrayList<String> PlayerConditions,ArrayList<String> PlayerAbilities,String PlayerItem,
                       int PlayerAgility,int PlayerIntellect,int PlayerHealth,int PlayerStrength,int PlayerMagic,

                      String MobName, ArrayList<String> MobConditions,ArrayList<String> MobAbilities,String MobItem,
                      int MobAgility,int MobIntellect,int MobHealth,int MobStrength,int MobMoral,int MobRespect,int MobRage,int MobMagic,
                      boolean MobAlive, boolean MobCanSpeak)
    {
        boolean hit = false; int damage;
        if (PlayerItem != null) {System.out.println("�� ������������� �� "+MobName+" ��������� "+PlayerItem);}
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
