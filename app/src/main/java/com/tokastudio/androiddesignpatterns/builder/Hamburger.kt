package com.tokastudio.androiddesignpatterns.builder

class Hamburger private constructor(
    private val bread: Boolean,
    private val ham: Boolean,
    private val cheese: Boolean,
    private val tomatoes: Boolean
) {

    class Builder{
        private val bread: Boolean= true
        private var ham: Boolean= false
        private var cheese: Boolean= false
        private var tomatoes: Boolean= false

//        fun bread(value: Boolean) {
//            bread= value
//        }
        fun ham(value: Boolean)= apply{ ham= value }
        fun cheese(value: Boolean)= apply{ cheese= value }
        fun tomatoes(value: Boolean)= apply{ tomatoes= value }

        fun build()= Hamburger(bread,ham,cheese,tomatoes)
    }

    fun showDetails(): String{
        var res= ""
        if (bread) res+= "Bread, "
        if (ham) res+= "Ham, "
        if (cheese) res+= "Cheese, "
        if (tomatoes) res+= "Tomatoes, "
        return res
    }
}