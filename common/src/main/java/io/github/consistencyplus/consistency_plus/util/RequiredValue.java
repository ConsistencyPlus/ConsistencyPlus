package io.github.consistencyplus.consistency_plus.util;

public class RequiredValue<T> {
    private final String name;
    private T value;

    public RequiredValue(String name) {
        this.name = name;
    }

    public void set(T t) {
        if (this.value != null) {
            throw new IllegalStateException(name + " already set: " + value + " (Tried to set to " + t + ")");
        }
        this.value = t;
    }

    public T get() {
        if (this.value == null) {
            throw new IllegalStateException(name + " is not set!");
        }
        return value;
    }
}
