package com.sda.weather.backend;

public class LocalizationService {

    private final LocalizationRepository localizationRepository;

    public LocalizationService(LocalizationRepository localizationRepository) {
        this.localizationRepository = localizationRepository;
    }

    public Localizations createNewLocalization(String city, String latitude, String longitude, String country, String region) {
        if (city == null) {
            throw new RuntimeException("Miasto nie może być puste");
        }
        if (latitude == null) { // todo regex ??
            throw new RuntimeException("Miasto nie może być puste");
        }
        if (longitude == null) { // todo regex ??
            throw new RuntimeException("Miasto nie może być puste");
        }
        if (country == null) {
            throw new RuntimeException("Kraj nie może być pusty");
        }

        Localizations localizations = new Localizations(city, latitude, longitude, country, region);

        return localizationRepository.saveLocalization(localizations);
    }
}
