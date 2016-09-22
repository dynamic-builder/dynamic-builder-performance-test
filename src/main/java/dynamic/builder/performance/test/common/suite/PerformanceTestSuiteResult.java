package dynamic.builder.performance.test.common.suite;

import java.util.Collection;

import dynamic.builder.performance.test.common.single.PerformanceTestResult;

public class PerformanceTestSuiteResult
{
    private final Collection<PerformanceTestResult> results;
    private final String testSuiteDescription;

    public PerformanceTestSuiteResult(Collection<PerformanceTestResult> results, String description)
    {
        this.results = results;
        this.testSuiteDescription = description;
    }

    public Collection<PerformanceTestResult> getResults()
    {
        return results;
    }

    public String getTestSuiteDescription()
    {
        return testSuiteDescription;
    }
}
