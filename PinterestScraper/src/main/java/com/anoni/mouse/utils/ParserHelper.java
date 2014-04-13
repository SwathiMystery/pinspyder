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

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * <p>
 * A helper utility class for parsing the DOM.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class ParserHelper {

    /**
     * 
     * @param className
     * @param rootHeader
     * @return
     */
    public static Element getFirstOfElementsByClass(String className, Element rootHeader) {
        Elements elements = rootHeader.getElementsByClass(className);
        if (elements != null && !elements.isEmpty()) {
            Element element = rootHeader.getElementsByClass(className).get(0);
            return element;
        }
        return null;
    }
    
    /**
     * 
     * @param className
     * @param boardElement
     * @return
     */
    public static Elements getElementsByClass(String className, Element boardElement) {
        Elements elements = boardElement.getElementsByClass(className);
        if (elements != null && !elements.isEmpty()) {
            return elements;
        }
        return null;
    }
}
