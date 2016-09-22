package dynamic.builder.performance.test.common.reporter.console;

import java.util.Collection;

import dynamic.builder.performance.test.common.reporter.PerformanceTestSuiteReporter;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuiteResult;

public class ConsolePerformanceTestSuiteReporter implements PerformanceTestSuiteReporter
{
    private final ConsolePerformanceTestReporter testReporter = new ConsolePerformanceTestReporter();
    private final String endOfLine = System.getProperty("line.separator");

    public void report(PerformanceTestSuiteResult result)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("==============================================================================").append(endOfLine);
        sb.append("TEST SUITE: ").append(result.getTestSuiteDescription()).append(endOfLine);
        sb.append("==============================================================================").append(endOfLine);
        System.out.print(sb.toString());

        testReporter.reportAll(result.getResults());
    }

    public void reportAll(Collection<PerformanceTestSuiteResult> results)
    {
        for (PerformanceTestSuiteResult result : results)
        {
            report(result);
        }
    }
}
