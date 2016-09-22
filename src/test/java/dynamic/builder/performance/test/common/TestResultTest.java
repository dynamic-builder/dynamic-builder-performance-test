package dynamic.builder.performance.test.common;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import dynamic.builder.performance.test.common.single.PerformanceTestResult;

/**
 * Test class for {@link PerformanceTestResult}.
 */
@SuppressWarnings({ "javadoc" })
public class TestResultTest
{
    @Test
    public void testGetTimePerIteration_correctValue()
    {
        PerformanceTestResult result = new PerformanceTestResult("test", 1000L, 20L, 3L);

        assertThat(result.getTimePerIteration(), is(50.0));
    }

    @Test
    public void testGetTimePerIteration_fractionalValue()
    {
        PerformanceTestResult result = new PerformanceTestResult("test", 1L, 2L, 3L);

        assertThat(result.getTimePerIteration(), is(0.5));
    }
}
