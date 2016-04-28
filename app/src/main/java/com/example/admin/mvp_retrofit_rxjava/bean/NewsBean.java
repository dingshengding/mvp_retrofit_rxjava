package com.example.admin.mvp_retrofit_rxjava.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Description : 新闻实体类
 * Author : dingsheng
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/19
 */
public class NewsBean implements Serializable {
    /**
     * postid : PHOT3IAC000100AP
     * hasCover : false
     * hasHead : 1
     * replyCount : 29920
     * hasImg : 1
     * digest :
     * hasIcon : false
     * docid : 9IG74V5H00963VRO_BLNN3CEDbjzhuyuekeupdateDoc
     * title : 扬州宁国寺3名和尚打架 被寺庙"开除"
     * order : 1
     * priority : 253
     * lmodify : 2016-04-28 08:01:20
     * boardid : photoview_bbs
     * ads : [{"title":"看客：被岛外人\"占领\"的海南楼市","tag":"photoset","imgsrc":"http://img4.cache.netease.com/3g/2016/4/28/20160428073122496a0.jpg","subtitle":"","url":"3R710001|117046"},{"title":"女大学生成全真教龙门派\"90后\"道长","tag":"photoset","imgsrc":"http://img6.cache.netease.com/3g/2016/4/28/20160428105949abaea.jpg","subtitle":"","url":"00AP0001|117095"},{"title":"公交车被抢客电瓶车追堵 无法正常靠站","tag":"photoset","imgsrc":"http://img5.cache.netease.com/3g/2016/4/28/201604281052486a810.jpg","subtitle":"","url":"00AP0001|117093"},{"title":"伦敦市民举行\"躺尸\"集会 抗议空气污染","tag":"photoset","imgsrc":"http://img1.cache.netease.com/3g/2016/4/28/2016042809393489cea.jpg","subtitle":"","url":"00AO0001|117084"},{"title":"日本花魁摄影人气旺 樱花飞舞十分美艳","tag":"photoset","imgsrc":"http://img5.cache.netease.com/3g/2016/4/28/201604280925122b964.jpg","subtitle":"","url":"00AO0001|117086"}]
     * photosetID : 00AP0001|117068
     * template : manual
     * votecount : 28252
     * skipID : 00AP0001|117068
     * alias : Top News
     * skipType : photoset
     * cid : C1348646712614
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://img1.cache.netease.com/3g/2016/4/28/20160428080323e6d98.png"},{"imgsrc":"http://img6.cache.netease.com/3g/2016/4/28/20160428080326df4dd.png"}]
     * source : 中青网
     * ename : androidnews
     * tname : 头条
     * imgsrc : http://img3.cache.netease.com/3g/2016/4/28/2016042808032161f74.jpg
     * ptime : 2016-04-28 08:01:20
     */

    private List<T1348647909107Bean> T1348647909107;

    public List<T1348647909107Bean> getT1348647909107() {
        return T1348647909107;
    }

    public void setT1348647909107(List<T1348647909107Bean> T1348647909107) {
        this.T1348647909107 = T1348647909107;
    }

    public static class T1348647909107Bean {
        private String postid;
        private boolean hasCover;
        private int hasHead;
        private int replyCount;
        private int hasImg;
        private String digest;
        private boolean hasIcon;
        private String docid;
        private String title;
        private int order;
        private int priority;
        private String lmodify;
        private String boardid;
        private String photosetID;
        private String template;
        private int votecount;
        private String skipID;
        private String alias;
        private String skipType;
        private String cid;
        private int hasAD;
        private String source;
        private String ename;
        private String tname;
        private String imgsrc;
        private String ptime;
        /**
         * title : 看客：被岛外人"占领"的海南楼市
         * tag : photoset
         * imgsrc : http://img4.cache.netease.com/3g/2016/4/28/20160428073122496a0.jpg
         * subtitle :
         * url : 3R710001|117046
         */
        private List<AdsBean> ads;
        /**
         * imgsrc : http://img1.cache.netease.com/3g/2016/4/28/20160428080323e6d98.png
         */
        private List<ImgextraBean> imgextra;

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public List<ImgextraBean> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraBean> imgextra) {
            this.imgextra = imgextra;
        }

        public static class AdsBean {
            private String title;
            private String tag;
            private String imgsrc;
            private String subtitle;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ImgextraBean {
            private String imgsrc;

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }


//    /**
//     * docid
//     */
//    private String docid;
//    /**
//     * 标题
//     */
//    private String title;
//    /**
//     * 小内容
//     */
//    private String digest;
//    /**
//     * 图片地址
//     */
//    private String imgsrc;
//    /**
//     * 来源
//     */
//    private String source;
//    /**
//     * 时间
//     */
//    private String ptime;
//    /**
//     * TAG
//     */
//    private String tag;
//
//    public String getDocid() {
//        return docid;
//    }
//
//    public void setDocid(String docid) {
//        this.docid = docid;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDigest() {
//        return digest;
//    }
//
//    public void setDigest(String digest) {
//        this.digest = digest;
//    }
//
//    public String getImgsrc() {
//        return imgsrc;
//    }
//
//    public void setImgsrc(String imgsrc) {
//        this.imgsrc = imgsrc;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
//
//    public String getPtime() {
//        return ptime;
//    }
//
//    public void setPtime(String ptime) {
//        this.ptime = ptime;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
}
