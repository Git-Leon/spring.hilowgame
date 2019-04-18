package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HighLowGame;
import com.zipcodewilmington.bakery.models.HighLowPlayer;
import com.zipcodewilmington.bakery.repositories.HighLowGameRepositary;
import com.zipcodewilmington.bakery.repositories.HighLowPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HighLowPlayerService {
    private HighLowGameRepositary gameRepo;
    private HighLowPlayerRepository playerRepo;

    @Autowired
    public HighLowPlayerService(HighLowPlayerRepository playerRepo, HighLowGameRepositary gameRepo) {
        this.playerRepo = playerRepo;
        this.gameRepo = gameRepo;
    }

    public HighLowPlayer create(HighLowPlayer hiLowPlayer) {
        return playerRepo.save(hiLowPlayer);
    }

    public HighLowPlayer show(Long gameId, Long accountId) {
        HighLowGame highLowGame = gameRepo.findById(gameId).get();
        return highLowGame.findById(accountId);
    }

    public Boolean delete(Long gameId) {
        playerRepo.deleteById(gameId);
        return true;
    }

    public HighLowPlayer update(Long gameId, HighLowPlayer newHiLowPlayer) {
        HighLowPlayer originalHiLowPlayer = playerRepo.findById(gameId).get();
        originalHiLowPlayer.setName(newHiLowPlayer.getName());
        originalHiLowPlayer.setAccount(newHiLowPlayer.getAccount());
        return playerRepo.save(originalHiLowPlayer);
    }
}
