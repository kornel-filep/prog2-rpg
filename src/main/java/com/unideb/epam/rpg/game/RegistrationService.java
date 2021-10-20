package com.unideb.epam.rpg.game;

import com.unideb.epam.rpg.domain.player.Player;
import com.unideb.epam.rpg.domain.player.Warrior;

import java.util.Scanner;

public class RegistrationService {

    public Player registerPlayer() {
        System.out.println("Welcome to the rpg game for prog2!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name?: ");
        String name = scanner.nextLine();
        return new Warrior(name);
    }

}
