package com.CanicsMotion.LibGdXDemonlyCamel;


import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;
	Texture img;
	ArrayList<Box> boxes;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		player = new Player(0,0);
		player.setPosition(20, 20);
		boxes = new ArrayList<Box>();
		boxes.add(new Box(new Vector2(50,60)));
	}

	@Override
	public void render () {
		player.Controll();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		player.Draw(batch);
		for (Box box : boxes) {
			box.draw(batch);
		}
		batch.end();
	}
    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
    @Override
    public void dispose() {
        batch.dispose();
    }
    /// Das War Janek
}
