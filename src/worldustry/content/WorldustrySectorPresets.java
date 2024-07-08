package worldustry.content;

import static worldustry.content.WorldustryPlanets.*;

import mindustry.type.*;

public class WorldustrySectorPresets{
    public static SectorPreset
    arisings;

    public static void load(){
        // salra region 

        arisings = new SectorPreset("arisings", salra, 10){{
            addStartingItems = true;
            alwaysUnlocked = true;
            difficulty = 1;
            captureWave = 30;
            attackAfterWaves = false;
        }};

        //endregion
    }
}