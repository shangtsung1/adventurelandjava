package def.adventureland;

import def.js.Array;
import jsweet.lang.Name;

@jsweet.lang.Interface
public class Entity {
    public double real_x;
    public double real_y;
    public double hp;
    public double mp;

    public boolean moving;


    public double x;
    public double y;
    public double width;
    public double height;
    public double alpha;
    public boolean visible;
    public String caskin;
    public double i;
    public double j;
    public String skin;
    public String stype;
    public double updates;
    public double cscale;
    public String in;
    public String map;
    public double max_hp;
    public double max_mp;
    public double xp;
    public double attack;
    public double heal;
    public double frequency;
    public double speed;
    public double range;
    public double armour;
    public double resistance;
    public double level;
    public boolean rip;
    public boolean afk;
    //public Array<Buff> s;
    //c
    //q
    public double age;
    public double pdps;
    public String id;
    public double cid;
    //cx
    //public EquipmentSlots slots;
    /*	"slots": {
		"ring1": {
			"level": 0,
			"name": "ringsj"
		},
		"ring2": {
			"name": "ringsj",
			"level": 0
		},
		"earring1": null,
		"earring2": null,
		"belt": {
			"level": 0,
			"name": "hpbelt"
		},
		"mainhand": null,
		"offhand": null,
		"helmet": {
			"name": "helmet",
			"gift": 1,
			"level": 0
		},
		"chest": null,
		"pants": null,
		"shoes": {
			"name": "shoes",
			"gift": 1,
			"level": 0
		},
		"gloves": null,
		"amulet": {
			"name": "hpamulet",
			"level": 0
		},
		"orb": null,
		"elixir": null,
		"cape": null
	}*/

    public String ctype;
    public String owner;

    @Name(value="int")
    public double intel;

    public double str;
    public double dex;
    public double vit;
    @Name(value="for")
    public double fort;
    public double mp_cost;
    public double mp_reduction;
    public double max_xp;
    public double goldm;
    public double xpm;
    public double luckm;
    public double isize;
    public double esize;
    public double gold;
    public double cash;
    public double targets;
    public double m;
    public double evasion;
    public double miss;
    public double reflection;
    public double lifesteal;
    public double manasteal;
    public double rpiercing;
    public double apiercing;
    public double crit;
    public double critdamage;
    public double dreturn;
    public double tax;
    public double xrange;
    public double pnresistance;
    public double fireresistance;
    public double fzresistance ;
    public double phresistance ;
    public double stresistance ;
    public double incdmgamp ;
    public double stun ;
    public double blast ;
    public double explosion;
    public double courage;
    public double mcourage;
    public double pcourage;
    public double fear;
    public Array<Item> items;
    public double cc;
    public String ipass;
    public String home;
    public Array<String> friends;
    public def.js.Object acx;
    public Array<String> xcx;
    public def.js.Object emx;
    public double pzazz;
    public String last_ms;
    public String name;
    public double real_alpha;
    public double me;
    public String type;
    public double awidth;
    public double aheight;
    public double ping;
    //public Stats stats;
    public boolean code;
    public double from_x;
    public double from_y;
    public double going_x;
    public double going_y;
    public double ref_speed;
    public double vx;
    public double vy;
    public double angle;
    public double a_direction;
    public String ms_walk;
    public String last_stop;
    public double last_walking;
    public double move_num;
    public double a_angle;
    public Entity target;
    public String focus;





}
