package com.jaeckel.geth.json;

import com.squareup.moshi.JsonQualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@JsonQualifier
public @interface Hex {
}
