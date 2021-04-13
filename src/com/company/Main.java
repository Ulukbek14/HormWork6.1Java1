package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setHealth(500);
        b1.setDamage(50);
        b1.setFair(new Weapon ("Fair","Firearm"));
        System.out.println(" health: " + b1.getHealth() + " damage: " + b1.getDamage() + " weaponType: " + b1.getFair().getWeaponType()+ " NamesWeapon: " + b1.fair.getNamesWeapon());
        System.out.println(b1.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(50);
        skeleton1.setDamage(12);
        skeleton1.setFair(new Weapon("Machine", "Bow"));
        System.out.println(" health: " + skeleton1.getHealth() + " damage: " + skeleton1.getDamage() + " Machine " + skeleton1.fair.getWeaponType() + " Bow: " + skeleton1.fair.getNamesWeapon());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(50);
        skeleton2.setDamage(11);
        skeleton2.setFair(new Weapon("Machine", "Bow"));
        System.out.println(" health: " + skeleton2.getHealth() + " damage: " + skeleton2.getDamage() + " Machine: " + skeleton2.fair.getWeaponType() + " Bow: " + skeleton2.fair.getNamesWeapon());

    }
}

