package net.k3rnel.server.battle.type;

import net.k3rnel.server.battle.Type;

public class Earth extends Type {
	
	public Earth() {
		setName("Earth");
	}
	
	@Override
	public Effectiveness isEffective(TypeName opponent) {
		// TODO Auto-generated method stub
		switch (opponent){
		case FIRE :
			return (Effectiveness.IMPERVIOUS);
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
