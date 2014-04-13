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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.anoni.mouse.model.BoardInfo;
import com.anoni.mouse.model.Followers;
import com.anoni.mouse.model.Following;
import com.anoni.mouse.model.ImageInfo;
import com.anoni.mouse.model.PinAttribution;
import com.anoni.mouse.model.Pins;
import com.anoni.mouse.model.TopSource;
import com.anoni.mouse.model.UserLikes;
import com.anoni.mouse.model.UserProfileInfo;
import com.anoni.mouse.utils.ParserHelper;

/**
 * <p>
 * <strong> PinterestDomParser </strong> is the class which does the parsing of
 * DOM. Given any HTML Page for Pinterest, should be able to get all information
 * of the user ie. followers, following, boards, pins, likes etc. in JSON
 * Format.
 * 
 * This class can be re-used as pinterest has URL Pattern which is very
 * comprehensible.
 * </p>
 * 
 * @author Swathi Venkatachala
 * 
 */
public class PinterestDomParser implements IPinterest {

    /**
     * URL of the pinterest user.
     */
    private String pinterestUrl;

    /**
     * Constructor.
     * 
     * @param pinterestUrl
     *            URL of pinterest
     */
    public PinterestDomParser(String pinterestUrl) {
        this.pinterestUrl = pinterestUrl;
    }

    /**
     * Default Constructor.
     */
    public PinterestDomParser() {
        super();
    }

    /**
     * @return the pinterestUrl
     */
    public String getPinterestUrl() {
        return pinterestUrl;
    }

