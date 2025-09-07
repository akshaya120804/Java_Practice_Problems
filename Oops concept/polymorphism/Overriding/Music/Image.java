package polymorphism.Overriding.Music;

class Image extends Media {
    @Override
    public void play() {
        System.out.println("🖼️ Displaying image...");
    }
}