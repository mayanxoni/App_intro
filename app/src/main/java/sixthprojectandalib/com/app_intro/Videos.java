package sixthprojectandalib.com.app_intro;

/**
 * Created by hp on 6/17/2017.
 */
public class Videos {

    private String title;
    private String thumbnail_url;
    private String videoID;

    public Videos(String title, String thumbnail_url, String videoid) {
        this.title = title;
        this.thumbnail_url= thumbnail_url;
        this.videoID = videoid;
    }

    public String getTitle() {
        return title;
    }
    public String getThumbnailUrl() {
        return thumbnail_url;
    }
    public String getVideoID() {
        return videoID;
    }


}


