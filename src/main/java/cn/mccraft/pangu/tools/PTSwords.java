package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@SharedCreativeTab("tools")
public interface PTSwords {
    Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial("PT_BRONZE", 2, 200, 5.2F, 1.8F, 14);

    @RegItem
    PGSword bronzeBroadSword = new PGSword(BRONZE);

    @RegItem
    PGSword bronzeSword = new PGSword(BRONZE).setFireHitEntity(5);

    @RegItem
    PGSword jointStaff = new PGSword(BRONZE);

    @RegItem
    PGSword crashBuddhistMonksKnife = new PGSword(BRONZE);

    @RegItem
    PGSword buddhistMonksKnife = new PGSword(BRONZE);

    @RegItem
    PGSword buddhistCane = new PGSword(BRONZE);
}
