package com.company;

public class Boss extends GameEntity{
    Weapon fair;

    public Weapon getFair() {
        return fair;
    }

    public void setFair(Weapon fair) {
        this.fair = fair;
    }

    public String printInfo(){
        return " health: "+ getHealth() + " damage: " + getDamage() + " weaponType: " + fair.getNamesWeapon() + " NamesWeapon "  + fair.getWeaponType();
    }
}











