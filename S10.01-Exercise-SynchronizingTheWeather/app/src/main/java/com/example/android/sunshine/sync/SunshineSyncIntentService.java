// TODO (5) Create a new class called SunshineSyncIntentService that extends IntentService
//  TODO (6) Create a constructor that calls super and passes the name of this class
//  TODO (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class SunshineSyncIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your superclass's constructor.
     *
     * and pass this class name as an argument.
     * The name is Used to name the worker thread, important only for debugging.
     */
    public SunshineSyncIntentService() {
        super(SunshineSyncIntentService.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}