package team.unstudio.simplescript.script;

import java.util.List;

import com.google.common.collect.Lists;

public class OptionRegisty {
	
	private static final List<Option> options = Lists.newArrayList();

	public static void addOption(Option option){
		options.add(option);
	}
	
	public static void removeOption(Option option){
		options.remove(option);
	}
	
	public static List<Option> getOptions(){
		return options;
	}
}
