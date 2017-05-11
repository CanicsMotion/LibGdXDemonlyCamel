package com.CanicsMotion.LibGdXDemonlyCamel;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javafx.scene.input.KeyCode;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player {
	public Vector pos = Vector.ZERO;
	Texture img;
	public float speed = 2;
	
	public Player(float _x ,float _y){
		pos = new Vector(_x,_y);
		img = new Texture("badlogic.jpg");
	}
	public Player(Vector v){
		pos = v;
		img = new Texture("badlogic.jpg");
	}
	
	public void Draw(SpriteBatch batch){
		batch.draw(img,pos.x, pos.y);
	}
	
	public void Update(){
		
	}
	public void Controll(){
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
			pos.y+=speed;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			pos.y-=speed;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			pos.x-=speed;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			pos.x+=speed;
		}
	}
}
