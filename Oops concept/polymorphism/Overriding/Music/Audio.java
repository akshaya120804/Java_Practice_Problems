package polymorphism.Overriding.Music;

class Audio extends Media {
    @Override
    public void play() {
        System.out.println("🎵 Playing audio file...");
    }
}