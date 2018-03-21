package com.inf.os.fileup;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MessagingService extends FirebaseMessagingService {

    private final static String TAG = "Tag Message";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e(TAG, "The Message : " + remoteMessage.getData());
        Log.e(TAG, "From: " + remoteMessage.getNotification());
    }
}
