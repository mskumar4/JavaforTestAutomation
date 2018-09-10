package com.epam.JSON;
	
	public class POJO {

	    private int userid;
	    private int id;
	    private String title;
	    private String body;

	   
		public int getUserid() {
	         return this.userid;
	    }

	    public void setUserid(int userid) {
	    	this.userid=userid;
	    }
	    
	    public int getid() {
	         return this.id;
	    }

	    public void setId(int id) {
	    	this.id=id;
	    }
	    
	    public String getTitle(String title) {
	         return this.title;
	    }

	    public void setTitle(String title) {
	    	this.title=title;
	    }
	    
	    public String getBody(String body) {
	         return this.body;
	    }

	    public void setBody(String body) {
	    	this.body=body;
	    }
	    @Override
		public String toString() {
			return "POJO [userid=" + userid + ", id=" + id + ", title=" + title
					+ ", body=" + body + "]";
		}

	}
