package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab("tools")
public interface PTItems {
    @RegItem
    PGSword bronzeBroadSword = new PGSword(Item.ToolMaterial.IRON);
}
