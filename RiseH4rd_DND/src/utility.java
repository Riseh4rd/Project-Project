import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class utility {

    public static void Hello(){
        System.out.println("\t\t\t---Все доступные команды и действия--- ");
        System.out.println("""
                ***ВЗАИМОДЕЙСТВИЕ С ЖИВЫМИ СУЩЕСТВАМИ:\s
                \t1(Бить-ударить [объект вашего насилия])
                \t2 ещё что-нибудь""");
        System.out.println("""
                ***ВЗАИМОДЕЙСТВИЕ С ИНВЕНТАРЁМ:\s
                \t1(ЭкипОсн [Предмет в инвентаре])
                \t2(ЭкипВтор [Предмет в инвентаре])
                \t3(ЭкипАкс [Предмет в инвентаре])
                \t4(ЭкипДос [Предмет в инвентаре])""");

    }//метод просто выводит в консоль подсказки для пользователя.
    public static void ClearAll(){
       System.out.println(" \n ".repeat(30));
        }//очистка консоли хуйнёй
    public static String character_New_Name(){
        String Slog1=null,Slog2=null,Slog3=null;
        String[] NormalSecond = new String[]{"Русский","белый","Чёрный","старый","недалекий","великий","красный","страшный","мятый","Мерзкий","мятный","Вонючий",
        "святой","чмо","золотой","холодный","Горячий","левый","Правый","тонкий","толстый","мелкий","Здоровый","тихий","Громкий","теплый"};
        String[] NormalName = new String[]{"Глеб","Дмитрий","Всеволод","Степан","Егор","Лев","Марат","Александр","Владислав","Платон","Мирон","Тимофей","Артём","Сергей",
                "Илья","Кирилл","Максим","Семён","Захар","Иван","Билал","Тимур","Денис","Михаил","Никита","Григорий","Артемий","Алексей","Константин","Эйбрахам","Адам",
                "Эйдриан","Алан","Эндрю","Энтони","Остин","Бэзил","Бенджамин","Бернард","Брейэн","Брус","Брюс","Картер","Чарлз","Кристиан","Кристофер","Клиффорд",
                "Кертис","Сайрус","Дейвид","Деннис","Доналд","Эдвард","Джеффри","Джордж","Джералд","Гилберт","Гордон","Грейам","Грегори","Харолд","Хенри","Херберт",
                "Хауард","Джек","Кит","Мартин","Морис","Майкл","МайлзНорман"};
        String[] Beliberda = new String[]{"Гит","Бар","Нок","Шу","Й","Ра","Чо","Чи","Че","Ча","Лер","Ляр","Со","Си","Су","Ум","Рут","Мур","Ша","де","зо","за","зи"
                ,"Ро","Ри","Ра","Виль","Зе","Вур","Ба","Бо","Би","Бе","Бэ","а","и","о","у","е","ю","я","ё","ху","хи","ха","Еб","Ёб","Дал","Дол","лал","лог","Хмы","рь"
                ,"рю","Ад","ол","ль","фа","чур","бес","ка","шай","тан","уй","Пи","до","рас","ал","ан","он","су","Мра","го","вно"};
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
        return Name;}//Метод для создания различных имен персонажей, имя составляется случайно из содержимого массивов
    public static String Town_New_Name(String NameToBuild){
        String[] Slog1 = new String[]{"Вурн","Шапе","Зоро","Каля","Гото","Бум","Рак","Ред","Блу","Пере","Пре","Грин","Сизо","Парс","Чоко","Пирс","Нами","Луфи","Усоп","Санж","Де-","Ля-","Гав-","Пакль",
                "Норд","Вест","Сан-","Локо-","Место ","Умрун-","Шпатель","Бумажный ","Проклятый ","Великий ","Зорг","Папи","Славный ","Пятый ","Зоро", "Каляпу","Александров ","Вечелый ","Чоко",
                "Третий ","Второй ","Последний ","Красный ","Побитый ", "Старинный ","Егоров", "Пьяный ","Холодный ", "Северный ","Южный ","Восточный ","Западный ","Даун","Сан","Вол","Моск","Тех","Дота",};
        String[] Slog2 = new String[]{NameToBuild,NameToBuild,NameToBuild,"тор","пор","но","-локо","-поко","ва","-фран","шиш","пирс","пай","лед","им","чак","сум","коми","судогда","ток","ром","-рома","роман","ер","фальш","чпок"
                ,"лом","санди","любере","осто","радже","товеро","карпа","филат","мас","мыс","латэ","порка","пипка","рюм","нарс","гром","дуб","лакот","рич-"};
        String[] Slog3 = new String[]{"санди","любере","осто","радже","товеро","карпа","филат","мас","мыс","парк","порка","пипка","рюм","нарс","гром","дуб","лакот","рич"," Апока-лока"," Сильвер","таун","лока","град","ленд"
                ,"сильва","товеро","гачи","цуха","дом","ратота","пирог"," Автомата","томата","стан"," червир"," сакоста"," Имени "+NameToBuild," помидоров"," клавиши"," магии"," трупов"," Имени "+NameToBuild," Имени "+NameToBuild," Имени "+NameToBuild};
        Random RND = new Random();
        String Name = Slog1[RND.nextInt(Slog1.length)]+Slog2[RND.nextInt(Slog2.length)]+Slog3[RND.nextInt(Slog3.length)];
        return Name;}//Метод для создания различных названий городов, составляется случайно из содержимого массивов

    public static boolean RollDice(int Bounds){
        Scanner in = new Scanner(System.in);
        Random Rnd = new Random();
        int input, result;
        int TypeRoll=Rnd.nextInt(3);

        if (TypeRoll==0){System.out.println("Бросок на удачу! Успех - выбить число не меньше "+Bounds+" !");
          while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("Вы ввели хуйню, вводите снова.");continue;}if (input>Bounds){System.out.println("Вы ввели число, превышающее границы ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt(Math.abs(input/2))+Rnd.nextInt(Math.abs(Bounds)))+1;
          if (result>=Bounds){System.out.println("Успех! вы выбросили: "+result+" / "+Bounds);return true;}
          else {System.out.println("Неудача! вы выбросили: "+result+" / "+Bounds);return false;}
        }
        else if (TypeRoll==1){ Bounds = Rnd.nextInt(5)+2; System.out.println("Бросок на удачу! Успех - выбить число Кратное "+Bounds+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("Вы ввели хуйню, вводите снова.");continue;}break;}
            result=((input/2)+Rnd.nextInt(Bounds))+1;
            if (result%Bounds==0){System.out.println("Успех! вы выбросили: "+result+" , Кратное "+Bounds);return true;}
            else {System.out.println("Неудача! вы выбросили: "+result+" , не кратное "+Bounds);return false;}
        }
        else {int Bounds2= Rnd.nextInt(5)+2; System.out.println("Бросок на удачу! Успех - выбить число не меньше "+Bounds+" , или кратное "+Bounds2+" !");
            while (true){ try {input = in.nextInt();} catch (NumberFormatException e){System.out.println("Вы ввели хуйню, вводите снова.");continue;}if (input>Bounds){System.out.println("Вы ввели число, превышающее границы ("+Bounds+") !");continue;}break;}
            result=(Rnd.nextInt((input/2)+1)+Rnd.nextInt(Bounds/2)+1)+1;
            if (result>=Bounds|result%Bounds2==0){System.out.println("Успех! вы выбросили: "+result+" / "+Bounds+" , или кратное "+Bounds2);return true;}
            else {System.out.println("Неудача! вы выбросили: "+result+" / "+Bounds+" , и не кратное "+Bounds2);return false;}
        }

        }//метод имитирующий бросание игральных костей

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
    }//Определяет за кем будет первый ход при встрече

    public static void CheckDeath(CharactersMobs Mob){

       if (CharactersMobs.GetHealth(Mob) <= 0){
           CharactersMobs.SetAlive(false,Mob);CharactersMobs.ReleaseIndex(Mob);
       }
    }//Проверка существа на жизнеспособность и дальнейшие действия

    public static boolean FindByName(String InputName,ArrayList<CharactersMobs> Mobs){
        boolean Found = false;
        for (CharactersMobs mob : Mobs) {
            if (InputName.equalsIgnoreCase(CharactersMobs.GetName(mob))) {CharactersMobs.PersonA = mob;Found=true;break;}
        }
        if (!Found) System.out.println(InputName + " тут нет");
        return Found;
    }//рудимент?

}

