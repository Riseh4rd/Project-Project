/*���� ������������ ���� ����� ��� ��������� ��������� ������ �����, ��� ���������� � ����,
 ���������� ��������� � ��� ����� ����� �� ������� ���������� ����� ������� ��������,
 � ����� ���������� ��� ��, ���� ����� ���-�� ������������. ������ ��� ����� �� ������ ��,
 � ������ �� ��� � �������, ��� ���� ��������, ��������� ������������ � �������. */

import java.util.ArrayList;

public class EnternalBuffer {

    public static String PlayerName;
    public static String PlayerTeam;
    public static ArrayList<String> PlayerConditions;
    public static ArrayList<String> PlayerAbilities;
    public static ArrayList<String> Inventory;
    public static int PlayerAgility =10 ,PlayerIntellect =10,PlayerHealth=20,PlayerStrength=10,PlayerMagic=0,PlayerLevel=0,PlayerCharisma=10;
    public static  boolean PlayerCanSpeak = true;

    // ����� ���� ������� � ������� ��� ����� ������ ���������.

    // ������� ������                                                              // ������� ��������
    public static String getPlayerName(){return PlayerName;}                    public static void SetPlayerName(String Replace){PlayerName = Replace;}//���ܨ�� ���� �ר�� ���������������������
    public String getPlayerTeam(){return PlayerTeam;}                           public static void SetPlayerTeam(String Replace){PlayerTeam = Replace;}

    public  ArrayList<String> getPlayerConditions(){return PlayerConditions;}   public void SetPlayerConditions( ArrayList<String> Replace){PlayerConditions = Replace;}
    public  ArrayList<String> getPlayerAbilities(){return PlayerAbilities;}     public void SetPlayerAbilities( ArrayList<String> Replace){PlayerAbilities = Replace;}
    public  ArrayList<String> getInventory(){return Inventory;}                 public static void SetInventory(ArrayList<String> Replace){Inventory = Replace;}

    public int getPlayerAgility(){return PlayerAgility;}                        public void SetPlayerAgility(int Replace){PlayerAgility = Replace;}
    public int getPlayerIntellect(){return PlayerIntellect;}                    public void SetPlayerIntellect(int Replace){PlayerIntellect = Replace;}
    public int getPlayerHealth(){return PlayerHealth;}                          public void SetPlayerHealth(int Replace){PlayerHealth = Replace;}
    public int getPlayerMagic(){return PlayerMagic;}                            public void SetPlayerMagic(int Replace){PlayerMagic = Replace;}
    public int getPlayerStrength(){return PlayerStrength;}                      public void SetPlayerStrength(int Replace){PlayerStrength = Replace;}
    public int getPlayerLevel(){return PlayerLevel;}                            public void SetPlayerLevel(int Replace){PlayerLevel = Replace;}
    public int getPlayerCharisma(){return PlayerCharisma;}                      public void SetPlayerCharisma(int Replace){PlayerCharisma = Replace;}

    public boolean getPlayerCanSpeak(){return PlayerCanSpeak;}                  public void SetPlayerCanSpeak(boolean Replace){PlayerCanSpeak = Replace;}// �� ������ ����� ���!
}
