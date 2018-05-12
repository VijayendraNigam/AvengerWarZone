package com.vn.avenger.warzone.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vn.avenger.warzone.common.Commodity;
import com.vn.avenger.warzone.common.Helper;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.GearPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;
import com.vn.avenger.warzone.shop.PurchaseObject;

public class EquippedVO implements ValueObject, Commodity<PurchaseObject> {

	private static final long serialVersionUID = 1650687719962801826L;

	private ArsenalPO acquiredArsenal;
	private List<ArsenalPO> arsenals;
	private List<GearPO> gears;
	private List<FirstAidPO> firstAids;
	private List<InstaHealthPO> instaHealths;
	private List<PotionPO> potions;

	public EquippedVO() {
		this.acquiredArsenal = Helper.ARSENAL_FACTORY.get(ARSENAL.TYPES.FISTS);
		this.arsenals = new ArrayList<>(Arrays.asList(acquiredArsenal));
		this.gears = new ArrayList<>();
		this.firstAids = new ArrayList<>();
		this.instaHealths = new ArrayList<>();
		this.potions = new ArrayList<>();
	}

	@Override
	public void stock(PurchaseObject purchaseObject) {

		if (purchaseObject instanceof ArsenalPO) {
			this.arsenals.add((ArsenalPO) purchaseObject);

			if (arsenals.isEmpty()) {
				arsenals.add(Helper.ARSENAL_FACTORY.get(ARSENAL.TYPES.FISTS));
			}

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

	@Override
	public void consume(PurchaseObject purchaseObject) {

		if (purchaseObject instanceof ArsenalPO) {
			this.arsenals.remove((ArsenalPO) purchaseObject);

		} else if (purchaseObject instanceof GearPO) {
			this.gears.remove((GearPO) purchaseObject);

		} else if (purchaseObject instanceof FirstAidPO) {
			this.firstAids.remove((FirstAidPO) purchaseObject);

		} else if (purchaseObject instanceof InstaHealthPO) {
			this.instaHealths.remove((InstaHealthPO) purchaseObject);

		} else if (purchaseObject instanceof PotionPO) {
			this.potions.remove((PotionPO) purchaseObject);

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

	public ArsenalPO getAcquiredArsenal() {
		return acquiredArsenal;
	}

	public EquippedVO setAcquiredArsenal(ArsenalPO acquiredArsenal) {
		this.acquiredArsenal = acquiredArsenal;
		return this;
	}

	@Override
	public String toString() {
		return "EquippedVO [acquiredArsenal=" + acquiredArsenal + ", arsenals=" + arsenals + ", gears=" + gears
				+ ", firstAids=" + firstAids + ", instaHealths=" + instaHealths + ", potions=" + potions + "]";
	}

}
