package com.futureprocessing.idea.shortcuts;

import java.lang.annotation.Repeatable;

@Repeatable(value = Shortcuts.class)
public @interface Shortcut {

	String combination();
	String description();

	String reference() default "";
}
