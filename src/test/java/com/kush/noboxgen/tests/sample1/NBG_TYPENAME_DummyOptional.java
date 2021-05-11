package com.kush.noboxgen.tests.sample1;

public class NBG_TYPENAME_DummyOptional<NBG_DATATYPE> {

    private final NBG_DATATYPE value;

    public NBG_TYPENAME_DummyOptional(NBG_DATATYPE value) {
        this.value = value;
    }

    public static <NBG_DATATYPE> NBG_TYPENAME_DummyOptional<NBG_DATATYPE> of(NBG_DATATYPE value) {
        return new NBG_TYPENAME_DummyOptional<NBG_DATATYPE>(value);
    }

    public static <NBG_DATATYPE> NBG_TYPENAME_DummyOptional<NBG_DATATYPE> empty() {
        return new NBG_TYPENAME_DummyOptional<NBG_DATATYPE>(null);
    }

    public NBG_DATATYPE get() {
        return value;
    }
}
