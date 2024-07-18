package uzb.aminasaidakhmedova.patternbuilder.view;

import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;

import java.util.List;
import java.util.stream.Stream;

public class View {
    public static void printSortedByAge(List<User> sortedUsers) {
        sortedUsers.forEach(System.out::println);
    }

    public static void printFilteredEvenId(Stream<User> filteredUsers) {
        filteredUsers.forEach(System.out::println);
    }

    public static void printAgeMatchId(boolean result) {
        if(result){
            System.out.println("There is a user whose age matches to his id.");
        }else{
            throw new RuntimeException("There are no users that have their id matching to their age.");
        }
    }
}
