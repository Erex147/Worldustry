package worldustry.content;

import static worldustry.content.WorldustryPlanets.*;

import mindustry.type.*;

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