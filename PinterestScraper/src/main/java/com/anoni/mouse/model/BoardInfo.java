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
 * <strong>BoardInfo</strong> is the information on boards an user created.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class BoardInfo {
    /** Title of the tag. **/
    private String title;
    /** Board by full name. **/
    private String boardByFullName;
    /** Hyper link of the board. **/
    private String href;
    /** {@link ImageInfo} of the board cover. **/
    private ImageInfo boardCover;
    /** List of {@link ImageInfo} of board thumbnails. **/
    private List<ImageInfo> boardThumbs;
    /** Pin detail of the thumbs. **/
    private String pinDetailThumb;
    /** Total number of pin counts. **/
    private String pinCount;

    /**
     * 
     */
    public BoardInfo() {
    }

    /**
     * @param title
     * @param boardByFullName
     * @param href
     * @param boardCover
     * @param boardThumbs
     * @param pinDetailThumb
     * @param pinCount
     */
    public BoardInfo(String title, String boardByFullName, String href, ImageInfo boardCover,
            List<ImageInfo> boardThumbs, String pinDetailThumb, String pinCount) {
        super();
        this.title = title;
        this.boardByFullName = boardByFullName;
        this.href = href;
        this.boardCover = boardCover;
        this.boardThumbs = boardThumbs;
        this.pinDetailThumb = pinDetailThumb;
        this.pinCount = pinCount;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the boardByFullName
     */
    public String getBoardByFullName() {
        return boardByFullName;
    }

    /**
     * @param boardByFullName
     *            the boardByFullName to set
     */
    public void setBoardByFullName(String boardByFullName) {
        this.boardByFullName = boardByFullName;
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
     * @return the boardCover
     */
    public ImageInfo getBoardCover() {
        return boardCover;
    }

    /**
     * @param boardCover
     *            the boardCover to set
     */
    public void setBoardCover(ImageInfo boardCover) {
        this.boardCover = boardCover;
    }

    /**
     * @return the boardThumbs
     */
    public List<ImageInfo> getBoardThumbs() {
        return boardThumbs;
    }

    /**
     * @param boardThumbs
     *            the boardThumbs to set
     */
    public void setBoardThumbs(List<ImageInfo> boardThumbs) {
        this.boardThumbs = boardThumbs;
    }

    /**
     * @return the pinDetailThumb
     */
    public String getPinDetailThumb() {
        return pinDetailThumb;
    }

    /**
     * @param pinDetailThumb
     *            the pinDetailThumb to set
     */
    public void setPinDetailThumb(String pinDetailThumb) {
        this.pinDetailThumb = pinDetailThumb;
    }

    /**
     * @return the pinCount
     */
    public String getPinCount() {
        return pinCount;
    }

    /**
     * @param pinCount
     *            the pinCount to set
     */
    public void setPinCount(String pinCount) {
        this.pinCount = pinCount;
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
