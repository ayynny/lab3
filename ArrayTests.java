import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3,4,9,1,2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2,1,9,4,3}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 =  {3,4,5};
    assertArrayEquals(new int[]{5,4,3}, ArrayExamples.reversed(input1));
  }
}
