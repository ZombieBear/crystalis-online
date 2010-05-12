package net.k3rnel.server.battle;

import net.k3rnel.server.StatusEffect;

/**
 * The monster class
 * @author ZombieBear
 *
 */
public class Monster {
	private int m_atk, m_spd, m_acc, m_hp, m_def;
	private String m_species, m_name;
	private Move[] m_moves = new Move[4];
	private Type[] m_types = new Type[2];
	private StatusEffect m_status;
}
