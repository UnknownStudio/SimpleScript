/*
 * Copyright (c) 2016, Unknown Domain. All rights reserved.
 * GUN GPLv3. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package team.unstudio.simplescript.script;

public abstract class Option {

	private final String name;
	private final String option;

	public Option(String name, String option) {
		this.name = name;
		this.option = option;
	}

	public String getName() {
		return name;
	}

	public String getOption() {
		return option;
	}

	public abstract boolean onOptionCall(ScriptHandler script);
}
