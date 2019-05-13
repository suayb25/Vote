package com.company.talha.vote;

/**
 * The type Popular elections.
 */
public class PopularElections {
    private   String name;
    private   String date;
    private  int image;
    private int voteCount;
    private String id;
    private String chosen;

    /**
     * Instantiates a new Popular elections.
     *
     * @param name      the name
     * @param date      the date
     * @param voteCount the vote count
     * @param image     the image
     */
    public PopularElections(String name, String date, int voteCount, int image,String id,String chosen) {
        this.name = name;
        this.date = date;
        this.image = image;
        this.id = id;
        this.chosen = chosen;
        this.voteCount = voteCount;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets ımage.
     *
     * @return the ımage
     */
    public int getImage() {
        return image;
    }

    /**
     * Sets ımage.
     *
     * @param image the image
     */
    public void setImage(int image) {
        this.image = image;
    }

    /**
     * Gets vote count.
     *
     * @return the vote count
     */
    public int getVoteCount() {
        return voteCount;
    }

    /**
     * Sets vote count.
     *
     * @param voteCount the vote count
     */
    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChosen() {
        return chosen;
    }

    public void setChosen(String chosen) {
        this.chosen = chosen;
    }
}
