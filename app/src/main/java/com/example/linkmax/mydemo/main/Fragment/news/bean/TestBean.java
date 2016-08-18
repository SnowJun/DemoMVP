package com.example.linkmax.mydemo.main.fragment.news.bean;

import java.util.List;

/**
 * 2016/8/17
 *
 * @author SnowJun
 * @since 1.0
 */
public class TestBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-08-17 05:30","title":"迟到41年的救赎","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/2/22/22B07F8788BFBE5BAC673CD5A39A6482.jpg.119x83.jpg","url":"http://news.163.com/16/0817/05/BUL8J5QC00014AED.html#f=slist"},{"ctime":"2016-08-17 06:16","title":"女子因与老公同房激怒情夫 被抛尸深井灌入水泥","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/0/03/0366C4A3290E83B7E869DA5BB06705C8.jpg.119x83.jpg","url":"http://news.163.com/16/0817/06/BULB72MK00011229.html#f=slist"},{"ctime":"2016-08-17 07:10","title":"女友提分手云南小伙以死相逼 民警破门救助被划伤","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/C/C7/C7CCAFCD0F99020BDB4DC6DB020A5989.png.119x83.jpg","url":"http://news.163.com/16/0817/07/BULEAMCP00014AEE.html#f=slist"},{"ctime":"2016-08-17 02:46","title":"湿疹婴儿接种卡介苗后死亡","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/C/C9/C9F1F04D33F26BDDD834A673B00B1D6D.jpeg.119x83.jpg","url":"http://news.163.com/16/0817/02/BUKV6N5L00014AED.html#f=slist"},{"ctime":"2016-08-17 02:46","title":"豪捐6000件陶瓷背后的邱氏收藏\u201c神话\u201d","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/9/9E/9E35892011E7EA81965F8E8DDACCACE2.jpg.119x83.jpg","url":"http://news.163.com/16/0817/02/BUKV6OJV00014AED.html#f=slist"},{"ctime":"2016-08-17 02:46","title":"湖南博士生举报水利局领导受贿","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/F/FE/FEE4524F9DAD80BD7601F7F64810A41E.jpg.119x83.jpg","url":"http://news.163.com/16/0817/02/BUKV6R6N00014AED.html#f=slist"},{"ctime":"2016-08-17 02:55","title":"假证买卖 亟须监管发力（走转改・一线调查（互联网新","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/4/47/47471D9B7F1EDEC5500F963571F09D87.jpg.119x83.jpg","url":"http://news.163.com/16/0817/02/BUKVN0KH00014AED.html#f=slist"},{"ctime":"2016-08-17 02:55","title":"我与\u201c尿协\u201d交锋这两年（深阅读・后续）","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/3/3E/3EE82687489A7EC17AAD536045530F13.jpeg.119x83.jpg","url":"http://news.163.com/16/0817/02/BUKVN26N00014AED.html#f=slist"},{"ctime":"2016-08-17 03:06","title":"为竞选他雇凶挟持对手 殊不料几罪犯杀人抛尸","description":"网易社会","picUrl":"http://s.cimg.163.com/catchpic/2/22/22B07F8788BFBE5BAC673CD5A39A6482.jpg.119x83.jpg","url":"http://news.163.com/16/0817/03/BUL0AM4I00014AEE.html#f=slist"},{"ctime":"2016-08-17 00:36","title":"港媒揭内地网戒中心:电击疗法比网瘾更可怕","description":"网易社会","picUrl":"","url":"http://news.163.com/16/0817/00/BUKNOM5500014JB5.html#f=slist"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-08-17 05:30
     * title : 迟到41年的救赎
     * description : 网易社会
     * picUrl : http://s.cimg.163.com/catchpic/2/22/22B07F8788BFBE5BAC673CD5A39A6482.jpg.119x83.jpg
     * url : http://news.163.com/16/0817/05/BUL8J5QC00014AED.html#f=slist
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
