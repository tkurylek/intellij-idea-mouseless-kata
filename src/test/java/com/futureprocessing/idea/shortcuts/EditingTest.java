package com.futureprocessing.idea.shortcuts;

import org.junit.Test;

public class EditingTest {

	Editing editing = new Editing();

	@Test
	@Shortcut(combination = "ctrl+space",
			description = "basic code completion",
			reference = "https://www.jetbrains.com/idea/help/basic-code-completion-completing-names-and-keywords.html")

	@Shortcut(combination = "ctrl+shift+space",
			description = "smart auto complete - class hierarchy is considered",
			reference = "https://www.jetbrains.com/idea/help/smart-type-code-completion-completing-code-based-on-type-information.html")

	@Shortcut(combination = "ctrl+shift+space (x2) or ctrl+alt+space (once)",
			description = "verbose auto complete - useful for static imports",
			reference = "https://www.jetbrains.com/idea/help/basic-code-completion-completing-names-and-keywords.html")
	public void shouldPresentCodeCompletion() {

		/*
		 * place cursor next to `new` keyword
		 * notice the difference between completion modes
		 */
		// editing.accept(new );

		/*
		 * try to import static method hitting ctrl+space twice
		 * or ctrl+alt+space once
		 */
		// singletonList
	}

	@Test
	@Shortcut(combination = "ctrl+space then tab",
			description = "smart autocomplete",
			reference = "https://www.jetbrains.com/idea/help/basic-code-completion-completing-names-and-keywords.html")
	public void shouldPresentSmartCodeCompletion() {

		/*
		 * place cursor between `accept` and `Beans`
		 * hit ctrl+space and:
		 * - change to acceptManyBeans()
		 * - change to acceptMoreBeans()
		 * Accept selection using both enter and tab keys.
		 */
		editing.acceptBeans(null);
	}

	@Test
	@Shortcut(combination = "ctrl+shift+enter",
			description = "completes statement",
			reference = "https://www.jetbrains.com/idea/help/completing-statements.html")
	public void shouldCompleteStatement() {
		/*
		 * Complete the following statement
		 */
		//editing.acceptManyBeans(new BlackEyeBean(
	}

	/*
	 * Complete the following class
	 */
	// class TestClass

	/*
	 * Complete the json statement:
	 * see example with json file: example.json
	 */

	@Test
	@Shortcut(combination = "ctrl+p",
			description = "shows method parameters",
			reference = "https://www.jetbrains.com/idea/help/viewing-method-parameter-information.html")
	public void shouldShowParametersInfo() {

		/*
		 * move cursor over null statement and press ctrl+p
		 */
		editing.acceptAllVegetables(null, null, null, null, null, null, null, null, null);
	}

	@Test
	@Shortcut(combination = "ctrl+q",
			description = "pops documentation for given method",
			reference = "https://www.jetbrains.com/idea/help/quick-pop-up-windows.html#d399110e131")
	public void shouldShowDocumentation() {

		/*
		 * move cursor over null statement and press ctrl+q
		 */
		editing.acceptAllVegetables(null, null, null, null, null, null, null, null, null);
	}

	@Test
	@Shortcut(combination = "ctrl+o",
			description = "Overrides a method",
			reference = "https://www.jetbrains.com/idea/help/overriding-methods-of-a-superclass.html")
	public void shouldOverrideMethods() {
		/*
		 * see class below
		 */
	}

	class OverrideMethods extends Editing {

	}

	@Test
	@Shortcut(combination = "ctrl+i",
			description = "Implements a method",
			reference = "https://www.jetbrains.com/idea/help/implementing-methods-of-an-interface.html")
	public void shouldImplementMethods() {
		/*
		 * see class below
		 */
	}

	class ImplementMethods implements Editing.Bean {

	}

	@Test
	@Shortcut(combination = "ctrl+w",
			description = "extending selection",
			reference = "https://www.jetbrains.com/idea/help/selecting-text-in-the-editor.html#d1701627e179")

	@Shortcut(combination = "ctrl+shift+w",
			description = "shrinking selection",
			reference = "https://www.jetbrains.com/idea/help/selecting-text-in-the-editor.html#d1701627e220")
	public void shouldSuccessivelySelectCodeBlocks() {

		/*
		 * select some text using extending and shrinking selection
		 */
		editing.acceptManyBeans(new Editing.BlackEyeBean("a bean"));
	}

	@Test
	@Shortcut(combination = "ctrl+shift+j",
			description = "joins smartly lines",
			reference = "https://www.jetbrains.com/idea/help/joining-lines-and-literals.html")
	public void shouldSmartJoinLines() {

		/*
		 * smart join them separately one by one - or select whole statement
		 */
		String lipsum = "Lorem ipsum dolor sit amet enim. Etiam ullamcorper. Suspendisse a pellentesque dui, non felis." +
				" Maecenas malesuada elit lectus felis, malesuada ultricies. Curabitur et ligula. Ut molestie a, " +
				"ultricies porta urna. Vestibulum commodo volutpat a, convallis ac, laoreet enim. Phasellus " +
				"fermentum in, ";

		/*
		 * smart join declaration and assignment into one line
		 */
		int declarationAndAssignment;
		declarationAndAssignment = 1;

		int incrementation = 1;
		incrementation += 20;
	}

