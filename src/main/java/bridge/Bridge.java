package bridge;

import app.Main;

import static def.dom.Globals.*;
import static jsweet.util.Lang.*;

public class Bridge{

	public static final int LOOP_INTERVAL_MS = 100;
	public static void main(String[] args) {
		setInterval(function(Main::loop),LOOP_INTERVAL_MS);
	}


}
