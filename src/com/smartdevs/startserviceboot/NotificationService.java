package com.smartdevs.startserviceboot;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;

public class NotificationService extends Service {

	private static final int myNotificationId = 1;

	@Override
	public void onStart(Intent intent, int startId) {
		displayNotification(createBasicNotification());
	};

	@Override
	public IBinder onBind(Intent intent) {

		return null;
	}

	private Notification createBasicNotification() {
		NotificationCompat.Builder builder = new Builder(
				getApplicationContext());
		Notification notification = builder
				.setSmallIcon(R.drawable.ic_launcher)
				.setContentTitle("Service on boot complete")
				.setContentText("SmartDev Companys Example").build();

		return notification;
	}

	private void displayNotification(Notification notification) {
		NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.notify(myNotificationId, notification);
	}

}
