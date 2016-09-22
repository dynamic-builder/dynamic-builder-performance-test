package dynamic.builder.performance.test.basic.initstrategy.autovalue;

import com.google.auto.value.AutoValue;

import dynamic.builder.performance.test.basic.BasicBuilder;
import dynamic.builder.performance.test.basic.BasicObject;

@AutoValue
abstract class BasicObjectAutoValue implements BasicObject
{
    public abstract String getStringValue();

    public abstract byte getByteValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract double getDoubleValue();

    static Builder builder()
    {
        return new AutoValue_BasicObjectAutoValue.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder implements BasicBuilder
    {
        public abstract Builder stringValue(String stringValue);

        public abstract Builder byteValue(byte byteValue);

        public abstract Builder intValue(int intValue);

        public abstract Builder longValue(long longValue);

        public abstract Builder doubleValue(double doubleValue);

        public abstract BasicObjectAutoValue build();
    }
}
