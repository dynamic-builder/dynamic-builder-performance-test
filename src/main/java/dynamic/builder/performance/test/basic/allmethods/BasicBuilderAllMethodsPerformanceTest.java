package dynamic.builder.performance.test.basic.allmethods;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.BasicObject;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.common.single.PerformanceTest;

public class BasicBuilderAllMethodsPerformanceTest implements PerformanceTest
{
    private final BasicBuilderInitStrategy initStrategy;
    private BasicBuilder builder;

    public BasicBuilderAllMethodsPerformanceTest(BasicBuilderInitStrategy initStrategy)
    {
        this.initStrategy = initStrategy;
    }

    @Override
    public String getTestName()
    {
        return "Basic Builder With All Methods Called For Implementation: " + initStrategy.getDescription();
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
    }

    @Override
    public void performTest()
    {
        BasicObject basicObject = buildObject(builder);
        callGetters(basicObject);
    }

    private static void callGetters(BasicObject basicObject)
    {
        basicObject.getStringValue();
        basicObject.getByteValue();
        basicObject.getIntValue();
        basicObject.getLongValue();
        basicObject.getDoubleValue();
    }

    private static BasicObject buildObject(BasicBuilder builder)
    {
        builder.stringValue("string");
        builder.byteValue((byte) 1);
        builder.intValue(2);
        builder.longValue(3L);
        builder.doubleValue(4.0);
        return builder.build();
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
