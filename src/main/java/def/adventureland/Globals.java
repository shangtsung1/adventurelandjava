package def.adventureland;

import def.js.Array;

@jsweet.lang.Interface
public abstract class Globals {

    public static GameCharacter character;

    public static native void accept_magiport(String name);

    public static native void accept_party_invite(String name);
    public static native void accept_party_request(String name);
    public static native void activate(double num);
    public static native void attack(Entity e);
    public static native void auto_craft(String name);
    public static native void bank_deposit(double gold);
    public static native void bank_retrieve(String pack,double pack_num,double num);
    public static native void bank_store(double num,String pack,double pack_num);
    public static native void bank_swap(String pack,double a,double b);
    public static native void bank_withdraw(double gold);
    public static native void buy(String name, double amount);
    public static native void buy(String name);
    public static native void buy_with_gold(String name,double quantity);
    public static native void buy_with_shells(String name,double quantity);
    public static native boolean can_attack(Entity target);
    public static native boolean can_heal(Entity t);
    public static native boolean can_move_to(double x, double y);
    public static native boolean can_transport(Entity entity);
    public static native boolean can_walk(Entity entity);
    public static native boolean change_server(String region,String name);
    public static native boolean change_target(Entity target);
    public static native boolean clear_drawings();
    public static native boolean close_stand();
    public static native void command_character(String name,String code_snippet);
    public static native void compound(double item0,double item1,double item2,double scroll_num,double offering_num);
    public static native void consume(double num);
    public static native void craft(int... invIds);
    public static native void cruise(double speed);
    public static native void destroy(double num);
    public static native void disconnect();
    public static native void distance(Entity _a, Entity _b);
    public static native void draw_circle(double x,double y,double radius,double size,String color);
    public static native void draw_line(double x,double y,double x2,double y2,double size,String color);
    public static native void enter(String place,String name);
    public static native void equip(double num,double slot);
    public static native void equip_cx(double slot,String cx_name);
    public static native void exchange(double item_num);
    public static native void exchange_buy(String token,String name);
    public static native void find_npc(String npc_id);
    public static native void game_log(String message,String color,double x);
    public static native void get(String name);
    public static native Array<GameCharacter> get_active_characters();
    public static native void get_active_code_slot();
    public static native Array<GameCharacter> get_characters();
    public static native Array<Entity> get_chests();
    //public static native void get_edited_code_slot();
    public static native Entity get_entity(String id);
    //public static native void get_focus();
    //public static native void get_map();
    public static native Monster get_monster(String id);
    public static native Entity get_nearest_hostile(def.js.Object args);
    public static native Monster get_nearest_monster(def.js.Object args);
    public static native Npc get_nearest_npc();
    public static native Array<Entity> get_party();
    public static native Player get_player(String name);
    //public static native Array<Server> get_servers();
    //public static native void get_socket();
    public static native Entity get_target();
    public static native Entity get_target_of(Entity entity);
    public static native Entity get_targeted_monster();
    public static native void giveaway(String slot,double invId,double quantity,double minutes);

    public static native void heal(Entity target);
    public static native boolean in_attack_range(Entity target);
    public static native boolean in_pvp();
    public static native void interact(String name);
    public static native boolean is_array(Object a);
    public static native boolean is_character(Object entity);
    public static native boolean is_disabled(Object entity);
    public static native boolean is_function(Object f);
    public static native boolean is_in_range(Entity target,String skill);
    public static native boolean is_monster(Object entity);
    public static native boolean is_moving(Object entity);
    public static native boolean is_npc(Object entity);
    public static native boolean is_number(Object obj);
    public static native boolean is_object(Object o);
    public static native boolean is_on_cooldown(String skill);
    public static native boolean is_paused();
    public static native boolean is_string(Object obj);
    public static native boolean is_transporting(Entity entity);
    public static native double item_grade(Item item);
    public static native def.js.Object item_properties(Item item);
    public static native double item_value(Item item);
    public static native void join(Event event);
    public static native void join_giveaway(String name,String slot,double rid);
    public static native void kick_party_member(String name);
    public static native void leave();
    public static native void leave_party();
    //public static native void load_code(name_or_slot,onerror);
    public static native double locate_item(String name);
    public static native void lock_item(double num);
    public static native void log(String message,String color);
    public static native void loot(String id_or_arg);
    public static native void loot();
    //public static native void map_key(key,skill,code);
    public static native void move(double x,double y);
    public static native void open_stand(double num);
    public static native void party_say(double message);
    public static native void pause();
    public static native void performance_trick();
    public static native void pm(String name,String message);
    public static native void preview_item(Object itemDef,Object args);

    public static native double quantity(String name);
    public static native void reduce_cooldown(String name,double ms);
    public static native void require_code(String name_or_slot);
    public static native void reset_mappings();
    public static native void respawn();
    public static native void safe_log(String message,String color);
    public static native void say(String message);
    public static native void seal_item(double num);
    public static native void sell(double num,double quantity);
    public static native void send_cm(String to,String message);
    public static native void send_cx(String receiver,String cx);
    public static native void send_gold(String receiver,double gold);
    public static native void send_item(String receiver,double num,double quantity);
    public static native void send_mail(String to,String subject,String message,Item item);
    public static native void send_party_invite(String name,boolean is_request);
    public static native void send_party_request(String name);
    public static native void set(String name,double value);
    public static native void set_home();
    //public static native void set_keymap(KeyMap keymap);
    public static native void set_message(String text);
    public static native void set_message(String text,String color);
    public static native void set_skillbar();
    public static native void shift(double num,String name);
    public static native void show_json(Object e);
    public static native void smart_move(String dest);
    public static native void start_character(String name,String code_slot_or_name);
    public static native void stop(String action,double second);
    public static native void stop_character(String name);
    public static native void swap(double a,double b);
    public static native void throw_item(double num,double x,double y);
    public static native void trade(double num,double trade_slot,double price,double quantity);
    public static native void trade_buy(Entity target,double trade_slot,double quantity);
    public static native void trade_sell(Entity target,double trade_slot,double quantity);
    //public static native void transport(String map,SpawnDef spawn);
    public static native void unequip(double slot);
    public static native void unfriend(String name);
    public static native void unlock_item(double num);
    //public static native void unmap_key(key);
    public static native void upgrade(double item_num,double scroll_num,double offering_num);
    public static native void upgrade(double item_num,double scroll_num,double offering_num,boolean only_calculate);
    public static native void upload_code(double slot_number,String slot_name,String code_string);
    public static native void use_hp_or_mp();
    public static native void use_nearest_door();
    public static native void use_skill(String name,Entity target,Object extra_arg);
    public static native void use_skill(String name,Entity target);
    public static native void wishlist(String trade_slot,String name,double price,double level,double quantity);
    public static native void xmove(double x,double y);















}
