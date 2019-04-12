import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true () {
        Hero myHero = new Hero ("Batman");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithDescription_String () {
        Hero myHero = new Hero("Batman");
        assertEquals("Batman", myHero.getDescription());
    }

    @Test
    public void isAdded_isFalseAfterInstantiation_false() {
        Hero myHero = new Hero("Batman");
        assertEquals(false, myHero.isAdded());
    }
    @Test
    public void getCreatedAt_instantiatesWIthCurentTime_today (){
        Hero myHero = new Hero("Batman");
        assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
    }
    @Test
    public void all_returnsAllInstancesofHero_true () {
        Hero firstHero = new Hero("Batman");
        Hero secondHero = new Hero("Superman");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero myHero = new Hero("Batman");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_heroesInstantiateWithAnID_1() {
        Hero.clear();
        Hero myHero = new Hero ("Batman");
        assertEquals(1, myHero.getId());
    }
    @Test
    public void find_returnsHeroWithSameId_secondHero() {
        Hero firstHero = new Hero ("Batman");
        Hero secondHero = new Hero ("Superman");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
}
