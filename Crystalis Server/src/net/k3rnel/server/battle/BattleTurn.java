package net.k3rnel.server.battle;

public abstract interface BattleTurn {
	public enum TurnType {
		ATTACK,
		ITEM,
		ESCAPE
	}
	
	/**
	 * Executes the turn
	 */
	public abstract void performAction();
	
	/**
	 * Returns the type of turn
	 * @return
	 */
	public abstract TurnType getTurnType();
}
