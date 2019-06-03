package com.aminography.primedatepicker.sample

import android.app.Application
import android.support.v7.app.AppCompatDelegate

/**
 * Created by aminography on 7/14/2018.
 */
@Suppress("unused")
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}

const val FONT_PATH_CIVIL = "fonts/Raleway-Regular.ttf"
const val FONT_PATH_PERSIAN = "fonts/IRANSans(FaNum).ttf"
const val FONT_PATH_HIJRI = "fonts/Amiri-Regular.ttf"