package custemer_tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class mytag extends TagSupport{
	public int doStartTag()throws JspException{
		
		try {
			// task ............ tag
			JspWriter out=pageContext.getOut();
			out.println("<h2> this is my custom tag</h2>");
			
		}catch(Exception e)
		{
			
		}
		// RETURN TYPES (WE ARE GOING TO SKIPPS BODY OF JSP)
		return SKIP_BODY;
	}

}

