package samith.test.mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NinerMaterial implements ToolMaterial{

    @Override
    public float getAttackDamage() {
        return 2;
    }

    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public int getEnchantability() {
        return 32;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 45;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_BLOCK);
    }
    
}
