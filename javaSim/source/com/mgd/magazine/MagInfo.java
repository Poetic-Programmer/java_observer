package com.mgd.magazine;

/**
  *@author: michael dunleavy
  *@since: 04/01/2017
  *<h1>MagInfo</h1>
  *<p>simple data structure holding update info 
  *   of magazine subscription</p>
  */
public class MagInfo{
	private final int issuePrice;
	private final int issueNumber;

	public MagInfo(final int issuePrice, final int issueNumber){
		this.issuePrice = issuePrice;
		this.issueNumber = issueNumber;
	}

	public int getIssuePrice() { return issuePrice; }
	public int getIssueNumber() { return issueNumber; }
}

