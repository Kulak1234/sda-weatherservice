package com.sda.weatherService;

import java.util.Scanner;

public class UserInterface {


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
                    readAllLocalizatiotions();
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

    private static void readAllLocalizatiotions() {
    }

    private static void addNewLocalization() {
        System.out.println("Podaj ");

    }


}