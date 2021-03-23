import static org.junit.jupiter.api.Assertions.*;

pulbic class orderDietest{
	
	@Test
	public void test( ) {
		DiceBag dieB = new DiceBag();
		dieB.addToken(new orderDie("a die", "red"));
		string output = dieB.toString():
		assertEquals(" there is a dice \n", output);
	}
	@Test
	public void test( ) {
		DiceBag dieB = new DiceBag();
		dieB.addToken(new orderDie("a die", "red"));
		dieB.addToken(new orderDie("a die", "red"));
		dieB.addToken(new orderDie("a die", "Blue"));
		dieB.addToken(new orderDie("a die", "Blue"));
		dieB.addToken(new orderDie("a die", "Blue"));
		string output = dieB.getColorsInBag():
		assertEquals(" red2\n Blue: 2", output);
	}
}
