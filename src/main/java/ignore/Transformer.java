package ignore;

import app.Main;
import def.adventureland.Entity;
import def.adventureland.Event;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static jsweet.util.Lang.function;

public class Transformer {
    public static void main(String[] args) throws Exception{
        ArrayList<String> lines = new ArrayList<>();
        File myObj = new File("./target/js/bundle.js");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            lines.add(myReader.nextLine());
        }
        myReader.close();
        String removed = lines.remove(lines.size()-1);
        myObj.delete();
        PrintWriter myWriter = new PrintWriter("./target/js/bundle.js");
        int x =0;
        for(String s:lines){
            myWriter.println(s);
        }
        myWriter.println("handle_command = app.Main.handle_command;");
        myWriter.println("handle_death=app.Main.handle_death;");
        myWriter.println("on_combined_damage=app.Main.on_combined_damage;");
        myWriter.println("on_destroy=app.Main.on_destroy;");
        myWriter.println("on_disappear=app.Main.on_disappear;");
        myWriter.println("on_draw=app.Main.on_draw;");
        myWriter.println("on_game_event=app.Main.on_game_event;");
        myWriter.println("on_party_invite=app.Main.on_party_invite;");
        myWriter.println("on_party_request=app.Main.on_party_request;");
        myWriter.println(removed);
        myWriter.close();
    }
}
