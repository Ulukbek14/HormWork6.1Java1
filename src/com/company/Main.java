package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setHealth(500);
        b1.setDamage(50);
        b1.setFair(new Weapon ("Fair","Firearm"));
        System.out.println(" health: " + b1.getHealth() + " damage: " + b1.getDamage() + " weaponType: " + b1.getFair().getWeaponType()+ " NamesWeapon: " + b1.fair.getNamesWeapon());
    }
}
