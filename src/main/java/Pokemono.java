/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Pokemono {
    private String name;
    private String type;
    private double hp = 100;
    private double defense;
    private double attack;
    private double speed;
    private int level;
    //construtor
    public Pokemono(String name, String type, int level, double hp) {
        this.hp = hp;
        this.name = name;
        this.type = type;
        this.level = level;
        calcAtributes();
        calcLevel();
        //printAtributes();
    }        

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    //métodos
    private void calcLevel(){
    hp = hp + (level / 2);
    attack = attack + (level /3);
    defense = defense + (defense /4);
    }
    
    public void printAtributes(){
        System.out.println("Nome: "+this.name+"|"+
                "Tipo: "+type+"|"+
                "Level: " + level + "|"
                 + "Ataque: " + attack +"|"
                    +"Defesa: " + defense);
    }
    
    
    private void calcAtributes(){
    switch(this.type){
        case "Fire":
            this.attack = 150;
            this.defense = 30;
            this.hp -= 20;
            break;
        case "Water":
            this.attack = 140;
            this.defense = 25;
            this.hp += 30;
            break;
        case "Ground":
            this.attack = 150;
            this.defense = 20;
            this.hp += 40;
            break;
        case "Plant":
            this.attack = 140;
            this.defense = 10;
            this.hp += 100;
            break;
    }
    }
}
