import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by WINDOWS 8.1 on 04/05/2018.
 */
public class TestSeries {

    @Test
    public void verificarPasos() {
        int[] expectedResults = new int[3];
        expectedResults[0] = 2;
        expectedResults[1] = 4;
        expectedResults[2] = 6;

        int[] actualResults = Series.pares(3);
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals("No son iguales",expectedResults[i],actualResults[i]);
        }

    }


}
