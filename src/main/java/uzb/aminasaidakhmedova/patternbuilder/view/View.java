package uzb.aminasaidakhmedova.patternbuilder.view;

public class View {
    public static void printSortedByAge() {

    }

    public static void printFilteredEvenId() {

    }

    public static void printAgeMatchId(boolean result) {
        if(result){
            System.out.println("There is a user whose age matches to his id.");
        }else{
            throw new RuntimeException("There are no users that have their id matching to their age.");
        }
    }
}
