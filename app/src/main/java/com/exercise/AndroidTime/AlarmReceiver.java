package com.exercise.AndroidTime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Toast.makeText(arg0, "Alarm received!", Toast.LENGTH_LONG).show();

		MediaPlayer objMediaPlayer = MediaPlayer.create(arg0, R.raw.intro_tata);
		objMediaPlayer.start();

	}



}
