/*******************************************************************************
 * Copyright 2014 NEGU Soft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.negusoft.nativeresources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

import java.io.InputStream;

/**
 * Utility class to get native android resources.
 */
public class NativeResources {

    private static final String NATIVE_PACKAGE = "android";

    private static final String TYPE_ID = "id";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_DRAWABLE = "drawable";
    private static final String TYPE_COLOR = "color";
    private static final String TYPE_BOOL = "bool";
    private static final String TYPE_INTEGER = "integer";
    private static final String TYPE_ANIM = "anim";
    private static final String TYPE_ANIMATOR = "animator";
    private static final String TYPE_DIMEN = "dimen";
    private static final String TYPE_FRACTION = "fraction";
    private static final String TYPE_ARRAY = "array";
    private static final String TYPE_LAYOUT = "layout";
    private static final String TYPE_PLURALS = "plurals";
    private static final String TYPE_XML = "xml";
    private static final String TYPE_RAW = "raw";

    /** Get a native identifier by name as in 'R.id.name'. */
    public static int getIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ID, NATIVE_PACKAGE);
    }

    /** Get a native string id by name as in 'R.string.name'. */
    public static int getStringIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_STRING, NATIVE_PACKAGE);
    }

    /** Get a native drawable by name as in 'R.drawable.name'. */
    public static String getString(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_STRING, NATIVE_PACKAGE);
        return res.getString(id);
    }

    /** Get a native drawable by name as in 'R.drawable.name'. */
    public static String getString(String name, Object... formatArgs) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_STRING, NATIVE_PACKAGE);
        return res.getString(id, formatArgs);
    }

    /** Get a native drawable id by name as in 'R.drawable.name'. */
    public static int getDrawableIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_DRAWABLE, NATIVE_PACKAGE);
    }

    /** Get a native drawable by name as in 'R.drawable.name'. */
    public static Drawable getDrawable(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_DRAWABLE, NATIVE_PACKAGE);
        return res.getDrawable(id);
    }

    /** Get a native drawable id by name as in 'R.drawable.name'. */
    public static int getColorIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_COLOR, NATIVE_PACKAGE);
    }

    /** Get a native drawable by name as in 'R.drawable.name'. */
    public static int getColor(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_COLOR, NATIVE_PACKAGE);
        return res.getColor(id);
    }

    /** Get a native drawable by name as in 'R.drawable.name'. */
    public static ColorStateList getColorStateList(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_COLOR, NATIVE_PACKAGE);
        return id == 0 ? null : res.getColorStateList(id);
    }

    /** Get a native boolean id by name as in 'R.bool.name'. */
    public static int getBooleanIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_BOOL, NATIVE_PACKAGE);
    }

    /** Get a native boolean by name as in 'R.bool.name'. */
    public static boolean getBoolean(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_BOOL, NATIVE_PACKAGE);
        return res.getBoolean(id);
    }

    /** Get a native integer id by name as in 'R.integer.name'. */
    public static int getIntegerIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_INTEGER, NATIVE_PACKAGE);
    }

    /** Get a native integer by name as in 'R.integer.name'. */
    public static int getInteger(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_INTEGER, NATIVE_PACKAGE);
        return res.getInteger(id);
    }

    /** Get a native id by name as in 'R.bool.name'. */
    public static int getAnimIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ANIM, NATIVE_PACKAGE);
    }

    /** Get a native id by name as in 'R.animator.name'. */
    public static int getAnimatorIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ANIMATOR, NATIVE_PACKAGE);
    }

    /** Get a native dimension id by name as in 'R.dimen.name'. */
    public static int getDimensionIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_DIMEN, NATIVE_PACKAGE);
    }

    /** Get a native dimension by name as in 'R.dimen.name'. */
    public static float getDimension(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_DIMEN, NATIVE_PACKAGE);
        return res.getDimension(id);
    }

    /** Get a native dimension by name as in 'R.dimen.name'. */
    public static int getDimensionPixelOffset(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_DIMEN, NATIVE_PACKAGE);
        return res.getDimensionPixelOffset(id);
    }

    /** Get a native dimension by name as in 'R.dimen.name'. */
    public static int getDimensionPixelSize(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_DIMEN, NATIVE_PACKAGE);
        return res.getDimensionPixelSize(id);
    }

    /** Get a native fraction id by name as in 'R.fraction.name'. */
    public static int getFractionIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_FRACTION, NATIVE_PACKAGE);
    }

    /** Get a native fraction by name as in 'R.fraction.name'. */
    public static float getFraction(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_FRACTION, NATIVE_PACKAGE);
        return res.getFraction(id, 1, 1);
    }

    /** Get a native array id by name as in 'R.array.name'. */
    public static int getArrayIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ARRAY, NATIVE_PACKAGE);
    }

    /** Get a native int array by name as in 'R.array.name'. */
    public static int[] getIntArray(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_ARRAY, NATIVE_PACKAGE);
        return res.getIntArray(id);
    }

    /** Get a native string array by name as in 'R.array.name'. */
    public static String[] getStringArray(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_ARRAY, NATIVE_PACKAGE);
        return res.getStringArray(id);
    }

    /** Get a native string array by name as in 'R.array.name'. */
    public static CharSequence[] getTextArray(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_ARRAY, NATIVE_PACKAGE);
        return res.getTextArray(id);
    }

    /** Get a native typed array by name as in 'R.array.name'. */
    public static TypedArray getTypedArray(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_ARRAY, NATIVE_PACKAGE);
        return res.obtainTypedArray(id);
    }

    /** Get a native layout id by name as in 'R.fraction.name'. */
    public static int getLayoutIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_LAYOUT, NATIVE_PACKAGE);
    }

    /** Get a native layout by name as in 'R.fraction.name'. */
    public static XmlResourceParser getLayout(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_LAYOUT, NATIVE_PACKAGE);
        return res.getLayout(id);
    }

    /** Get a native plurals id by name as in 'R.plurals.name'. */
    public static int getPluralsIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_PLURALS, NATIVE_PACKAGE);
    }

    /** Get a native plurals by name as in 'R.plurals.name'. */
    public static String getQuantityString(String name, int quantity) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_PLURALS, NATIVE_PACKAGE);
        return res.getQuantityString(id, quantity);
    }

    /** Get a native plurals by name as in 'R.plurals.name'. */
    public static String getQuantityString(String name, int quantity, Object... formatArgs) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_PLURALS, NATIVE_PACKAGE);
        return res.getQuantityString(id, quantity, formatArgs);
    }

    /** Get a native plurals by name as in 'R.plurals.name'. */
    public static CharSequence getQuantityText(String name, int quantity) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_PLURALS, NATIVE_PACKAGE);
        return res.getQuantityText(id, quantity);
    }

    /** Get a native string by name as in 'R.string.name'. */
    public static CharSequence getText(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_STRING, NATIVE_PACKAGE);
        return res.getText(id);
    }

    /** Get a native string by name as in 'R.string.name'. */
    public static CharSequence getText(String name, CharSequence def) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_STRING, NATIVE_PACKAGE);
        return res.getText(id, def);
    }

    /** Get a native xml id by name as in 'R.xml.name'. */
    public static int getXmlIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_XML, NATIVE_PACKAGE);
    }

    /** Get a native integer by name as in 'R.xml.name'. */
    public static XmlResourceParser getXml(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_XML, NATIVE_PACKAGE);
        return res.getXml(id);
    }

    /** Get a native raw id by name as in 'R.raw.name'. */
    public static int getRawIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_RAW, NATIVE_PACKAGE);
    }

    /** Open a native raw resource by name as in 'R.raw.name'. */
    public static InputStream openRawResource(String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_RAW, NATIVE_PACKAGE);
        return res.openRawResource(id);
    }

    /** Open a native raw resource by name as in 'R.raw.name'. */
    public static InputStream openRawResource(String name, TypedValue value) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_RAW, NATIVE_PACKAGE);
        return res.openRawResource(id, value);
    }

    /** Open a native raw resource by name as in 'R.raw.name'. */
    public static AssetFileDescriptor openRawResourceFd (String name) {
        Resources res = Resources.getSystem();
        int id = res.getIdentifier(name, TYPE_RAW, NATIVE_PACKAGE);
        return res.openRawResourceFd(id);
    }

}