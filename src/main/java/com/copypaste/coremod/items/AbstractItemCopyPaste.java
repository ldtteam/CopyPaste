package com.copypaste.coremod.items;

import com.copypaste.api.util.constant.Constants;
import net.minecraft.item.Item;

/**
 * Handles simple things that all items need.
 */
public abstract class AbstractItemCopyPaste extends Item
{
    /**
     * The name of the item.
     */
    private final String name;

    /**
     * Sets the name, creative tab, and registers the item.
     *
     * @param name The name of this item
     */
    public AbstractItemCopyPaste(final String name)
    {
        super();
        this.name = name;

        super.setUnlocalizedName(Constants.MOD_ID.toLowerCase() + "." + this.name);
        setRegistryName(this.name);
    }

    /**
     * Returns the name of the item.
     *
     * @return Name of the item.
     */
    public final String getName()
    {
        return name;
    }
}
