package com.kailashdabhi.kt.xtension

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

/**
 * @author Kailash Dabhi (kailash09dabhi@gmail.com)
 * @date   9/7/2017 1:13 PM
 */

fun Context.toast(message: String) {
  Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.email(email: String, subject: String = "", text: String = ""): Boolean {
  val intent = Intent(Intent.ACTION_SENDTO)
  intent.data = Uri.parse("mailto:")
  intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
  if (subject.isNotEmpty())
    intent.putExtra(Intent.EXTRA_SUBJECT, subject)
  if (text.isNotEmpty())
    intent.putExtra(Intent.EXTRA_TEXT, text)
  if (intent.resolveActivity(packageManager) != null) {
    startActivity(intent)
    return true
  }
  return false

}