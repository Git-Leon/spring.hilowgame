package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.models.HighLowPlayer;
import com.zipcodewilmington.bakery.repositories.HiLowGameRepositary;
import com.zipcodewilmington.bakery.repositories.HiLowPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiLowPlayerService {
    private HiLowGameRepositary gameRepo;
    private HiLowPlayerRepository playerRepo;

    @Autowired
    public HiLowPlayerService(HiLowPlayerRepository playerRepo, HiLowGameRepositary gameRepo) {
        this.playerRepo = playerRepo;
        this.gameRepo = gameRepo;
    }

    public HighLowPlayer create(HighLowPlayer hiLowPlayer) {
        return playerRepo.save(hiLowPlayer);
    }

    public HighLowPlayer show(Long gameId, Long accountId) {
        HiLowGame highLowGame = gameRepo.findById(gameId).get();
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
