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
package com.anoni.mouse.model;

import com.anoni.mouse.utils.JSONFormatter;

/**
 * <p>
 * <strong> TopSource </strong> is the class which is the top sources of pins of
 * the user.
 * The attributes of the top source can be href, image information and name.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class TopSource {
    /** Link of the top source. **/
    private String href;
    /** {@link ImageInfo} Image information ie. alt and src of the top sources. **/
    private ImageInfo imageInfo;
    /** Top Sources Name. **/
    private String name;

    /**
     * 
     */
    public TopSource() {
        super();
    }

    /**
     * @param href
     * @param imageInfo
     * @param name
     */
    public TopSource(String href, ImageInfo imageInfo, String name) {
        super();
        this.href = href;
        this.imageInfo = imageInfo;
        this.name = name;
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href
     *            the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return the imageInfo
     */
    public ImageInfo getImageInfo() {
        return imageInfo;
    }

    /**
     * @param imageInfo
     *            the imageInfo to set
     */
    public void setImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a JSON string corresponding to object state
     * 
     * @return JSON representation
     */
    public String toJSON() {
        return JSONFormatter.toJSON(this);
    }

    @Override
    public String toString() {
        return toJSON();
    }

}
