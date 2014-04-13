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
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.anoni.mouse.model.BoardInfo;
import com.anoni.mouse.model.Followers;
import com.anoni.mouse.model.Following;
import com.anoni.mouse.model.Pins;
import com.anoni.mouse.model.Pinterest;
import com.anoni.mouse.model.UserLikes;
import com.anoni.mouse.model.UserProfileInfo;

/**
 * <p>
 * An unit test case to test the validity of scraping the pinterest URL.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class PinterestScraperTest extends TestCase {

    private static final String SEED = "http://www.pinterest.com/techcrunch";
    private static UserProfileInfo userProfileInfo;
    private static List<BoardInfo> boardInfo;
    private static List<Pins> pins;

    /**
     * Test method for
     * {@link com.anoni.mouse.PinterestDomParser#getUserProfileInfo} .
     * 
     * @throws IOException
     */
    public void testGetUserProfileInfo() throws IOException {
        PinterestDomParser pinterestDomParser = new PinterestDomParser(SEED);
        userProfileInfo = pinterestDomParser.getUserProfileInfo();
    }

    /**
     * Test method for
     * {@link com.anoni.mouse.PinterestDomParser#getUserBoardInfo()} .
     * 
     * @throws IOException
     */
    public void testGetBoardInfo() throws IOException {
        PinterestDomParser pinterestDomParser = new PinterestDomParser(SEED);
        boardInfo = pinterestDomParser.getUserBoardInfo();
    }

    /**
     * Test method for
     * {@link com.anoni.mouse.PinterestDomParser#getUserPinsInfo()}
     * 
     * @throws IOException
     */
    public void testGetUserPinsInfo() throws IOException {
        PinterestDomParser pinterestDomParser = new PinterestDomParser(SEED);
        pins = pinterestDomParser.getUserPinsInfo();
    }
    
    /**
     * 
     * @throws IOException
     */
    public void testPinterest() throws IOException {
        // TODO
        List<Followers> followersList = new ArrayList<Followers>();
        List<Following> followingList = new ArrayList<Following>();
        List<UserLikes> userLikesList = new ArrayList<UserLikes>();
        Pinterest pinterest = new Pinterest(userProfileInfo, boardInfo, pins, followersList, followingList, userLikesList);
        System.out.println(pinterest);
    }
}
