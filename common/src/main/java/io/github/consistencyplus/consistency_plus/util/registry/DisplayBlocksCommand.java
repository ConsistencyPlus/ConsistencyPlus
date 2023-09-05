package io.github.consistencyplus.consistency_plus.util.registry;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;
import net.minecraft.block.Block;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import static net.minecraft.server.command.CommandManager.literal;

public class DisplayBlocksCommand {
    public static LiteralArgumentBuilder<ServerCommandSource> build() {
        int blocks = CPlusBlockFamilies.ALL_FAMILIES.stream()
                .mapToInt(family -> family.blockTable.size())
                .sum();
        return literal("cplus")
                .then(literal("display-all")
                        .then(literal("i-understand-this-will-place-" + blocks + "-blocks")
                                .requires(source -> source.hasPermissionLevel(4)) // OP
                                .executes(ctx -> {
                                    BlockPos origin = BlockPos.ofFloored(ctx.getSource().getPosition());
                                    ServerWorld world = ctx.getSource().getWorld();
                                    int families = CPlusBlockFamilies.ALL_FAMILIES.size();
                                    BlockPos.Mutable row = origin.up(families).mutableCopy();
                                    if (world.isOutOfHeightLimit(row)) {
                                        ctx.getSource().sendError(Text.literal("Too high"));
                                        return 0;
                                    }
                                    BlockPos.Mutable pos = row.mutableCopy();
                                    CPlusBlockFamilies.ALL_FAMILIES.forEach(family -> {
                                        for (BlockStyle style : BlockStyle.values()) {
                                            BlockShape[] shapes = style.hasShapes ? BlockShape.values() : new BlockShape[] { BlockShape.CUBE };
                                            for (BlockShape shape : shapes) {
                                                Block block = family.getBlock(style, shape);
                                                if (block != null) {
                                                    world.setBlockState(pos, block.getDefaultState());
                                                }
                                                pos.move(Direction.EAST);
                                            }
                                        }
                                        row.move(Direction.DOWN);
                                        pos.set(row);
                                    });
                                    return 1;
                                })
                        )
                );
    }
}
