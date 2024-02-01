import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversed1() {
    int[] input1 = new int[]{1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace1() {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(arr);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] averageTestArr = new double[]{2.0, 2.0, 3.0, 4.0, 5.0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(averageTestArr), 0.00001);
  }

}
