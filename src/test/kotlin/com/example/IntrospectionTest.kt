package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.micronaut.core.beans.BeanIntrospection

class IntrospectionTest : StringSpec() {

    init {
        "test properties of complex TO" {
            val introspection = BeanIntrospection.getIntrospection(MargheritaTO::class.java)

            val name = introspection.getProperty("name").orElse(null)
            name shouldNotBe null
            name.isReadOnly shouldBe false

            val isGood = introspection.getProperty("good").orElse(null)
            isGood shouldNotBe null
            isGood.isReadOnly shouldBe false
        }

        "test properties of simple TO" {
            val introspection = BeanIntrospection.getIntrospection(MargheritaTO::class.java)

            val name = introspection.getProperty("name").orElse(null)
            name shouldNotBe null
            name.isReadOnly shouldBe false

            val isGood = introspection.getProperty("good").orElse(null)
            isGood shouldNotBe null
            isGood.isReadOnly shouldBe false
        }
    }

}
