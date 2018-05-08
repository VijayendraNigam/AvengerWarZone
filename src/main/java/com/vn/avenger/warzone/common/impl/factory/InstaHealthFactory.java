package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.instahealth.QuadraInstaHealth;
import com.vn.avenger.warzone.shop.instahealth.TedraInstaHealth;

public class InstaHealthFactory implements Factory<InstaHealthPO, INSTA_HEALTH.TYPES> {

	@Override
	public InstaHealthPO get(INSTA_HEALTH.TYPES instaHealth) {

		switch (instaHealth) {

		case QUADRA:		return new QuadraInstaHealth();
		case TEDRA:		return new TedraInstaHealth();
		default:			return new QuadraInstaHealth();
		
		}

	}

}
