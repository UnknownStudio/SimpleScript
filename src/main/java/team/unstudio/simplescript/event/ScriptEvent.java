package team.unstudio.simplescript.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import team.unstudio.simplescript.script.Script;

public class ScriptEvent extends Event{
	
	private final Script script;
	
	public ScriptEvent(Script script) {
		this.script = script;
	}

	public Script getScript() {
		return script;
	}
	
	private static final HandlerList handler = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return handler;
	}
	
	public static HandlerList getHandlerList(){
		return handler;
	}
}
