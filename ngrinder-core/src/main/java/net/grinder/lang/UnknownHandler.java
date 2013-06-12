package net.grinder.lang;

import net.grinder.util.AbstractGrinderClassPathProcessor;

/**
 * UnknownHandler. It follows the null object pattern.
 * 
 * @author JunHo Yoon
 * @since 3.2
 */
public class UnknownHandler extends AbstractLanguageHandler {

	/**
	 * Constructor.
	 */
	public UnknownHandler() {
		super("unknown", "unknown");
	}

	@Override
	public AbstractGrinderClassPathProcessor getClassPathProcesssor() {
		return null;
	}

}