package Lesson.ClassObject.Clone;

import java.util.Objects;

public class Bmw implements Cloneable{
   private String model;
   private Engine engine;
   private MediaPlayer mediaPlayer;

    public Bmw(String model, Engine engine, MediaPlayer mediaPlayer) {
        this.model = model;
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Bmw (model,(Engine) engine.clone(), new MediaPlayer(mediaPlayer.getName()));
    }

    public void info () {
        System.out.println(model + " "+engine.getLs() + " " + mediaPlayer.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return Objects.equals(model, bmw.model) && Objects.equals(engine, bmw.engine) && Objects.equals(mediaPlayer, bmw.mediaPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engine, mediaPlayer);
    }
}
