package dynamic.builder.performance.test.basic.implemented;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.BasicObject;

public class BasicObjectImpl implements BasicObject
{
    private final String stringValue;
    private final byte byteValue;
    private final int intValue;
    private final long longValue;
    private final double doubleValue;

    private BasicObjectImpl(Builder builder)
    {
        this.stringValue = builder.stringValue;
        this.byteValue = builder.byteValue;
        this.intValue = builder.intValue;
        this.longValue = builder.longValue;
        this.doubleValue = builder.doubleValue;
    }

    public String getStringValue()
    {
        return stringValue;
    }

    public byte getByteValue()
    {
        return byteValue;
    }

    public int getIntValue()
    {
        return intValue;
    }

    public long getLongValue()
    {
        return longValue;
    }

    public double getDoubleValue()
    {
        return doubleValue;
    }

    public static class Builder implements BasicBuilder
    {
        private String stringValue;
        private byte byteValue;
        private int intValue;
        private long longValue;
        private double doubleValue;

        public BasicBuilder stringValue(String stringValue)
        {
            this.stringValue = stringValue;
            return this;
        }

        public BasicBuilder byteValue(byte byteValue)
        {
            this.byteValue = byteValue;
            return this;
        }

        public BasicBuilder intValue(int intValue)
        {
            this.intValue = intValue;
            return this;
        }

        public BasicBuilder longValue(long longValue)
        {
            this.longValue = longValue;
            return this;
        }

        public BasicBuilder doubleValue(double doubleValue)
        {
            this.doubleValue = doubleValue;
            return this;
        }

        public BasicObject build()
        {
            return new BasicObjectImpl(this);
        }
    }
}
