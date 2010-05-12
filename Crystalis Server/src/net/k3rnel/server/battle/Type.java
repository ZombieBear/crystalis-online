package net.k3rnel.server.battle;

public abstract class Type {
	String m_name;
	
	public enum Effectiveness {
		EFFECTIVE,
		NOT_EFFECTIVE,
		NEUTRAL,
		IMPERVIOUS
	}
	
	/**
	 * Returns the type
	 * @return name of the type
	 */
	public abstract String getName();
	
	/**
	 * Returns the level of effectiveness against another type
	 * @param opponent
	 * @return the level of effectiveness against another type
	 */
	public abstract Effectiveness isEffective(Type opponent);
}
