/*Ѕуду использовать этот класс как некоторое хранилище вообще всего, что происходит в игре,
 переменные созданные в нем будут врем€ от времени измен€тьс€ извне другими классами,
 а после вызыватьс€ ими же, если вдруг что-то понадобитьс€. ¬ообще тут будет не вообще всЄ,
 а только то что € понимаю, как сюда засунуть, нормально использовать и хранить. */

import java.util.ArrayList;

public class EnternalBuffer {

    public static String PlayerName;
    public static String PlayerTeam="¬аша  оманда";
    public static ArrayList<String> PlayerConditions;
    public static ArrayList<String> PlayerAbilities;
    public static ArrayList<String> Inventory; public static String PlayerWeapon,PlayerSecond,PlayerAccessory,PlayerArmor;
    public static int PlayerAgility =8 ,PlayerIntellect =8,PlayerHealth=20,PlayerStrength=8,PlayerMagic=0,PlayerCharisma=5,PlayerFullLevel=0,PlayerLevel= 0;
    public static  boolean PlayerCanSpeak = true;

    // ƒалее идут геттеры и сеттеры дл€ этого класса бл€дского.

    // √≈““≈–џ ≈ЅјЌџ≈                                                              // —≈““≈–џ ЅЋяƒ— »≈
    public static String getPlayerName(){return PlayerName;}                    public static void SetPlayerName(String Replace){PlayerName = Replace;}//–ј«№®Ѕ» ћ≈Ќя ѕ„®Ћј ј’ј’ј’ј’ј’ј’ј’ј’’ј’ј’
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

    public boolean getPlayerCanSpeak(){return PlayerCanSpeak;}                  public void SetPlayerCanSpeak(boolean Replace){PlayerCanSpeak = Replace;}// Ќ≈ Ћќћј“№ ЅЋя“№ Ё“ќ!

    // далее идут методы, которые по сути могли быть бы и не тут...

    public static void LookPlayer(){

    System.out.println("\n»м€: ["+PlayerName+"]");
    System.out.println(" оманда: ["+PlayerTeam+"]");
    System.out.println("ƒействующие Ёффекты: ["+PlayerConditions+"]");
    System.out.println("ƒействующие ќсобенности: ["+PlayerAbilities+"]");

    System.out.println("\n—ила:["+PlayerStrength+"]   Ћовкость:["+PlayerAgility+"]   »нтеллект:["+PlayerIntellect+"]  ћаги€:["+PlayerMagic+"]  ’аризма:["+PlayerCharisma+"]");
    System.out.println("«доровье:["+PlayerHealth+"]   ”ровень:["+PlayerLevel+" , "+(PlayerFullLevel%100)+"/100] ");

    System.out.print("\nЁкипированное оружие: ["+PlayerWeapon+"] ");
    System.out.println("Ёкипированное вторичное: ["+PlayerSecond+"]  ");
    System.out.print("Ёкипированный аксессуар: ["+PlayerAccessory+"]  ");
    System.out.println("Ёкипированные доспехи: ["+PlayerArmor+"]  ");
    System.out.print("»нвентарь "+Inventory.size()+"/"+PlayerStrength+" : ["+Inventory+"]");
    System.out.println("\n".repeat(2));
    }//ћетод используетс€ дл€ получени€(хаха не ниху€) и вывода в консоль всей »нформации об игроке.

}
