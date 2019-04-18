package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HighLowGame;
import com.zipcodewilmington.bakery.repositories.HighLowGameRepositary;

public class HighLowGameService {
    private HighLowGameRepositary repositary;

    public HighLowGameService(HighLowGameRepositary repositary) {
        this.repositary = repositary;
    }

    public HighLowGame show(Long gameid) {
        return repositary.findById(gameid).get();
    }

    public HighLowGame create(HighLowGame hiLowGame) {
        return repositary.save(hiLowGame);
    }

    public Boolean delete(Long gameid) {
        repositary.deleteById(gameid);
        return true;
    }

    public HighLowGame update(Long gameid, HighLowGame newHighLowGame) {
        HighLowGame originalHiLow = repositary.findById(gameid).get();
        return repositary.save(originalHiLow);
    }
}
