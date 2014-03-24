package com.negusoft.nativeresources;

import android.graphics.drawable.Drawable;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ResourceTest extends TestCase {

    private static final String SAMPLE_ID_NAME = "content";
    private static final String SAMPLE_STRING_NAME = "silent_mode";
    private static final String SAMPLE_DRAWABLE_NAME = "btn_check_buttonless_on";
    private static final String SAMPLE_ANIM_NAME = "lock_screen_exit";
    private static final String SAMPLE_ANIMATOR_NAME = "fragment_open_exit";

    public void testIdentifier() {
        int id = NativeResources.getIdentifier(SAMPLE_ID_NAME);
        Assert.assertTrue(id != 0);
    }

    public void getStringIdentifier() {
        int id = NativeResources.getIdentifier(SAMPLE_STRING_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testString() {
        String string = NativeResources.getString(SAMPLE_STRING_NAME);
        Assert.assertNotNull(string);
    }

    public void testDrawableIdentifier() {
        int id = NativeResources.getDrawableIdentifier(SAMPLE_DRAWABLE_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testDrawable() {
        Drawable drawable = NativeResources.getDrawable(SAMPLE_DRAWABLE_NAME);
        Assert.assertNotNull(drawable);
    }

    public void testAnimIdentifier() {
        int id = NativeResources.getAnimIdentifier(SAMPLE_ANIM_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testAnimatorIdentifier() {
        int id = NativeResources.getAnimatorIdentifier(SAMPLE_ANIMATOR_NAME);
        Assert.assertTrue(id != 0);
    }

}
