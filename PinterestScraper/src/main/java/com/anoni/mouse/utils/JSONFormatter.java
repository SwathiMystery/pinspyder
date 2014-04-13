/**
 * -----------------------------------------------------------------------------
 *  Copyright (c) 2014 Swathi Venkatachala
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 *to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *copies of the Software, and to permit persons to whom the Software is
 *furnished to do so, subject to the following conditions:
 *
 *The above copyright notice and this permission notice shall be included in
 *all copies or substantial portions of the Software.
 *
 *THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *THE SOFTWARE.
 *
 *---------------------------END COPYRIGHT--------------------------------------
 */
package com.anoni.mouse.utils;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * <p>
 * JSONFormatter converts objects to JSON representation and vice-versa. This is
 * a helper class for JSON.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public final class JSONFormatter {

    private JSONFormatter() {
    }

    /**
     * Gson instantiation.
     */
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    /**
     * Converts a Raw Type to JSON String.
     * 
     * @param <T>
     *            Type to be converted
     * @param t
     *            Object of the type
     * @return JSON representation
     */
    public static <T> String toJSON(T t) {
        return GSON.toJson(t);
    }

    public static <T> String toJSON(T t, Type type) {
        return GSON.toJson(t, type);
    }

    /**
     * Converts a JSON String to object representation.
     * 
     * @param <T>
     *            Type to be converted
     * @param responseString
     *            JSON representation
     * @param clazz
     *            Target class
     * @return Object of the target type
     */
    public static <T> T fromJSON(String responseString, Class<T> clazz) {
        T t = null;
        t = GSON.fromJson(responseString, clazz);
        return t;
    }

    public static <T> T fromJSON(String responseString, Type type) {
        T t = null;
        t = GSON.fromJson(responseString, type);
        return t;
    }

    /**
     * Method to convert to JSON Tree.
     * 
     * @param t
     *            type
     * @return json element
     */
    public static <T> JsonElement toJSONTree(T t) {
        return GSON.toJsonTree(t);
    }

}
