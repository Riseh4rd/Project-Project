import java.util.Random;
import java.util.Scanner;

public class utility {
    public static void ClearAll(){
       System.out.println(" \n ".repeat(100));
        }
    public static String character_New_Name(){
        String[] Slog = new String[]{"���","���","���","��","�","��","��","��","��","��","���","���","��","��","��","��","���",""," ","","","���","��","��","��","��","��"
                ,"��","��","��","����","��","���","��","��","��","��","��","�","�","�","�","�","�","�","�","��","��","��","��","��","���","���","���","���","���","��"
                ,"��","��","��","��","��","���","���","��","���","���","-","��","��","��","���","��","��","��","��","���","��","���"," ��������� "," ���� "," ������� "," ������ "," ��������� "
                ," ����"," ����"," ������ "," ������ ","-","-"};
        Random RND = new Random();
        String Name = Slog[RND.nextInt(Slog.length)]+Slog[RND.nextInt(Slog.length)]+Slog[RND.nextInt(Slog.length)];
        return Name;}
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
        return Name;}

    public static boolean RollDice(int Bounds){
        Scanner in = new Scanner(System.in);
        Random Rnd = new Random();
        int input, result;
        int TypeRoll=Rnd.nextInt(3);

        if (TypeRoll==0){System.out.println("������ �� �����! ����� - ������ ����� �� ������ "+Bounds+" !");
          while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}if (input>Bounds){System.out.println("�� ����� �����, ����������� ������� ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt((input/2))+Rnd.nextInt(Bounds));
          if (result>=Bounds){System.out.println("�����! �� ���������: "+result+" / "+Bounds);return true;}
          else {System.out.println("�������! �� ���������: "+result+" / "+Bounds);return false;}
        }
        else if (TypeRoll==1){ Bounds = Rnd.nextInt(7); System.out.println("������ �� �����! ����� - ������ ����� ������� "+Bounds+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}break;}
            result=((input/2)+Rnd.nextInt(Bounds));
            if (result%Bounds==0){System.out.println("�����! �� ���������: "+result+" , ������� "+Bounds);return true;}
            else {System.out.println("�������! �� ���������: "+result+" , �� ������� "+Bounds);return false;}
        }
        else {int Bounds2= Rnd.nextInt(7); System.out.println("������ �� �����! ����� - ������ ����� �� ������ "+Bounds+" , ��� ������� "+Bounds2+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("�� ����� �����, ������� �����.");continue;}if (input>Bounds){System.out.println("�� ����� �����, ����������� ������� ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt((input/2)+1)+Rnd.nextInt(Bounds/2)+1);
            if (result>=Bounds|result%Bounds2==0){System.out.println("�����! �� ���������: "+result+" / "+Bounds+" , ��� ������� "+Bounds2);return true;}
            else {System.out.println("�������! �� ���������: "+result+" / "+Bounds+" , � �� ������� "+Bounds2);return false;}
        }

        }
}

