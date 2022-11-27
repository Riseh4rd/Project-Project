import java.util.Random;

public class BackStoryScenario {
    public static final String a2 = "\033[0m";  // Text Reset
    public static final String a1 = "\033[0;97m";  // WHITE
    public static void GiveMeStory(String Name){
        Random RND = new Random();
       int StoryNuber = RND.nextInt(2);
       if (StoryNuber==0){BackStory1(Name);}
        if (StoryNuber==1){BackStory2(Name);}
    }
    public static void BackStory1(String PlayerName){
        String[] Player = new String[]{"мага","чародея","война","паладина","полководца","вора","уборщика","курьера","повара","инженера","вруна","дурака","идиота","гения","изобретателя","раба",};
        String[] Years = new String[]{"Камня","Палки","Бутылки","Щвабры","Меча","книги","Посоха","Артефакта", "ока", "лука и стрелы", "погнутого клинка", "копья", "тесака", "топора", "кирки", "кошеля", "рюкзака", "колчана", "кинжала", "ритуального ножа", "камня","черепа","крысы"
                ,"коровы","дракона","моржа","веревки","дождя","смуты","смерти","Человека"};
Random RND = new Random();
        utility ImportUtility = new utility();
        String Antagonist = ImportUtility.character_New_Name();
        String Year = Years[RND.nextInt(Years.length)];
        String TheGoodGod = ImportUtility.character_New_Name();
        String Town = ImportUtility.Town_New_Name(Antagonist);
        String PlayerType =Player[RND.nextInt(Player.length)];
        System.out.println("Злой чародей по имени "+a1+Antagonist+a2+" захватывал города один за другим, возрождая свою армию тьмы. \n" +
                "И в десятом году правления божественного вождя, которого звали "+a1+TheGoodGod+a2+", в год "+a1+Year+a2+", когда в небе расцвели весенние цветы, \n" +
                "небесный владыка послал своего величайшего "+a1+PlayerType+a2+", по имени "+a1+PlayerName+a2+" что бы одолеть злого колдуна. Но несмотря на то,\n" +
                "что Вы по приказу небесного владыки захватили столицу — "+a1+Town+a2+", Вы умудрились потерять всех своих солдат,\n" +
                "вам чудом удалось выжить в борьбе за город. Вам ничего не оставалось кроме как бродить по руинам великой битвы...");
    }// Легион Колдуна 1
    public static void BackStory2(String PlayerName){
        String[] Player = new String[]{"мага","чародея","война","паладина","полководца","вора","уборщика","курьера","повара","инженера","вруна","дурака","идиота","гения","изобретателя","раба",};
        String[] Years = new String[]{"Камня","Палки","Бутылки","Щвабры","Меча","книги","Посоха","Артефакта", "ока", "лука и стрелы", "погнутого клинка", "копья", "тесака", "топора", "кирки", "кошеля", "рюкзака", "колчана", "кинжала", "ритуального ножа", "камня","черепа","крысы"
                ,"коровы","дракона","моржа","веревки","дождя","смуты","смерти","Человека"};
        Random RND = new Random();
        utility ImportUtility = new utility();
        String Antagonist = ImportUtility.character_New_Name();
        String Year = Years[RND.nextInt(Years.length)];
        String TheGoodGod = ImportUtility.character_New_Name();
        String Town = ImportUtility.Town_New_Name(Antagonist);
        String PlayerType =Player[RND.nextInt(Player.length)];
        System.out.println("Злой чародей по имени "+a1+Antagonist+a2+" захватывал города один за другим, возрождая свою армию тьмы. \n" +
                "И в десятом году правления божественного вождя, которого звали "+a1+TheGoodGod+a2+", в год "+a1+Year+a2+", когда в небе расцвели весенние цветы, \n" +
                "небесный владыка послал своего величайшего "+a1+PlayerType+a2+", по имени "+a1+PlayerName+a2+" что бы одолеть злого колдуна. Но несмотря на то,\n" +
                "что Вы по приказу небесного владыки захватили столицу — "+a1+Town+a2+", Вы умудрились потерять всех своих солдат,\n" +
                "вам чудом удалось выжить в борьбе за город. Вам ничего не оставалось кроме как бродить по руинам великой битвы...");
    }// УХ ЕБААААААААААААААТЬ!

}
