package app;

import def.adventureland.Entity;
import def.adventureland.Event;

import static def.adventureland.Globals.respawn;

public abstract class UClass {

    public abstract void loop();

    public void handle_command(String command,Object args){

    }
    public void handle_death(){
    }

    public void on_combined_damage(){

    }
    public void on_destroy(){

    }
    public void on_disappear(Entity entity, def.js.Object data){

    }
    public void on_draw(){

    }
    public void on_game_event(Event event){

    }
    public void on_party_invite(String name){

    }
    public void on_party_request(String name){

    }
}
