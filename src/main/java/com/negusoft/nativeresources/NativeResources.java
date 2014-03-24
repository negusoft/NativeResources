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

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/**
 * Utility class to get native android resources.
 */
public class NativeResources {

    private static final String NATIVE_PACKAGE = "android";

    private static final String TYPE_ID = "id";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_DRAWABLE = "drawable";
    private static final String TYPE_ANIM = "anim";
    private static final String TYPE_ANIMATOR = "animator";

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
        return id == 0 ? null : res.getString(id);
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
        return id == 0 ? null : res.getDrawable(id);
    }

    /** Get a native id by name as in 'R.anim.name'. */
    public static int getAnimIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ANIM, NATIVE_PACKAGE);
    }

    /** Get a native id by name as in 'R.animator.name'. */
    public static int getAnimatorIdentifier(String name) {
        Resources res = Resources.getSystem();
        return res.getIdentifier(name, TYPE_ANIMATOR, NATIVE_PACKAGE);
    }


}