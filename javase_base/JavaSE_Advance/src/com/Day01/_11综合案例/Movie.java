package com.Day01._11综合案例;

/**
 * @Description Movie
 * @Author ChengYun
 * @Date 2025-03-28  19:44
 */
public class Movie {
    private int id;//编号
    private String movieName;//电影名字
    private String name;//主演名字
    private double score; //评分
    private String actor;//导演名字

    public Movie() {
    }

    public Movie(int id, String movieName, String name, double score, String actor) {
        this.id = id;
        this.movieName = movieName;
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}' + "\n";
    }
}