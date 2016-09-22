package dynamic.builder.performance.test.common.single;

public interface PerformanceTest
{
    public abstract String getTestName();

    public abstract void performTestSetup();

    public abstract void performIterationSetup();

    public abstract void performTest();

    public abstract void performIterationTearDown();

    public abstract void performTestTearDown();
}
