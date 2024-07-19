package uzb.aminasaidakhmedova.patternbuilder.controller;

import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;
import uzb.aminasaidakhmedova.patternbuilder.service.Service;
import uzb.aminasaidakhmedova.patternbuilder.view.View;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {
    private final Service service = new Service();
    private final View view = new View();

    public Stream<User> makeUserStream(List<User> users) {
        Stream<User> streamUsers = users.stream();
        return service.initializeUsers(streamUsers);
    }

    public List<User> sortByAgeDescending(Stream<User> streamUsers) {
        List<User> usersList = streamUsers.collect(Collectors.toList());
        return service.sortByAgeDescending(usersList.stream());
    }

    public Stream<User> filterOnlyEvenId(Stream<User> streamUsers) {
        List<User> usersList = streamUsers.collect(Collectors.toList());
        return service.filterOnlyEvenId(usersList.stream());
    }

    public boolean hasAgeMatchIdUser(List<User> usersList) {
        return service.hasAgeMatchIdUser(usersList);
    }

    public void printSortedByAge(List<User> sortedUsers) {
        view.printSortedByAge(sortedUsers);
    }

    public void printFilteredEvenId(List<User> filteredUsers) {
        view.printFilteredEvenId(filteredUsers);
    }

    public void printAgeMatchId(boolean result) {
        view.printAgeMatchId(result);
    }
}
