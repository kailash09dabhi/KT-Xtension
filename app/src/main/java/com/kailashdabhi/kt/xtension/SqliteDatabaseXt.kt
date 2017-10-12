package com.kailashdabhi.kt.xtension

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

/**
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date   8/22/2017 10:43 PM
 */

fun <T> SQLiteDatabase.perform(query: String, func: (Cursor) -> T): List<T> {
  return rawQuery(query, null).eachRow {
    func(it)
  }
}