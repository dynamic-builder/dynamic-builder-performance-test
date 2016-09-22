package dynamic.builder.performance.test.common.suite;

import java.util.ArrayList;
import java.util.Collection;

import dynamic.builder.performance.test.basic.allmethods.AllMethodsTestSuite;
import dynamic.builder.performance.test.basic.buildmethod.BuildMethodOnlyTestSuite;
import dynamic.builder.performance.test.basic.gettersonly.GettersOnlyTestSuite;

public class PerformanceTestSuiteRunnerConfiguration
{
    public Collection<PerformanceTestSuite> getTestSuites()
    {
        Collection<PerformanceTestSuite> testSuites = new ArrayList<PerformanceTestSuite>();
        testSuites.add(new AllMethodsTestSuite());
        testSuites.add(new GettersOnlyTestSuite());
        testSuites.add(new BuildMethodOnlyTestSuite());
        return testSuites;
    }
}
