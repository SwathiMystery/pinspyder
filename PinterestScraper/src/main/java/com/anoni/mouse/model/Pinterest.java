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
 * @author swathi
 * 
 */
public class Pinterest {
    /** {@link UserProfileInfo} User Profile Information. **/
    UserProfileInfo userProfileInfo;
    /** {@link BoardInfo} Board Information list. **/
    List<BoardInfo> boardInfoList;
    /** {@link Pins} List of pins. **/
    List<Pins> pinsList;
    /** {@link Followers} followers list. **/
    List<Followers> followersList;
    /** {@link Following} following list. **/
    List<Following> followingList;
    /** {@link UserLikes} user likes list. **/
    List<UserLikes> userLikesList;

    /**
     * @param userProfileInfo
     * @param boardInfoList
     * @param pinsList
     * @param followersList
     * @param followingList
     * @param userLikesList
     */
    public Pinterest(UserProfileInfo userProfileInfo, List<BoardInfo> boardInfoList, List<Pins> pinsList,
            List<Followers> followersList, List<Following> followingList, List<UserLikes> userLikesList) {
        super();
        this.userProfileInfo = userProfileInfo;
        this.boardInfoList = boardInfoList;
        this.pinsList = pinsList;
        this.followersList = followersList;
        this.followingList = followingList;
        this.userLikesList = userLikesList;
    }

    /**
     * @return the userProfileInfo
     */
    public UserProfileInfo getUserProfileInfo() {
        return userProfileInfo;
    }

    /**
     * @param userProfileInfo
     *            the userProfileInfo to set
     */
    public void setUserProfileInfo(UserProfileInfo userProfileInfo) {
        this.userProfileInfo = userProfileInfo;
    }

    /**
     * @return the boardInfoList
     */
    public List<BoardInfo> getBoardInfoList() {
        return boardInfoList;
    }

    /**
     * @param boardInfoList
     *            the boardInfoList to set
     */
    public void setBoardInfoList(List<BoardInfo> boardInfoList) {
        this.boardInfoList = boardInfoList;
    }

    /**
     * @return the pinsList
     */
    public List<Pins> getPinsList() {
        return pinsList;
    }

    /**
     * @param pinsList
     *            the pinsList to set
     */
    public void setPinsList(List<Pins> pinsList) {
        this.pinsList = pinsList;
    }

    /**
     * @return the followersList
     */
    public List<Followers> getFollowersList() {
        return followersList;
    }

    /**
     * @param followersList
     *            the followersList to set
     */
    public void setFollowersList(List<Followers> followersList) {
        this.followersList = followersList;
    }

    /**
     * @return the followingList
     */
    public List<Following> getFollowingList() {
        return followingList;
    }

    /**
     * @param followingList
     *            the followingList to set
     */
    public void setFollowingList(List<Following> followingList) {
        this.followingList = followingList;
    }

    /**
     * @return the userLikesList
     */
    public List<UserLikes> getUserLikesList() {
        return userLikesList;
    }

    /**
     * @param userLikesList
     *            the userLikesList to set
     */
    public void setUserLikesList(List<UserLikes> userLikesList) {
        this.userLikesList = userLikesList;
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
