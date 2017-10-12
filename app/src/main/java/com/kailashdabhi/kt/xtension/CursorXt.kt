package com.kailashdabhi.kt.xtension

import android.database.Cursor
import android.util.Log

/**
 * @author Kailash Dabhi
 * @date 8/5/2017 11:03 PM
 */
fun Cursor.forEach(body: (Cursor) -> Unit) {
  if (count > 0) {
    try {
      moveToFirst()
      do {
        body(this)
      } while (moveToNext())
    } catch (e: Exception) {
    }
  }
  close()
}

fun <T> Cursor.eachRow(body: (Cursor) -> T): List<T> {
  val list = arrayListOf<T>()
  if (count > 0) {
    try {
      moveToFirst()
      do {
        list.add(body(this))
      } while (moveToNext())
    } catch (e: Exception) {
      Log.e("", e.toString())
    }
  }
  close()
  return list
}

fun <T> Cursor.toObject(default: T, body: (Cursor) -> T): T {
  var toObject = default
  if (count > 0) {
    try {
      moveToFirst()
      do {
        toObject = body(this)
      } while (moveToNext())
    } catch (e: Exception) {
      Log.e("", e.toString())
    }
  }
  close()
  return toObject
}


fun Cursor.int(columnName: String): Int = getInt(getColumnIndexOrThrow(columnName))

fun Cursor.string(columnName: String): String = getString(getColumnIndexOrThrow(columnName))

fun Cursor.long(columnName: String): Long = getLong(getColumnIndexOrThrow(columnName))

fun Cursor.boolean(columnName: String): Boolean {
  val BOOLEAN_TRUE = 1
  return getInt(getColumnIndexOrThrow(columnName)) == BOOLEAN_TRUE
}
