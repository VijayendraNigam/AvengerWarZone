package com.vn.avenger.warzone.vo;

import java.util.ArrayList;
import java.util.List;

import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.GearPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;

public class EquippedVO implements ValueObject {

	private static final long serialVersionUID = 1650687719962801826L;

	private List<ArsenalPO> arsenals;
	private List<GearPO> gears;
	private List<FirstAidPO> firstAids;
	private List<InstaHealthPO> instaHealths;
	private List<PotionPO> potions;

	public EquippedVO() {
		this.arsenals = new ArrayList<>();
		this.gears = new ArrayList<>();
		this.firstAids = new ArrayList<>();
		this.instaHealths = new ArrayList<>();
		this.potions = new ArrayList<>();
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
