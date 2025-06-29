package net.sba.aigenmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.sba.aigenmod.AiGeneratedMobs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GREEN_STICK = registerItem("green_stick",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AiGeneratedMobs.MOD_ID,"green_stick")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("aigenmod", name), item);
    }

    public static void registerModItems() {
        AiGeneratedMobs.LOGGER.info("Registering Mod Items for " + AiGeneratedMobs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GREEN_STICK);
        });
    }
}