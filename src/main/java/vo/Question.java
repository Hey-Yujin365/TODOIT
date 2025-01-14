package vo;

public class Question {

	private int no;
	private String title;
	private String content;
	
	public Question() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Question [no=" + no + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
