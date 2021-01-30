package com.sda.weather.backend;

public class localizationMapper {
    LocalizationsDTO asLocationDTO(Localizations localizations) {
        LocalizationsDTO localizationsDTO = new LocalizationsDTO();
        LocalizationsDTO.setCity(localizations.getCity());
        LocalizationsDTO.setCountry(localizations.getCountry());
        LocalizationsDTO.setLatitude(localizations.getLatitude());
        LocalizationsDTO.setLongitude(localizations.getLongitude());

        localizations.getRegion().ifPresent(LocalizationsDTO::setRegion);

        return LocalizationsDTO;
    }
}
