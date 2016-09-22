package dynamic.builder.performance.test.basic.allmethods;

import java.util.ArrayList;
import java.util.Collection;

import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategyUtility;
import dynamic.builder.performance.test.common.single.PerformanceTest;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuite;

public class AllMethodsTestSuite implements PerformanceTestSuite
{
    public String getDescription()
    {
        return "Test Suite for calling all methods on the builder and built object for each implementation approach";
    }

    public Collection<PerformanceTest> getPerformanceTests()
    {
        Collection<PerformanceTest> performanceTests = new ArrayList<PerformanceTest>();
        for (BasicBuilderInitStrategy strategy : BasicBuilderInitStrategyUtility.getAllStrategies())
        {
            performanceTests.add(new BasicBuilderAllMethodsPerformanceTest(strategy));
        }
        return performanceTests;
    }

}
