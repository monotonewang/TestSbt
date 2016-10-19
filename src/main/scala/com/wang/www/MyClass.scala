package com.wang.www

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
  * Created by 7 on 2016/10/19.
  */
class MyClass extends Activity{
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.main)

    val title = findViewById(R.id.title).asInstanceOf[TextView]
    title.setText("Hello Scala!")
  }
}
