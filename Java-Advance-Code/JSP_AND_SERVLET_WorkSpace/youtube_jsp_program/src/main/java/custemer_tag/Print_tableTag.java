package custemer_tag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Print_tableTag extends TagSupport {
	
	public int number;
	//settert
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public int doStartTag()throws JspException
	{
		//PRINT TABLE
		//1-10 lop
		
		
		
		try {
			JspWriter out=pageContext.getOut();
		for(int i=1;i<=10;i++)
		{
			out.println((i*number)+"<br>");
			
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		// RETURN TYPES (WE ARE GOING TO SKIPPS BODY OF JSP)
				return SKIP_BODY;
	}

}
