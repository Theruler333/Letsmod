package theruler333.lmm.block;

import theruler333.lmm.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class Cobble_Black extends Block {


        public Cobble_Black (int id, Material material)
        {
                super(BlockIDs.Cobblestone_black, Material.rock);
                setHardness(2.0F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("Black Cobblestone");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public void registerIcons(IconRegister iconRegister) {
            this.blockIcon = iconRegister.registerIcon("lmm:cobblestone black");
        }



} 
