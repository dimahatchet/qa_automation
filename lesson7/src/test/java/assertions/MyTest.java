package assertions;

import org.junit.Test;

public class MyTest {
@Test
    public void test() {
        User boris = new User();
        boris.setAge(18);
        UserAssertion.assertThat(boris).canBuyAlcohol();
    }
}
