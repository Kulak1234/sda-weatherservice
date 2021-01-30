package com.sda.weather.backend;

public class localizationMapper {

    LocalizationsDTO asLocationDTO(Localizations localizations) {
        LocalizationsDTO localizationsDTO = new LocalizationsDTO();
        localizationsDTO.setCity(localizations.getCity());
        localizationsDTO.setCountry(localizations.getCountry());
        // todo adjust it
//        localizationsDTO.setLatitude(localizations.getLatitude());
//        localizationsDTO.setLongitude(localizations.getLongitude());
        localizations.getRegion().ifPresent(localizationsDTO::setRegion);

        return localizationsDTO;
    }
}
