package com.sda.weather;

import com.sda.weather.backend.LocalizationController;
import com.sda.weather.backend.LocalizationRepository;
import com.sda.weather.backend.LocalizationRepositoryImpl;
import com.sda.weather.backend.LocalizationService;

import java.util.Scanner;


public class UserInterface {
    private static final LocalizationController localizationController;

    static {
        LocalizationRepositoryImpl localizationRepository = new LocalizationRepositoryImpl();
        LocalizationService localizationService = new LocalizationService(localizationRepository);
        localizationController = new LocalizationController(localizationService);
    }

    public static void main(String[] args) {
        System.out.println("Witaj w Pogodynce!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodać lokalizację");
            System.out.println("2. Wyświetl dodane lokalizacje");
            System.out.println("3. Odczytać pogodę z danej lokalizacji");
            System.out.println("4. Zamknąć aplikację");

            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    addNewLocalization();
                    break;
                case 2:
                    readAllLocalizations();
                    break;
                case 3:
                    showWeatherFromLocalization();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void showWeatherFromLocalization() {

    }

    private static void readAllLocalizations() { // todo typo
        System.out.println("Twoje wpisy: ");
    }

    private static void addNewLocalization() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj miasto");
        String city = scanner.nextLine();
        System.out.println("Podaj szerokosc geograficzna");
        String latitude = scanner.nextLine();
        System.out.println("Podaj dlugosc geograficzna");
        String longitude = scanner.nextLine();
        System.out.println("Podaj nazwę kraju");
        String country = scanner.nextLine();
        System.out.println("Podaj nazwę regionu");
        String region = scanner.nextLine();
        String response = localizationController.addNewLocalization(city,latitude,longitude,country,region);
        System.out.println(("Twoja lokalizacja została pomyślnie dodana " + response));
    }
}
