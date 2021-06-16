package com.olympic.cis143.m05.student.homework.annotations1;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
public @interface FoodItem
{
	public String value() default "food";
}
