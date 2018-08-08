package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;
import cn.mccraft.pangu.core.item.ToolMaterialHelper;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab("tools")
public interface PESwords {

    Item.ToolMaterial BRONZE = ToolMaterialHelper.builder("PT_BRONZE", Item.ToolMaterial.IRON).setAttackDamage(5).build();

    @RegItem
    Item bronzeBroadSword = PESword.of(BRONZE);

    @RegItem
    Item bronzeSword = PESword.of(BRONZE).setFireHitEntity(5);

    @RegItem
    Item jointStaff = PESword.of(BRONZE);

    @RegItem
    PGSword crashBuddhistMonksKnife = PESword.of(BRONZE);

    @RegItem
    PGSword buddhistMonksKnife = PESword.of(BRONZE);

    @RegItem
    PGSword buddhistCane = PESword.of(BRONZE);
}
