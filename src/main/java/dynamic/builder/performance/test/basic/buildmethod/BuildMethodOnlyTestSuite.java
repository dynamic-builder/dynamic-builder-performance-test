package dynamic.builder.performance.test.basic.buildmethod;

import java.util.ArrayList;
import java.util.Collection;

import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategyUtility;
import dynamic.builder.performance.test.common.single.PerformanceTest;
import dynamic.builder.performance.test.common.suite.PerformanceTestSuite;

public class BuildMethodOnlyTestSuite implements PerformanceTestSuite
{
    @Override
    public String getDescription()
    {
        return "Test Suite for calling build method only on the builder for each implementation approach";
    }

    @Override
    public Collection<PerformanceTest> getPerformanceTests()
    {
        Collection<PerformanceTest> performanceTests = new ArrayList<PerformanceTest>();
        for (BasicBuilderInitStrategy strategy : BasicBuilderInitStrategyUtility.getAllStrategies())
        {
            performanceTests.add(new BasicBuilderBuildMethodPerformanceTest(strategy));
        }
        return performanceTests;
    }

}
