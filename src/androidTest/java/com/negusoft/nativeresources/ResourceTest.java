package com.negusoft.nativeresources;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ResourceTest extends TestCase {

    private static final String SAMPLE_ID_NAME = "content";
    private static final String SAMPLE_STRING_NAME = "silent_mode";
    private static final String SAMPLE_DRAWABLE_NAME = "btn_check_buttonless_on";
    private static final String SAMPLE_COLOR_NAME = "darker_gray";
    private static final String SAMPLE_COLOR_STATE_LIST_NAME = "search_url_text";
    private static final String SAMPLE_BOOLEAN_NAME = "split_action_bar_is_narrow";
    private static final String SAMPLE_ANIM_NAME = "lock_screen_exit";
    private static final String SAMPLE_ANIMATOR_NAME = "fragment_open_exit";
    private static final String SAMPLE_DIMENSION_NAME = "app_icon_size";

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
        NativeResources.getDrawableIdentifier(SAMPLE_DRAWABLE_NAME);
    }

    public void testDrawable() {
        Drawable drawable = NativeResources.getDrawable(SAMPLE_DRAWABLE_NAME);
        Assert.assertNotNull(drawable);
    }

    public void testColorIdentifier() {
        // test a simple color
        int simpleId = NativeResources.getColorIdentifier(SAMPLE_COLOR_NAME);
        Assert.assertTrue(simpleId != 0);
        // test a state list color
        int stateListId = NativeResources.getColorIdentifier(SAMPLE_COLOR_STATE_LIST_NAME);
        Assert.assertTrue(stateListId != 0);
    }

    public void testColor() {
        NativeResources.getColor(SAMPLE_COLOR_NAME);
    }

    public void testColorStateList() {
        ColorStateList color = NativeResources.getColorStateList(SAMPLE_COLOR_STATE_LIST_NAME);
        Assert.assertNotNull(color);
    }

    public void testBooleanIdentifier() {
        int id = NativeResources.getBooleanIdentifier(SAMPLE_BOOLEAN_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testBoolean() {
        NativeResources.getBoolean(SAMPLE_BOOLEAN_NAME);
    }

    public void testAnimIdentifier() {
        int id = NativeResources.getAnimIdentifier(SAMPLE_ANIM_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testAnimatorIdentifier() {
        int id = NativeResources.getAnimatorIdentifier(SAMPLE_ANIMATOR_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testDimensionIdentifier() {
        int id = NativeResources.getDimensionIdentifier(SAMPLE_DIMENSION_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testDimension() {
        NativeResources.getDimension(SAMPLE_DIMENSION_NAME);
        NativeResources.getDimensionPixelOffset(SAMPLE_DIMENSION_NAME);
        NativeResources.getDimensionPixelSize(SAMPLE_DIMENSION_NAME);
    }

}
