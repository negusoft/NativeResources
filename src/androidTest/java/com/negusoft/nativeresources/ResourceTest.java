package com.negusoft.nativeresources;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.IOException;

public class ResourceTest extends TestCase {

    private static final String SAMPLE_ID_NAME = "content";
    private static final String SAMPLE_STRING_NAME = "silent_mode";
    private static final String SAMPLE_DRAWABLE_NAME = "btn_check_buttonless_on";
    private static final String SAMPLE_COLOR_NAME = "darker_gray";
    private static final String SAMPLE_COLOR_STATE_LIST_NAME = "search_url_text";
    private static final String SAMPLE_BOOLEAN_NAME = "split_action_bar_is_narrow";
    private static final String SAMPLE_INTEGER_NAME = "kg_carousel_angle";
    private static final String SAMPLE_ANIM_NAME = "lock_screen_exit";
    private static final String SAMPLE_ANIMATOR_NAME = "fragment_open_exit";
    private static final String SAMPLE_DIMENSION_NAME = "app_icon_size";
    private static final String SAMPLE_FRACTION_NAME = "config_dimBehindFadeDuration";
    private static final String SAMPLE_STRING_ARRAY_NAME = "phoneTypes";
    private static final String SAMPLE_TYPED_ARRAY_NAME = "preloaded_drawables";
    private static final String SAMPLE_LAYOUT_NAME = "alert_dialog";
    private static final String SAMPLE_PLURALS_NAME = "num_seconds_ago";
    private static final String SAMPLE_XML_NAME = "autotext";
    private static final String SAMPLE_RAW_NAME = "fallbackring";
    private static final String SAMPLE_ATTR_NAME = "colorForeground";
    private static final String SAMPLE_INTERPOLATOR_NAME = "bounce";
    private static final String SAMPLE_MENU_NAME = "webview_copy";
    private static final String SAMPLE_MIPMAP_NAME = "sym_def_app_icon";
    private static final String SAMPLE_STYLE_NAME = "WindowTitleBackground";

    public void testIdentifierAccess() {
        assertTrue(NativeResources.getIdentifier(SAMPLE_ID_NAME) != 0);
        assertTrue(NativeResources.getStringIdentifier(SAMPLE_STRING_NAME) != 0);
        assertTrue(NativeResources.getDrawableIdentifier(SAMPLE_DRAWABLE_NAME) != 0);
        assertTrue(NativeResources.getColorIdentifier(SAMPLE_COLOR_NAME) != 0);
        assertTrue(NativeResources.getColorIdentifier(SAMPLE_COLOR_STATE_LIST_NAME) != 0);
        assertTrue(NativeResources.getBooleanIdentifier(SAMPLE_BOOLEAN_NAME) != 0);
        assertTrue(NativeResources.getIntegerIdentifier(SAMPLE_INTEGER_NAME) != 0);
        assertTrue(NativeResources.getAnimIdentifier(SAMPLE_ANIM_NAME) != 0);
        assertTrue(NativeResources.getAnimatorIdentifier(SAMPLE_ANIMATOR_NAME) != 0);
        assertTrue(NativeResources.getDimensionIdentifier(SAMPLE_DIMENSION_NAME) != 0);
        assertTrue(NativeResources.getFractionIdentifier(SAMPLE_FRACTION_NAME) != 0);
        assertTrue(NativeResources.getArrayIdentifier(SAMPLE_STRING_ARRAY_NAME) != 0);
        assertTrue(NativeResources.getArrayIdentifier(SAMPLE_TYPED_ARRAY_NAME) != 0);
        assertTrue(NativeResources.getLayoutIdentifier(SAMPLE_LAYOUT_NAME) != 0);
        assertTrue(NativeResources.getPluralsIdentifier(SAMPLE_PLURALS_NAME) != 0);
        assertTrue(NativeResources.getXmlIdentifier(SAMPLE_XML_NAME) != 0);
        assertTrue(NativeResources.getRawIdentifier(SAMPLE_RAW_NAME) != 0);
        assertTrue(NativeResources.getAttrIdentifier(SAMPLE_ATTR_NAME) != 0);
        assertTrue(NativeResources.getInterpolatorIdentifier(SAMPLE_INTERPOLATOR_NAME) != 0);
        assertTrue(NativeResources.getMenuIdentifier(SAMPLE_MENU_NAME) != 0);
        assertTrue(NativeResources.getMipmapIdentifier(SAMPLE_MIPMAP_NAME) != 0);
        assertTrue(NativeResources.getStyleIdentifier(SAMPLE_STYLE_NAME) != 0);
    }

    public void testString() {
        String string = NativeResources.getString(SAMPLE_STRING_NAME);
        Assert.assertNotNull(string);
        String stringWithArgs = NativeResources.getString(SAMPLE_STRING_NAME, new Object[]{});
        Assert.assertNotNull(stringWithArgs);
    }

    public void testDrawable() {
        Drawable drawable = NativeResources.getDrawable(SAMPLE_DRAWABLE_NAME);
        Assert.assertNotNull(drawable);
    }

    public void testColor() {
        NativeResources.getColor(SAMPLE_COLOR_NAME);
    }

    public void testColorStateList() {
        ColorStateList color = NativeResources.getColorStateList(SAMPLE_COLOR_STATE_LIST_NAME);
        Assert.assertNotNull(color);
    }

    public void testBoolean() {
        NativeResources.getBoolean(SAMPLE_BOOLEAN_NAME);
    }

    public void testInteger() {
        NativeResources.getIdentifier(SAMPLE_INTEGER_NAME);
    }

    public void testDimension() {
        NativeResources.getDimension(SAMPLE_DIMENSION_NAME);
        NativeResources.getDimensionPixelOffset(SAMPLE_DIMENSION_NAME);
        NativeResources.getDimensionPixelSize(SAMPLE_DIMENSION_NAME);
    }

    public void testFraction() {
        NativeResources.getFraction(SAMPLE_FRACTION_NAME);
    }

    public void testArray() {
        NativeResources.getStringArray(SAMPLE_STRING_ARRAY_NAME);
        NativeResources.getTextArray(SAMPLE_STRING_ARRAY_NAME);
        NativeResources.getTypedArray(SAMPLE_TYPED_ARRAY_NAME);
    }

    public void testLayout() {
        NativeResources.getLayout(SAMPLE_LAYOUT_NAME);
    }

    public void testPlurals() {
        Assert.assertNotNull(
                NativeResources.getQuantityString(SAMPLE_PLURALS_NAME, 0));
        Assert.assertNotNull(
                NativeResources.getQuantityString(SAMPLE_PLURALS_NAME, 0, new Object[] { 0 }));
        Assert.assertNotNull(
                NativeResources.getQuantityText(SAMPLE_PLURALS_NAME, 0));
    }

    public void testText() {
        NativeResources.getText(SAMPLE_STRING_NAME);
        CharSequence def = "Default";
        CharSequence result = NativeResources.getText("", def);
        Assert.assertEquals(result, def);
    }

    public void testXml() {
        NativeResources.getXml(SAMPLE_XML_NAME);
    }

    public void testRaw() {
        try {
            NativeResources.openRawResource(SAMPLE_RAW_NAME).close();
            NativeResources.openRawResource(SAMPLE_RAW_NAME, new TypedValue()).close();
            NativeResources.openRawResourceFd(SAMPLE_RAW_NAME).close();
        } catch (IOException e) {
            Assert.fail("Something went wrong dealing with the raw streams.");
        }
    }

}
