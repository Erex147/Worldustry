package worldustry.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.entities.effect.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.production.*;
import static mindustry.type.ItemStack.*;

public class WorldustryBlocks{
    public static Block

    //region salra
    impactorDrill
    //endregion
    ;

    public static void load(){
        impactorDrill = new BurstDrill("impactor-drill"){{
            requirements(Category.production, with(WorldustryItems.plutalium, 40));
            drillTime = 60f * 6f;
            size = 5;
            hasPower = true;
            tier = 7;
            //TODO better effect
            drillEffect = new MultiEffect(
                Fx.mineImpact,
                Fx.drillSteam,
                Fx.dynamicSpikes.wrap(Liquids.hydrogen.color, 30f),
                Fx.mineImpactWave.wrap(Liquids.hydrogen.color, 45f)
            );
            shake = 4f;
            itemCapacity = 50;
            arrowOffset = 2f;
            arrowSpacing = 5f;
            arrows = 2;
            glowColor.a = 0.6f;
            fogRadius = 5;

            drillMultipliers.put(Items.beryllium, 2.5f);

            //TODO different requirements
            //consumePower(6f);
            //consumeLiquids(LiquidStack.with(Liquids.hydrogen, 4f / 60f));
        }};
    }
}