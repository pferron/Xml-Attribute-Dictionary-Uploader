package com.axiomatics.data;

public class Attribute {
	
	private String id				= null;
	private String attributeName	= null;
	private String nameSpace		= null;
	private String datatype			= null;
	private String category		 	= null;

	
	public String getId()
	{
	    return this.id;
	}
	public void setId(String id)
	{
	     this.id = id;
	}
	
	public String getAttributeName()
	{
	    return this.attributeName;
	}
	public void setAttributeName(String attributeName)
	{
	     this.attributeName = attributeName;
	}
	
	public String getNameSpace()
	{
	    return this.nameSpace;
	}
	public void setNameSpace(String nameSpace)
	{
	     this.nameSpace = nameSpace;
	}
	
	public String getDataType()
	{
	    return this.datatype;
	}
	public void setDataType(String datatype)
	{
	     this.datatype = datatype;
	}
	
	public String getCategory()
	{
	    return this.category;
	}
	public void setCategory(String category)
	{
	     this.category = category;
	}

}
