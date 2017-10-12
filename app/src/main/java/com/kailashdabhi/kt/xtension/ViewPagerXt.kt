package com.kailashdabhi.kt.xtension

import android.support.v4.view.ViewPager

/**
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date   8/22/2017 12:48 AM
 */
fun ViewPager.onPageSelected(body: (pageNo: Int) -> Unit) =
    addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
      override fun onPageScrollStateChanged(state: Int) {
      }

      override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
      }

      override fun onPageSelected(position: Int) {
        body(position);
      }
    })
