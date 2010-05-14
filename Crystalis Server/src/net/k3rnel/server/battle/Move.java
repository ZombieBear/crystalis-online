package net.k3rnel.server.battle;

public abstract class Move implements BattleTurn {
	String m_name;
	protected int m_basePwr, m_baseAmmount, m_baseCoolDown, m_accuracy;
	Type m_type;
	
	public enum MoveCategory{
		NORMAL_ATTACK,
		SPECIAL_ATTACK,
		STAT_BOOST
	}
	
	/**
	 * Returns the type of turn performed
	 */
	public TurnType getTurnType() {
		return TurnType.ATTACK;
	}
	
	/**
	 * Returns the base cooldown time for the move
	 * @return
	 */
	public int getBaseCoolDown() {
		return m_baseCoolDown;
	}
	
	/**
	 * Returns the accuracy of a move
	 * @return
	 */
	public int getAccuracy() {
		return m_accuracy;
	}
	/**
	 * Returns the base power of a move
	 * @return
	 */
	public int getBasePower(){
		return m_basePwr;
	}
	
	/**
	 * Performs the action
	 */
	public abstract void performAction();
}
