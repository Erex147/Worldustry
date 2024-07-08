package worldustry.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class WorldustryItems{
    public static Item
    plutalium;

    public static final Seq<Item> salraItems = new Seq<>();

    public static void load(){
        plutalium = new Item("plutalium", Color.valueOf("324ea8")){
            {
                hardness = 1;
                cost = 1.1f;
                alwaysUnlocked = true;
            }
        };

        salraItems.addAll(
            plutalium
        );

    }
}