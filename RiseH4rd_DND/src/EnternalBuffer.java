/*���� ������������ ���� ����� ��� ��������� ��������� ������ �����, ��� ���������� � ����,
 ���������� ��������� � ��� ����� ����� �� ������� ���������� ����� ������� ��������,
 � ����� ���������� ��� ��, ���� ����� ���-�� ������������. ������ ��� ����� �� ������ ��,
 � ������ �� ��� � �������, ��� ���� ��������, ��������� ������������ � �������. */

import java.util.ArrayList;

public class EnternalBuffer {

    public static String PlayerName;
    public static String PlayerTeam="���� �������";
    public static ArrayList<String> PlayerConditions;
    public static ArrayList<String> PlayerAbilities;
    public static ArrayList<String> Inventory; public static String PlayerWeapon,PlayerSecond,PlayerAccessory,PlayerArmor;
    public static int PlayerAgility =8 ,PlayerIntellect =8,PlayerHealth=20,PlayerStrength=8,PlayerMagic=0,PlayerCharisma=5,PlayerFullLevel=0,PlayerLevel= 0;
    public static  boolean PlayerCanSpeak = true;

    // ����� ���� ������� � ������� ��� ����� ������ ���������.

    // ������� ������                                                              // ������� ��������
    public static String getPlayerName(){return PlayerName;}                    public static void SetPlayerName(String Replace){PlayerName = Replace;}//���ܨ�� ���� �ר�� ���������������������
    public String getPlayerTeam(){return PlayerTeam;}                           public static void SetPlayerTeam(String Replace){PlayerTeam = Replace;}

    public  ArrayList<String> getPlayerConditions(){return PlayerConditions;}   public void SetPlayerConditions( ArrayList<String> Replace){PlayerConditions = Replace;}
    public  ArrayList<String> getPlayerAbilities(){return PlayerAbilities;}     public void SetPlayerAbilities( ArrayList<String> Replace){PlayerAbilities = Replace;}
    public  ArrayList<String> getInventory(){return Inventory;}                 public static void SetInventory(ArrayList<String> Replace){Inventory = Replace;}

    public static String getPlayerWeapon(){return PlayerWeapon;}                 public static void SetPlayerWeapon(String Replace){PlayerWeapon = Replace;}
    public  String getPlayerSecond(){return PlayerSecond;}                 public static void SetPlayerSecond(String Replace){PlayerSecond = Replace;}
    public  String getPlayerAccessory(){return PlayerAccessory;}           public static void SetPlayerAccessory(String Replace){PlayerAccessory = Replace;}
    public  String getPlayerArmor(){return PlayerArmor;}                   public static void SetPlayerArmor(String Replace){PlayerArmor = Replace;}

    public static int getPlayerAgility(){return PlayerAgility;}                        public void SetPlayerAgility(int Replace){PlayerAgility = Replace;}
    public int getPlayerIntellect(){return PlayerIntellect;}                    public void SetPlayerIntellect(int Replace){PlayerIntellect = Replace;}
    public int getPlayerHealth(){return PlayerHealth;}                          public void SetPlayerHealth(int Replace){PlayerHealth = Replace;}
    public int getPlayerMagic(){return PlayerMagic;}                            public void SetPlayerMagic(int Replace){PlayerMagic = Replace;}
    public int getPlayerStrength(){return PlayerStrength;}                      public void SetPlayerStrength(int Replace){PlayerStrength = Replace;}
    public int getPlayerLevel(){return PlayerLevel;}                            public void SetPlayerLevel(int Replace){PlayerLevel = Replace;}
    public int getPlayerCharisma(){return PlayerCharisma;}                      public void SetPlayerCharisma(int Replace){PlayerCharisma = Replace;}
    public int getPlayerFullLevel(){return PlayerFullLevel;}                    public void SetPlayerFullLevel(int Replace){PlayerFullLevel = Replace;}

    public boolean getPlayerCanSpeak(){return PlayerCanSpeak;}                  public void SetPlayerCanSpeak(boolean Replace){PlayerCanSpeak = Replace;}// �� ������ ����� ���!

    // ����� ���� ������, ������� �� ���� ����� ���� �� � �� ���...

    public static void LookPlayer(){

    System.out.println("\n���: ["+PlayerName+"]");
    System.out.println("�������: ["+PlayerTeam+"]");
    System.out.println("����������� �������: ["+PlayerConditions+"]");
    System.out.println("����������� �����������: ["+PlayerAbilities+"]");

    System.out.println("\n����:["+PlayerStrength+"]   ��������:["+PlayerAgility+"]   ���������:["+PlayerIntellect+"]  �����:["+PlayerMagic+"]  �������:["+PlayerCharisma+"]");
    System.out.println("��������:["+PlayerHealth+"]   �������:["+PlayerLevel+" , "+(PlayerFullLevel%100)+"/100] ");

    System.out.print("\n������������� ������: ["+PlayerWeapon+"] ");
    System.out.println("������������� ���������: ["+PlayerSecond+"]  ");
    System.out.print("������������� ���������: ["+PlayerAccessory+"]  ");
    System.out.println("������������� �������: ["+PlayerArmor+"]  ");
    System.out.print("��������� "+Inventory.size()+"/"+PlayerStrength+" : ["+Inventory+"]");
    System.out.println("\n".repeat(2));
    }//����� ������������ ��� ���������(���� �� �����) � ������ � ������� ���� ���������� �� ������.

}
