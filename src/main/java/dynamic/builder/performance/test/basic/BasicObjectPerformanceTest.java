package dynamic.builder.performance.test.basic;

import com.singleton.dynamic.builder.DynamicBuilderFactory;

import dynamic.builder.performance.test.basic.initstrategy.implemented.BasicObjectImpl;

public class BasicObjectPerformanceTest
{
    private static final int WARM_UP_ITERATIONS = 10000;
    private static final int ITERATIONS = 1000000;

    public static void main(String[] args)
    {
        // DYNAMIC
        for (int i = 0; i < WARM_UP_ITERATIONS; i++)
        {
            performDynamicBuilderTest();
        }

        long dynamicBuilderBeginTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++)
        {
            performDynamicBuilderTest();
        }
        long dynamicBuilderEndTime = System.nanoTime();
        long dynamicTotalTime = dynamicBuilderEndTime - dynamicBuilderBeginTime;

        System.out.println("Dynamic Total Time: " + dynamicTotalTime);
        System.out.println("Dynamic Average Time: " + dynamicTotalTime / ITERATIONS);

        // IMPLEMENTED
        for (int i = 0; i < WARM_UP_ITERATIONS; i++)
        {
            performImplementedBuilderTest();
        }

        long implementedBuilderBeginTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++)
        {
            performImplementedBuilderTest();
        }
        long implementedBuilderEndTime = System.nanoTime();
        long implementedTotalTime = implementedBuilderEndTime - implementedBuilderBeginTime;

        System.out.println("Implemented Total Time: " + implementedTotalTime);
        System.out.println("Implemented Average Time: " + implementedTotalTime / ITERATIONS);
    }

    private static void performImplementedBuilderTest()
    {
        BasicBuilder builder = initImplementedBuilder();
        BasicObject object = buildObject(builder);
        callGetters(object);
    }

    private static void performDynamicBuilderTest()
    {
        BasicBuilder builder = initDynamicBuilder();
        BasicObject object = buildObject(builder);
        callGetters(object);
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

    private static BasicBuilder initDynamicBuilder()
    {
        return new DynamicBuilderFactory().createBuilderForClass(BasicBuilder.class);
    }

    private static BasicBuilder initImplementedBuilder()
    {
        return new BasicObjectImpl.Builder();
    }
}
