package dynamic.builder.performance.test.basic.initstrategy;

import dynamic.builder.performance.test.basic.BasicBuilder;

public interface BasicBuilderInitStrategy
{
    String getDescription();

    BasicBuilder initBasicBuilder();
}
