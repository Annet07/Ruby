import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void checkString() {


        String str = "1";

        for (int i = 0; i < 5; i++) {

            NString nString = new NString(str);

            str = nString.returnNewString();

        }

        Assert.assertEquals("312211", str);
    }

}
