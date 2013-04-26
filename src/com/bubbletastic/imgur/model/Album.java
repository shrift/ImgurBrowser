package com.bubbletastic.imgur.model;

import java.util.List;

public class Album {

	// id string The ID for the image
	// title string The title of the album in the gallery
	// description string The description of the album in the gallery
	// datetime int Time inserted into the gallery, epoch time
	// cover string The ID of the album cover image
	// account_url string The account username or null if it's anonymous.
	// privacy string The privacy level of the album, you can only view public if not logged in as album owner
	// layout string The view layout of the album.
	// views integer The number of image views
	// link string The URL link to the album
	// ups integer Upvotes for the image
	// downs integer Number of downvotes for the image
	// score integer Imgur popularity score
	// is_album boolean if it's an album or not
	// vote boolean The current user's vote on the album. null if not signed in or if the user hasn't voted on it.
	// images_count integer The total number of images in the album (only available when requesting the direct album)
	// images Array of Images An array of all the images in the album (only available when requesting the direct album)

	private String id;
	private String title;
	private String description;
	private Integer datetime;
	private String cover;
	private String account_url;
	private String privacy;
	private String layout;
	private Integer views;
	private String link;
	private Integer ups;
	private Integer downs;
	private Integer score;
	private Boolean is_album;
	private Boolean vote;
	private Integer images_count;
	private List<Image> images;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDatetime() {
		return datetime;
	}

	public void setDatetime(Integer datetime) {
		this.datetime = datetime;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getAccount_url() {
		return account_url;
	}

	public void setAccount_url(String account_url) {
		this.account_url = account_url;
	}

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getUps() {
		return ups;
	}

	public void setUps(Integer ups) {
		this.ups = ups;
	}

	public Integer getDowns() {
		return downs;
	}

	public void setDowns(Integer downs) {
		this.downs = downs;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Boolean getIs_album() {
		return is_album;
	}

	public void setIs_album(Boolean is_album) {
		this.is_album = is_album;
	}

	public Boolean getVote() {
		return vote;
	}

	public void setVote(Boolean vote) {
		this.vote = vote;
	}

	public Integer getImages_count() {
		return images_count;
	}

	public void setImages_count(Integer images_count) {
		this.images_count = images_count;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}
