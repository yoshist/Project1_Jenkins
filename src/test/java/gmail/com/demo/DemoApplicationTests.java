package gmail.com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private DemoApplication ticketer = new DemoApplication();
	@Test
	void testRandoNumber() {

	assertTrue(ticketer.getRandeomTicketNumber()>1000&ticketer.getRandomTicketNumber()<9999);
	}

}
