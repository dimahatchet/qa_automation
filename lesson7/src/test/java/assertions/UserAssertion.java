package assertions;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class UserAssertion extends AbstractAssert<UserAssertion,User> {

    private UserAssertion(User user, Class<?> selfType) {
        super(user, selfType);
    }

    public static UserAssertion assertThat(User actual) {
        return new UserAssertion(actual,UserAssertion.class);
    }

    public UserAssertion canBuyAlcohol() {
        Assertions.assertThat(actual.getAge()).isGreaterThan(21);
        return this;
    }

    public UserAssertion isOlderThen(final User other) {
        Assertions.assertThat(actual.getAge())
                .withFailMessage(String.format("User can't buy alcohol: his age is {%d}",actual.getAge()))
                .isGreaterThan(other.getAge());
        return this;
    }

}
