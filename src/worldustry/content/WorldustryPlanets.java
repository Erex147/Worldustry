package worldustry.content;

import arc.*;
import arc.graphics.Color;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.graphics.g3d.NoiseMesh;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.mod.*;
import mindustry.type.Planet;
import mindustry.ui.dialogs.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;

public class WorldustryPlanets {
     public static Planet pluto;

     public static void load() {
        pluto = new Planet("pluto", Planets.sun, 1, 1){{
            generator = new ErekirPlanetGenerator();
            meshLoader = () -> new NoiseMesh(this, 3, 5, 0.92f, 2, 0.5f, 2, 1, Color.valueOf("808080"), Color.valueOf("2f0909"), 1, 0.8f, 1f, 0.5f);
            cloudMeshLoader = () -> new MultiMesh(
                new HexSkyMesh(this, 3, 0.2f, 0.0012f, 5, Color.valueOf("2f0909").a(0.75f), 2, 0.42f, 1.2f, 0.25f),
                new HexSkyMesh(this, 5, 0.5f, 0.001f, 5, Color.valueOf("2f0941").a(0.35f), 3, 0.38f, 1.2f, 0.3f)
            );
            alwaysUnlocked = true;
            landCloudColor = Color.valueOf("d3d3d3");
            atmosphereColor = Color.valueOf("ffffff");
            defaultEnv = Env.terrestrial;
            startSector = 10;
            atmosphereRadIn = 0.0f;
            atmosphereRadOut = 0.005f;
            tidalLock = true;
            orbitRadius = 33f;
            lightSrcTo = 0.5f;
            lightDstFrom = 0.2f;
            clearSectorOnLose = true;
            defaultCore = Blocks.coreBastion;
            iconColor = Color.valueOf("ff1010");
            hiddenItems.addAll(Items.serpuloItems).removeAll(Items.erekirItems);
            enemyBuildSpeedMultiplier = 0.4f;
            bloom = false;

            allowLaunchToNumbered = false;
            updateLighting = false;

            defaultAttributes.set(Attribute.heat, 1f);

            ruleSetter = r -> {
                r.waveTeam = Team.malis;
                r.placeRangeCheck = false;
                r.showSpawns = true;
                r.fog = true;
                r.staticFog = true;
                r.lighting = false;
                r.coreDestroyClear = true;
                r.onlyDepositCore = true;
            };

            unlockedOnLand.add(Blocks.coreBastion);
        }};
     }
}
