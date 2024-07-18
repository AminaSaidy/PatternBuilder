package uzb.aminasaidakhmedova.patternbuilder.service;

import java.util.Random;

public class Service {
    public static String generateRandomString() {
        String possibleSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder strBuild = new StringBuilder(15);
        for (int i = 0; i < 15; i++) {
            strBuild.append(possibleSymbols.charAt(random.nextInt(possibleSymbols.length())));
        }
        return strBuild.toString();
    }

    public static void sortByAgeDescending() {

    }

    public static void filterOnlyEvenId() {

    }

    public static void hasAgeMatchIdUser() {

    }
}
