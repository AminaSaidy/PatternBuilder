package uzb.aminasaidakhmedova.patternbuilder.model.entity;

public class User {
    private final Long id;
    private final String login;
    private final int age;
    private final StringBuilder password;

    public User(Long id, String login, int age, StringBuilder password) {
        this.id = id;
        this.login = login;
        this.age = age;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public StringBuilder getPassword() {
        return password;
    }
}
