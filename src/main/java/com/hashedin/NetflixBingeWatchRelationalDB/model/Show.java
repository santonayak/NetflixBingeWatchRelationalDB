package com.hashedin.NetflixBingeWatchRelationalDB.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;

@Entity
public class Show {
    @Id
    private String showId;
    private String type;
    private String name;
    private String director;
    private String casting;
    private String country;
    private String date_added;
    private String release_year;
    private String season_code;
    private String season_count;
    private String category;
    private String description;

    public Show(){}

    public Show(String showId, String type, String name, String director, String casting, String country, String date_added, String release_year, String season_code, String season_count, String category, String description) {
        this.showId = showId;
        this.type = type;
        this.name = name;
        this.director = director;
        this.casting = casting;
        this.country = country;
        this.date_added = date_added;
        this.release_year = release_year;
        this.season_code = season_code;
        this.season_count = season_count;
        this.category = category;
        this.description = description;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return casting;
    }

    public void setCast(String casting) {
        this.casting = casting;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getSeason_code() {
        return season_code;
    }

    public void setSeason_code(String season_code) {
        this.season_code = season_code;
    }

    public String getSeason_count() {
        return season_count;
    }

    public void setSeason_count(String season_count) {
        this.season_count = season_count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