    /**
     * @param pinterestUrl
     *            the pinterestUrl to set
     */
    public void setPinterestUrl(String pinterestUrl) {
        this.pinterestUrl = pinterestUrl;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getUserProfileInfo(java.lang.String)
     */
    public UserProfileInfo getUserProfileInfo() throws IOException {
        UserProfileInfo userProfileInfo = new UserProfileInfo();
        Document document = Jsoup.connect(getPinterestUrl()).get();
        Element rootHeader = ParserHelper.getFirstOfElementsByClass("UserProfileHeader", document);
        if (rootHeader != null) {

            // Get the profile image information.
            Element profileImageElement = ParserHelper.getFirstOfElementsByClass("profileImage", rootHeader);
            ImageInfo imageInfo = new ImageInfo();
            if (profileImageElement != null) {
                imageInfo.setSrc(profileImageElement.attr("src"));
                imageInfo.setAlt(profileImageElement.attr("alt"));
                userProfileInfo.setProfileImage(imageInfo);
            } else {
                imageInfo.setSrc("");
                imageInfo.setAlt("");
                userProfileInfo.setProfileImage(imageInfo);
            }

            // Get the user name.
            Element nameElement = ParserHelper.getFirstOfElementsByClass("userProfileHeaderName", document);
            if (nameElement != null) {
                userProfileInfo.setName(nameElement.text().trim());
            } else {
                userProfileInfo.setName("");
            }

            // Get the bio info of the user.
            Element bioElement = ParserHelper.getFirstOfElementsByClass("userProfileHeaderBio", document);
            if (bioElement != null) {
                userProfileInfo.setBio(bioElement.text().trim());
            } else {
                userProfileInfo.setBio("");
            }

            // Get the location details of the user.
            Element locationElement = ParserHelper.getFirstOfElementsByClass("userProfileHeaderLocationWrapper",
                    document);
            if (locationElement != null) {
                userProfileInfo.setLocation(locationElement.text().trim());
            } else {
                userProfileInfo.setLocation("");
            }

            // Get the website information.
            Element websiteElement = ParserHelper.getFirstOfElementsByClass("website", document);
            if (websiteElement != null) {
                userProfileInfo.setWebsite(websiteElement.attr("href"));
            } else {
                userProfileInfo.setWebsite("");
            }

            // Get the Facebook information.
            Element facebookElement = ParserHelper.getFirstOfElementsByClass("facebook", document);
            if (facebookElement != null) {
                userProfileInfo.setFacebook(facebookElement.attr("href"));
            } else {
                userProfileInfo.setFacebook("");
            }

            // Get the Twitter information.
            Element twitterElement = ParserHelper.getFirstOfElementsByClass("twitter", document);
            if (twitterElement != null) {
                userProfileInfo.setTwitter(twitterElement.attr("href"));
            } else {
                userProfileInfo.setTwitter("");
            }

            // Get all the profile statistics.
            Element profileStatsElement = ParserHelper.getFirstOfElementsByClass("UserInfoBar", document);
            if (profileStatsElement != null) {
                userProfileInfo.setBoardsCount(profileStatsElement.getElementsByTag("li").get(0).text().split(" ")[0]);
                userProfileInfo.setPinsCount(profileStatsElement.getElementsByTag("li").get(1).text().split(" ")[0]);
                userProfileInfo.setNoOfLikes(profileStatsElement.getElementsByTag("li").get(2).text().split(" ")[0]);
                userProfileInfo
                        .setFollowersCount(profileStatsElement.getElementsByTag("li").get(3).text().split(" ")[0]);
                userProfileInfo
                        .setFollowingCount(profileStatsElement.getElementsByTag("li").get(4).text().split(" ")[0]);
            } else {
                userProfileInfo.setBoardsCount("");
                userProfileInfo.setPinsCount("");
                userProfileInfo.setNoOfLikes("");
                userProfileInfo.setFollowersCount("");
                userProfileInfo.setFollowingCount("");
            }

            // Get the top sources.
            Element topSourcesElement = ParserHelper.getFirstOfElementsByClass("userProfileHeaderTopSources", document);
            List<TopSource> topSources = new ArrayList<TopSource>();
            if (topSourcesElement != null) {
                Elements topSourcesElements = topSourcesElement.getElementsByTag("li");
                for (int i = 0; i < topSourcesElements.size(); i++) {
                    TopSource topSource = new TopSource();
                    topSource.setHref(topSourcesElements.get(i).getElementsByTag("a").attr("href"));
                    topSource.setImageInfo(new ImageInfo(topSourcesElements.get(i).getElementsByTag("img").attr("alt"),
                            topSourcesElements.get(i).getElementsByTag("img").attr("src")));
                    topSource.setName(topSourcesElements.get(i).getElementsByTag("a").text().trim());
                    topSources.add(topSource);
                }
                userProfileInfo.setTopSources(topSources);
            } else {
                userProfileInfo.setTopSources(topSources);
            }
        }
        return userProfileInfo;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getUserBoardInfo(java.lang.String)
     */
    public List<BoardInfo> getUserBoardInfo() throws IOException {
        List<BoardInfo> boardInfos = new ArrayList<BoardInfo>();
        Document document = Jsoup.connect(getPinterestUrl()).get();
        Elements elements = ParserHelper.getElementsByClass("Board", document);
        for (int i = 0; i < elements.size(); i++) {
            Element boardElement = elements.get(i);
            BoardInfo boardInfo = new BoardInfo();
            Element boardInfoElement = ParserHelper.getFirstOfElementsByClass("boardName", boardElement);
            if (boardInfoElement != null) {

                // Get the title of the board
                Element titleElement = ParserHelper.getFirstOfElementsByClass("title", boardInfoElement);
                if (titleElement != null) {
                    boardInfo.setTitle(titleElement.text().trim());
                } else {
                    boardInfo.setTitle("");
                }

                // Get the board by full name.
                Element boardByFullNameElement = ParserHelper.getFirstOfElementsByClass("fullName", boardInfoElement);
                if (boardByFullNameElement != null) {
                    boardInfo.setBoardByFullName(boardByFullNameElement.text().trim());
                } else {
                    boardInfo.setBoardByFullName("");
                }

                // Get the board URL.
                Element boardHrefElement = boardElement.getElementsByTag("a").get(0);
                if (boardHrefElement != null) {
                    boardInfo.setHref(boardHrefElement.attr("href"));
                } else {
                    boardInfo.setHref("");
                }

                // Get the board Pins Count.
                Element boardPinsCountElement = ParserHelper.getFirstOfElementsByClass("PinCount", boardElement);
                if (boardPinsCountElement != null) {
                    boardInfo.setPinCount(boardPinsCountElement.text().trim().split(" ")[0]);
                } else {
                    boardInfo.setPinCount("");
                }

                // Get the board Cover image
                Element boardImgCoverElement = ParserHelper.getFirstOfElementsByClass("boardCover", boardElement);
                ImageInfo imageInfo = new ImageInfo();
                if (boardImgCoverElement != null) {
                    imageInfo.setAlt(boardImgCoverElement.attr("alt"));
                    imageInfo.setSrc(boardImgCoverElement.attr("src"));
                    boardInfo.setBoardCover(imageInfo);
                } else {
                    imageInfo.setAlt("");
                    imageInfo.setSrc("");
                    boardInfo.setBoardCover(imageInfo);
                }

                // Get the board Thumbs.
                Elements boardThumbsElements = ParserHelper.getElementsByClass("boardThumbs", boardElement);
                List<ImageInfo> boardThumbs = new ArrayList<ImageInfo>();
                if (boardThumbsElements != null && !boardThumbsElements.isEmpty()) {
                    for (Element boardThumbsElement : boardThumbsElements) {
                        ImageInfo imageThumbInfo = new ImageInfo();
                        Elements boardThumbsImgElements = boardThumbsElement.getElementsByTag("img");
                        for (Element boardThumbsImgElement : boardThumbsImgElements) {
                            imageThumbInfo.setAlt(boardThumbsImgElement.attr("alt"));
                            imageThumbInfo.setSrc(boardThumbsImgElement.attr("src"));
                            boardThumbs.add(imageThumbInfo);
                            boardInfo.setBoardThumbs(boardThumbs);

                        }
                    }
                } else {
                    ImageInfo imageThumbInfo = new ImageInfo();
                    imageThumbInfo.setAlt("");
                    imageThumbInfo.setSrc("");
                    boardThumbs.add(imageThumbInfo);
                    boardInfo.setBoardThumbs(boardThumbs);
                }

                boardInfos.add(boardInfo);
            }
        }
        return boardInfos;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getUserPinsInfo()
     */
    public List<Pins> getUserPinsInfo() throws IOException {
        Document document = Jsoup.connect(getPinterestUrl() + "/pins").get();
        List<Pins> pinList = new ArrayList<Pins>();

        // Get PinWrapper.
        Elements pinGridItemsElements = ParserHelper.getElementsByClass("GridItems", document);
        Elements pinElements = ParserHelper.getElementsByClass("Pin", pinGridItemsElements.get(0));
        int size = pinElements.size();

        for (int i = 0; i < size; i++) {
            Pins pins = new Pins();

            // Get pin holder elements.
            Element pinHolderElement = pinElements.get(i).getElementsByClass("pinHolder").first();

            if (pinHolderElement != null) {
                // Get href of pins.
                String pinHref = pinHolderElement.getElementsByTag("a").attr("href");
                if (pinHref != null && !pinHref.isEmpty()) {
                    pins.setPinhref(pinHref);
                } else {
                    pins.setPinhref("");
                }

                // Get domain of pins
                Elements pinDomainElements = ParserHelper.getElementsByClass("pinDomain", pinHolderElement);
                if (pinDomainElements != null) {
                    Element pinDomainElement = pinDomainElements.get(0);
                    if (pinDomainElement != null) {
                        String domain = pinDomainElement.text();
                        pins.setPinDomain(domain);
                    }
                } else {
                    pins.setPinDomain("");
                }

                // Get pin ImageInfo of pins.
                Elements pinImgElements = ParserHelper.getElementsByClass("pinImg", pinHolderElement);
                ImageInfo pinImageInfo = new ImageInfo();
                if (pinImgElements != null) {
                    Element pinImgElement = pinImgElements.get(0);
                    if (pinImgElement != null) {
                        pinImageInfo.setSrc(pinImgElement.attr("src"));
                        pinImageInfo.setAlt(pinImgElement.attr("alt"));
                        pins.setPinImageInfo(pinImageInfo);
                    }
                } else {
                    pinImageInfo.setSrc("");
                    pinImageInfo.setAlt("");
                    pins.setPinImageInfo(pinImageInfo);
                }
            }

            // Get Pin Meta elements - desc, attribution, tags
            Elements pinMetaElements = pinElements.get(i).getElementsByClass("pinMeta");

            if (pinMetaElements != null && !pinMetaElements.isEmpty()) {
                // Get description of pins.
                Element pinDescElement = ParserHelper.getFirstOfElementsByClass("pinDescription",
                        pinMetaElements.get(0));
                String pinDescription;
                if (pinDescElement != null) {
                    pinDescription = pinDescElement.text();
                    pins.setPinDescription(pinDescription);
                } else {
                    pins.setPinDescription("");
                }
                
                // Get attribution of pins.
                Element pinAttributionElement = ParserHelper.getFirstOfElementsByClass("pinAttribution",
                        pinMetaElements.get(0));
                PinAttribution pinAttribution = new PinAttribution();
                if (pinAttributionElement != null) {
                    // Image info of attribution.
                    Element pinAttributionImageInfoElement = pinAttributionElement.getElementsByTag("img").get(0);
                    ImageInfo pinAttributionImageInfo = new ImageInfo();
                    pinAttributionImageInfo.setSrc(pinAttributionImageInfoElement.attr("src"));
                    pinAttributionImageInfo.setAlt(pinAttributionImageInfoElement.attr("alt"));
                    pinAttribution.setPinAttributionImageInfo(pinAttributionImageInfo);

                    // Href and description of attribution of the pin.
                    Element pinAttributionHrefElement = pinAttributionElement.getElementsByTag("a").get(0);
                    // pin href of attribution.
                    pinAttribution.setHref(pinAttributionHrefElement.attr("href"));
                    // pinAttributionDesc of attribution.
                    pinAttribution.setPinAttributionDesc(pinAttributionHrefElement.text());

                    pins.setPinAttribution(pinAttribution);
                } else {
                    // Image info of attribution.
                    ImageInfo pinAttributionImageInfo = new ImageInfo();
                    pinAttributionImageInfo.setAlt("");
                    pinAttributionImageInfo.setSrc("");
                    pinAttribution.setPinAttributionImageInfo(pinAttributionImageInfo);

                    // pin href of attribution.
                    pinAttribution.setHref("");
                    // pinAttributionDesc of attribution.
                    pinAttribution.setPinAttributionDesc("");

                    pins.setPinAttribution(pinAttribution);
                }
            } else {
                // Set pin description.
                pins.setPinDescription("");

                // Image info of attribution.
                ImageInfo pinAttributionImageInfo = new ImageInfo();
                pinAttributionImageInfo.setAlt("");
                pinAttributionImageInfo.setSrc("");
                PinAttribution pinAttribution = new PinAttribution();
                pinAttribution.setPinAttributionImageInfo(pinAttributionImageInfo);

                // pin href of attribution.
                pinAttribution.setHref("");
                // pinAttributionDesc of attribution.
                pinAttribution.setPinAttributionDesc("");

                pins.setPinAttribution(pinAttribution);
            }

            pinList.add(pins);
        }
        return pinList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getFollowersInfo()
     */
    public List<Followers> getFollowersInfo() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getFollowingInfo()
     */
    public List<Following> getFollowingInfo() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.anoni.mouse.IPinterest#getUserLikes()
     */
    public List<UserLikes> getUserLikes() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }
}
