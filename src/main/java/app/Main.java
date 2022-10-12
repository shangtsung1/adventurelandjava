package app;


import def.adventureland.*;
import static def.adventureland.Globals.*;

//based on https://github.com/kaansoral/adventureland/blob/master/examples/simple_but_improved.js
public class Main {
    public static void loop() {
        if(character.hp<400 || character.mp<300) {
            set_message("Drinking Potion");
            use_hp_or_mp();
        }
        // Uses potions only when the above conditions are met
        loot();

        if(character.moving) {
            set_message("Moving");
            return;
        }

        Entity target=get_targeted_monster();
        if(target == null)
        {
            def.js.Object args = new def.js.Object();// args={};
            args.$set("min_xp",100);
            args.$set("max_att",120);
            args.$set("path_check",true);
            args.$set("no_target",true);
            target=get_nearest_monster(args);
            // Ensures that your character can walk to the target (path_check) and the target isn't engaging with anyone else (no_target)
            if(target != null) {
                set_message("Changing Target");
                change_target(target);
            }
            else
            {
                set_message("No Monsters");
                return;
            }
        }

        if(!in_attack_range(target) && character!=null)
        {
            set_message("Moving to target");
            move(
                    character.real_x+(target.real_x-character.real_x)/2,
                    character.real_y+(target.real_y-character.real_y)/2
            );
            // Walk half the distance
        }
        else if(can_attack(target))
        {
            set_message("Attacking");
            attack(target);
        }
    }
    public static void handle_command(String command,Object args){

    }
    public static void handle_death(){
        respawn();
    }

    public static void on_combined_damage(){

    }
    public static void on_destroy(){

    }
    public static void on_disappear(Entity entity, def.js.Object data){

    }
    public static void on_draw(){

    }
    public static void on_game_event(Event event){

    }
    public static void on_party_invite(String name){

    }
    public static void on_party_request(String name){

    }

}
