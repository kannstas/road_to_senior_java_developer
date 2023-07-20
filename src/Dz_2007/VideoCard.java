package Dz_2007;

public class VideoCard implements Cloneable {
    private String nameModel;
    private int volumeVideoCard;

    public VideoCard(String nameModel, int volumeVideoCard) {
        this.nameModel = nameModel;
        this.volumeVideoCard = volumeVideoCard;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public int getVolumeVideoCard() {
        return volumeVideoCard;
    }

    public void setVolumeVideoCard(int volumeVideoCard) {
        this.volumeVideoCard = volumeVideoCard;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new VideoCard(nameModel, volumeVideoCard);
    }
}

