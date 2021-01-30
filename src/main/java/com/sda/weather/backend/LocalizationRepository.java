package com.sda.weather.backend;

import java.util.List;

public interface LocalizationRepository {

    Localizations saveLocalization(Localizations localizations);

    List<Localizations> readAllLocalizations();
}
