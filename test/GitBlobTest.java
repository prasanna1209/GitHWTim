import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GitBlobTest {

	@Test
	public void testBlob() {
		GitBlob b = new GitBlob("the data");
		assertEquals("the data", b.getData());
	}

}
