package edu.ncsu.csc326.coffeemaker;
import org.junit.*;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {	
	
	private Inventory inventory;
	private Recipe doableRecipe; // a recipe for which the inventory has enough ingredients
	private Recipe missingCoffeeRecipe;
	private Recipe missingChocolateRecipe;
	private Recipe missingMilkRecipe;
	private Recipe missingSugarRecipe;
	private Recipe chocolateRecipe;
	private Recipe coffeeRecipe;
	private Recipe milkRecipe;
	private Recipe sugarRecipe;

	private final int DEFAULT_AMT = 15;
	private final String DEFAULT_AMT_STR = "15";
	private String expectedInventoryString;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		inventory = new Inventory();
		doableRecipe = new Recipe();
		missingCoffeeRecipe = new Recipe();
		missingChocolateRecipe = new Recipe();
		missingMilkRecipe = new Recipe();
		missingSugarRecipe = new Recipe();
		chocolateRecipe = new Recipe();
		coffeeRecipe = new Recipe();
		milkRecipe = new Recipe();
		sugarRecipe = new Recipe();

		missingCoffeeRecipe.setAmtCoffee(Integer.toString(DEFAULT_AMT + 1));
		missingChocolateRecipe.setAmtChocolate(Integer.toString(DEFAULT_AMT + 1));
		missingMilkRecipe.setAmtMilk(Integer.toString(DEFAULT_AMT + 1));
		missingSugarRecipe.setAmtSugar(Integer.toString(DEFAULT_AMT + 1));
		
		chocolateRecipe.setAmtChocolate("1");
		coffeeRecipe.setAmtCoffee("1");
		milkRecipe.setAmtMilk("1");
		sugarRecipe.setAmtSugar("1");
		
		expectedInventoryString = "Coffee: " + DEFAULT_AMT_STR + "\nMilk: " + DEFAULT_AMT_STR +
				"\nSugar: " + DEFAULT_AMT_STR + "\nChocolate: " + DEFAULT_AMT_STR + "\n";
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetChocolate() throws Exception {
		int chocolate = inventory.getChocolate();
		assertEquals(chocolate, DEFAULT_AMT);
	}
	
	@Test
	public void testSetChocolateHigher() throws Exception {
		inventory.setChocolate(1);
		assertEquals(inventory.getChocolate(), 1);
	}
		
	@Test
	public void testSetChocolateLower() throws Exception {
		inventory.setChocolate(-1);
		assertEquals(inventory.getChocolate(), DEFAULT_AMT);
	}
	
	@Test
	public void testSetChocolate() throws Exception {
		inventory.setChocolate(0);
		assertEquals(inventory.getChocolate(), 0);
	}
	
	@Test
	public void testAddChocolateValidStringValidAmount() throws Exception {
		try {
			inventory.addChocolate("0");
			assertEquals(inventory.getChocolate(), DEFAULT_AMT);
		}
		catch(Exception ex) {
			fail("Valid string '0' failed to add chocolate");
		}
	}
	
	@Test
	public void testAddChocolateValidStringValidAmountUpper() throws Exception {
		try {
			inventory.addChocolate("1");
			assertEquals(inventory.getChocolate(), DEFAULT_AMT + 1);
		}
		catch(Exception ex) {
			fail("Valid string '1' failed to add chocolate");
		}
	}
	
	@Test
	public void testAddChocolateInvalidString() throws Exception {
		try {
			inventory.addChocolate("chocolate");
			fail("Inputting invalid string 'chocolate' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getChocolate(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testAddChocolateValidStringInvalidAmount() throws Exception {
		try {
			inventory.addChocolate("-1");
			fail("Inputting invalid amount '-1' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getChocolate(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testGetCoffee() throws Exception {
		int coffee = inventory.getCoffee();
		assertEquals(coffee, DEFAULT_AMT);
	}
	
	@Test
	public void testSetCoffeeHigher() throws Exception {
		inventory.setCoffee(1);
		assertEquals(inventory.getCoffee(), 1);
	}
		
	@Test
	public void testSetCoffeeLower() throws Exception {
		inventory.setCoffee(-1);
		assertEquals(inventory.getCoffee(), DEFAULT_AMT);
	}
	
	@Test
	public void testSetCoffee() throws Exception {
		inventory.setCoffee(0);
		assertEquals(inventory.getCoffee(), 0);
	}
	
	@Test
	public void testAddCoffeeValidStringValidAmount() throws Exception {
		try {
			inventory.addCoffee("0");
			assertEquals(inventory.getCoffee(), DEFAULT_AMT);
		}
		catch(Exception ex) {
			fail("Valid string '0' failed to add coffee");
		}
	}
	
	@Test
	public void testAddCoffeeValidStringValidAmountUpper() throws Exception {
		try {
			inventory.addCoffee("1");
			assertEquals(inventory.getCoffee(), DEFAULT_AMT + 1);
		}
		catch(Exception ex) {
			fail("Valid string '1' failed to add coffee");
		}
	}
	
	@Test
	public void testAddCoffeeInvalidString() throws Exception {
		try {
			inventory.addCoffee("coffee");
			fail("Inputting invalid string 'coffee' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getCoffee(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testAddCoffeeValidStringInvalidAmount() throws Exception {
		try {
			inventory.addCoffee("-1");
			fail("Inputting invalid amount '-1' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getCoffee(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testGetMilk() throws Exception {
		int milk = inventory.getMilk();
		assertEquals(milk, DEFAULT_AMT);
	}
	
	@Test
	public void testSetMilkHigher() throws Exception {
		inventory.setMilk(1);
		assertEquals(inventory.getMilk(), 1);
	}
		
	@Test
	public void testSetMilkLower() throws Exception {
		inventory.setMilk(-1);
		assertEquals(inventory.getMilk(), DEFAULT_AMT);
	}
	
	@Test
	public void testSetMilk() throws Exception {
		inventory.setMilk(0);
		assertEquals(inventory.getMilk(), 0);
	}
	
	@Test
	public void testAddMilkValidStringValidAmount() throws Exception {
		try {
			inventory.addMilk("0");
			assertEquals(inventory.getMilk(), DEFAULT_AMT);
		}
		catch(Exception ex) {
			fail("Valid string '0' failed to add milk");
		}
	}
	
	@Test
	public void testAddMilkValidStringValidAmountUpper() throws Exception {
		try {
			inventory.addMilk("1");
			assertEquals(inventory.getMilk(), DEFAULT_AMT + 1);
		}
		catch(Exception ex) {
			fail("Valid string '1' failed to add milk");
		}
	}
	
	@Test
	public void testAddMilkInvalidString() throws Exception {
		try {
			inventory.addMilk("milk");
			fail("Inputting invalid string 'milk' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getMilk(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testAddMilkValidStringInvalidAmount() throws Exception {
		try {
			inventory.addMilk("-1");
			fail("Inputting invalid amount '-1' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getMilk(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testGetSugar() throws Exception {
		int sugar = inventory.getSugar();
		assertEquals(sugar, DEFAULT_AMT);
	}
	
	@Test
	public void testSetSugarHigher() throws Exception {
		inventory.setSugar(1);
		assertEquals(inventory.getSugar(), 1);
	}
		
	@Test
	public void testSetSugarLower() throws Exception {
		inventory.setSugar(-1);
		assertEquals(inventory.getSugar(), DEFAULT_AMT);
	}
	
	@Test
	public void testSetSugar() throws Exception {
		inventory.setSugar(0);
		assertEquals(inventory.getSugar(), 0);
	}
	
	@Test
	public void testAddSugarValidStringValidAmount() throws Exception {
		try {
			inventory.addSugar("0");
			assertEquals(inventory.getSugar(), DEFAULT_AMT);
		}
		catch(Exception ex) {
			fail("Valid string '0' failed to add sugar");
		}
	}
	
	@Test
	public void testAddSugarValidStringValidAmountUpper() throws Exception {
		try {
			inventory.addSugar("1");
			assertEquals(inventory.getSugar(), DEFAULT_AMT + 1);
		}
		catch(Exception ex) {
			fail("Valid string '1' failed to add sugar");
		}
	}
	
	@Test
	public void testAddSugarInvalidString() throws Exception {
		try {
			inventory.addSugar("sugar");
			fail("Inputting invalid string 'sugar' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getSugar(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testAddSugarValidStringInvalidAmount() throws Exception {
		try {
			inventory.addSugar("-1");
			fail("Inputting invalid amount '-1' did not cause method to throw exception");
		}
		catch(Exception ex) {
			assertEquals(inventory.getSugar(), DEFAULT_AMT);
		}
	}
	
	@Test
	public void testEnoughIngredientsHasEnough() throws Exception {
		boolean hasEnough = inventory.enoughIngredients(doableRecipe);
		assertEquals(hasEnough, true);
	}
	
	@Test
	public void testEnoughIngredientsMissingChocolate() throws Exception {
		boolean hasEnough = inventory.enoughIngredients(missingChocolateRecipe);
		assertEquals(hasEnough, false);
	}
	
	@Test
	public void testEnoughIngredientsMissingCoffee() throws Exception {
		boolean hasEnough = inventory.enoughIngredients(missingCoffeeRecipe);
		assertEquals(hasEnough, false);
	}
	
	@Test
	public void testEnoughIngredientsMissingMilk() throws Exception {
		boolean hasEnough = inventory.enoughIngredients(missingMilkRecipe);
		assertEquals(hasEnough, false);
	}
	
	@Test
	public void testEnoughIngredientsMissingSugar() throws Exception {
		boolean hasEnough = inventory.enoughIngredients(missingSugarRecipe);
		assertEquals(hasEnough, false);
	}
	
	@Test
	public void testUseIngredientsMissingIngredients() throws Exception {
		boolean usedIngredients = inventory.useIngredients(missingChocolateRecipe);
		assertEquals(usedIngredients, false);
	}
	
	@Test
	public void testUseIngredientsIngredientsUsed() throws Exception {
		boolean usedIngredients = inventory.useIngredients(chocolateRecipe);
		assertEquals(usedIngredients, true);
	}
	
	@Test
	public void testUseIngredientsChocolateUsed() throws Exception {
		inventory.useIngredients(chocolateRecipe);
		assertEquals(inventory.getChocolate(), DEFAULT_AMT - chocolateRecipe.getAmtChocolate());
	}
	
	@Test
	public void testUseIngredientsCoffeeUsed() throws Exception {
		inventory.useIngredients(coffeeRecipe);
		assertEquals(inventory.getCoffee(), DEFAULT_AMT - coffeeRecipe.getAmtCoffee());
	}
	
	@Test
	public void testUseIngredientsMilkUsed() throws Exception {
		inventory.useIngredients(milkRecipe);
		assertEquals(inventory.getMilk(), DEFAULT_AMT - milkRecipe.getAmtMilk());
	}
	
	@Test
	public void testUseIngredientsSugarUsed() throws Exception {
		inventory.useIngredients(sugarRecipe);
		assertEquals(inventory.getSugar(), DEFAULT_AMT - sugarRecipe.getAmtSugar());
	}
	
	@Test
	public void testToString() throws Exception {		
		assertEquals(expectedInventoryString, inventory.toString());
	}
}
