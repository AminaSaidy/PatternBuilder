package uzb.aminasaidakhmedova.patternbuilder._main;

import uzb.aminasaidakhmedova.patternbuilder.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class _Main {
    public static void main(String[] args) {
        List<User.Builder> userBuild = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            userBuild.add(new User.Builder());
        }
    }
}
