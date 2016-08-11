package com.example.linkmax.mydemo.main.fragment.news.bean;

import java.util.List;

/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewsBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-08-10 07:55","title":"危险的\u201c救助金\u201d：\u201c访民敲诈政府案\u201d的罪与非罪","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/B/B2/B2AD01D5895188794B2699B1847AF3D7.jpg.119x83.jpg","url":"http://news.163.com/16/0810/07/BU3G407P00014SEH.html#f=slist"},{"ctime":"2016-08-10 08:04","title":"男子被记35分后无证驾车又交通违法，逃逸被抓再记8分","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/A/A2/A2ADDD8F813F9D47DE4CDF69F7B44294.jpg.119x83.jpg","url":"http://news.163.com/16/0810/08/BU3GK7JN00014SEH.html#f=slist"},{"ctime":"2016-08-10 05:40","title":"湖南公职人员纵火致1死2伤 曾是治安巡逻大队长","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/D/DA/DA8383BBC4C64D22E70E9A6F0331BC76.jpg.119x83.jpg","url":"http://news.163.com/16/0810/05/BU38BKKR00011229.html#f=slist"},{"ctime":"2016-08-10 05:44","title":"男子岩穴支篷布住25年靠挖山药等生存 家人劝不回","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/1/14/1486AD931FBE6187165AFD06B635C53C.jpg.119x83.jpg","url":"http://news.163.com/16/0810/05/BU38K60G00011229.html#f=slist"},{"ctime":"2016-08-10 06:43","title":"天津爆炸有伤者未出院 幸存消防员遭骂苟且偷生","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/A/AC/AC66CA63448B5512320085D65B72F8BE.jpg.119x83.jpg","url":"http://news.163.com/16/0810/06/BU3C0B1E00011229.html#f=slist"},{"ctime":"2016-08-10 07:12","title":"深圳卫计委原主任141万买官 行贿后叫领导老板","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/A/A2/A2ADDD8F813F9D47DE4CDF69F7B44294.jpg.119x83.jpg","url":"http://news.163.com/16/0810/07/BU3DLHQ600014SEH.html#f=slist"},{"ctime":"2016-08-10 03:59","title":"广州12岁少女离家失联数日 好心人索600万赎金","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/E/E8/E8855C7EFD64BBD0DAF3911D70AE3898.jpg.119x83.jpg","url":"http://news.163.com/16/0810/03/BU32JGQI00011229.html#f=slist"},{"ctime":"2016-08-10 04:21","title":"七夕节婚姻登记不敌情人节和520 网络预约仅2对","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/F/F0/F046D4BF2EF8886CCF90A56C71070027.jpg.119x83.jpg","url":"http://news.163.com/16/0810/04/BU33RL9L00014AEF.html#f=slist"},{"ctime":"2016-08-10 04:38","title":"七旬老人怨妻子照顾孙子冷落自己 起诉离婚索礼金","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/D/DA/DA8383BBC4C64D22E70E9A6F0331BC76.jpg.119x83.jpg","url":"http://news.163.com/16/0810/04/BU34QI0100011229.html#f=slist"},{"ctime":"2016-08-10 04:41","title":"香港男子携5管孕妇血液出关被查 或涉走私基因","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/1/14/1486AD931FBE6187165AFD06B635C53C.jpg.119x83.jpg","url":"http://news.163.com/16/0810/04/BU350F0200011229.html#f=slist"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-08-10 07:55
     * title : 危险的“救助金”：“访民敲诈政府案”的罪与非罪
     * description : 网易社会
     * picUrl : http://s.cimg.163.com/catchpic/B/B2/B2AD01D5895188794B2699B1847AF3D7.jpg.119x83.jpg
     * url : http://news.163.com/16/0810/07/BU3G407P00014SEH.html#f=slist
     */

    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
