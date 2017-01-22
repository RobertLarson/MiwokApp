package com.example.android.miwok;

import android.view.View;

/**
 * Created by rlarson on 1/1/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId = NO_AUDIO_PROVIDED;
    private static final int NO_AUDIO_PROVIDED = -1;

    public Word(String defaultTranslation,
                String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation,
                String miwokTranslation,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation,
                String miwokTranslation,
                int audioResourceId,
                int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    int getImageResourceId() {
        return mImageResourceId;
    }
    int getAudioResourceId() {
        return mAudioResourceId;
    }

    boolean hasImage() {
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
