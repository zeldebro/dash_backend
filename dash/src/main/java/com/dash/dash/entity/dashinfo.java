package com.dash.dash.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "dash_info")
public class dashinfo {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "end_year")
    private int end_year;

    @Column(name = "citylng")
    private String citylng;

    @Column(name = "citylat")
    private String citylat;

    @Column(name = "intensity")
    private int intensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight")
    private String insight;

    @Column(name = "swot")
    private String swot;

    @Column(name = "url")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private String start_year;

    @Column(name = "impact")
    private String impact;

    @Column(name = "added")
    private String added;

    @Column(name = "published")
    private String published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private int relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title")
    private String title;

    @Column(name = "likelihood" , nullable = true)
    private Integer likelihood;
    @Column(name = "likehood", nullable = true)
    private Integer likehood;

    @Column(name = "id")
    private int id;
}