package com.smartdevs.startserviceboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			Intent pushIntent = new Intent(context, NotificationService.class);
			context.startService(pushIntent);
		}
	}

}
