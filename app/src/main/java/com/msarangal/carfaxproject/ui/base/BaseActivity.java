package com.msarangal.carfaxproject.ui.base;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.msarangal.carfaxproject.data.prefs.PrefManager;

import java.util.Arrays;

/**
 * Created by Mandeep Sarangal on 21,April,2019
 */
public class BaseActivity extends AppCompatActivity {

    String[] perms = {"android.permission.CALL_PHONE"};
    private static final int permsRequestCode = 200;
    private static final String TAG = BaseActivity.class.getSimpleName();

    private String phoneNumber = "";

    protected void requestForRuntimePermissions(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // Request for permission
                requestPermissions(perms, permsRequestCode);
            } else {
                // Already given, no request required
                savePermsInSharedPrefs(true);
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(callIntent);
                return;
            }

        } else {
            savePermsInSharedPrefs(true);
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        Log.d(TAG, Arrays.toString(grantResults));
        switch (requestCode) {
            case permsRequestCode:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // User clicked ALLOW
                    savePermsInSharedPrefs(true);
                    requestForRuntimePermissions(phoneNumber);
                } else {
                    // User clicked DENY
                    savePermsInSharedPrefs(false);
                }
        }
    }

    private void savePermsInSharedPrefs(boolean permission) {
        PrefManager.setCallPermission(permission);
    }
}
