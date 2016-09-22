package dynamic.builder.performance.test.common.suite;

import java.util.Collection;

import dynamic.builder.performance.test.common.single.PerformanceTest;

public interface PerformanceTestSuite
{
    String getDescription();

    Collection<PerformanceTest> getPerformanceTests();
}
