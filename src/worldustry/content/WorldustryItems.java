package worldustry.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class WorldustryItems{
    public static Item
    plutalium, necronite;

    public static final Seq<Item> salraItems = new Seq<>();

    public static void load(){
        plutalium = new Item("plutalium", Color.valueOf("324ea8")){
            {
                hardness = 1;
                cost = 1.1f;
                alwaysUnlocked = true;
            }
        };

        necronite = new Item("necronite", Color.valueOf("324ea8")){
            {
                hardness = 1;
                cost = 1.1f;
                alwaysUnlocked = true;
                charge = 0.17f;
            }
        };

        salraItems.addAll(
            plutalium
        );

    }
}