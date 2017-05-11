package com.CanicsMotion.LibGdXDemonlyCamel.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.CanicsMotion.LibGdXDemonlyCamel.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Demon Camel";
		config.width = 640;
		config.height = 480;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
