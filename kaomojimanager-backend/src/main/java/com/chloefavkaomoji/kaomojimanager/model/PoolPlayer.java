package com.chloefavkaomoji.kaomojimanager.model;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
public class PoolPlayer implements Serializable {
    @Id
    // databases like MySQL, PostgreSQL, and SQL Server
    // auto incrementation key value is assigned for each Instance
    @GeneratedValue(strategy = GenerationType.IDENTITY) // only apply to id
    @Column(nullable = false, updatable = false) // only apply to id
    private Long id;
    private String name;
    private int yob; // year of birth
    private String levelOverally;
    private String levelPlayingForm;
    private String levelStrokeAccuracy;
    private String imageURL;
    private String primaryCueBrand;
    private int numberOfCue;
    private String additionalNote;
    @Column(nullable = false, updatable = false)
    private String poolPlayerCode;

    private static int numberOfPeople = 0;


    public PoolPlayer(){}
    public PoolPlayer(String name, Long id, int yob, String levelOverally, String playingForm, String strokeAccuracy, String imageURL, String primaryCueBrand, int numberOfCue, String additionalNote, String poolPlayerCode){
        this.name = name;
        this.id=id;
        this.yob = yob;
        this.levelOverally=levelOverally;
        this.levelPlayingForm=playingForm;
        this.levelStrokeAccuracy=strokeAccuracy;
        this.imageURL=imageURL;
        this.primaryCueBrand=primaryCueBrand;
        this.numberOfCue=numberOfCue;
        this.additionalNote=additionalNote;
        this.poolPlayerCode=poolPlayerCode;
        numberOfPeople++;
    }

    public String getPoolPlayerCode() {
        return poolPlayerCode;
    }

    public void setPoolPlayerCode(String poolPlayerCode) {
        this.poolPlayerCode = poolPlayerCode;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public static void setNumberOfPeople(int numberOfPeople) {
        PoolPlayer.numberOfPeople = numberOfPeople;
    }

    public String getAdditionalNote() {
        return additionalNote;
    }

    public void setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote;
    }

    public int getNumberOfCue() {
        return numberOfCue;
    }

    public void setNumberOfCue(int numberOfCue) {
        this.numberOfCue = numberOfCue;
    }

    public String getPrimaryCueBrand() {
        return primaryCueBrand;
    }

    public void setPrimaryCueBrand(String primaryCueBrand) {
        this.primaryCueBrand = primaryCueBrand;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLevelStrokeAccuracy() {
        return levelStrokeAccuracy;
    }

    public void setLevelStrokeAccuracy(String levelStrokeAccuracy) {
        this.levelStrokeAccuracy = levelStrokeAccuracy;
    }

    public String getLevelPlayingForm() {
        return levelPlayingForm;
    }

    public void setLevelPlayingForm(String levelPlayingForm) {
        this.levelPlayingForm = levelPlayingForm;
    }

    public String getLevelOverally() {
        return levelOverally;
    }

    public void setLevelOverally(String levelOverally) {
        this.levelOverally = levelOverally;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PoolPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", levelOverally=" + levelOverally +
                ", levelPlayingForm=" + levelPlayingForm +
                ", levelStrokeAccuracy=" + levelStrokeAccuracy +
                ", imageURL='" + imageURL + '\'' +
                ", primaryCueBrand='" + primaryCueBrand + '\'' +
                ", numberOfCue=" + numberOfCue +
                ", additionalNote='" + additionalNote + '\'' +
                '}';
    }
}