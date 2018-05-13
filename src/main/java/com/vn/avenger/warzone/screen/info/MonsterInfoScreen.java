package com.vn.avenger.warzone.screen.info;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.screen.Window;

public class MonsterInfoScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                  Monster Information                 |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   Which monster would you like to know about ?       |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);

		int i = 1;
		for (MONSTER monster : MONSTER.values()) {
			screen.append("|  ").append(i++).append(") ").append(monster.getMonsterName()).append(NEWLINE);
		}

		screen.append("|  ").append(i++).append(") Back").append(NEWLINE);
		screen.append("|______________________________________________________").append(NEWLINE);

		return screen.toString();
	}
	
}
