package com.futureprocessing.idea.shortcuts;

import org.junit.Test;

public class RefactoringTest {

	@Test
	@Shortcut(combination = "ctrl+shift+up", description = "Moves symbol up")
	@Shortcut(combination = "ctrl+shift+up", description = "Moves symbol down")
	public void shouldReorderMethods() {
		/*
		 * Go to Refactoring class (ctrl+shift+t)
		 * and reorder the methods and inner classes
		 */
	}

	@Test
	@Shortcut(combination = "ctrl+alt+shift+t", description = "Pops up `Refactor This` window")
	@Shortcut(combination = "ctrl+f6", description = "changes method signature")
	public void shouldRefactorThis() {
		/*
		 * change signature of refactorMySignature method
		 * to refactorMySignature(String first, String second)
		 */

	}

	public void refactorMySignature(String second, String first) {
	}

	@Test
	@Shortcut(combination = "shift+f6", description = "Renames statements")
	public void shouldRenameVariable() {

		String integer = "abc";
	}

	@Test
	@Shortcut(combination = "ctrl+alt+n", description = "Inlines variable")
	public void shouldInlineVariable() {

		String string = "abc";
		new Editing.BlackEyeBean(string);
	}

	@Test
	@Shortcut(combination = "ctrl+alt+c", description = "Extracts constant")
	@Shortcut(combination = "ctrl+alt+c (twice)", description = "Extracts constant and show additional options")
	@Shortcut(combination = "ctrl+alt+c then alt+a", description = "Extracts constant and replaces all occurrences")
	public void shouldExtractConstant() {

		String a = "abc";
		String b = "abc";
		String c = "abc";
	}

	@Test
	@Shortcut(combination = "ctrl+alt+v", description = "Extracts variable")
	public void shouldExtractVariable() {

		new Editing.BlackEyeBean("extractMe");

		// "alsoExtractable"
	}

	@Test
	@Shortcut(combination = "ctrl+alt+f", description = "Extracts field")
	public void shouldExtractField() {

		new Editing.BlackEyeBean("extractMe");

		// "alsoExtractable"
	}

	@Test
	@Shortcut(combination = "ctrl+alt+p", description = "Extracts parameter")
	public void shouldExtractParameter() {

		new Editing.BlackEyeBean("extractMe");

		// "alsoExtractable"
	}

	@Test
	@Shortcut(combination = "ctrl+alt+m", description = "Extracts method")
	public void shouldExtractMethod() {

		new Editing.BlackEyeBean("extractMe");

		// "alsoExtractable"
	}
}