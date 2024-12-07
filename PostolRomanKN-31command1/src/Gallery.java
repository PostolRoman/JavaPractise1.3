import java.util.ArrayList;
import java.util.List;

class Gallery {
    private List<Picture> pictures = new ArrayList<>();
    private String name;
    private String article;


    private static Gallery instance;


    private Gallery(String name) {
        this.name = name;
    }


    public static Gallery getInstance(String name) {
        if (instance == null) {
            instance = new Gallery(name);
        }
        return instance;
    }


    public boolean addPicture(Picture picture) {
        if (!pictures.contains(picture)) {
            pictures.add(picture);
            return true;
        }
        return false;
    }


    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }


    public String describePicture(Picture picture) {
        return pictures.contains(picture) ? picture.toString() : "Picture not found.";
    }


    public Picture getPicture(String name) {
        for (Picture p : pictures) {
            if (p.getName().equals(name)) return p;
        }
        return null;
    }


    public List<Picture> getPictures() {
        return pictures;
    }


    public long getPictureCount() {
        return pictures.size();
    }


    public String getName() {
        return name;
    }


    public void setArticle(String article) {
        this.article = article;
    }

    // Отримання статті
    public String getArticle() {
        return article;
    }
}

