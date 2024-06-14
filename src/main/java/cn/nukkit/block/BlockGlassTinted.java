package cn.nukkit.block;

import cn.nukkit.item.Item;

public class BlockGlassTinted extends BlockGlass {

    public BlockGlassTinted() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Tinted Glass";
    }

    @Override
    public int getId() {
        return TINTED_GLASS;
    }

    @Override
    public Item[] getDrops(Item item) {
        return new Item[] { this.toItem() };
    }

    @Override
    public boolean canSilkTouch() {
        return false;
    }
}
