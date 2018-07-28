package don.geronimo.estudo.testeautenticacao2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TesteAutenticacao2ApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Before
    public void createAdmin(){
        User usu = new User("78a2", "foo", "bar");
        userRepository.save(usu);
    }

    @Test
    public void hasFoo() {
        User usu = userRepository.findById("78a2").get();
        assert(usu.getLogin().equals("foo") && usu.getPassword().equals("bar"));
    }

}
