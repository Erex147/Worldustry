package worldustry;

import worldustry.*;
import worldustry.content.*;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Worldustry extends Mod{

    public Worldustry(){
        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("worldustry-frog")).pad(20f).row();
                dialog.cont.button("hmmm yes frog", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        WorldustryPlanets.load();
        WorldustrySectorPresets.load();
    }

}