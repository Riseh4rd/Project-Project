import java.util.ArrayList;

public class CharactersMobs {
        private String Name,Type,Team;
        private ArrayList<String> Conditions,Abilities;
        private int Agility,Intellect,Health,Strength,Moral,Respect,Rage,Magic,Level;
        private  boolean Alive,CanSpeak;


      public static String GetName(CharactersMobs Mob){
         return Mob.Name;}
      public void SetName(String Name){
         this.Name = Name;}

        private ArrayList<String> GetCondition(){
            return Conditions;}
        public void SetCondition(ArrayList<String> Condition){
            this.Conditions = Condition;}

        private ArrayList<String> GetAbility(){
            return Abilities;}
        public void SetAbility(ArrayList<String> Ability){
            this.Abilities = Ability;}

        private int GetAgility(){
            return Agility;}
        public void SetAgility(int Agility){
            this.Agility = Agility;}

        private int GetIntellect(){
            return Intellect;}
        public void SetIntellect(int Intellect){
            this.Intellect = Intellect;}

        private int GetHealth(){
            return Health;}
        public void SetHealth(int Health){
            this.Health = Health;}

        private int GetStrength(){
            return Strength;}
        public void SetStrength(int Strength){
            this.Strength = Strength;}

        private int GetMoral(){
            return Moral;}
        public void SetMoral(int Moral){
            this.Moral = Moral;}

        private int GetRespect(){
            return Respect;}
        public void SetRespect(int Respect){
            this.Respect = Respect;}

        private int GetRage(){
            return Rage;}
        public void SetRage(int Rage){
            this.Rage = Rage;}

        private int GetMagic(){
            return Magic;}
        public void SetMagic(int Magic){
            this.Magic = Magic;}

    private int GetLevel(){
        return Level;}
    public void SetLevel(int Level){
        this.Level = Level;}

        private boolean GetAlive(){
            return Alive;}
        public void SetAlive(boolean Alive){
            this.Alive = Alive;}

        private boolean GetCanSpeak(){
            return CanSpeak;}
        public void SetCanSpeak(boolean CanSpeak){
            this.CanSpeak = CanSpeak;}

    private String GetType(){
        return Type;}
    public void SetType(String Type){
        this.Type = Type;}

    private String GetTeam(){
        return Team;}
    public void SetTeam(String Team){
        this.Team = Team;}


}

