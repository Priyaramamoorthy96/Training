<?xml version = "1.0" encoding = "UTF-8"?> 
<xsl:stylesheet version = "1.0" 
   xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
   <xsl:template match = "/"> 
                <xsl:for-each select = "employee/AJG"> 
					
                  <xsl:if test = "salary > 14000"> 
                  <xsl:text>&#xa;</xsl:text>
               <xsl:value-of select = "name"/> 
         
               </xsl:if> 
               </xsl:for-each> 
		   </xsl:template>  
</xsl:stylesheet>