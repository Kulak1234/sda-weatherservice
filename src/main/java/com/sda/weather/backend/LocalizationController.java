package com.sda.weather.backend;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.stream.Collectors;

public class LocalizationController {

    private final LocalizationService localizationService;

    public LocalizationController(LocalizationService localizationService) {
        this.localizationService = localizationService;
    }

    public String addNewLocalization(String city, String latitude, String longitude, String country, String region) {
        Localizations newLocalization = localizationService.createNewLocalization(city, latitude, longitude, country, region);
        return newLocalization.toString();
    }

    public String readAllLocalizations() {
//        List<LocalizationsDTO> locations = localizationService.readAllLocalizations().stream()
//                .map(localizationsMapper::asLocationDTO)
//                .collect(Collectors.toList());

//        try {
//            return objectMapper.writeValueAsString(locations);
//        } catch (JsonProcessingException e) {
//            throw new InternalServerException("Wystąpił problem podczas serializacji odpowiedzi: " + e.getMessage());
//        }
        return "";
    }
}
