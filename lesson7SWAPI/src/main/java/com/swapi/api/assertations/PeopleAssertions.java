package com.swapi.api.assertations;

import com.swapi.models.People;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class PeopleAssertions extends AbstractAssert<PeopleAssertions,People> {

    private PeopleAssertions(People user, Class<?> selfType) {
        super(user, selfType);
    }

    public static PeopleAssertions assertThat(People actual) {
        return new PeopleAssertions(actual,PeopleAssertions.class);
    }

    public PeopleAssertions canBuyAlcohol() {
        Assertions.assertThat(actual.getName());
        return this;
    }

    public PeopleAssertions isOlderThen(final People other) {
        Assertions.assertThat(actual.getName())
                .withFailMessage(String.format("User can't buy alcohol: his age is {%d}",actual.getName())).isEqualTo(actual.getName());
        return this;
    }

}