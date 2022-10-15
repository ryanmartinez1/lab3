import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { };
    int[] input3 = {3,2,1};
    int[] input4 = {5,8,4,0};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ }, input2);
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{1,2,3}, input3);
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{0,4,8,5},input4);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3};
    int[] input3 = {3,2,1};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{1,2,3}, ArrayExamples.reversed(input3));
  }

  @Test 
  public void averageWithoutLowest(){
    double[] input1 = {3};
    double[] input2 = { };
    double[] input3 = {3.0,2.0,2.0};
    double[] input4 = {5,8,5,1};
    assertEquals(0.0 , ArrayExamples.averageWithoutLowest(input1),0);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2),0);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input3),0);
    assertEquals(6, ArrayExamples.averageWithoutLowest(input4),0);

    
	}


}
