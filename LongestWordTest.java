import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class LongestWordTest {

    /* PassingLongestStringTest to test that the method
     longestString is passing the test case when the values 
     returned are correct*/
	@Test
	public void PassingLongestStringTest() {
        String testString="The cow jumped over the moon";
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(6,"jumped");
        assertEquals(map,LongestWord.longestString(testString));
    }
    
     /* FailingLongestStringTest to test that 
     the method longestString is failing 
     when the values returned are incorrect*/
    @Test
	public void FailingLongestStringTest() {
        String testString="The cow jumped over the moon";
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(4,"over");
        assertNotEquals(map,LongestWord.longestString(testString));
	}
}

