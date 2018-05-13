package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.game.info.AchievementInfo;
import com.vn.avenger.warzone.game.info.ArsenalInfo;
import com.vn.avenger.warzone.game.info.FirstAidInfo;
import com.vn.avenger.warzone.game.info.FoodInfo;
import com.vn.avenger.warzone.game.info.InstaHealthInfo;
import com.vn.avenger.warzone.game.info.MonsterInfo;
import com.vn.avenger.warzone.game.info.PotionInfo;
import com.vn.avenger.warzone.game.info.XPInfo;
import com.vn.avenger.warzone.ui.Gui;

public class Help {

	private Help() {

	}

	public static void view() {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.HELP));

			switch (Gui.in.readInt()) {

			case 1:
				MonsterInfo.info();
				break;

			case 2:
				ArsenalInfo.info();
				break;

			case 3:
				break;

			case 4:
				FirstAidInfo.info();
				break;

			case 5:
				InstaHealthInfo.info();
				break;

			case 6:
				PotionInfo.info();
				break;

			case 7:
				FoodInfo.info();
				break;

			case 8:
				XPInfo.info();
				break;

			case 9:
				AchievementInfo.info();
				break;

			case 10:
				return;

			default:
				break;

			}
		}
	}
}
