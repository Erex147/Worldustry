package worldustry.content;

import mindustry.type.*;

import static worldustry.content.WorldustryPlanets.*;

public class WorldustrySectorPresets{
    public static SectorPreset
    arisings;

    public static void load(){
        //region serpulo

        arisings = new SectorPreset("arisings", pluto, 10){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            overrideLaunchDefaults = true;
            noLighting = true;
            startWaveTimeMultiplier = 3f;
        }};

        //endregion
    }
}