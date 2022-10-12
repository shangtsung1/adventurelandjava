package app;

import app.classes.*;
import def.adventureland.*;
import static def.adventureland.Globals.*;


public class Main {
    static UClass characterClass;

    public static void loop() {
        if(characterClass == null){
            switch(character.ctype){
                case "warrior":
                    characterClass = new Warrior();
                    break;
                case "mage":
                    characterClass = new Mage();
                    break;
                case "merchant":
                    characterClass = new Merchant();
                    break;
                case "rogue":
                    characterClass = new Rogue();
                    break;
                case "ranger":
                    characterClass = new Ranger();
                    break;
                case "paladin":
                    characterClass = new Paladin();
                    break;
                case "priest":
                    characterClass = new Priest();
                    break;
                default:
                    characterClass = new Unknown();
                    break;
            }
        }
        characterClass.loop();
    }
    public static void handle_command(String command,Object args){
        characterClass.handle_command(command,args);
    }
    public static void handle_death(){
        characterClass.handle_death();
    }

    public static void on_combined_damage(){
        characterClass.on_combined_damage();
    }
    public static void on_destroy(){
        characterClass.on_destroy();
    }
    public static void on_disappear(Entity entity, def.js.Object data){
        characterClass.on_disappear(entity, data);
    }
    public static void on_draw(){
        characterClass.on_draw();
    }
    public static void on_game_event(Event event){
        characterClass.on_game_event(event);
    }
    public static void on_party_invite(String name){
        characterClass.on_party_invite(name);
    }
    public static void on_party_request(String name){
        characterClass.on_party_request(name);
    }

}
