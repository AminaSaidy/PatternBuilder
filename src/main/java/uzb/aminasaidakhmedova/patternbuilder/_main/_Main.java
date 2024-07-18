package uzb.aminasaidakhmedova.patternbuilder._main;

import uzb.aminasaidakhmedova.patternbuilder.controller.Controller;
import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Main {
    public static void main(String[] args) {
        List<User> userBuild = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            userBuild.add(new User.Builder().build());
        }

        Controller controller = new Controller();
        Stream<User> streamUser = controller.makeUserStream(userBuild);
        List<User> sortedByAgeUsers = controller.sortByAgeDescending(streamUser);
        controller.printSortedByAge(sortedByAgeUsers);
        Stream<User> filteredByIdUsers = controller.filterOnlyEvenId(sortedByAgeUsers.stream());
        List<User> filteredList = filteredByIdUsers.collect(Collectors.toList());
        boolean checkAgeMatchIdUser = controller.hasAgeMatchIdUser(filteredList);
        controller.printAgeMatchId(checkAgeMatchIdUser);
    }
}
