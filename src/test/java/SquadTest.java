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
    @Test
    public void succesFullyGetsHero_true() {
        Hero hero = new Hero("Uhuru", 26, "trap", "Patience", "Drive");
        Squad squad = new Squad("Vikings", "Defeat spartans");
        squad.getHeroes().add(hero);
        assertEquals(hero, squad.getHeroes().get(0));
    }
    @Test
    public void checksIfSquadCanAddHeroes_true() {
        Hero eric = new Hero("Eric", 26, "Super Coder", "Patience", "ForexTrader");
        Hero brian = new Hero("Brian", 27, "Pilot", "Never broke", "Wings");
        Squad avengers = new Squad("Avengers", "Defeat Spartans");
        avengers.setHeroes(eric);
        avengers.setHeroes(brian);
        assertEquals(true, avengers.getHeroes().contains(eric));
    }

}
