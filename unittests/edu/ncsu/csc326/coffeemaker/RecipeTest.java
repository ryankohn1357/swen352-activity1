package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;
import org.junit.*;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class RecipeTest extends TestCase {
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetName() {
		Recipe recipe = new Recipe();
		String name = recipe.getName();
		assertEquals("Name is not empty when creating new recipe", "", name);
	}
	
	@Test
	public void testSetAndGetName1() {
		Recipe recipe = new Recipe();
		recipe.setName("starbucks");
		String name = recipe.getName();
		assertEquals("Name should be starbucks", "starbucks", name);
	};
	
	@Test
	public void testSetAndGetName2() {
		Recipe recipe = new Recipe();
		recipe.setName(null);
		String name = recipe.getName();
		assertEquals("Name should not change due to null", "", name);
	}
	
	@Test
	public void testGetMilk() {
		Recipe recipe = new Recipe();
		int milk = recipe.getAmtMilk();
		assertEquals("Milk should be 0", 0, milk);
	}
	
	@Test
	public void testGetCoffee() {
		Recipe recipe = new Recipe();
		int coffee = recipe.getAmtCoffee();
		assertEquals("Coffee should be 0", 0, coffee);
	}
	
	@Test
	public void testGetChocolate() {
		Recipe recipe = new Recipe();
		int chocolate = recipe.getAmtChocolate();
		assertEquals("Chocolate should be 0", 0, chocolate);
	}
	
	@Test
	public void testGetSugar() {
		Recipe recipe = new Recipe();
		int sugar = recipe.getAmtSugar();
		assertEquals("Sugar should be 0", 0, sugar);
	}
	
	@Test
	public void testGetPrice() {
		Recipe recipe = new Recipe();
		int price = recipe.getPrice();
		assertEquals("Price should be 0", 0, price);
	}
	
	@Test
	public void testGetString() {
		Recipe recipe = new Recipe();
		String str = recipe.toString();
		assertEquals("String should be empty", "", str);
	}
	
	@Test
	public void testSetChocolate1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("1");
		int chocolate = recipe.getAmtChocolate();
		assertEquals("Chocolate should be 1", 1, chocolate);
	}
	
	@Test
	public void testSetChocolate2() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("0");
		int chocolate = recipe.getAmtChocolate();
		assertEquals("Chocolate should be 0", 0, chocolate);
	}
	
	@Test
	public void testSetChocolate3() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("-1");
		} catch(RecipeException e) {
			assertEquals("Units of chocolate must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetChocolate4() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("hello");
		} catch(RecipeException e) {
			assertEquals("Units of chocolate must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetCoffee1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee("1");
		int coffee = recipe.getAmtCoffee();
		assertEquals("Coffee should be 1", 1, coffee);
	}
	
	@Test
	public void testSetCoffee2() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee("0");
		int coffee = recipe.getAmtCoffee();
		assertEquals("Coffee should be 0", 0, coffee);
	}
	
	@Test
	public void testSetCoffee3() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtCoffee("-1");
		} catch(RecipeException e) {
			assertEquals("Units of coffee must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetCoffee4() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtCoffee("hello");
		} catch(RecipeException e) {
			assertEquals("Units of coffee must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetMilk1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtMilk("1");
		int milk = recipe.getAmtMilk();
		assertEquals("Milk should be 1", 1, milk);
	}
	
	@Test
	public void testSetMilk2() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtMilk("0");
		int milk = recipe.getAmtMilk();
		assertEquals("Milk should be 0", 0, milk);
	}
	
	@Test
	public void testSetMilk3() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtMilk("-1");
		} catch(RecipeException e) {
			assertEquals("Units of milk must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetMilk4() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtMilk("hello");
		} catch(RecipeException e) {
			assertEquals("Units of milk must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetSugar1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtSugar("1");
		int sugar = recipe.getAmtSugar();
		assertEquals("Sugar should be 1", 1, sugar);
	}
	
	@Test
	public void testSetSugar2() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setAmtSugar("0");
		int sugar = recipe.getAmtSugar();
		assertEquals("Sugar should be 0", 0, sugar);
	}
	
	@Test
	public void testSetSugar3() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtSugar("-1");
		} catch(RecipeException e) {
			assertEquals("Units of sugar must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetSugar4() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setAmtSugar("hello");
		} catch(RecipeException e) {
			assertEquals("Units of sugar must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetPrice1() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setPrice("1");
		int price = recipe.getPrice();
		assertEquals("Price should be 1", 1, price);
	}
	
	@Test
	public void testSetPrice2() throws RecipeException {
		Recipe recipe = new Recipe();
		recipe.setPrice("0");
		int price = recipe.getPrice();
		assertEquals("Price should be 0", 0, price);
	}
	
	@Test
	public void testSetPrice3() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setPrice("-1");
		} catch(RecipeException e) {
			assertEquals("Price must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testSetPrice4() throws RecipeException {
		Recipe recipe = new Recipe();
		try {
			recipe.setPrice("hello");
		} catch(RecipeException e) {
			assertEquals("Price must be a positive integer", e.getMessage());
		}
	}
	
	@Test
	public void testHashcode1() {
		Recipe recipe = new Recipe();
		recipe.setName("hello");
		int hashcode = recipe.hashCode();
		System.out.println(hashcode);
		assertEquals("Hashcode returned should be 99162353", 99162353, hashcode);
	}
	
	@Test
	public void testHashcode2() {
		Recipe recipe = new Recipe();
		int hashcode = recipe.hashCode();
		System.out.println(hashcode);
		assertEquals("Hashcode returned should be 31", 31, hashcode);
	}
	
	@Test
	public void testEquals1() {
		Recipe recipe = new Recipe();
		Recipe otherRecipe = null;
		boolean equals = recipe.equals(otherRecipe);
		assertFalse("It should be false due to null obj", equals);
	}
	
	@Test
	public void testEquals2() {
		Recipe recipe = new Recipe();
		Recipe otherRecipe = new Recipe();
		boolean equals = recipe.equals(otherRecipe);
		assertTrue("It should be true due to identical objects", equals);
	}
	
	@Test
	public void testEquals3() {
		Recipe recipe = new Recipe();
		Recipe otherRecipe = new Recipe();
		recipe.setName("hello");
		otherRecipe.setName("hello");
		boolean equals = recipe.equals(otherRecipe);
		assertTrue("It should be true due to identical objects", equals);
	}
	
	@Test
	public void testEquals4() {
		Recipe recipe = new Recipe();
		Recipe otherRecipe = new Recipe();
		recipe.setName("hi");
		otherRecipe.setName("hello");
		boolean equals = recipe.equals(otherRecipe);
		assertFalse("It should be false due to different names", equals);
	}
	
	@Test
	public void testEquals5() {
		Recipe recipe = new Recipe();
		Inventory inventory = new Inventory();
		boolean equals = recipe.equals(inventory);
		assertFalse("It should be false due to different classes", equals);
	}
	
	@Test
	public void testEquals6() {
		Recipe recipe = new Recipe();
		boolean equals = recipe.equals(recipe);
		assertTrue("It should be true due to identical objects", equals);
	}
}
