package com.theotechnologies.moonshine.binding;

import android.content.Context;

import com.theotechnologies.moonshine.binding.audio.AndroidAudioRenderer;
import com.theotechnologies.moonshine.binding.crypto.AndroidCryptoProvider;
import com.theotechnologies.moonshine.nvstream.av.audio.AudioRenderer;
import com.theotechnologies.moonshine.nvstream.http.LimelightCryptoProvider;

public class PlatformBinding {
    public static LimelightCryptoProvider getCryptoProvider(Context c) {
        return new AndroidCryptoProvider(c);
    }
}
