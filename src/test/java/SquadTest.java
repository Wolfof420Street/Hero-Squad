import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Marvel");
        assertEquals(true, testSquad instanceof Squad);
    }


    @Test
    public void getName_squadInstantiatesWithName_String () {
        Squad testSquad = new Squad("Marvel");
        assertEquals("Marvel", testSquad.getName());
    }
    @Test
    public void all_returnsAllInstancesofSquad_true () {
        Squad firstSquad = new Squad("Marvel");
        Squad secondSquad = new Squad("DC");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }
    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testSquad = new Squad ("Marvel");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
    @Test
    public void getId_squadsInstantiateWithAnId_1() {
        Squad testSquad = new Squad ("Marvel");
        assertEquals(1, testSquad.getId());
    }
    @Test
    public void find_returnsSquadWithSameId_secondCategory() {
        Squad.clear();
        Squad firstSquad = new Squad("Marvel");
        Squad secondSquad = new Squad("DC");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }
    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad ("Marvel");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void addTask_addsTaskToList_true() {
        Squad testSquad = new Squad("Marvel");
        Hero testHero = new Hero ("SpiderMan", "69", "web", "death");
        testHero.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testSquad));
    }
    }
