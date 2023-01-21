package io.github.consistencyplus.consistency_plus;

import net.minecraftforge.forgespi.locating.IModFile;
import net.minecraftforge.resource.PathPackResources;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

// based on Create's copper legacy pack impl
public class ModFilePackResources extends PathPackResources {
	protected final IModFile modFile;
	protected final String sourcePath;

	public ModFilePackResources(String name, IModFile modFile, String sourcePath) {
		super(name, modFile.findResource(sourcePath));
		this.modFile = modFile;
		this.sourcePath = sourcePath;
	}

	@Override
	@NotNull
	protected Path resolve(String... paths) {
		String[] allPaths = new String[paths.length + 1];
		allPaths[0] = sourcePath;
		System.arraycopy(paths, 0, allPaths, 1, paths.length);
		return modFile.findResource(allPaths);
	}
}
