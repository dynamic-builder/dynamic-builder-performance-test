package dynamic.builder.performance.test.common.suite;

import java.util.ArrayList;
import java.util.List;

import dynamic.builder.performance.test.common.single.PerformanceTest;
import dynamic.builder.performance.test.common.single.PerformanceTestResult;
import dynamic.builder.performance.test.common.single.PerformanceTestRunner;

public class PerformanceTestSuiteRunner
{
    private final PerformanceTestRunner testRunner = new PerformanceTestRunner();

    public List<PerformanceTestSuiteResult> runPerformanceTests(PerformanceTestSuiteRunnerConfiguration configuration)
    {
        List<PerformanceTestSuiteResult> results = new ArrayList<PerformanceTestSuiteResult>(configuration.getTestSuites().size());

        for (PerformanceTestSuite testSuite : configuration.getTestSuites())
        {
            List<PerformanceTestResult> testResults = new ArrayList<PerformanceTestResult>(testSuite.getPerformanceTests().size());
            for (PerformanceTest test : testSuite.getPerformanceTests())
            {
                testResults.add(testRunner.performTest(test));
            }
            results.add(new PerformanceTestSuiteResult(testResults, testSuite.getDescription()));
        }
        return results;
    }
}
