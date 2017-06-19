package sixthprojectandalib.com.app_intro;

/**
 * Created by hp on 6/17/2017.
 */
public class First {
    private String name;
    private int img;
    private String text;
    public First(String name,int img,String text) {
        // TODO Auto-generated constructor stub
        this.name=name;
        this.img=img;
        this.text=text;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public String getText() {
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
}
