package dynamic.builder.performance.test.basic.initstrategy;

import java.util.ArrayList;
import java.util.Collection;

import dynamic.builder.performance.test.basic.initstrategy.autovalue.AutoValueBasicBuilderInitStrategy;
import dynamic.builder.performance.test.basic.initstrategy.dynamic.DynamicBasicBuilderInitStrategy;
import dynamic.builder.performance.test.basic.initstrategy.implemented.ImplementedBasicBuilderInitStrategy;

public class BasicBuilderInitStrategyUtility
{
    public static Collection<BasicBuilderInitStrategy> getAllStrategies()
    {
        Collection<BasicBuilderInitStrategy> allInitStrategies = new ArrayList<BasicBuilderInitStrategy>();
        allInitStrategies.add(ImplementedBasicBuilderInitStrategy.INSTANCE);
        allInitStrategies.add(DynamicBasicBuilderInitStrategy.INSTANCE);
        allInitStrategies.add(AutoValueBasicBuilderInitStrategy.INSTANCE);
        return allInitStrategies;
    }
}
