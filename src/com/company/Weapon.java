package com.company;

public class Weapon {
    private String weaponType;
    private String namesWeapon;


    public Weapon(String weaponType, String namesWeapon) {
        this.weaponType = weaponType;
        this.namesWeapon = namesWeapon;

    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;

    }

    public String getNamesWeapon() {
        return namesWeapon;
    }


    public void setNamesWeapon(String namesWeapon) {
        this.namesWeapon = namesWeapon;
    }
}
