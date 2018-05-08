package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.FIRST_AID;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.firstaid.ClassicFirstAid;

public class FirstAidFactory implements Factory<FirstAidPO, FIRST_AID.TYPES> {

	@Override
	public FirstAidPO get(FIRST_AID.TYPES firstAid) {

		switch (firstAid) {

		case CLASSIC:      return new ClassicFirstAid();
		default:           return new ClassicFirstAid();

		}
	}

}
