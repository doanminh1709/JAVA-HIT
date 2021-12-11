package Bai3;

import java.util.ArrayList;

public class News extends Caculate implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News(){}
    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }
    @Override
    public float ResultRatelist() {
        return super.ResultRatelist();
    }
    @Override
    public void Display(){
        System.out.println("Title "+ this.title + "\npublishDate : "+ this.publishDate
        + "\nAthour : " + this.author + "\nContent : " +this.content + "\nAverage Rate : "
                + this.ResultRatelist());
    }
}
