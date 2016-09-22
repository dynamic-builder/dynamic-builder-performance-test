package dynamic.builder.performance.test.basic.initstrategy.implemented;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.initstrategy.BasicBuilderInitStrategy;

public enum ImplementedBasicBuilderInitStrategy implements BasicBuilderInitStrategy
{
    INSTANCE;

    @Override
    public String getDescription()
    {
        return "pure java implementation";
    }

    @Override
    public BasicBuilder initBasicBuilder()
    {
        return new BasicObjectImpl.Builder();
    }
}
