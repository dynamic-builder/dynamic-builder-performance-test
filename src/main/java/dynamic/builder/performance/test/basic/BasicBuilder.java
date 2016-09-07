package dynamic.builder.performance.test.basic;

public interface BasicBuilder
{
    BasicBuilder stringValue(String stringValue);
    BasicBuilder byteValue(byte byteValue);
    BasicBuilder intValue(int intValue);
    BasicBuilder longValue(long longValue);
    BasicBuilder doubleValue(double doubleValue);
    BasicObject build();
}
