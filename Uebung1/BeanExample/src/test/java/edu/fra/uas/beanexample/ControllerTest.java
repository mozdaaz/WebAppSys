package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat; 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.beanexample.BeanController;

@SpringBootTest
public class ControllerTest {
@Autowired
private BeanController beanController; 
@Test
void testController() {
assertThat(beanController.putMessage("Das ist ein Test"))
 .isEqualTo("Das ist ein Test");
} 

@Test
public void counterTest {
    


}
}