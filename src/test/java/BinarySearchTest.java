
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class BinarySearchTest {
  private int[] array = {2,12,14,25,54,67,89,96};
  private ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14,34,42,66,79,81,90,100));

  @Test
  void testbinarySearch1() {

    assertEquals(4, BinarySearch.binarySearch(array, 54));
  }
  @Test
  void testbinarySearch2() {
    
    assertEquals(-1, BinarySearch.binarySearch(array, -34));
  }

  @Test
  void testbinarySearch3() {
    
    assertEquals(2, BinarySearch.binarySearch(list, 42));
  }

  @Test
  void testbinarySearch4() {
    
    assertEquals(4, BinarySearch.binarySearch(array, 54));
  }

  @Test
  void testbinarySearch5() {
    
    assertEquals(7, BinarySearch.binarySearch(array, 96));
    assertEquals(0, BinarySearch.binarySearch(list, 14));
  }
  
  
  
  
  

}
