import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class utility {

    public static void Hello(){
        System.out.println("\t\t\t---��� ��������� ������� � ��������--- ");
        System.out.println("""
                ***�������������� � ������ ����������:\s
                \t1(����-������� [������ ������ �������])
                \t2 ��� ���-������""");
        System.out.println("""
                ***�������������� � �������Ш�:\s
                \t1(������� [������� � ���������])
                \t2(�������� [������� � ���������])
                \t3(������� [������� � ���������])
                \t4(������� [������� � ���������])""");

    }//����� ������ ������� � ������� ��������� ��� ������������.
    public static void ClearAll(){
       System.out.println(" \n ".repeat(30));
        }//������� ������� �����
    public static String character_New_Name(){
        String Slog1=null,Slog2=null,Slog3=null;
        String[] NormalSecond = new String[]{"�������","�����","׸����","������","���������","�������","�������","��������","�����","�������","������","�������",
        "������","���","�������","��������","�������","�����","������","������","�������","������","��������","�����","�������","������"};
        String[] NormalName = new String[]{"����","�������","��������","������","����","���","�����","���������","���������","������","�����","�������","����","������",
                "����","������","������","����","�����","����","�����","�����","�����","������","������","��������","�������","�������","����������","��������","����",
                "�������","����","�����","������","�����","�����","���������","�������","������","����","����","������","�����","��������","���������","��������",
                "������","������","������","������","������","������","�������","������","�������","�������","������","������","�������","������","�����","�������",
                "������","����","���","������","�����","�����","�����������"};
        String[] Beliberda = new String[]{"���","���","���","��","�","��","��","��","��","��","���","���","��","��","��","��","���","���","��","��","��","��","��"
                ,"��","��","��","����","��","���","��","��","��","��","��","�","�","�","�","�","�","�","�","��","��","��","��","��","���","���","���","���","���","��"
                ,"��","��","��","��","��","���","���","��","���","���","��","��","��","���","��","��","��","��","���","��","���"};
        Random RND = new Random();

        int typer = RND.nextInt(5);
        int type = RND.nextInt(3);
        if (typer>=0){
          type = RND.nextInt(4);
        if (type==0){Slog1=Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)];}
        if (type==1){Slog1=NormalName[RND.nextInt(NormalName.length)];}
        if (type==2){Slog1=NormalSecond[RND.nextInt(NormalSecond.length)];}
        if (type==3){Slog1=Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)];}}

        if (typer>=2){
         type = RND.nextInt(2);
        if (type==0){Slog2=" "+Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)];}
        if (type==1){Slog2=" "+NormalName[RND.nextInt(NormalName.length)];}}else {Slog2="";}

        if (typer==4){
         type = RND.nextInt(2);
        if (type==0){Slog3=" "+Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)]+Beliberda[RND.nextInt(Beliberda.length)];}
        if (type==1){Slog3=" "+NormalSecond[RND.nextInt(NormalSecond.length)];}}else {Slog3="";}

        String Name = Slog1+Slog2+Slog3;
        return Name;}//����� ��� �������� ��������� ���� ����������, ��� ������������ �������� �� ����������� ��������
    public static String Town_New_Name(String NameToBuild){
        String[] Slog1 = new String[]{"����","����","����","����","����","���","���","���","���","����","���","����","����","����","����","����","����","����","����","����","��-","��-","���-","�����",
                "����","����","���-","����-","����� ","�����-","�������","�������� ","��������� ","������� ","����","����","������� ","����� ","����", "������","����������� ","������� ","����",
                "������ ","������ ","��������� ","������� ","������� ", "��������� ","������", "������ ","�������� ", "�������� ","����� ","��������� ","�������� ","����","���","���","����","���","����",};
        String[] Slog2 = new String[]{NameToBuild,NameToBuild,NameToBuild,"���","���","��","-����","-����","��","-����","���","����","���","���","��","���","���","����","�������","���","���","-����","�����","��","�����","����"
                ,"���","�����","������","����","�����","������","�����","�����","���","���","����","�����","�����","���","����","����","���","�����","���-"};
        String[] Slog3 = new String[]{"�����","������","����","�����","������","�����","�����","���","���","����","�����","�����","���","����","����","���","�����","���"," �����-����"," �������","����","����","����","����"
                ,"������","������","����","����","���","������","�����"," ��������","������","����"," ������"," �������"," ����� "+NameToBuild," ���������"," �������"," �����"," ������"," ����� "+NameToBuild," ����� "+NameToBuild," ����� "+NameToBuild};
        Random RND = new Random();
        String Name = Slog1[RND.nextInt(Slog1.length)]+Slog2[RND.nextInt(Slog2.length)]+Slog3[RND.nextInt(Slog3.length)];
        return Name;}//����� ��� �������� ��������� �������� �������, ������������ �������� �� ����������� ��������

    public static boolean RollDice(int Bounds){
        Scanner in = new Scanner(System.in);
        Random Rnd = new Random();
        int input, result;
        int TypeRoll=Rnd.nextInt(3);

        if (TypeRoll==0){System.out.println("������ �� �����! ����� - ������ ����� �� ������ "+Bounds+" !");
          while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}if (input>Bounds){System.out.println("�� ����� �����, ����������� ������� ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt(Math.abs(input/2))+Rnd.nextInt(Math.abs(Bounds)))+1;
          if (result>=Bounds){System.out.println("�����! �� ���������: "+result+" / "+Bounds);return true;}
          else {System.out.println("�������! �� ���������: "+result+" / "+Bounds);return false;}
        }
        else if (TypeRoll==1){ Bounds = Rnd.nextInt(5)+2; System.out.println("������ �� �����! ����� - ������ ����� ������� "+Bounds+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}break;}
            result=((input/2)+Rnd.nextInt(Bounds))+1;
            if (result%Bounds==0){System.out.println("�����! �� ���������: "+result+" , ������� "+Bounds);return true;}
            else {System.out.println("�������! �� ���������: "+result+" , �� ������� "+Bounds);return false;}
        }
        else {int Bounds2= Rnd.nextInt(5)+2; System.out.println("������ �� �����! ����� - ������ ����� �� ������ "+Bounds+" , ��� ������� "+Bounds2+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}if (input>Bounds){System.out.println("�� ����� �����, ����������� ������� ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt((input/2)+1)+Rnd.nextInt(Bounds/2)+1)+1;
            if (result>=Bounds|result%Bounds2==0){System.out.println("�����! �� ���������: "+result+" / "+Bounds+" , ��� ������� "+Bounds2);return true;}
            else {System.out.println("�������! �� ���������: "+result+" / "+Bounds+" , � �� ������� "+Bounds2);return false;}
        }

        }//����� ����������� �������� ��������� ������

    public static boolean FirstTurner(ArrayList<CharactersMobs> Mobs){
        int PlayerAgility = 0,MobAgility=0;
        CharactersMobs Mob = null;
        for (int i = 0; i <Mobs.size() ; i++) {
            if (CharactersMobs.GetAgility(Mobs.get(i))>=MobAgility){
                MobAgility=CharactersMobs.GetAgility(Mobs.get(i));
                Mob = Mobs.get(i);
            }

        }

      if (PlayerAgility>=MobAgility){actions.ActionDetector(Mobs);return true;}
      else {MobActions.MobActionChoiser(Mobs);return false;}
    }//���������� �� ��� ����� ������ ��� ��� �������

    public static void CheckDeath(CharactersMobs Mob){

       if (CharactersMobs.GetHealth(Mob) <= 0){
           CharactersMobs.SetAlive(false,Mob);CharactersMobs.ReleaseIndex(Mob);
       }
    }//�������� �������� �� ���������������� � ���������� ��������

    public static boolean FindByName(String InputName,ArrayList<CharactersMobs> Mobs){
        boolean Found = false;
        for (CharactersMobs mob : Mobs) {
            if (InputName.equalsIgnoreCase(CharactersMobs.GetName(mob))) {CharactersMobs.PersonA = mob;Found=true;break;}
        }
        if (!Found) System.out.println(InputName + " ��� ���");
        return Found;
    }//��������?

}

