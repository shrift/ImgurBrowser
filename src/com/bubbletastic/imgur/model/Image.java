package com.bubbletastic.imgur.model;

public class Image {

	// id string The ID for the image
	// title string The title of the image.
	// description string Description of the image.
	// datetime int Time inserted into the gallery, epoch time
	// type string Image MIME type.
	// animated boolean is the image animated
	// width integer The width of the image in pixels
	// height integer The height of the image in pixels
	// size integer The size of the image in bytes
	// views integer The number of image views
	// bandwidth integer Bandwidth consumed by the image in bytes
	// deletehash string OPTIONAL, the deletehash, if you're logged in as the image owner
	// link string The direct link to the the image
	// vote boolean The current user's vote on the album. null if not signed in or if the user hasn't voted on it.
	// account_url string The username of the account that uploaded it, or null.
	// bandwidth integer Bandwidth consumed by the image in bytes
	// ups integer Upvotes for the image
	// downs integer Number of downvotes for the image
	// score integer Imgur popularity score
	// is_album boolean if it's an album or not

	private String id;
	private String title;
	private String description;
	private Integer datetime;
	private String type;
	private Boolean animated;
	private Integer width;
	private Integer height;
	private Integer size;
	private Integer views;
	private Integer bandwidth;
	private String deletehash;
	private String link;
	private Boolean vote;
	private String account_url;
	private Integer ups;
	private Integer downs;
	private Integer score;
	private Boolean is_album;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getAnimated() {
		return animated;
	}

	public void setAnimated(Boolean animated) {
		this.animated = animated;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getDeletehash() {
		return deletehash;
	}

	public void setDeletehash(String deletehash) {
		this.deletehash = deletehash;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getVote() {
		return vote;
	}

	public void setVote(Boolean vote) {
		this.vote = vote;
	}

	public String getAccount_url() {
		return account_url;
	}

	public void setAccount_url(String account_url) {
		this.account_url = account_url;
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

}
