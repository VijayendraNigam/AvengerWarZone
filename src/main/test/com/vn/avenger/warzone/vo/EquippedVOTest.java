package com.vn.avenger.warzone.vo;

import static com.google.common.truth.Truth.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;

public class EquippedVOTest {

	@Mock
	private ArsenalPO arsenal;

	@Mock
	private FirstAidPO firstAid;

	@Mock
	private InstaHealthPO instaHealth;

	@Mock
	private PotionPO potion;

	@Mock
	private FoodPO food;

	private EquippedVO equipped;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		equipped = new EquippedVO();
	}

	@Test
	public void testStock() {
		equipped.stock(arsenal);
		equipped.stock(firstAid);
		equipped.stock(instaHealth);
		equipped.stock(potion);
		equipped.stock(food);

		assertThat(equipped.getArsenals()).contains(arsenal);
		assertThat(equipped.getFirstAids()).contains(firstAid);
		assertThat(equipped.getInstaHealths()).contains(instaHealth);
		assertThat(equipped.getPotions()).contains(potion);
		assertThat(equipped.getFood()).contains(food);

	}

	@Test
	public void testConsume() {

		equipped.getArsenals().addAll(Arrays.asList(arsenal));
		equipped.getFirstAids().addAll(Arrays.asList(firstAid));
		equipped.getInstaHealths().addAll(Arrays.asList(instaHealth, instaHealth, instaHealth));
		equipped.getPotions().addAll(Arrays.asList(potion, potion, potion, potion));
		equipped.getFood().addAll(Arrays.asList(food, food, food, food, food));

		equipped.consume(arsenal);
		equipped.consume(firstAid);
		equipped.consume(instaHealth);
		equipped.consume(potion);
		equipped.consume(food);

		assertThat(equipped.getArsenals()).hasSize(1);
		assertThat(equipped.getFirstAids()).isEmpty();
		assertThat(equipped.getInstaHealths()).hasSize(2);
		assertThat(equipped.getPotions()).hasSize(3);
		assertThat(equipped.getFood()).hasSize(4);

	}

}
