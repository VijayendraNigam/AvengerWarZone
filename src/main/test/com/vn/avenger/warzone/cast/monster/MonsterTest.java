package com.vn.avenger.warzone.cast.monster;

import static com.google.common.truth.Truth.assertThat;
import static com.vn.avenger.warzone.common.Tests.ARSENAL_NAME;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.PurchaseObject;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.GeneralVO;
import com.vn.avenger.warzone.vo.HealthVO;
import com.vn.avenger.warzone.vo.StatisticsVO;
import com.vn.avenger.warzone.vo.WealthVO;

public class MonsterTest {

	@Mock
	private CombatantStats monsterCombatantStats;

	@Mock
	private EquippedVO monsterEquipped;

	@Mock
	private StatisticsVO monsterStatistics;

	@Mock
	private GeneralVO monsterGeneral;

	@Mock
	private HealthVO monsterHealth;

	@Mock
	private WealthVO monsterWealth;

	@Mock
	private ArsenalPO monsterArsenal;

	@Mock
	private PurchaseObject monsterPurchaseObject;

	@Mock
	private Hero hero;

	@Mock
	private CombatantStats heroCombatantStats;

	@Mock
	private HealthVO heroHealth;

	private Monster monster;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		monster = new Monster(monsterCombatantStats);
		_init();
	}

	private void _init() {
		when(monsterCombatantStats.getEquipped()).thenReturn(monsterEquipped);
		when(monsterCombatantStats.getGeneral()).thenReturn(monsterGeneral);
		when(monsterCombatantStats.getWealth()).thenReturn(monsterWealth);
		when(monsterCombatantStats.getHealth()).thenReturn(monsterHealth);
		when(monsterCombatantStats.getStatistics()).thenReturn(monsterStatistics);
	}

	@Test
	public void testAcquire() {
		when(monsterArsenal.getName()).thenReturn(ARSENAL_NAME);

		MessageCodes code = monster.acquire(monsterArsenal);

		assertThat(code.getMessageKey()).isEqualTo(MessageCodes.ACQUIRE_SUCCESS.getMessageKey());
		assertThat(code.getArguments()).asList().contains(ARSENAL_NAME);

	}

	@Test
	public void testAvail() {
		when(monsterPurchaseObject.use(any(Combatant.class))).thenReturn(MessageCodes.BUY_SUCCESS);

		MessageCodes code = monster.avail(monsterPurchaseObject);

		assertThat(code.getMessageKey()).isEqualTo(MessageCodes.BUY_SUCCESS.getMessageKey());

	}

	@Test
	public void testDoAttack() {
		when(hero.getCombatantStats()).thenReturn(heroCombatantStats);
		when(heroCombatantStats.getHealth()).thenReturn(heroHealth);
		when(monsterGeneral.getXp()).thenReturn(100);

		monster.doAttack(hero);

		assertThat(monsterGeneral.getXp()).isEqualTo(100);
		assertThat(heroCombatantStats.getHealth().isAlive()).isFalse();

	}

	@Test
	public void testGetHomeView() {
		when(monsterGeneral.getLevel()).thenReturn(LEVELS.LEVEL_1);
		when(monsterEquipped.getAcquiredArsenal()).thenReturn(monsterArsenal);

		String screen = monster.getHomeView();

		assertThat(screen).isNotEmpty();
	}

	@Test
	public void testView() {
		when(monsterEquipped.getAcquiredArsenal()).thenReturn(monsterArsenal);

		String screen = monster.view();

		assertThat(screen).isNotEmpty();

	}

}
