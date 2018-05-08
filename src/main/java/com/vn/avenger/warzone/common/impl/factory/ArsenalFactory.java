package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.arsenal.AssaultRifle;
import com.vn.avenger.warzone.shop.arsenal.Chainsaw;
import com.vn.avenger.warzone.shop.arsenal.Fists;
import com.vn.avenger.warzone.shop.arsenal.Hammer;
import com.vn.avenger.warzone.shop.arsenal.Knife;
import com.vn.avenger.warzone.shop.arsenal.Pistol;
import com.vn.avenger.warzone.shop.arsenal.Shotgun;
import com.vn.avenger.warzone.shop.arsenal.SniperRifle;

public class ArsenalFactory implements Factory<ArsenalPO, ARSENAL.TYPES> {

	@Override
	public ArsenalPO get(ARSENAL.TYPES arsenal) {

		switch (arsenal) {

		case FISTS:          return new Fists();
		case KNIFE:          return new Knife();
		case HAMMER:         return new Hammer();
		case CHAINSAW:       return new Chainsaw();
		case PISTOL:         return new Pistol();
		case SHOT_GUN:       return new Shotgun();
		case SNIPER_RIFLE:   return new SniperRifle();
		case ASSAULT_RIFLE:  return new AssaultRifle();
		default:             return new Fists();
		}

	}

}
