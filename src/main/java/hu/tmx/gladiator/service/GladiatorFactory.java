package hu.tmx.gladiator.service;

import hu.tmx.gladiator.model.*;
import hu.tmx.gladiator.util.Util;

import static hu.tmx.gladiator.util.Util.randomName;

public class GladiatorFactory {
    public static Gladiator generateRandomGladiator() {
        int choice = Util.nextInt(5);
        Gladiator gladiator;
        switch (choice) {
            case 0:
                gladiator = new Brutal(randomName());
                break;
            case 1:
                gladiator = new Assassin(randomName());
                break;
            case 2:
                gladiator = new Archer(randomName());
                break;
            default:
                gladiator = new Swordsman(randomName());
                break;
        }
        return gladiator;
    }
}
