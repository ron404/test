package test2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ExpectedExceptionsTest {
	
    @Rule
    public ExpectedException thrown = ExpectedException.none();
     
    @Test
    public void verifiesTypeAndMessage() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Runtime exception occurred");

        throw new RuntimeException("Runtime exception occurred");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void exceptionExpected(){
        throw new IllegalArgumentException("catch me if you can");
    }

    

	@Rule
    public Timeout timeout = new Timeout(20   , null);
     
    @Test
    public void slowTestAskingForTrouble() throws InterruptedException {
        Thread.sleep(1000 * 60);
    }

    
}