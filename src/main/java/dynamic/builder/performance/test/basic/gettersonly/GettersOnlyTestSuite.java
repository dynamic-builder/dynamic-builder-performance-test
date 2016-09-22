package dynamic.builder.performance.test.basic.gettersonly;

import java.util.ArrayList;
import java.util.Collection;

import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategyUtility;
import dynamic.builder.performance.test.common.single.PerformanceTest;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuite;

public class GettersOnlyTestSuite implements PerformanceTestSuite
{
    @Override
    public String getDescription()
    {
        return "Test Suite for calling getter methods only on the built object for each implementation approach";
    }

    @Override
    public Collection<PerformanceTest> getPerformanceTests()
    {
        Collection<PerformanceTest> performanceTests = new ArrayList<PerformanceTest>();
        for (BasicBuilderInitStrategy strategy : BasicBuilderInitStrategyUtility.getAllStrategies())
        {
            performanceTests.add(new BasicBuilderGettersOnlyPerformanceTest(strategy));
        }
        return performanceTests;
    }
}
