package dynamic.builder.performance.test.common.reporter;

import java.util.Collection;

import dynamic.builder.performance.test.common.single.PerformanceTestResult;

public interface PerformanceTestReporter
{
    void report(PerformanceTestResult result);

    void reportAll(Collection<PerformanceTestResult> results);
}
