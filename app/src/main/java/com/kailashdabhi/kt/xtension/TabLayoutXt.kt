package com.kailashdabhi.kt.xtension

import android.support.design.widget.TabLayout

/**
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date   8/22/2017 1:29 AM
 */

fun TabLayout.add(body: TabLayout.() -> TabLayout.Tab) {
  addTab(this.body())
}

fun TabLayout.tab(body: TabLayout.Tab.() -> TabLayout.Tab): TabLayout.Tab = newTab().body()
