package com.pchmn.materialchips.model;


import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Chip implements ChipInterface {

    private Object id;
    private Uri avatarUri;
    private Drawable avatarDrawable;
    private Bitmap avatarBitmap;
    private String label;
    private String info;

    public Chip(@NonNull Object id, @Nullable Uri avatarUri, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.avatarUri = avatarUri;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull Object id, @Nullable Drawable avatarDrawable, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.avatarDrawable = avatarDrawable;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull Object id, @Nullable Bitmap avatarBitmap, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.avatarBitmap = avatarBitmap;
        this.label = label;
        this.info = info;
    }

    public Chip(@Nullable Uri avatarUri, @NonNull String label, @Nullable String info) {
        this.avatarUri = avatarUri;
        this.label = label;
        this.info = info;
    }

    public Chip(@Nullable Drawable avatarDrawable, @NonNull String label, @Nullable String info) {
        this.avatarDrawable = avatarDrawable;
        this.label = label;
        this.info = info;
    }

    public Chip(@Nullable Bitmap avatarBitmap, @NonNull String label, @Nullable String info) {
        this.avatarBitmap = avatarBitmap;
        this.label = label;
        this.info = info;
    }

    // temporary solution for removing overloading ambiguity
    public Chip(@NonNull CharSequence id, @NonNull String label, @Nullable String info) {
        this.id = id;
        this.label = label;
        this.info = info;
    }

    public Chip(@NonNull String label, @Nullable String info) {
        this.label = label;
        this.info = info;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public Uri getAvatarUri() {
        return avatarUri;
    }

    @Override
    public Drawable getAvatarDrawable() {
        return avatarDrawable;
    }

    @Override
    public Bitmap getAvatarBitmap() {
        return avatarBitmap;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
