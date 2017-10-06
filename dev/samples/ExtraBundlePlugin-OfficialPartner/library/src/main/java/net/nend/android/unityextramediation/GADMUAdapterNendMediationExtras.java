package net.nend.android.unityextramediation;

import android.os.Bundle;
import android.text.TextUtils;

import com.google.ads.mediation.nend.NendAdapter;

import java.util.HashMap;

@SuppressWarnings("unused")
public class GADMUAdapterNendMediationExtras {

    public Bundle buildExtras(HashMap<String, String> extras) {

        Bundle bundle = new Bundle();

        String type = extras.get("type");
        if (TextUtils.isEmpty(type)) {
            return null;
        }

        if (type.equals("interstitialTypeVideo")) {
            bundle.putSerializable(NendAdapter.KEY_INTERSTITIAL_TYPE, NendAdapter.InterstitialType.TYPE_VIDEO);

            String userId = extras.get("userId");
            if (!TextUtils.isEmpty(userId)) {
                bundle.putString(NendAdapter.KEY_USER_ID, userId);
            }

        } else {
            bundle.putSerializable(NendAdapter.KEY_INTERSTITIAL_TYPE, NendAdapter.InterstitialType.TYPE_NORMAL);
        }

        return bundle;
    }

    public Class getAdapterClass() {
        return NendAdapter.class;
    }
}