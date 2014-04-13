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
package com.anoni.mouse;

import java.io.IOException;
import java.util.List;

import com.anoni.mouse.model.BoardInfo;
import com.anoni.mouse.model.Followers;
import com.anoni.mouse.model.Following;
import com.anoni.mouse.model.Pins;
import com.anoni.mouse.model.UserLikes;
import com.anoni.mouse.model.UserProfileInfo;

/**
 * <p>
 * Interface to the Pinterest Scraper.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public interface IPinterest {
    /**
     * Get the user profile information.
     * 
     * @param url
     *            URL of the pinterest user
     * @return JSON Representation of user profile
     * @throws IOException
     *             exception thrown while parsing error
     */
    UserProfileInfo getUserProfileInfo() throws IOException;

    /**
     * Get the board information of the user.
     * 
     * @param url
     *            URL of the pinterest user
     * @return Representation of board info
     * @throws IOException
     *             exception thrown while parsing error
     */
    List<BoardInfo> getUserBoardInfo() throws IOException;

    /**
     * Get the user pins information.
     * 
     * @return list of pins
     * @throws IOException
     *             exception thrown while parsing error
     */
    List<Pins> getUserPinsInfo() throws IOException;

    /**
     * Get the user followers information.
     * 
     * @return
     * @throws IOException
     */
    List<Followers> getFollowersInfo() throws IOException;

    /**
     * Get the user following information.
     * 
     * @return
     * @throws IOException
     */
    List<Following> getFollowingInfo() throws IOException;

    /**
     * Get the user likes information.
     * 
     * @return
     * @throws IOException
     */
    List<UserLikes> getUserLikes() throws IOException;
}
