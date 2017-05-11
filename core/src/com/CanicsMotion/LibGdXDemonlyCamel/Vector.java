package com.CanicsMotion.LibGdXDemonlyCamel;

public class Vector {
	public float x;
	public float y;
	public static final Vector ZERO = new Vector(0,0);
	public Vector(float _x,float _y){
		x = _x;
		y = _y;
	}
	public Vector(){
		x = 0;
		y = 0;
	}
	
	public Vector Mult(Vector v){
		return new Vector(v.x * x,v.y * y);
	}
	public Vector Add(Vector v){
		return new Vector(v.x + x,v.y + y);
	}
}
