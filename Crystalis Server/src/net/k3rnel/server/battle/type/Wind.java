package net.k3rnel.server.battle.type;

import net.k3rnel.server.battle.Type;

public class Wind extends Type {
	
	public Wind() {
		setName("Wind");
	}
	
	@Override
	public Effectiveness isEffective(TypeName opponent) {
		// TODO Auto-generated method stub
		switch (opponent){
		case FIRE :
			return (Effectiveness.NOT_EFFECTIVE);
		case WATER :
			return (Effectiveness.EFFECTIVE);
		case EARTH :
			return (Effectiveness.NEUTRAL);
		case WIND :
			return (Effectiveness.NEUTRAL);
		}
		return null;
	}
}
