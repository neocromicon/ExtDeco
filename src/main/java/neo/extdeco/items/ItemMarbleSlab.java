package neo.extdeco.items;

import neo.extdeco.blocks.BlocksExtDeco;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class ItemMarbleSlab extends ItemSlab {
	
	public ItemMarbleSlab(Block block) {
		super(block, (BlockSlab) BlocksExtDeco.marbleSlabSingle, (BlockSlab) BlocksExtDeco.marbleSlabDouble, false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	public int getMetadata(int par1) {
          return par1;
    }
}