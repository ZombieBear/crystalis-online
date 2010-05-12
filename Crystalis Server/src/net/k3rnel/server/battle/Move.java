package net.k3rnel.server.battle;

public abstract class Move implements BattleTurn {
	String m_name;
	int m_baseDmg, m_baseAmmount, m_baseCoolOff;
	Type m_type;
	
	public TurnType getTurnType() {
		return TurnType.ATTACK;
	}
}
