package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;

public class PESword extends PGSword {
    public PESword(ToolMaterial material) {
        super(material);
        setI18nLore();
    }

    public static PESword of(ToolMaterial toolMaterial) {
        return new PESword(toolMaterial);
    }
}
