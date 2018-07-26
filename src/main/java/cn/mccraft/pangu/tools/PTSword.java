package cn.mccraft.pangu.tools;

import cn.mccraft.pangu.core.item.PGSword;

public class PTSword extends PGSword {
    public PTSword(ToolMaterial material) {
        super(material);
        setI18nLore();
    }

    public static PTSword of(ToolMaterial toolMaterial) {
        return new PTSword(toolMaterial);
    }
}
