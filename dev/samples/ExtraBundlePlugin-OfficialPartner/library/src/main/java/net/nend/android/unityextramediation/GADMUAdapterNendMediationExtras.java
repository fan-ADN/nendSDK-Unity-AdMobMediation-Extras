package net.nend.android.unityextramediation;

import android.os.Bundle;
import android.text.TextUtils;

import com.google.ads.mediation.nend.NendAdapter;

import java.util.HashMap;

@SuppressWarnings("unused")
public class GADMUAdapterNendMediationExtras {
    public Bundle buildExtras(HashMap<String, String> extras) {
        Bundle bundle = new Bundle();

        if (extras.get(NendAdapter.KEY_INTERSTITIAL_TYPE).equals("interstitialTypeVideo")) {
            bundle.putSerializable(NendAdapter.KEY_INTERSTITIAL_TYPE, NendAdapter.InterstitialType.TYPE_VIDEO);

            String userId = extras.get(NendAdapter.KEY_USER_ID);
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
