package com.latihan;

//player
class Player {
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName :" + this.name);
        System.out.println("Health :" + this.health);
        this.weapon.display();
        this.armor.display();
    }

}

// senjata
class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("weapon : " + this.name + ", power : " + attackPower);
    }
}

// armor
class Armor {
    double defensePower;
    String name;

    Armor(String name, double defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    void display() {
        System.out.println("armor : " + this.name + ", defense : " + defensePower);
    }
}

public class main {
    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("rumu", 100.0);
        Player player2 = new Player("jala", 50);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);

        // membuat object armor
        Armor bajuBesi = new Armor("baju besi", 10);
        Armor baju = new Armor("baju", 0);

        // equip senjata dan armor (palyer 1)
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // equip senjata dan armor (palyer 1)
        player2.equipWeapon(ketapel);
        player2.equipArmor(baju);
        player2.display();
    }
}   
