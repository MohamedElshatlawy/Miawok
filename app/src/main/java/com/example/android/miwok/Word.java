package com.example.android.miwok;

/**
 * Created by BinaryWorld on 17-Sep-16.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioId;
    private boolean hasImage;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int mAudioId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioId = mAudioId;
        this.hasImage=false;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId,int mAudioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioId = mAudioId;
        this.hasImage=true;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getmAudioId() {
        return mAudioId;
    }

    public  boolean isHasImage() {
        return hasImage;
    }
}
