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

    public static class Builder {
        private Long id;
        private String login;
        private int age;
        private StringBuilder password;

        public Builder(){

        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPassword(StringBuilder password) {
            this.password = password;
            return this;
        }

        public User build() {
            if(id == null) {
                id = generateUniqueId();
            }
            return new User(id, login, age, password);
        }

        private Long generateUniqueId() {
            return System.currentTimeMillis();
        }
    }
}
