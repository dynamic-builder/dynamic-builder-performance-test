package dynamic.builder.performance.test.common.reporter.console;

import java.util.Collection;

import dynamic.builder.performance.test.common.reporter.PerformanceTestReporter;
import dynamic.builder.performance.test.common.single.PerformanceTestResult;

public class ConsolePerformanceTestReporter implements PerformanceTestReporter
{
    private final String endOfLine = System.getProperty("line.separator");

    public void report(PerformanceTestResult result)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("****************************************************************").append(endOfLine);
        sb.append("Test Results for ").append(result.getTestName()).append(endOfLine);
        sb.append("****************************************************************").append(endOfLine);

        sb.append("Time per iteration: ").append(result.getTimePerIteration()).append(endOfLine);
        sb.append("Iterations: ").append(result.getIterations()).append(endOfLine);
        sb.append("Total Duration Of Test: ").append(result.getTotalRunTime()).append(endOfLine);
        sb.append("Total Elapsed Time (include setup/teardown/etc): ").append(result.getWholeTestTime()).append(endOfLine);
        sb.append(endOfLine);
        System.out.println(sb.toString());
    }

    public void reportAll(Collection<PerformanceTestResult> results)
    {
        for (PerformanceTestResult result : results)
        {
            report(result);
        }
    }

}
