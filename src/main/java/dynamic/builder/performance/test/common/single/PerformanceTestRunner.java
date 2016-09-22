package dynamic.builder.performance.test.common.single;

public class PerformanceTestRunner
{
    private static final long WARM_UP_ITERATIONS = 10000;
    private static final long ITERATIONS = 500000;

    public PerformanceTestResult performTest(PerformanceTest test)
    {
        long totalTestNanos = 0;
        long wholeTestStartNanos = System.nanoTime();
        test.performTestSetup();

        for (int i = 0; i < WARM_UP_ITERATIONS; i++)
        {
            test.performIterationSetup();
            test.performTest();
            test.performIterationTearDown();
        }

        for (int i = 0; i < ITERATIONS; i++)
        {
            test.performIterationSetup();
            long iterationStart = System.nanoTime();
            test.performTest();
            long iterationEnd = System.nanoTime();
            totalTestNanos += (iterationEnd - iterationStart);
            test.performIterationTearDown();
        }
        test.performTestTearDown();
        long wholeTestEndNanos = System.nanoTime();
        long wholeTestTimeNanos = wholeTestEndNanos - wholeTestStartNanos;

        return new PerformanceTestResult(test.getTestName(), totalTestNanos, ITERATIONS, wholeTestTimeNanos);
    }
}
