package com.vn.avenger.warzone.cast.hero;

import static com.google.common.truth.Truth.assertThat;
import static com.vn.avenger.warzone.common.Tests.ARSENAL_NAME;
import static com.vn.avenger.warzone.common.Tests.PURCHASE_OBJECT_NAME;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.PurchaseObject;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.GeneralVO;
import com.vn.avenger.warzone.vo.HealthVO;
import com.vn.avenger.warzone.vo.StatisticsVO;
import com.vn.avenger.warzone.vo.WealthVO;

public class HeroTest {

	@Mock
	private Monster monster;

	@Mock
	private GeneralVO monsterGeneral;

	@Mock
	private HealthVO monsterHealth;

	@Mock
	private WealthVO monsterWealth;

	@Mock
	private CombatantStats monsterCombatantStats;

	@Mock
	private CombatantStats attackedOnCombatantStats;

	@Mock
	private Combatant attackedOnCombatant;

	@Mock
	private HealthVO attackedOnHealth;

	@Mock
	private CombatantStats attackerCombatantStats;

	@Mock
	private ArsenalPO attackerArsenal;

	@Mock
	private EquippedVO attackerEquipped;

	@Mock
	private WealthVO attackerWealth;

	@Mock
	private HealthVO attackerHealth;

	@Mock
	private GeneralVO attackerGeneral;

	@Mock
	private StatisticsVO attackerStatistics;

	@Mock
	private PurchaseObject attackerPurchaseObject;

	private Hero hero;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		hero = new Hero(attackerCombatantStats);
		_init();
	}

	private void _init() {
		when(attackerCombatantStats.getEquipped()).thenReturn(attackerEquipped);
		when(attackerCombatantStats.getGeneral()).thenReturn(attackerGeneral);
		when(attackerCombatantStats.getWealth()).thenReturn(attackerWealth);
		when(attackerCombatantStats.getHealth()).thenReturn(attackerHealth);
		when(attackerCombatantStats.getStatistics()).thenReturn(attackerStatistics);
	}

	@Test
	public void testAcquire() {
		when(attackerArsenal.getName()).thenReturn(ARSENAL_NAME);

		MessageCodes code = hero.acquire(attackerArsenal);

		assertThat(code.getMessageKey()).isEqualTo(MessageCodes.ACQUIRE_SUCCESS.getMessageKey());
		assertThat(code.getArguments()).asList().contains(ARSENAL_NAME);

	}

	@Test
	public void testAvail() {
		when(attackerPurchaseObject.use(any(Combatant.class))).thenReturn(MessageCodes.BUY_SUCCESS);

		MessageCodes code = hero.avail(attackerPurchaseObject);

		assertThat(code.getMessageKey()).isEqualTo(MessageCodes.BUY_SUCCESS.getMessageKey());

	}

	@Test
	public void testDoAttack() {
		when(attackedOnCombatant.getCombatantStats()).thenReturn(attackedOnCombatantStats);
		when(attackedOnCombatantStats.getHealth()).thenReturn(attackedOnHealth);
		when(attackerGeneral.getXp()).thenReturn(100);

		hero.doAttack(attackedOnCombatant);

		assertThat(attackerGeneral.getXp()).isEqualTo(100);
		assertThat(attackedOnCombatantStats.getHealth().isAlive()).isFalse();

	}

	@Test
	public void testBuy() {
		when(attackerPurchaseObject.getName()).thenReturn(PURCHASE_OBJECT_NAME);
		when(attackerPurchaseObject.getPrice()).thenReturn(COINS.COUNT.TEN);

		MessageCodes code = hero.buy(attackerPurchaseObject);

		assertThat(code.getMessageKey()).isEqualTo(MessageCodes.BUY_FAIL_FUND.getMessageKey());
		assertThat(code.getArguments()).asList().contains(PURCHASE_OBJECT_NAME);

	}

	@Test
	public void testGetWarZoneView() {
		when(attackerGeneral.getLevel()).thenReturn(LEVELS.LEVEL_1);
		when(monster.getCombatantStats()).thenReturn(monsterCombatantStats);
		when(monsterCombatantStats.getGeneral()).thenReturn(monsterGeneral);
		when(monsterCombatantStats.getHealth()).thenReturn(monsterHealth);
		when(monsterCombatantStats.getWealth()).thenReturn(monsterWealth);

		String screen = hero.getWarZoneView(monster);

		assertThat(screen).isNotEmpty();

	}

	@Test
	public void testGetHomeView() {
		when(attackerGeneral.getLevel()).thenReturn(LEVELS.LEVEL_1);
		when(attackerEquipped.getAcquiredArsenal()).thenReturn(attackerArsenal);

		String screen = hero.getHomeView();

		assertThat(screen).isNotEmpty();
	}

	@Test
	public void testView() {
		when(attackerEquipped.getAcquiredArsenal()).thenReturn(attackerArsenal);

		String screen = hero.view();

		assertThat(screen).isNotEmpty();

	}

}
