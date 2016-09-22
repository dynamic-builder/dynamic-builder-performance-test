package dynamic.builder.performance.test.basic.gettersonly;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.BasicObject;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;
import dynamic.builder.performance.test.common.single.PerformanceTest;

public class BasicBuilderGettersOnlyPerformanceTest implements PerformanceTest
{
    private final BasicBuilderInitStrategy initStrategy;
    private BasicObject builtObject;

    public BasicBuilderGettersOnlyPerformanceTest(BasicBuilderInitStrategy initStrategy)
    {
        this.initStrategy = initStrategy;
    }

    @Override
    public String getTestName()
    {
        return "Built Object With Getter Methods Called For Implementation: " + initStrategy.getDescription();
    }

    @Override
    public void performTestSetup()
    {
    }

    @Override
    public void performIterationSetup()
    {
        BasicBuilder basicBuilder = initStrategy.initBasicBuilder();
        builtObject = buildObject(basicBuilder);
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
    public void performTest()
    {
        callGetters(builtObject);
    }

    private static void callGetters(BasicObject basicObject)
    {
        basicObject.getStringValue();
        basicObject.getByteValue();
        basicObject.getIntValue();
        basicObject.getLongValue();
        basicObject.getDoubleValue();
    }

    @Override
    public void performIterationTearDown()
    {
        builtObject = null;

    }

    @Override
    public void performTestTearDown()
    {
    }
}
