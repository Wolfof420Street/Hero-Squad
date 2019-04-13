import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true () {
        Hero myHero = new Hero ("Batman", "30", "intelligence", "no Super Power");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithDescription_String () {
        Hero myHero = new Hero("Batman", "20", "intelligence", "no Super Power");
        assertEquals("Batman", myHero.getDescription());
    }

    @Test
    public void isAdded_isFalseAfterInstantiation_false() {
        Hero myHero = new Hero("Batman", "420", "intelligence", "No Super Power");
        assertEquals(false, myHero.isAdded());
    }
    @Test
    public void getCreatedAt_instantiatesWIthCurentTime_today (){
        Hero myHero = new Hero("Batman", "69", "intelligence", "No Super Power");
        assertEquals(LocalDateTime.now().getDayOfWeek(), myHero.getCreatedAt().getDayOfWeek());
    }
    @Test
    public void getStrength_instantiatesWithStrength_String () {
        Hero myHero = new Hero("Batman", "69", "Money", "Alfred");
        assertEquals("Money", myHero.getStrength());
    }
    @Test
    public void getWeakness_instantiatesWithWeakness () {
        Hero myHero = new Hero("Batman", "69", "Money", "Alfred");
        assertEquals("Alfred", myHero.getWeakness());
    }
    @Test
    public void getAge_instantiatesWithAge_String () {
        Hero myHero = new Hero("Batman", "69", "Money", "Alfred");
        assertEquals("69", myHero.getAge());
    }
    @Test
    public void all_returnsAllInstancesofHero_true () {
        Hero firstHero = new Hero("Batman", "69", "money", "Weak");
        Hero secondHero = new Hero("Superman", "1000", "super strength", "cryptonite");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero myHero = new Hero("Batman", "69", "money", "death");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_heroesInstantiateWithAnID_1() {
        Hero.clear();
        Hero myHero = new Hero ("Batman", "69", "rich", "can die");
        assertEquals(1, myHero.getId());
    }
    @Test
    public void find_returnsHeroWithSameId_secondHero() {
        Hero firstHero = new Hero ("Batman", "69", "Rich", "gets hurt");
        Hero secondHero = new Hero ("Superman", "69", "flying", "Kryptonite");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
}
