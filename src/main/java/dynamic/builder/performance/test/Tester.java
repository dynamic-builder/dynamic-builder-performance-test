package dynamic.builder.performance.test;

import java.util.List;

import dynamic.builder.performance.test.common.reporter.PerformanceTestSuiteReporter;
import dynamic.builder.performance.test.common.reporter.console.ConsolePerformanceTestSuiteReporter;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuiteResult;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuiteRunner;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuiteRunnerConfiguration;

public class Tester
{
    public static void main(String[] args)
    {
        PerformanceTestSuiteRunnerConfiguration configuration = new PerformanceTestSuiteRunnerConfiguration();
        PerformanceTestSuiteRunner runner = new PerformanceTestSuiteRunner();
        List<PerformanceTestSuiteResult> results = runner.runPerformanceTests(configuration);
        PerformanceTestSuiteReporter suiteReporter = new ConsolePerformanceTestSuiteReporter();
        suiteReporter.reportAll(results);
    }
}
