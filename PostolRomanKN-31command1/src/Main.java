public class Main {
    public static void main(String[] args) {

        Picture pic1 = new Picture("Mona Lisa", (short) 1503, "Leonardo da Vinci");
        Picture pic2 = new Picture("Starry Night", (short) 1889, "Vincent van Gogh");


        Gallery gallery = Gallery.getInstance("Art Gallery");


        gallery.addPicture(pic1);
        gallery.addPicture(pic2);


        gallery.setArticle("A collection of historical paintings.");

        System.out.println("Gallery Name: " + gallery.getName());
        System.out.println("Gallery Article: " + gallery.getArticle());
        System.out.println("Number of Pictures: " + gallery.getPictureCount());

        System.out.println(gallery.describePicture(pic1));

        gallery.removePicture(pic1);
        System.out.println("Number of Pictures after removal: " + gallery.getPictureCount());

        Gallery anotherGallery = Gallery.getInstance("Another Name");
        System.out.println("Is the same instance: " + (gallery == anotherGallery));
    }
}