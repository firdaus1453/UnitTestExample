package com.github.instrumenttestexample

/**
 * Created by Muhammad Firdaus on 07/01/2020.
 */
class CuboidModel(
    private var width: Double = 0.0,
    private var length: Double = 0.0,
    private var height: Double = 0.0
) {
    fun save(w: Double, l: Double, h: Double) {
        width = w
        length = l
        height = h
    }

    fun getVolume(): Double {
        return width * length * height
    }

    fun getSurfaceArea(): Double {
        val wl = width * length
        val wh = width * height
        val lh = length * height
        return 2 * (wl + wh + lh)
    }

    fun getCircumference(): Double {
        return 4 * (width * length * height)
    }
}