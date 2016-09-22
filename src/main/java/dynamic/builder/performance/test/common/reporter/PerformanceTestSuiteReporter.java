package dynamic.builder.performance.test.common.reporter;

import java.util.Collection;

import dynamic.builder.performance.test.common.suite.PerformanceTestSuiteResult;

public interface PerformanceTestSuiteReporter
{
    void report(PerformanceTestSuiteResult result);

    void reportAll(Collection<PerformanceTestSuiteResult> results);
}
