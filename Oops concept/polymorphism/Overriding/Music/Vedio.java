package polymorphism.Overriding.Music;

class Video extends Media {
    @Override
    public void play() {
        System.out.println("🎬 Playing video file...");
    }
}