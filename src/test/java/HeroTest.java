import models.Hero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
//    check to see if an object is correctly created
    @Before
    public void tearDown(){
        Hero.clearAllHeroes();
    }
    @Test
    public void heroObjectIsCorrectlyCreated_true() {
        Hero superHero = new Hero("Brian", 26, "Coder", "Patience", "master");
        assertEquals(true, superHero instanceof Hero);
    }
    @Test
    public void allHeroesContainsAllHeroes_true() {
        Hero superHero = new Hero("Briam", 26, " Coder", "Patience", "master");
        Hero secondSuperHero = new Hero("Twitty", 21, "Super", "Patience", "DC");
        assertEquals(true, Hero.getAll().contains(superHero));
        assertEquals(true, Hero.getAll().contains(secondSuperHero));
    }

}
