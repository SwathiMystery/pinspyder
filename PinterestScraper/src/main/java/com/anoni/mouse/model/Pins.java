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

import java.util.List;

import com.anoni.mouse.utils.JSONFormatter;

/**
 * <p>
 * <strong>Pins</strong> is the information of the pins the user pinned onto a
 * board.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class Pins {
    /** Link to the pin. **/
    private String pinhref;
    /** {@link ImageInfo} of pins. **/
    private ImageInfo pinImageInfo;
    /** Description of the pins. **/
    private String pinDescription;
    /** {@link PinAttribution} Attribution of the pins. **/
    private PinAttribution pinAttribution;
    /** Pin found on domain. **/
    private String pinDomain;
    /** {@link PinTag} Hash tags of the pins. **/
    private List<PinTag> pinTags;
    /** {@link PinCredits} Pin Credits of the pins. **/
    private PinCredits pinCredits;
    /** {@link SocialItem} Pin repins. **/
    private SocialItem pinRepin;
    /** {@link SocialItem} Pin likes. **/
    private SocialItem pinLike;

    /**
     * Default Constructor.
     */
    public Pins() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param pinhref
     * @param pinImageInfo
     * @param pinDescription
     * @param pinAttribution
     * @param pinDomain
     * @param pinTags
     * @param pinCredits
     * @param pinRepin
     * @param pinLike
     */
    public Pins(String pinhref, ImageInfo pinImageInfo, String pinDescription, PinAttribution pinAttribution,
            String pinDomain, List<PinTag> pinTags, PinCredits pinCredits, SocialItem pinRepin, SocialItem pinLike) {
        super();
        this.pinhref = pinhref;
        this.pinImageInfo = pinImageInfo;
        this.pinDescription = pinDescription;
        this.pinAttribution = pinAttribution;
        this.pinDomain = pinDomain;
        this.pinTags = pinTags;
        this.pinCredits = pinCredits;
        this.pinRepin = pinRepin;
        this.pinLike = pinLike;
    }

    /**
     * @return the pinhref
     */
    public String getPinhref() {
        return pinhref;
    }

    /**
     * @param pinhref
     *            the pinhref to set
     */
    public void setPinhref(String pinhref) {
        this.pinhref = pinhref;
    }

    /**
     * @return the pinImageInfo
     */
    public ImageInfo getPinImageInfo() {
        return pinImageInfo;
    }

    /**
     * @param pinImageInfo
     *            the pinImageInfo to set
     */
    public void setPinImageInfo(ImageInfo pinImageInfo) {
        this.pinImageInfo = pinImageInfo;
    }

    /**
     * @return the pinDescription
     */
    public String getPinDescription() {
        return pinDescription;
    }

    /**
     * @param pinDescription
     *            the pinDescription to set
     */
    public void setPinDescription(String pinDescription) {
        this.pinDescription = pinDescription;
    }

    /**
     * @return the pinAttribution
     */
    public PinAttribution getPinAttribution() {
        return pinAttribution;
    }

    /**
     * @param pinAttribution
     *            the pinAttribution to set
     */
    public void setPinAttribution(PinAttribution pinAttribution) {
        this.pinAttribution = pinAttribution;
    }

    /**
     * @return the pinDomain
     */
    public String getPinDomain() {
        return pinDomain;
    }

    /**
     * @param pinDomain
     *            the pinDomain to set
     */
    public void setPinDomain(String pinDomain) {
        this.pinDomain = pinDomain;
    }

    /**
     * @return the pinTags
     */
    public List<PinTag> getPinTags() {
        return pinTags;
    }

    /**
     * @param pinTags
     *            the pinTags to set
     */
    public void setPinTags(List<PinTag> pinTags) {
        this.pinTags = pinTags;
    }

    /**
     * @return the pinCredits
     */
    public PinCredits getPinCredits() {
        return pinCredits;
    }

    /**
     * @param pinCredits
     *            the pinCredits to set
     */
    public void setPinCredits(PinCredits pinCredits) {
        this.pinCredits = pinCredits;
    }

    /**
     * @return the pinRepin
     */
    public SocialItem getPinRepin() {
        return pinRepin;
    }

    /**
     * @param pinRepin
     *            the pinRepin to set
     */
    public void setPinRepin(SocialItem pinRepin) {
        this.pinRepin = pinRepin;
    }

    /**
     * @return the pinLike
     */
    public SocialItem getPinLike() {
        return pinLike;
    }

    /**
     * @param pinLike
     *            the pinLike to set
     */
    public void setPinLike(SocialItem pinLike) {
        this.pinLike = pinLike;
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
