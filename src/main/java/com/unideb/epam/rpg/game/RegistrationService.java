package com.unideb.epam.rpg.game;

import com.unideb.epam.rpg.domain.player.Hunter;
import com.unideb.epam.rpg.domain.player.Player;
import com.unideb.epam.rpg.domain.player.Warrior;

import java.util.Scanner;

public class RegistrationService {

    public Player registerPlayer() {
        System.out.println("Welcome to the rpg game for prog2!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name?: ");
        String name = scanner.nextLine();
        System.out.print("Whats your class?: ");
        String characterClass = scanner.nextLine();
        return createPlayer(name, characterClass);
    }

    public Player createPlayer(String name, String characterClass) {
        switch (characterClass) {
            case "warrior":
                return new Warrior(name);
            case "hunter":
                return new Hunter(name);
            default:
                System.out.println("Pick either a warrior or a hunter!: ");
                Scanner scanner = new Scanner(System.in);
                return createPlayer(name, scanner.nextLine());
        }
    }

}
