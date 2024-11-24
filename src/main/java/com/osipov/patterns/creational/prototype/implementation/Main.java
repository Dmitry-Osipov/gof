package com.osipov.patterns.creational.prototype.implementation;

import com.osipov.patterns.creational.prototype.implementation.prototype.Clone;
import com.osipov.patterns.creational.prototype.implementation.prototype.Replicant;
import com.osipov.patterns.creational.prototype.implementation.prototype.StarWarsClone;
import com.osipov.patterns.creational.prototype.implementation.prototype.Terminator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clone starWarsClone1 = new StarWarsClone("Клон-коммандер", 1);
        Clone starWarsClone2 = starWarsClone1.deepClone();
        Clone replicant1 = new Replicant("Декард", 35);
        Clone replicant2 = replicant1.deepClone();
        Clone terminator1 = new Terminator("T-1000", 5);
        Clone terminator2 = terminator1.deepClone();
        List<Clone> clones = List.of(starWarsClone1, starWarsClone2, replicant1, replicant2, terminator1, terminator2);
        for (int i = 0; i < clones.size(); i+=2) {
            Clone firstClone = clones.get(i);
            Clone secondClone = clones.get(i + 1);
            System.out.printf("first == second - %s%n", firstClone == secondClone);
            System.out.printf("first equals second - %s%n", firstClone.equals(secondClone));
        }
    }
}
