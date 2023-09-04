package io.github.consistencyplus.consistency_plus.util;

import java.util.function.Function;

import org.jetbrains.annotations.Nullable;

import net.minecraft.util.DyeColor;

public class ColoredSet<T> {
	public static final int SIZE = DyeColor.values().length + 1;

	private final T[] values;

	private ColoredSet(T[] values) {
		this.values = values;
	}

	public T get(@Nullable DyeColor color) {
		return values[getIndex(color)];
	}

	public T getColorless() {
		return get(null);
	}

	public static <T> ColoredSet<T> of(Function<DyeColor, T> factory) {
		//noinspection unchecked
		T[] values = (T[]) new Object[SIZE];
		values[0] = factory.apply(null);
		for (DyeColor color : DyeColor.values()) {
			int index = color.ordinal() + 1;
			values[index] = factory.apply(color);
		}
		return new ColoredSet<>(values);
	}

	private static int getIndex(@Nullable DyeColor color) {
		return color == null ? 0 : color.ordinal() + 1;
	}
}
