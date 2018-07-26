package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;
import cn.mccraft.pangu.core.item.ToolMaterialHelper;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab("tools")
public interface PTSwords {
    Item.ToolMaterial BRONZE = new ToolMaterialHelper.Builder("PT_BRONZE", Item.ToolMaterial.IRON).setAttackDamage(5).build();

    @RegItem
    Item bronzeBroadSword = PTSword.of(BRONZE);

    @RegItem
    Item bronzeSword = PTSword.of(BRONZE).setFireHitEntity(5);

    @RegItem
    Item jointStaff = PTSword.of(BRONZE);

    @RegItem
    PGSword crashBuddhistMonksKnife = PTSword.of(BRONZE);

    @RegItem
    PGSword buddhistMonksKnife = PTSword.of(BRONZE);

    @RegItem
    PGSword buddhistCane = PTSword.of(BRONZE);
}
