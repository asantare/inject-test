package com.example

import io.micronaut.core.annotation.Introspected
import io.micronaut.core.annotation.ReflectiveAccess


interface PizzaTO {
    val name: String
    val isGood: Boolean
}

@Introspected
@ReflectiveAccess
data class MargheritaTO(
    override var name: String,
    override var isGood: Boolean,
) : PizzaTO


@Introspected
@ReflectiveAccess
data class SimpleTO(
    var name: String,
    var isGood: Boolean
)