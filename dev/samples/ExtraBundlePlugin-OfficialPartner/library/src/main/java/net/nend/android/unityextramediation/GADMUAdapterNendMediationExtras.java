package net.nend.android.unityextramediation;

import android.os.Bundle;
import android.text.TextUtils;

import com.google.ads.mediation.nend.NendAdapter;

import java.util.HashMap;

@SuppressWarnings("unused")
public class GADMUAdapterNendMediationExtras {

    static final String KEY_INTERSTITIAL_TYPE = "key_interstitial_type";
    static final String KEY_USER_ID = "key_user_id";

    public Bundle buildExtras(HashMap<String, String> extras) {

        Bundle bundle = new Bundle();

        String type = extras.get("type");
        if (TextUtils.isEmpty(type)) {
            return null;
        }

        if (type != null && type.equals("interstitialTypeVideo")) {
            bundle.putSerializable(KEY_INTERSTITIAL_TYPE, NendAdapter.InterstitialType.TYPE_VIDEO);

            String userId = extras.get("userId");
            if (!TextUtils.isEmpty(userId)) {
                bundle.putString(KEY_USER_ID, userId);
            }

        } else {
            bundle.putSerializable(KEY_INTERSTITIAL_TYPE, NendAdapter.InterstitialType.TYPE_NORMAL);
        }

        return bundle;
    }

    public Class getAdapterClass() {
        return NendAdapter.class;
    }
}