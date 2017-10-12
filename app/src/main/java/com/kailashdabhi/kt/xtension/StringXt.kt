package com.kailashdabhi.kt.xtension

/**
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date   8/21/2017 11:19 PM
 */
fun String.capitalizedWord(): String {
  val words = replace('_', ' ').toLowerCase()
      .split(" ".toRegex())
      .dropLastWhile { it.isEmpty() }
      .toTypedArray()
  var aString = ""
  for (word in words) {
    aString = aString + word.substring(0, 1).toUpperCase() + word.substring(1) + " "
  }
  return aString;
}