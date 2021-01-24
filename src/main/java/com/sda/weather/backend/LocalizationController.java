package com.sda.weather.backend;

public class LocalizationController {

    private final LocalizationService localizationService;

    public LocalizationController(LocalizationService localizationService) {
        this.localizationService = localizationService;
    }

    public String addNewLocalization(String city, String latitude, String longitude, String country, String region) {
        Localizations newLocalization = localizationService.createNewLocalization(city, latitude, longitude, country, region);
        return newLocalization.toString();
    }
}
