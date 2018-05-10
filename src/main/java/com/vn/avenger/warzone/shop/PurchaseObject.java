package com.vn.avenger.warzone.shop;

import java.io.Serializable;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;
import com.vn.avenger.warzone.screen.Window;

public interface PurchaseObject extends Window<String>, Serializable {

	public String getName();

	public COINS.COUNT getPrice();

	public float getPower();

	public ENERGY getEnergy();

	public LEVELS getMimimumLevelNeeded();
}
