package dynamic.builder.performance.test.basic.initstrategy.autovalue;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;

public enum AutoValueBasicBuilderInitStrategy implements BasicBuilderInitStrategy
{
    INSTANCE;

    @Override
    public String getDescription()
    {
        return "auto value implementation";
    }

    @Override
    public BasicBuilder initBasicBuilder()
    {
        return BasicObjectAutoValue.builder();
    }
}
