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
 * <strong>PinCredits</strong> is the credits of a pin.
 * </p>
 * 
 * @author swathi
 * 
 */
public class PinCredits {
    /** Link to credits. **/
    private String href;
    /** {@link ImageInfo} of credit pins. **/
    private ImageInfo creditImageInfo;
    /** Name of credit pins. **/
    private String creditName;
    /** Title of the credit pins. **/
    private String creditTitle;

    /**
     * 
     */
    public PinCredits() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param href
     * @param creditImageInfo
     * @param creditName
     * @param creditTitle
     */
    public PinCredits(String href, ImageInfo creditImageInfo, String creditName, String creditTitle) {
        super();
        this.href = href;
        this.creditImageInfo = creditImageInfo;
        this.creditName = creditName;
        this.creditTitle = creditTitle;
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
     * @return the creditImageInfo
     */
    public ImageInfo getCreditImageInfo() {
        return creditImageInfo;
    }

    /**
     * @param creditImageInfo
     *            the creditImageInfo to set
     */
    public void setCreditImageInfo(ImageInfo creditImageInfo) {
        this.creditImageInfo = creditImageInfo;
    }

    /**
     * @return the creditName
     */
    public String getCreditName() {
        return creditName;
    }

    /**
     * @param creditName
     *            the creditName to set
     */
    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    /**
     * @return the creditTitle
     */
    public String getCreditTitle() {
        return creditTitle;
    }

    /**
     * @param creditTitle
     *            the creditTitle to set
     */
    public void setCreditTitle(String creditTitle) {
        this.creditTitle = creditTitle;
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
