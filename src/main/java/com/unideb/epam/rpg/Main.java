package com.unideb.epam.rpg;

import com.unideb.epam.rpg.domain.player.Player;
import com.unideb.epam.rpg.game.GameService;
import com.unideb.epam.rpg.game.RegistrationService;

public class Main {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService();
        Player player = registrationService.registerPlayer();
        System.out.println(player);
        GameService gameService = new GameService();
        gameService.start(player);
    }
}
