package com.cucumberspringboot.preference.stepDefinitions;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
@Repeatable(value = Givens.class)
@interface Given {
    String value() default "";
}
