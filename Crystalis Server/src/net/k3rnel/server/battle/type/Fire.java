package net.k3rnel.server.battle.type;

import net.k3rnel.server.battle.Type;

public class Fire extends Type {
	
	public Fire() {
		setName("Fire");
	}
	
	@Override
	public Effectiveness isEffective(TypeName opponent) {
		// TODO Auto-generated method stub
		switch (opponent){
		case FIRE :
			return (Effectiveness.IMPERVIOUS);
		case WATER :
			return (Effectiveness.NOT_EFFECTIVE);
		case EARTH :
			return (Effectiveness.NOT_EFFECTIVE);
		case WIND :
			return (Effectiveness.NEUTRAL);
		}
		return null;
	}
}
