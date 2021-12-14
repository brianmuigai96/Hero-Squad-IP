import models.Hero;
import models.Squad;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquadTest {
    @Test
    public void instantiatesSquadCorrectly_true() {
        Hero hero = new Hero("Uhuru", 26, "trap", "Patience", "Drive");
        Squad squad = new Squad("Vikings", "Defeat spartans");
        assertEquals(true, squad instanceof Squad);
    }
}
