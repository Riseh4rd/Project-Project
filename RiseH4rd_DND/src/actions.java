import java.util.ArrayList;
import java.util.Scanner;

public class actions {

    public static void ActionDetector(ArrayList<CharactersMobs> Mobs){
        System.out.println("���� ��������?");
        Scanner in = new Scanner(System.in);
        String Input = in.nextLine();
        String[] Words = Input.split(" ");


        if (Words.length==1){ActionsType1(Words[0],Mobs);}
        else if (Words.length==2){ActionsType2(Words[0],Words[1],Mobs);}
        else if (Words.length==3){ActionsType3(Words[0],Words[1],Words[2],Mobs);}
        else {ActionsType4(Words[0],Words[1],Words[2],Words[3],Mobs);}

    }

    public static CharactersMobs ActionsType1(String Word1,ArrayList<CharactersMobs> Mobs) {
        return null;
    }
    public static CharactersMobs ActionsType2(String Word1,String Word2,ArrayList<CharactersMobs> Mobs) {

        Word2 = Word2.replace("_"," ");
        boolean Found = utility.FindByName(Word2,Mobs);
        CharactersMobs Mob = CharactersMobs.PersonA;
        if (Found){
        if (Word1.equalsIgnoreCase("����")){Mob=Punch(Mob);}

        }
        return Mob;
    }
    public static CharactersMobs ActionsType3(String Word1,String Word2,String Word3,ArrayList<CharactersMobs> Mobs) {
        return null;
    }
    public static CharactersMobs ActionsType4(String Word1,String Word2,String Word3,String Word4,ArrayList<CharactersMobs> Mobs) {
        return null;
    }

    public static CharactersMobs Punch(CharactersMobs Mob) {

        if (!CharactersMobs.GetAlive(Mob)){System.out.println(CharactersMobs.GetName(Mob)+" ��� �����!");}
        else {
        boolean hit = false; int damage;
        String MobName = CharactersMobs.GetName(Mob);
        int MobMoral = CharactersMobs.GetMoral(Mob);
        int PlayerAgility = EnternalBuffer.PlayerAgility; int MobAgility = CharactersMobs.GetAgility(Mob);
        int PlayerStrength = EnternalBuffer.PlayerStrength; int MobStrength = CharactersMobs.GetStrength(Mob);
        int MobHealth = CharactersMobs.GetHealth(Mob);
        int MobRage = CharactersMobs.GetRage(Mob); int MobRespect = CharactersMobs.GetRespect(Mob);
        if (EnternalBuffer.getPlayerWeapon() != null) {System.out.println("�� ������������� �� "+MobName+" ��������� "+EnternalBuffer.getPlayerWeapon());}
        else {System.out.println("�� ������������� �� "+MobName+" �����");}

        if (MobMoral < 0) {System.out.println(MobName+" ��������! ��� �������������� "+MobName+" ��������� �� "+Math.abs(MobMoral)+" !!!");}

        if (PlayerAgility < MobAgility+MobMoral) {System.out.println(MobName+" ����� ������� ��������("+(MobAgility+MobMoral)+"), ��� ��("+PlayerAgility+")!\n" +
                "�� ������ ���� ������������, ������ "+((MobAgility+MobMoral)-(PlayerAgility))+" !");
            hit = utility.RollDice(((MobAgility+MobMoral)-(PlayerAgility)));
        if (hit){System.out.println("�� ������� ��������� �� "+MobName+"! "+MobName+" �������� "+PlayerStrength+"!!!�������� ���� ���� ������!!! �����!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        else {System.out.println("�� ������������!");}}
        else{ System.out.println("�� ������� ��������� �� "+MobName+"! "+MobName+" �������� "+PlayerStrength+"!!!�������� ���� ���� ������!!! �����!");MobHealth=MobHealth-(PlayerStrength);MobMoral--;MobRespect--;MobRage++;}
        System.out.println("������ � "+MobName+" �������� "+MobHealth+" ��������");CharactersMobs.SetHealth(MobHealth,Mob);utility.CheckDeath(Mob);
        if (MobHealth<=0){ System.out.println(MobName+" ��������! ");}
        }
        return Mob;
    }



}
