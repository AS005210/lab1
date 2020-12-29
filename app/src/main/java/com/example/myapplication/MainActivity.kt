package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {



    var tags = listOf<String>(
        "youtube", "p", "mess",
        "linlin", "twitter", "game",
        "apple", "face", "youtube",
        "p", "mess", "linlin", "twitter",
        "game", "apple", "face")
    companion object {
        var tempId = R.id.RestartButton;
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_main)
        tags = tags.shuffle();
    }


    fun init(view: View) {
        tags = tags.shuffle();
        val apple1: ImageButton = findViewById(R.id.i1);
        apple1.tag = tags[0]
        val apple2: ImageButton = findViewById(R.id.i2);
        apple2.tag = tags[1]
        val Ananas1: ImageButton = findViewById(R.id.i3);
        Ananas1.tag = tags[2]
        val Ananas2: ImageButton = findViewById(R.id.i4);
        Ananas2.tag = tags[3]
        val Apesin1: ImageButton = findViewById(R.id.i5);
        Apesin1.tag = tags[4]
        val Apesin2: ImageButton = findViewById(R.id.i6);
        Apesin2.tag = tags[5]
        val Banan1: ImageButton = findViewById(R.id.i7);
        Banan1.tag = tags[6]
        val Banan2: ImageButton = findViewById(R.id.i8);
        Banan2.tag = tags[7]
        val Cherry1: ImageButton = findViewById(R.id.i9);
        Cherry1.tag = tags[8]
        val Cherry2: ImageButton = findViewById(R.id.i10);
        Cherry2.tag = tags[9]
        val Sliva1: ImageButton = findViewById(R.id.i11);
        Sliva1.tag = tags[10]
        val Sliva2: ImageButton = findViewById(R.id.i12);
        Sliva2.tag = tags[11]
        val Strawberry1: ImageButton = findViewById(R.id.i13);
        Strawberry1.tag = tags[12]
        val Strawberry2: ImageButton = findViewById(R.id.i14);
        Strawberry2.tag = tags[13]
        val Vinograd1: ImageButton = findViewById(R.id.i15);
        Vinograd1.tag = tags[14]
        val Vinograd2: ImageButton = findViewById(R.id.i16);
        Vinograd2.tag = tags[15]

    }
    fun <T> Iterable<T>.shuffle(): List<T> {
        val list = this.toMutableList().apply {  }
        Collections.shuffle(list)
        return list
    }

    fun onNewGameClick(view: View) {
        setContentView(R.layout.activity_main)
        init(view);
    }

    fun onExitClick (view: View) {
        finish();
        System.exit(0);
    }

    fun onBackClick (view: View) {
        setContentView(R.layout.menu_main)
    }

    fun onClickButton(view: View) {
        val LastButton: ImageButton = findViewById(tempId)
        val CurrentButton: ImageButton = findViewById(view.id)
        when(view.tag) {
            "p" -> {
                CurrentButton.setImageResource(R.drawable.p)
                compare(LastButton, CurrentButton, view)
            }
            "youtube" -> {
                CurrentButton.setImageResource(R.drawable.youtube)
                compare(LastButton, CurrentButton, view)
            }
            "twitter" -> {
                CurrentButton.setImageResource(R.drawable.ttt)
                compare(LastButton, CurrentButton, view)
            }
            "game" -> {
                CurrentButton.setImageResource(R.drawable.game)
                compare(LastButton, CurrentButton, view)
            }
            "apple" -> {
                CurrentButton.setImageResource(R.drawable.applee)
                compare(LastButton, CurrentButton, view)
            }
            "mess" -> {
                CurrentButton.setImageResource(R.drawable.mess)
                compare(LastButton, CurrentButton, view)
            }
            "linlin" -> {
                CurrentButton.setImageResource(R.drawable.linlin)
                compare(LastButton, CurrentButton, view)
            }
            "face" -> {
                CurrentButton.setImageResource(R.drawable.face)
                compare(LastButton, CurrentButton, view)
            }

        }
    }
    fun compare(LastButton: ImageButton, CurrentButton: ImageButton, view: View) {
        if ( (LastButton.getTag() == CurrentButton.getTag()) && tempId != view.id )
        {
            android.os.Handler().postDelayed({
                CurrentButton.visibility = View.INVISIBLE
                LastButton.visibility = View.INVISIBLE
            }, 300)
            return
        }
        if ( tempId != R.id.RestartButton && tempId != view.id ) {
            LastButton.setImageResource(R.drawable.smilea)
        }
        tempId = view.id
    }

    fun onRestartClick (view: View) {
        setContentView(R.layout.activity_main)
        init(view)
        tempId = R.id.RestartButton
    }

}