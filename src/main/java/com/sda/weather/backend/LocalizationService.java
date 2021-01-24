package com.sda.weather.backend;

public class LocalizationService {
    private final LocalizationRepository localizationRepository;

    public LocalizationService(LocalizationRepository localizationRepository) {
        this.localizationRepository = localizationRepository;
    }


    public Localizations createNewLocalization(String city, String latitude, String longitude, String country, String region) {
        return null;
    }
}
