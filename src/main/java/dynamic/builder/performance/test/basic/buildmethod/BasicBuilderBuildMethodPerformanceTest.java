package dynamic.builder.performance.test.basic.buildmethod;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.common.single.PerformanceTest;

public class BasicBuilderBuildMethodPerformanceTest implements PerformanceTest
{
    private final BasicBuilderInitStrategy initStrategy;
    private BasicBuilder builder;

    public BasicBuilderBuildMethodPerformanceTest(BasicBuilderInitStrategy initStrategy)
    {
        this.initStrategy = initStrategy;
    }

    @Override
    public String getTestName()
    {
        return "BasicBuilder build method only called (values previously set) for Implementation: " + initStrategy.getDescription();
    }

    @Override
    public void performTestSetup()
    {
        // Do nothing
    }

    @Override
    public void performIterationSetup()
    {
        builder = initStrategy.initBasicBuilder();
        setValuesOnBuilder(builder);
    }

    @Override
    public void performTest()
    {
        builder.build();
    }

    private static void setValuesOnBuilder(BasicBuilder builder)
    {
        builder.stringValue("string");
        builder.byteValue((byte) 1);
        builder.intValue(2);
        builder.longValue(3L);
        builder.doubleValue(4.0);
    }

    @Override
    public void performIterationTearDown()
    {
        builder = null;
    }

    @Override
    public void performTestTearDown()
    {
        // Do nothing
    }
}
