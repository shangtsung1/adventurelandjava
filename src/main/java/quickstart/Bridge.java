package quickstart;

import app.Main;
import def.adventureland.Entity;
import def.adventureland.Event;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

import static def.dom.Globals.*;
import static jsweet.util.Lang.*;

public class Bridge{

	public static final int LOOP_INTERVAL_MS = 100;
	public static void main(String[] args) {
		setInterval(function(Main::loop),LOOP_INTERVAL_MS);
	}


}
