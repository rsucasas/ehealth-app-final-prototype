package eu.ehealth.db.db;

// Generated Oct 1, 2013 11:39:06 AM by Hibernate Tools 3.2.4.GA

import java.sql.Timestamp;


/**
 * Identifier generated by hbm2java
 */
public class Identifier implements java.io.Serializable
{


	private Integer id;
	private String Type;
	private String Number;
	private Timestamp IssueDate;
	private String IssueAuthority;
	private Integer persondata;
	private PersonData m_PersonData;


	public Identifier()
	{
	}


	public Identifier(String Type, String Number, Timestamp IssueDate,
			String IssueAuthority, Integer persondata, PersonData m_PersonData)
	{
		this.Type = Type;
		this.Number = Number;
		this.IssueDate = IssueDate;
		this.IssueAuthority = IssueAuthority;
		this.persondata = persondata;
		this.m_PersonData = m_PersonData;
	}


	public Integer getId()
	{
		return this.id;
	}


	public void setId(Integer id)
	{
		this.id = id;
	}


	public String getType()
	{
		return this.Type;
	}


	public void setType(String Type)
	{
		this.Type = Type;
	}


	public String getNumber()
	{
		return this.Number;
	}


	public void setNumber(String Number)
	{
		this.Number = Number;
	}


	public Timestamp getIssueDate()
	{
		return this.IssueDate;
	}


	public void setIssueDate(Timestamp IssueDate)
	{
		this.IssueDate = IssueDate;
	}


	public String getIssueAuthority()
	{
		return this.IssueAuthority;
	}


	public void setIssueAuthority(String IssueAuthority)
	{
		this.IssueAuthority = IssueAuthority;
	}


	public Integer getPersondata()
	{
		return this.persondata;
	}


	public void setPersondata(Integer persondata)
	{
		this.persondata = persondata;
	}


	public PersonData getM_PersonData()
	{
		return this.m_PersonData;
	}


	public void setM_PersonData(PersonData m_PersonData)
	{
		this.m_PersonData = m_PersonData;
	}

}