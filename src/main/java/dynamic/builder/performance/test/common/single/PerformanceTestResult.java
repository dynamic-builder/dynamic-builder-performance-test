package dynamic.builder.performance.test.common.single;

public class PerformanceTestResult
{
    private final String testName;
    private final long totalRunTime;
    private final long iterations;
    private final long wholeTestTime;

    public PerformanceTestResult(String testName, long totalRunTime, long iterations, long wholeTestTime)
    {
        this.testName = testName;
        this.totalRunTime = totalRunTime;
        this.iterations = iterations;
        this.wholeTestTime = wholeTestTime;
    }

    public String getTestName()
    {
        return testName;
    }

    public long getTotalRunTime()
    {
        return totalRunTime;
    }

    public long getIterations()
    {
        return iterations;
    }

    public double getTimePerIteration()
    {
        return (double) totalRunTime / iterations;
    }

    public long getWholeTestTime()
    {
        return wholeTestTime;
    }
}