	@Test
	@Shortcut(combination = "ctrl+alt+t",
			description = "Surround statement with if/while/do..while/try..catch etc.",
			reference = "https://www.jetbrains.com/idea/help/surrounding-blocks-of-code-with-language-constructs.html")
	public void shouldSurroundWith() {

		Editing.BroadBean bean = new Editing.BroadBean();
		/*
		 * surround the following with if(bean != null)
		 */
		editing.accept(bean);
	}

	@Test
	@Shortcut(combination = "alt+enter",
			description = "applies quick fix")
	public void shouldApplyQuickFix() {

		/*
		 * remove unnecessary check for null
		 */
		Editing.BroadBean bean = new Editing.BroadBean();
		if (bean != null) {
			editing.accept(bean);
		}
	}

	@Test
	@Shortcut(combination = "ctrl+alt+l", description = "formats code")
	public void shouldFormatCode() {
		/*
		 * try to format whole class
		 */
	}

	@Test
	@Shortcut(combination = "ctrl+alt+o", description = "optimizes imports")
	public void shouldOptimizeImports() {
		/*
		 * try to optimize imports for this class
		 */
	}

	@Test
	@Shortcut(combination = "ctrl+shift+v", description = "pastes from recent buffers")
	public void shouldPresentRecentBuffers() {
		String copyMeFirst = "copyMeFirst";
		String copyMeSecond = "copyMeSecond";

		/*
		 * paste copyMeFirst from recent buffers as constructor parameter
		 */
		new Editing.BlackEyeBean();
	}

	@Test
	@GlobalReference("http://blog.jetbrains.com/idea/2014/03/intellij-idea-13-1-rc-introduces-sublime-text-style-multiple-selections/")
	@Shortcut(combination = "alt+j", description = "Places another cursor in found statement")
	@Shortcut(combination = "F3", description = "Skips found statement - will not place another cursor")
	@Shortcut(combination = "ctrl+alt+shift+j", description = "Place cursors in all found statements")
	@Shortcut(combination = "alt+shift(hold) + mouse click", description = "Place another cursor in clicked spot")
	@Shortcut(combination = "scroll button (hold)", description = "Column selection mode")
	public void shouldPresentMulticursor() {
		/*
		 * replace text using multicursor [replaceWithNth] with the First, Second, Third and so on.
		 * Try not to use mouse selection.
		 */
		String changeMeFirst = "changeMe[replaceWithNth]";
		String changeMeSecond = "changeMe[replaceWithNth]";
		String changeMeThird = "changeMe[replaceWithNth]";
		String changeMeFourth = "changeMe[replaceWithNth]";
	}

	@Test
	@Shortcut(combination = "alt+insert", description = "generates code")
	public void shouldGenerateTestMethod() {
		/*
		 * try to generate a test method below this one
		 */
	}

	@Test
	@Shortcut(combination = "ctrl+shift+t", description = "goes/generates test class")
	public void shouldGenerateTestClassForClass() {
		/*
		 * try to go to the class this test is testing
		 */
	}

	@Test
	@Shortcut(combination = "ctrl+shift+u", description = "converts text to upper/lower string")
	public void shouldUpperLowerCase() {
		/*
		 * try to change string `should be uppercase` to `SHOULD BE UPPERCASE`
		 */
		/*
		 * try to fix the following variables naming using multicursor
		 */
		String First = "should be uppercase";
		String Second = "should be uppercase";
		String Third = "should be uppercase";
		String Fourth = "should be uppercase";
	}

	@Test
	@Shortcut(combination = "alt+delete", description = "deletes method with potential references")
	public void shouldSafelyDeleteMethod() {

		/*
		 * try to delete the following method with its execution
		 */
		editing.toBeSafelyRemoved();
	}

	@Test
	@Shortcut(combination = "ctrl+j", description = "presents available templates to be inserted")
	public void shouldPresentLiveTemplates() {
		/*
		 * try to insert simple template
		 */
		/*
		 * try to add `gwt` template that generates //given //when //then comments
		 */
		// gwt
	}

	@Test
	@Shortcut(combination = ".[template]", description = "presents available templates to be inserted")
	public void shouldPresentPostfixCompletion() {
		/*
		 * see available postfix templates for the variable `a` below
		 */
	}

	public Object postFixDemo() {
		boolean a = false;
		// a.if
		// a.return
		// ...
		// a.
		return null;
	}
}
