package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.screen.AboutScreen;
import com.vn.avenger.warzone.screen.HelpScreen;
import com.vn.avenger.warzone.screen.HeroScreen;
import com.vn.avenger.warzone.screen.ModeScreen;
import com.vn.avenger.warzone.screen.ReloadScreen;
import com.vn.avenger.warzone.screen.UsernameScreen;
import com.vn.avenger.warzone.screen.WelcomeScreen;
import com.vn.avenger.warzone.screen.Window;
import com.vn.avenger.warzone.screen.info.AchievementInfoScreen;
import com.vn.avenger.warzone.screen.info.ArsenalInfoScreen;
import com.vn.avenger.warzone.screen.info.FirstAidInfoScreen;
import com.vn.avenger.warzone.screen.info.FoodInfoScreen;
import com.vn.avenger.warzone.screen.info.InstaHealthInfoScreen;
import com.vn.avenger.warzone.screen.info.MonsterInfoScreen;
import com.vn.avenger.warzone.screen.info.PotionInfoScreen;
import com.vn.avenger.warzone.screen.info.XpInfoScreen;

public class ScreenFactory implements Factory<Window<String>, SCREENS.TYPES> {

	@Override
	public Window<String> get(SCREENS.TYPES screen) {

		switch (screen) {

		case WELCOME:                 return new WelcomeScreen();
		case ABOUT:                   return new AboutScreen();
		case HELP:                    return new HelpScreen();
		case ACHIEVEMENT_INFO:        return new AchievementInfoScreen();
		case ARSENAL_INFO:            return new ArsenalInfoScreen();
		case FIRST_AID_INFO:          return new FirstAidInfoScreen();
		case INSTA_HEALTH_INFO:       return new InstaHealthInfoScreen();
		case FOOD_INFO:               return new FoodInfoScreen();
		case MONSTER_INFO:            return new MonsterInfoScreen();
		case POTION_INFO:             return new PotionInfoScreen();
		case XP_INFO:                 return new XpInfoScreen();
		case RELOAD:                  return new ReloadScreen();
		case MODE:                    return new ModeScreen();
		case USERNAME:                return new UsernameScreen();
		case HERO:                    return new HeroScreen();
		default:                      return new WelcomeScreen();

		}
	}

}
