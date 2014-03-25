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
        String stringWithArgs = NativeResources.getString(SAMPLE_STRING_NAME, new Object[]{});
        Assert.assertNotNull(stringWithArgs);
    }

    public void testDrawableIdentifier() {
        int id = NativeResources.getDrawableIdentifier(SAMPLE_DRAWABLE_NAME);
        Assert.assertTrue(id != 0);
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

    public void testIntegerIdentifier() {
        int id = NativeResources.getIntegerIdentifier(SAMPLE_INTEGER_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testInteger() {
        NativeResources.getIdentifier(SAMPLE_INTEGER_NAME);
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

    public void testFractionIdentifier() {
        int id = NativeResources.getFractionIdentifier(SAMPLE_FRACTION_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testFraction() {
        NativeResources.getFraction(SAMPLE_FRACTION_NAME);
    }

    public void testArrayIdentifier() {
        int stringArrayId = NativeResources.getArrayIdentifier(SAMPLE_STRING_ARRAY_NAME);
        Assert.assertTrue(stringArrayId != 0);
        int typedArrayId = NativeResources.getArrayIdentifier(SAMPLE_TYPED_ARRAY_NAME);
        Assert.assertTrue(typedArrayId != 0);
    }

    public void testArray() {
        NativeResources.getStringArray(SAMPLE_STRING_ARRAY_NAME);
        NativeResources.getTextArray(SAMPLE_STRING_ARRAY_NAME);
        NativeResources.getTypedArray(SAMPLE_TYPED_ARRAY_NAME);
    }

    public void testLayoutIdentifier() {
        int id = NativeResources.getLayoutIdentifier(SAMPLE_LAYOUT_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testLayout() {
        NativeResources.getLayout(SAMPLE_LAYOUT_NAME);
    }

    public void testPluralsIdentifier() {
        int id = NativeResources.getPluralsIdentifier(SAMPLE_PLURALS_NAME);
        Assert.assertTrue(id != 0);
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

    public void testXmlIdentifier() {
        int id = NativeResources.getXmlIdentifier(SAMPLE_XML_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testXml() {
        NativeResources.getXml(SAMPLE_XML_NAME);
    }

    public void testRawIdentifier() {
        int id = NativeResources.getRawIdentifier(SAMPLE_RAW_NAME);
        Assert.assertTrue(id != 0);
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

    public void testAttrIdentifier() {
        int id = NativeResources.getAttrIdentifier(SAMPLE_ATTR_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testInterpolatorIdentifier() {
        int id = NativeResources.getInterpolatorIdentifier(SAMPLE_INTERPOLATOR_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testMenuIdentifier() {
        int id = NativeResources.getMenuIdentifier(SAMPLE_MENU_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testMipmapIdentifier() {
        int id = NativeResources.getMipmapIdentifier(SAMPLE_MIPMAP_NAME);
        Assert.assertTrue(id != 0);
    }

    public void testStyleIdentifier() {
        int id = NativeResources.getStyleIdentifier(SAMPLE_STYLE_NAME);
        Assert.assertTrue(id != 0);
    }

}
