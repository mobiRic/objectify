package com.googlecode.objectify.test.entity;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Embed;

/**
 */
@Embed
@Cache
public class Someone
{
	public Name name;
	public int age;

	public Someone()
	{
	}

	public Someone(Name name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
