package rocks.zipcodewilmington;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    private CatHouse catHouse;
    private Cat bigCat;
    private Cat smallCat;

    @Before
    public void setup(){
        this.catHouse = new CatHouse();
        this.bigCat = new Cat("Tiger", new Date(50), 2);
        this.smallCat = new Cat("Tiny", new Date(25), 1);}

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
    //Given
    Integer expected = 1;
    //When
        catHouse.add(bigCat);
    //Then
    Assert.assertEquals(expected, catHouse.getNumberOfCats());}
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
    //Given
    catHouse.add(bigCat);
    //When
    catHouse.remove(2);
    Integer expectedInt = 0;
    //Then
     Assert.assertEquals(expectedInt, catHouse.getNumberOfCats());}
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeTest(){
    //Given
    catHouse.add(bigCat);
    //When
    catHouse.remove(bigCat);
    Integer expectedInt = 0;
    //Then
    Assert.assertEquals(expectedInt, catHouse.getNumberOfCats());}
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatbyIdTest(){
    //Given
    catHouse.add(bigCat);
    //When

    //Then
     Assert.assertEquals(catHouse.getCatById(2), bigCat);}
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
    //Given
    catHouse.add(bigCat);
    catHouse.add(smallCat);
    Integer expectedInt = 2;
    Assert.assertEquals(expectedInt, catHouse.getNumberOfCats());}
    @After
    public void tearDown(){
        this.catHouse.clear();}}