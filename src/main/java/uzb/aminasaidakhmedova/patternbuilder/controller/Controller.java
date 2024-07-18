package uzb.aminasaidakhmedova.patternbuilder.controller;

import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;
import uzb.aminasaidakhmedova.patternbuilder.service.Service;

import java.util.List;
import java.util.stream.Stream;

public class Controller {
    private final Service service = new Service();

    public Stream<User> makeUserStream(List<User> users) {
        Stream<User> streamUsers = users.stream();
        return service.initializeUsers(streamUsers);
    }

    public List<User> sortByAgeDescending(Stream<User> streamUsers) {
        return service.sortByAgeDescending(streamUsers);
    }

    public Stream<User> filterOnlyEvenId(Stream<User> streamUsers) {
        return service.filterOnlyEvenId(streamUsers);
    }

    public boolean hasAgeMatchIdUser(Stream<User> streamUsers) {
        return service.hasAgeMatchIdUser(streamUsers);
    }
}
