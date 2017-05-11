package com.CanicsMotion.LibGdXDemonlyCamel;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

import javafx.scene.transform.Translate;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	
	Player player;
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player(5,5);
	}

	@Override
	public void render () {
		player.Controll();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		player.Draw(batch);
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
