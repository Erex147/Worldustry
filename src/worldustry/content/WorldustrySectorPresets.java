package worldustry.content;

import static worldustry.content.WorldustryPlanets.*;

import mindustry.type.*;

public class WorldustrySectorPresets{
    public static SectorPreset
    arisings;

    public static void load(){
        // pluto region 

        arisings = new SectorPreset("arisings", salra, 10){{
            addStartingItems = true;
            alwaysUnlocked = true;
            difficulty = 1;
        }};

        //endregion
    }
}