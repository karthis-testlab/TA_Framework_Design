package com.test.architect.bridge.design.pattern;

public class EngineFactory {

	public static UiElementAction engineToRun(EngineType engineType) {
		switch (engineType) {
		case SELENIUM:
			return new SeleniumEngine();
		case PLAYWRIGHT:
			return new PlaywrightEngine();
		default:
			return null;
		}
	}

}