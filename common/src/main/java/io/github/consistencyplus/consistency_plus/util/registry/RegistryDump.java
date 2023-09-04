package io.github.consistencyplus.consistency_plus.util.registry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class RegistryDump {
	public static void run() {
		export("blocks_new", Registries.BLOCK);
		export("items_new", Registries.ITEM);
	}

	private static void export(String name, Registry<?> registry) {
		try {
			Path gameDir = FabricLoader.getInstance().getGameDir();

			List<String> entries = new ArrayList<>();
			registry.getIds().forEach(id -> {
				if (id.getNamespace().equals("consistency_plus"))
					entries.add(id.toString());
			});

			entries.sort(Comparator.naturalOrder());
			Path outFile = gameDir.resolve(name + ".txt");
			String out = String.join("\n", entries);
			Files.deleteIfExists(outFile);
			Files.writeString(outFile, out, StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
