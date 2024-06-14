package cn.nukkit.block;

public class BlockDoubleSlabBrickBlackstonePolished extends BlockDoubleSlabBlackstonePolished {

    public BlockDoubleSlabBrickBlackstonePolished() {
        this(0);
    }

    public BlockDoubleSlabBrickBlackstonePolished(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB;
    }

    @Override
    public int getSingleSlabId() {
        return POLISHED_BLACKSTONE_BRICK_SLAB;
    }

    @Override
    public String getSlabName() {
        return "Polished Blackstone Brick";
    }

    @Override
    public double getHardness() {
        return 2;
    }
}
