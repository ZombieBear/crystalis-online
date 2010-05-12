package net.k3rnel.server.battle;

public abstract class Type {
	private String m_name;
	
	public enum TypeName {
		FIRE,
		WATER,
		EARTH,
		WIND
	}
	
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
	public String getName() {
		return m_name;
	}
	
	/**
	 * Sets the move name
	 * @param name
	 */
	public void setName(String name){
		m_name = name;
	}
	
	/**
	 * Returns the level of effectiveness against another type
	 * @param opponent
	 * @return the level of effectiveness against another type
	 */
	public abstract Effectiveness isEffective(TypeName opponent);
}
