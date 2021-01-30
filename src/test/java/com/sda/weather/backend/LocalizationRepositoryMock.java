package com.sda.weather.backend;

import java.util.List;

public class LocalizationRepositoryMock implements LocalizationRepository{

    @Override
    public Localizations saveLocalization(Localizations localizations) {
        return localizations;
    }
    public List<Localizations> readAllLocalizations(){return null;}
}
