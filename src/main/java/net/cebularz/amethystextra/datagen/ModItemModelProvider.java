package net.cebularz.amethystextra.datagen;


import net.cebularz.amethystextra.AmethystExtra;
import net.cebularz.amethystextra.block.ModBlocks;
import net.cebularz.amethystextra.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AmethystExtra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMETHYST_APPLE);
        simpleItem(ModItems.AMETHYST_CARROT);

        wallItem(ModBlocks.AMETHYST_BRICKS_WALL, ModBlocks.AMETHYST_BRICKS);
        evenSimplerBlockItem(ModBlocks.AMETHYST_BRICKS_STAIRS);
        evenSimplerBlockItem(ModBlocks.AMETHYST_BRICKS_SLAB);

        wallItem(ModBlocks.POLISHED_AMETHYST_WALL, ModBlocks.POLISHED_AMETHYST);
        evenSimplerBlockItem(ModBlocks.AMETHYST_STAIRS);
        evenSimplerBlockItem(ModBlocks.AMETHYST_SLAB);

        wallItemVanilla(ModBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
        evenSimplerBlockItem(ModBlocks.POLISHED_AMETHYST_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_AMETHYST_SLAB);

        simpleItem(ModItems.AMETHYST_ENDER_PEARL);
    }
    private ItemModelBuilder simpleItem(DeferredHolder<Item, Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AmethystExtra.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(DeferredHolder<Block, Block> block) {
        this.withExistingParent(AmethystExtra.MOD_ID + ":" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath(),
                modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block.get()).getPath()));
    }
    public void wallItem(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(AmethystExtra.MOD_ID, "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock.get()).getPath()));
    }
    public void wallItemVanilla(DeferredHolder<Block, Block> block, Block baseBlock) {
        this.withExistingParent(BuiltInRegistries.BLOCK.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }
    private ItemModelBuilder simpleBlockItemBlockTexture(DeferredHolder<Block, Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AmethystExtra.MOD_ID,"block/" + item.getId().getPath()));
    }
}
