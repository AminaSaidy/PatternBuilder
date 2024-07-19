package uzb.aminasaidakhmedova.patternbuilder.service;

import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;

import java.util.Comparator;
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

    public Stream<User> initializeUsers(Stream<User> users) {
        return users.map(user -> new User.Builder()
                .setLogin(generateRandomString(new Random().nextInt(15) + 5))
                .setAge(new Random().nextInt(80))
                .setPassword(new StringBuilder(generateRandomString(new Random().nextInt(15) + 5)))
                .build());
    }

    public List<User> sortByAgeDescending(Stream<User> users) {
        return users.sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static Stream<User> filterOnlyEvenId(Stream<User> users) {
        return users.filter(user -> user.getId() % 2 == 0);
    }

    public boolean hasAgeMatchIdUser(List<User> users) {
       return users.stream().anyMatch(user -> user.getId().equals(user.getAge()));
    }
}
