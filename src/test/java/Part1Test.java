
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Part1Test {

    @Test
    public void testBlob() {
        GitBlob b = new GitBlob("the data");
        assertEquals("the data", b.getData());
    }

}
