package com.vn.avenger.warzone.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vn.avenger.warzone.common.Digest;
import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.ABSTRACT_FACTORY.FACTORY;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.common.impl.factory.AbstractFactory;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.GearPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;
import com.vn.avenger.warzone.shop.PurchaseObject;

public class EquippedVO implements ValueObject, Digest<PurchaseObject> {

	private static final long serialVersionUID = 1650687719962801826L;

	private List<ArsenalPO> arsenals;
	private List<GearPO> gears;
	private List<FirstAidPO> firstAids;
	private List<InstaHealthPO> instaHealths;
	private List<PotionPO> potions;

	public EquippedVO() {

		Factory<ArsenalPO, ARSENAL.TYPES> arsenalfactory = AbstractFactory.getFactory(FACTORY.ARSENAL);

		this.arsenals = new ArrayList<>(Arrays.asList(arsenalfactory.get(ARSENAL.TYPES.FISTS)));
		this.gears = new ArrayList<>();
		this.firstAids = new ArrayList<>();
		this.instaHealths = new ArrayList<>();
		this.potions = new ArrayList<>();
	}

	@Override
	public void digest(PurchaseObject purchaseObject) {

		if (purchaseObject instanceof ArsenalPO) {
			this.arsenals.add((ArsenalPO) purchaseObject);

		} else if (purchaseObject instanceof GearPO) {
			this.gears.add((GearPO) purchaseObject);

		} else if (purchaseObject instanceof FirstAidPO) {
			this.firstAids.add((FirstAidPO) purchaseObject);

		} else if (purchaseObject instanceof InstaHealthPO) {
			this.instaHealths.add((InstaHealthPO) purchaseObject);

		} else if (purchaseObject instanceof PotionPO) {
			this.potions.add((PotionPO) purchaseObject);

		}
	}

	public List<ArsenalPO> getArsenals() {
		return arsenals;
	}

	public EquippedVO setArsenals(List<ArsenalPO> arsenals) {
		this.arsenals = arsenals;
		return this;
	}

	public List<GearPO> getGears() {
		return gears;
	}

	public EquippedVO setGears(List<GearPO> gears) {
		this.gears = gears;
		return this;
	}

	public List<FirstAidPO> getFirstAids() {
		return firstAids;
	}

	public EquippedVO setFirstAids(List<FirstAidPO> firstAids) {
		this.firstAids = firstAids;
		return this;
	}

	public List<InstaHealthPO> getInstaHealths() {
		return instaHealths;
	}

	public EquippedVO setInstaHealths(List<InstaHealthPO> instaHealths) {
		this.instaHealths = instaHealths;
		return this;
	}

	public List<PotionPO> getPotions() {
		return potions;
	}

	public EquippedVO setPotions(List<PotionPO> potions) {
		this.potions = potions;
		return this;
	}

	@Override
	public String toString() {
		return "EquippedVO [arsenals=" + arsenals + ", gears=" + gears + ", firstAids=" + firstAids + ", instaHealths="
				+ instaHealths + ", potions=" + potions + "]";
	}

}
