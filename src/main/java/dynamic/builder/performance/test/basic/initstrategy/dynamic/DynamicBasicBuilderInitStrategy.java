package dynamic.builder.performance.test.basic.initstrategy.dynamic;

import com.singleton.dynamic.builder.DynamicBuilderFactory;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;

public enum DynamicBasicBuilderInitStrategy implements BasicBuilderInitStrategy
{
    INSTANCE;

    @Override
    public String getDescription()
    {
        return "dynamic-builder";
    }

    @Override
    public BasicBuilder initBasicBuilder()
    {
        return new DynamicBuilderFactory().createBuilderForClass(BasicBuilder.class);
    }
}
