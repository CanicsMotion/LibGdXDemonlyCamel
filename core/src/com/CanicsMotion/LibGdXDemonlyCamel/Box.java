package com.CanicsMotion.LibGdXDemonlyCamel;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Box extends Sprite{
	public Box(Vector2 v){
		super(new Texture("devBox.jpg"));
		this.setX(v.x);
		this.setY(v.y);
	}
}
