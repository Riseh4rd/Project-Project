import java.util.ArrayList;

public class CharactersMobs {
    public static CharactersMobs PersonA;
    private String Name,Type,Team;
        private ArrayList<String> Conditions,Abilities;
        private int Agility,Intellect,Health,Strength,Moral,Respect,Rage,Magic,Level;
        private  boolean Alive,CanSpeak;

        public CharactersMobs(String Type, String Team, String Name, ArrayList<String> Conditions, ArrayList<String> Abilities, int Agility, int Intellect, int Health, int Strength, int Moral, int Respect, int Rage, int Magic, boolean Alive, boolean CanSpeak){
            this.Name = Name;
            this.Type = Type;
            this.Team = Team;
            this.Conditions = Conditions;
            this.Abilities = Abilities;
            this.Agility = Agility;
            this.Intellect = Intellect;
            this.Health = Health;
            this.Strength = Strength;
            this.Moral = Moral;
            this.Respect = Respect;
            this.Rage = Rage;
            this.Magic = Magic;
            this.Alive = Alive;
            this.CanSpeak = CanSpeak;
        }

        public static String GetName(CharactersMobs Mob){
             return Mob.Name;}
        public static void SetName(String Name,CharactersMobs Mob){
            Mob.Name = Name;}

        public static ArrayList<String> GetCondition(CharactersMobs Mob){
                return Mob.Conditions;}
            public void SetCondition(ArrayList<String> Condition){
                this.Conditions = Condition;}

        public static ArrayList<String> GetAbility(CharactersMobs Mob){
                return Mob.Abilities;}
            public void SetAbility(ArrayList<String> Ability){
                this.Abilities = Ability;}

        public static int GetAgility(CharactersMobs Mob){
                return Mob.Agility;}
            public void SetAgility(int Agility){
                this.Agility = Agility;}

        public static int GetIntellect(CharactersMobs Mob){
                return Mob.Intellect;}
            public void SetIntellect(int Intellect){
                this.Intellect = Intellect;}

        public static int GetHealth(CharactersMobs Mob){
                return Mob.Health;}
            public static void SetHealth(int Health, CharactersMobs Mob){
                Mob.Health = Health;}

        public static int GetStrength(CharactersMobs Mob){
                return Mob.Strength;}
            public void SetStrength(int Strength){
                this.Strength = Strength;}

        public static int GetMoral(CharactersMobs Mob){
                return Mob.Moral;}
            public void SetMoral(int Moral){
                this.Moral = Moral;}

        public static int GetRespect(CharactersMobs Mob){
                return Mob.Respect;}
            public void SetRespect(int Respect){
                this.Respect = Respect;}

        public static int GetRage(CharactersMobs Mob){
                return Mob.Rage;}
            public void SetRage(int Rage){
                this.Rage = Rage;}

        public static int GetMagic(CharactersMobs Mob){
                return Mob.Magic;}
            public void SetMagic(int Magic){
                this.Magic = Magic;}

        public static int GetLevel(CharactersMobs Mob){
            return Mob.Level;}
        public void SetLevel(int Level){
            this.Level = Level;}

        public static boolean GetAlive(CharactersMobs Mob){
                return Mob.Alive;}
            public static void SetAlive(boolean Alive, CharactersMobs Mob){
                Mob.Alive = Alive;}

        public static boolean GetCanSpeak(CharactersMobs Mob){
                return Mob.CanSpeak;}
            public void SetCanSpeak(boolean CanSpeak){
                this.CanSpeak = CanSpeak;}

        public static String GetType(CharactersMobs Mob){
            return Mob.Type;}
        public void SetType(String Type){
            this.Type = Type;}

        public static String GetTeam(CharactersMobs Mob){
            return Mob.Team;}
        public void SetTeam(String Team){
            this.Team = Team;}


}

