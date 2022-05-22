package model;

public class Weapon extends Equipment {

    private WeaponType weaponType;

    public Weapon(int id, String name, int attackModifier, int defenseModifier, WeaponType weaponType) {
        super(id, name, attackModifier, defenseModifier);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

}
