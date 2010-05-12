package net.k3rnel.server.battle.type;

import net.k3rnel.server.battle.Type;

public class Water extends Type {
	
	public Water() {
		setName("Water");
	}
	
	@Override
	public Effectiveness isEffective(TypeName opponent) {
		// TODO Auto-generated method stub
		switch (opponent){
		case FIRE :
			return (Effectiveness.EFFECTIVE);
		case WATER :
			return (Effectiveness.NEUTRAL);
		case EARTH :
			return (Effectiveness.NOT_EFFECTIVE);
		case WIND :
			return (Effectiveness.NEUTRAL);
		}
		return null;
	}
}
