package com.unideb.epam.rpg.game;

import com.unideb.epam.rpg.domain.monster.Goblin;
import com.unideb.epam.rpg.domain.monster.Monster;
import com.unideb.epam.rpg.domain.monster.Orc;
import com.unideb.epam.rpg.domain.player.Player;

import java.util.Random;
import java.util.Scanner;

public class GameService {
    private static int goblinCounter = 1;

    public void start(Player player) {
        while (player.getCurrentHp() > 0) {
            //Monster monster = new Goblin("El Goblino " + goblinCounter++);
            Monster monster = new Orc("El Orco " + goblinCounter++);
            while (monster.getCurrentHp() > 0 && player.getCurrentHp() > 0) {
                battle(player, monster);
                System.out.println(player);
                System.out.println(monster);
            }
        }
    }

    private void battle(Player player, Monster monster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to attack or block?:");
        String choice = scanner.nextLine();
        playRound(player, monster, choice);
    }

    private void playRound(Player player, Monster monster, String choice) {
        if (choice.equals("attack")) {
            player.attack(monster);
        } else if(choice.equals("block")) {
            Random random = new Random();
            playerTryToBlock(player, monster, random);
            return;
        }
        monster.attack(player);
    }

    private void playerTryToBlock(Player player, Monster monster, Random random) {
        if (random.nextBoolean()){
            System.out.println("Hehe, block successful!");
        } else {
            monster.attack(player);
        }
    }

}
