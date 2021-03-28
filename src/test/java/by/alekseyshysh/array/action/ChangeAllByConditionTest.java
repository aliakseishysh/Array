package by.alekseyshysh.array.action;

import org.testng.Assert;
import org.testng.annotations.Test;

import by.alekseyshysh.array.action.impl.ArrayChangeElementsByConditionAction;
import by.alekseyshysh.array.entity.IntArray;

public class ChangeAllByConditionTest {
	
	private ArrayChangeElementsByConditionInterface changeElements = new ArrayChangeElementsByConditionAction();
	
	@Test
	public void changeAllGreaterThenZeroTest() {
		IntArray actual = new IntArray(new int[] {-3,-2,-1,0,1,2,3});
		IntArray expected = new IntArray(new int[] {-3,-2,-1,0,-42,-42,-42});
		changeElements.changeAllByCondition(e -> e > 0, actual, -42);
		Assert.assertEquals(expected.equals(actual), true);
	}
	@Test
	public void changeAllLessThenZeroTest() {
		IntArray actual = new IntArray(new int[] {-3,-2,-1,0,1,2,3});
		IntArray expected = new IntArray(new int[] {42,42,42,0,1,2,3});
		changeElements.changeAllByCondition(e -> e < 0, actual, 42);
		Assert.assertEquals(expected.equals(actual), true);
	}
	@Test
	public void changeAllGreaterThenZeroWithStreamTest() {
		IntArray actual = new IntArray(new int[] {-3,-2,-1,0,1,2,3});
		IntArray expected = new IntArray(new int[] {-3,-2,-1,0,-42,-42,-42});
		changeElements.changeAllByConditionWithStream(e -> e > 0, actual, -42);
		System.out.println(actual.toString() + " : " +expected.toString());
		Assert.assertEquals(expected.equals(actual), true);
	}
	@Test
	public void changeAllLessThenZeroWithStreamTest() {
		IntArray actual = new IntArray(new int[] {-3,-2,-1,0,1,2,3});
		IntArray expected = new IntArray(new int[] {42,42,42,0,1,2,3});
		changeElements.changeAllByConditionWithStream(e -> e < 0, actual, 42);
		Assert.assertEquals(expected.equals(actual), true);
	}
}
