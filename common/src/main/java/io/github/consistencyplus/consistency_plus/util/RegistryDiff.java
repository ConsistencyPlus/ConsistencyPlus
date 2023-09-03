package io.github.consistencyplus.consistency_plus.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class RegistryDiff {
	public static void run(Registry<?> registry, String name) {
		List<String> registered = registry.getKeys().stream()
				.map(RegistryKey::getValue)
				.filter(id -> id.getNamespace().equals(ConsistencyPlusMain.MOD_ID))
				.map(Identifier::toString)
				.toList();

		List<String> length = registered.stream().sorted(Comparator.comparingInt(String::length)).toList();
		ConsistencyPlusMain.LOGGER.info("a " + length.get(0));
		ConsistencyPlusMain.LOGGER.info("b " + length.get(length.size() - 1));

		List<String> required = getTxtLines(LoaderUtils.getGameDir().resolve(name + ".txt"));

		registered.forEach(entry -> {
			if (!required.contains(entry)) {
				ConsistencyPlusMain.LOGGER.error("Extra " + name + " registration: " + entry);
			}
		});
		required.forEach(entry -> {
			if (!registered.contains(entry)) {
				ConsistencyPlusMain.LOGGER.error("Missing " + name + " registration: " + entry);
			}
		});
	}

	private static List<String> getTxtLines(Path file) {
		try {
			return Files.readAllLines(file).stream().map(String::trim).toList();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
