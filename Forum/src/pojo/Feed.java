package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feed")
public class Feed {
	@Id
	@Column(name="feed_id",length=150)
	private String feedId;
	private String question;
	private String userId;
	private String feedStamp;

	public String getFeedId() {
		return feedId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFeedStamp() {
		return feedStamp;
	}

	public void setFeedStamp(String feedStamp) {
		this.feedStamp = feedStamp;
	}

}
