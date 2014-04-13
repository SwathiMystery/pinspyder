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
 * <strong>UserPofileInfo</strong> information - pinterest user. Represents the
 * biography of the user, website, facebook URL, Twitter URL, Followers,
 * Following, likes count, location details, name of the user, total no. of
 * pins, profile image, top sources of the pins.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class UserProfileInfo {
    /** Bio of the user. **/
    private String bio;
    /** Website URL of the person. **/
    private String website;
    /** Count of the no. of boards. **/
    private String boardsCount;
    /** URL Facebook. **/
    private String facebook;
    /** URL of Twitter. **/
    private String twitter;
    /** Count of the no. of followers. **/
    private String followersCount;
    /** Count of the no. of following. **/
    private String followingCount;
    /** Count of the no. of likes. **/
    private String noOfLikes;
    /** Location details ie. latitude and longitude. **/
    private String location;
    /** Name of the user. **/
    private String name;
    /** Count of the no. of pins. **/
    private String pinsCount;
    /** {@link ImageInfo} Image of the profile. **/
    private ImageInfo profileImage;
    /** {@link TopSource} List of top sources of pins. **/
    private List<TopSource> topSources;

    /**
     * Default Constructor.
     */
    public UserProfileInfo() {
    }

    /**
     * @param bio
     * @param website
     * @param boardsCount
     * @param facebook
     * @param twitter
     * @param followersCount
     * @param followingCount
     * @param noOfLikes
     * @param location
     * @param name
     * @param pinsCount
     * @param profileImage
     * @param topSources
     */
    public UserProfileInfo(String bio, String website, String boardsCount, String facebook, String twitter,
            String followersCount, String followingCount, String noOfLikes, String location, String name,
            String pinsCount, ImageInfo profileImage, List<TopSource> topSources) {
        super();
        this.bio = bio;
        this.website = website;
        this.boardsCount = boardsCount;
        this.facebook = facebook;
        this.twitter = twitter;
        this.followersCount = followersCount;
        this.followingCount = followingCount;
        this.noOfLikes = noOfLikes;
        this.location = location;
        this.name = name;
        this.pinsCount = pinsCount;
        this.profileImage = profileImage;
        this.topSources = topSources;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio
     *            the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website
     *            the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the boardsCount
     */
    public String getBoardsCount() {
        return boardsCount;
    }

    /**
     * @param boardsCount
     *            the boardsCount to set
     */
    public void setBoardsCount(String boardsCount) {
        this.boardsCount = boardsCount;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook
     *            the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the twitter
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter
     *            the twitter to set
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return the followersCount
     */
    public String getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount
     *            the followersCount to set
     */
    public void setFollowersCount(String followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return the followingCount
     */
    public String getFollowingCount() {
        return followingCount;
    }

    /**
     * @param followingCount
     *            the followingCount to set
     */
    public void setFollowingCount(String followingCount) {
        this.followingCount = followingCount;
    }

    /**
     * @return the noOfLikes
     */
    public String getNoOfLikes() {
        return noOfLikes;
    }

    /**
     * @param noOfLikes
     *            the noOfLikes to set
     */
    public void setNoOfLikes(String noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(String location) {
        this.location = location;
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
     * @return the pinsCount
     */
    public String getPinsCount() {
        return pinsCount;
    }

    /**
     * @param pinsCount
     *            the pinsCount to set
     */
    public void setPinsCount(String pinsCount) {
        this.pinsCount = pinsCount;
    }

    /**
     * @return the profileImage
     */
    public ImageInfo getProfileImage() {
        return profileImage;
    }

    /**
     * @param profileImage
     *            the profileImage to set
     */
    public void setProfileImage(ImageInfo profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * @return the topSources
     */
    public List<TopSource> getTopSources() {
        return topSources;
    }

    /**
     * @param topSources
     *            the topSources to set
     */
    public void setTopSources(List<TopSource> topSources) {
        this.topSources = topSources;
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
