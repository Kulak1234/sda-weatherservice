package com.sda.weather.backend;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class LocalizationServiceTest {

    private static LocalizationService localizationService;

    @BeforeAll
    static void setUp() {
        LocalizationRepositoryImpl localizationRepository = new LocalizationRepositoryMock();
        localizationService = new LocalizationService(localizationRepository);
    }

    @Test
    void createNewLocalization_createsLocalization() {
        // when
        Localizations newLocalization = localizationService.createNewLocalization("Gdansk", "45", "50", "Poland", "Pomorskie");

        // then
        assertThat(newLocalization).isNotNull();
    }

    @Test
    void createNewLocalization_whenCityIsNull_throwsException() {
        // when
        Throwable throwable = catchThrowable(() -> localizationService.createNewLocalization(null, "45", "50", "Poland", "Pomorskie"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @Test
    void createNewLocalization_whenLongitudeIsMoreThan180_throwsException() {
        // when
        Throwable throwable = catchThrowable(() -> localizationService.createNewLocalization("Gdansk", "45", null, "Poland", "Pomorskie"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @Test
    void createNewLocalization_whenLongitudeIsMoreThan180Negative_throwsException() {
        // when
        Throwable throwable = catchThrowable(() -> localizationService.createNewLocalization("Gdansk", "45", "-181", "Poland", "Pomorskie"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }
}
