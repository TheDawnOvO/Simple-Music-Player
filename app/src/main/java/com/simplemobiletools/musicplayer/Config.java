package com.simplemobiletools.musicplayer;

import android.content.Context;
import android.content.SharedPreferences;

public class Config {
    private SharedPreferences mPrefs;

    public static Config newInstance(Context context) {
        return new Config(context);
    }

    public Config(Context context) {
        mPrefs = context.getSharedPreferences(Constants.PREFS_KEY, Context.MODE_PRIVATE);
    }

    public boolean getIsFirstRun() {
        return mPrefs.getBoolean(Constants.IS_FIRST_RUN, true);
    }

    public void setIsFirstRun(boolean firstRun) {
        mPrefs.edit().putBoolean(Constants.IS_FIRST_RUN, firstRun).apply();
    }

    public boolean getIsShuffleEnabled() {
        return mPrefs.getBoolean(Constants.SHUFFLE, true);
    }

    public void setShuffle(boolean shuffle) {
        mPrefs.edit().putBoolean(Constants.SHUFFLE, shuffle).apply();
    }
}
