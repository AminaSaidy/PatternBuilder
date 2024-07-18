package uzb.aminasaidakhmedova.patternbuilder.service;
import java.util.Comparator;
import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service {
    public static String generateRandomString(int length) {
        String possibleSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder strBuild = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            strBuild.append(possibleSymbols.charAt(random.nextInt(possibleSymbols.length())));
        }
        return strBuild.toString();
    }

    public Stream<User> initializeUsers(int amount) {
        return Stream.generate(() -> new User.Builder()
                        .setLogin(generateRandomString(new Random().nextInt(15) + 5))
                        .setAge(new Random().nextInt(80))
                        .setPassword(new StringBuilder(generateRandomString(new Random().nextInt(15) + 5)))
                        .build())
                .limit(amount);
    }

    public static List<User> sortByAgeDescending(Stream<User> users) {
        return users.sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static void filterOnlyEvenId() {

    }

    public static void hasAgeMatchIdUser() {

    }
}
