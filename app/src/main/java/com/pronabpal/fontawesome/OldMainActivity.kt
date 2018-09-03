package com.pronabpal.fontawesome

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main1.*
import java.util.regex.Pattern


class OldMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        textFont.text = "\uf2bd"
        clickTofont.setOnClickListener {
                textFont.text = convertUnicode(inUni.getText())  }
        fontScreen.invalidate()
    }


    fun convertUnicode(s: CharSequence): String {
        val result = StringBuffer()
        val m = Pattern.compile("\\\\u([0-9a-zA-Z]{4,4})\\b").matcher(s)
        while (m.find()) {
            val c = Integer.parseInt(m.group(1), 16).toChar()
            m.appendReplacement(result, c.toString())
        }
        m.appendTail(result)
        return result.toString()
    }
}
