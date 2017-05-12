package com.CanicsMotion.LibGdXDemonlyCamel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player extends Sprite{
	Texture img;
	public float speed = 2;
	private Vector2 position;
	
	public Player(float _x ,float _y){
		super(new Texture("badlogic.jpg"));
		setPosition(new Vector2(_x,_y));
	}
	public Player(Vector2 v){
		super(new Texture("badlogic.jpg"));
		setPosition(v);
	}
	
	public void Draw(SpriteBatch batch){
		this.draw(batch);
	}
	
	public void Update(){
		
	}
	public void Controll(){
		Vector2 mov = new Vector2(0,0);
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
			mov.add( new Vector2(0,1));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			mov.add( new Vector2(0,-1));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			mov.add( new Vector2(-1,0));
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			mov.add( new Vector2(1,0));
		}
		mov.nor();
		setPosition(position.add( mov.mulAdd(mov, speed)));
	}
	public Vector2 getPosition() {
		return position;
	}
	public void setPosition(Vector2 position) {
		this.position = position;
		this.setX(position.x);
		this.setY(position.y);
	}
}