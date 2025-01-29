package jabai;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void test() {
    assertDoesNotThrow(() -> Main.main(null));
  }

}
