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
 * <strong> SocialItem </strong> is the information of repins and likes: links
 * and count.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class SocialItem {
    /** href of the social item. **/
    private String socialItemHref;
    /** Count of likes and repins. **/
    private String socialMetaCount;

    /**
     * @return the socialItemHref
     */
    public String getSocialItemHref() {
        return socialItemHref;
    }

    /**
     * @param socialItemHref
     *            the socialItemHref to set
     */
    public void setSocialItemHref(String socialItemHref) {
        this.socialItemHref = socialItemHref;
    }

    /**
     * @return the socialMetaCount
     */
    public String getSocialMetaCount() {
        return socialMetaCount;
    }

    /**
     * @param socialMetaCount
     *            the socialMetaCount to set
     */
    public void setSocialMetaCount(String socialMetaCount) {
        this.socialMetaCount = socialMetaCount;
    }

    /**
     * 
     */
    public SocialItem() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param socialItemHref
     * @param socialMetaCount
     */
    public SocialItem(String socialItemHref, String socialMetaCount) {
        super();
        this.socialItemHref = socialItemHref;
        this.socialMetaCount = socialMetaCount;
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
