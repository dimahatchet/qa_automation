package builderExample;

public class User {

    private final int age;
    private final String firstName;
    private final String lastName;

    private User(Builder builder) {
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static Builder create() {
        return new Builder();
    }

    public int getAge() {
        return age;
    }

    public String getFisrtName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder {
        private int age;
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user = User.create()
                .setAge(42)
                .setFirstName("a")
                .setLastName("b")
                .build();

    }
}
