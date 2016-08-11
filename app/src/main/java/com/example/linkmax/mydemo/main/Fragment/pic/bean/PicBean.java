package com.example.linkmax.mydemo.main.fragment.pic.bean;

import java.util.List;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class PicBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-03-06 14:11","title":"美少女韩雨嘉可爱私拍","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_1c3cc572a80ccc3343062e7ad6c51180-760x500.jpg","url":"http://m.xxxiao.com/2010"},{"ctime":"2016-03-06 14:11","title":"[TGOD推女神] 性感少妇Aline艾琳私房写真","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_26da7f08a6170deda90a8bcd208618f9-760x500.jpg","url":"http://m.xxxiao.com/249"},{"ctime":"2016-03-06 14:11","title":"美女许允美黑花连裙衣海边写真","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/05/m.xxxiao.com_ac8044b0a0ee6c0ff51fa4ed4df1010e-760x500.jpg","url":"http://m.xxxiao.com/1268"},{"ctime":"2016-03-06 14:11","title":"短发美女激情劲爆性感艺术照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150725/8-150H5155Rb36.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/51899.html"},{"ctime":"2016-03-06 14:11","title":"性感美女绮里嘉ula比基尼秀","description":"THE美女","picUrl":"/content/images/nopic.png","url":"http://www.the6688.com/rhmeinv/1427.html"},{"ctime":"2016-03-06 14:11","title":"混血美女貌美动人写真照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150727/8-150HGG92c05.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/50227.html"},{"ctime":"2016-03-06 14:11","title":"刘娅希黑色内衣大秀丰满双乳诱人照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201507/378/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/122561.html"},{"ctime":"2016-03-06 14:11","title":"极品少妇紫色比基尼大秀傲人双乳","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150728/8-150HQ50I4224.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/49938.html"},{"ctime":"2016-03-06 14:11","title":"美女高清私房 内衣真空秀曼妙身姿","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201503/1054/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/12805.html"},{"ctime":"2016-03-06 14:11","title":"极品御姐性感秀大胸唯美艺术照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150729/8-150H9102I2548.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/51102.html"}]
     */

    private int code;
    private String msg;
    /**
     * ctime : 2016-03-06 14:11
     * title : 美少女韩雨嘉可爱私拍
     * description : 美女图片
     * picUrl : http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_1c3cc572a80ccc3343062e7ad6c51180-760x500.jpg
     * url : http://m.xxxiao.com/2010
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
