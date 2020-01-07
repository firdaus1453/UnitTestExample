package com.github.instrumenttestexample

/**
 * Created by Muhammad Firdaus on 07/01/2020.
 */
class MainViewModel(private val cuboidModel: CuboidModel) {
    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(w,l,h)
    }

    fun getCircumference():Double{
        return cuboidModel.getCircumference()
    }

    fun getSurfaceArea():Double{
        return cuboidModel.getSurfaceArea()
    }

    fun getVolume():Double{
        return cuboidModel.getVolume()
    }
}