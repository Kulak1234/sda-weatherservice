package com.sda.weather.backend;

public class LocalizationRepositoryMock implements LocalizationRepository{

    @Override
    public Localizations saveLocalization(Localizations localizations) {
        return localizations;
    }
}
