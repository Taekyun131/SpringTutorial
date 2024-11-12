package www.silver.vo;

public class questionVO {
	int no=0;
	String subject=null;
	String title=null;
	String content=null;
	String indate=null;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "questionVO [no=" + no + ", subject=" + subject + ", title=" + title + ", content=" + content
				+ ", indate=" + indate + "]";
	}
	
	
}
