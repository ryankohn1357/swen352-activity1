package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

import java.util.Arrays;

import org.junit.*;


public class RecipeBookTest extends TestCase {
	/* 5 different recipes and one similar (re) */
	private RecipeBook rb;
	private Recipe r;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	private Recipe re;
	private Recipe [] recipeArrayOf4;
	private final int NUM = 4;

	protected void setUp() throws Exception {
		
		rb = new RecipeBook();
		try{
			r = new Recipe();
			r.setName("r");
			r.setPrice("5");
			r.setAmtChocolate("5");
			r.setAmtCoffee("5");
			r.setAmtMilk("5");
			r.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		try{
			r2 = new Recipe();
			r2.setName("r2");
			r2.setPrice("5");
			r2.setAmtChocolate("6");
			r2.setAmtCoffee("5");
			r2.setAmtMilk("5");
			r2.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		try{
			r3 = new Recipe();
			r3.setName("r3");
			r3.setPrice("5");
			r3.setAmtChocolate("7");
			r3.setAmtCoffee("5");
			r3.setAmtMilk("5");
			r3.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		try{
			r4 = new Recipe();
			r4.setName("r4");
			r4.setPrice("5");
			r4.setAmtChocolate("8");
			r4.setAmtCoffee("5");
			r4.setAmtMilk("5");
			r4.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		try{
			r5 = new Recipe();
			r5.setName("r5");
			r5.setPrice("5");
			r5.setAmtChocolate("9");
			r5.setAmtCoffee("5");
			r5.setAmtMilk("5");
			r5.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		try{
			re = new Recipe();
			re.setName("r");
			re.setPrice("5");
			re.setAmtChocolate("5");
			re.setAmtCoffee("5");
			re.setAmtMilk("5");
			re.setAmtSugar("5");
		}catch(Exception ex) {
		}
		
		recipeArrayOf4 = new Recipe [NUM];
		recipeArrayOf4[0] = r;
		recipeArrayOf4[1] = r2;
		recipeArrayOf4[2] = r3;
		recipeArrayOf4[3] = r4;
		
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	//Proves that all four slots filled with recipes are properly placed
	@Test
	public void testaddRecipe() {
		rb.addRecipe(r);
		rb.addRecipe(r2);
		rb.addRecipe(r3);
		rb.addRecipe(r4);
		assertTrue(Arrays.equals(recipeArrayOf4, rb.getRecipes()));
	}
	
	//shows that you can not add more recipes than 4 in a recipe book
	@Test
	public void testaddRecipe2much() {
		rb.addRecipe(r);
		rb.addRecipe(r2);
		rb.addRecipe(r3);
		rb.addRecipe(r4);
		assertFalse(rb.addRecipe(r5));
	}
	
	//adds a recipe that is basically the same to r in a recipe book that has room
	@Test
	public void testaddRecipe3same() {
		rb.addRecipe(r);
		rb.addRecipe(r2);
		rb.addRecipe(r3);
		assertFalse(rb.addRecipe(re));
	}
	
	//a simple test to make sure other recipe book slots are empty
	@Test
	public void testaddRecipe4() {
		rb.addRecipe(r);
		Recipe [] test = rb.getRecipes();
		assertEquals(test[1], null);
	}
	
	//Makes sure it returns the proper string
	@Test
	public void testdeleteRecipe() {
		rb.addRecipe(r);
		assertEquals(rb.deleteRecipe(0), "r");
	}
	
	//Makes sure that recipe is actually deleted from recipe array
	@Test
	public void testdeleteRecipe2() {
		rb.addRecipe(r);
		rb.deleteRecipe(0);
		Recipe [] test = rb.getRecipes();
		assertEquals(test[0].toString(), "");
	}
	
	//Shows that when you try deleting a recipe that doesn't exist it returns null
	@Test
	public void testdeleteRecipe3() {
		assertEquals(rb.deleteRecipe(0), null);
	}
	
	//Makes sure other recipes are not deleted by the delete recipe method
	@Test
	public void testdeleteRecipe4() {
		rb.addRecipe(r);
		rb.addRecipe(r2);
		rb.deleteRecipe(0);
		Recipe [] test = rb.getRecipes();
		assertEquals(test[1].toString(), "r2");
	}
	
	//potential error: edit recipe changes the name to an empty string
	//This test returns the recipe edited which is good tho
	@Test
	public void testeditRecipe() {
		rb.addRecipe(r);
		assertEquals(rb.editRecipe(0, r2), "r");
		//Recipe [] test = rb.getRecipes();
		//assertEquals(test[0].toString(), "");
	}
	
	//The edited recipe name is now "" which should be "r2"
	@Test
	public void testeditRecipe2() {
		rb.addRecipe(r);
		assertEquals(rb.editRecipe(0, r2), "r");
		Recipe [] test = rb.getRecipes();
		assertEquals(test[0].toString(), "");
	}
	
	//Checks that edit recipe returns null when there is no recipe to edit
	@Test
	public void testeditRecipe3() {
		assertEquals(rb.editRecipe(0, r2), null);
	}
	
	//Tests editing a full recipebook at a middle index
	@Test
	public void testeditRecipe4() {
		rb.addRecipe(r);
		rb.addRecipe(r2);
		rb.addRecipe(r3);
		rb.addRecipe(r4);
		assertEquals(rb.editRecipe(1, r5), "r2");
	}

}
























