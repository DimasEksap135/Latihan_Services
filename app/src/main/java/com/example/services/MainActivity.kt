package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
//import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mendeklarasikan var media player dan memanggil data Mp3
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.music)

        // button play
        btn_play.setOnClickListener{
            mediaPlayer?.start()
        }
        // button pause
        btn_pause.setOnClickListener{
            mediaPlayer?.pause()
        }
        // button stop
        btn_stop.setOnClickListener{
            mediaPlayer?.pause()
            mediaPlayer?.seekTo(0)
        }

        // button fb
        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/dmas.sses"))
            startActivity(i)
        })
        // button ig
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/dimaseksap"))
            startActivity(i)
        })
        // button twitter
        btn_twt.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/dimaseksap"))
            startActivity(i)
        })



    }
}
