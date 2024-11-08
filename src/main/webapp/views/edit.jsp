<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
        <h1>Update student marks</h1>  
       <form:form method="GET" action="/editandsave">    
        <table >    
        <tr>  
        <td>SID</td>    
         <td><form:hidden  path="sid" /></td>  
         </tr>  
         <tr>    
            <td>Name :</td>    
            <td><form:input path="name" /></td>  
           </tr>  
         <tr>    
          <td>course: </td>   
          <td><form:input path="course"  /></td>  
         </tr> 
         
         <tr>    
          <td>html :</td>    
          <td><form:input path="html" /></td>  
         </tr> 
         <tr>    
            <td>hibernet :</td>    
            <td><form:input path="hibernet" /></td>  
           </tr>  
         <tr>    
            <td>spring :</td>    
            <td><form:input path="spring" /></td>  
           </tr> 
           <tr>    
            <td>springboot :</td>    
            <td><form:input path="springboot" /></td>  
           </tr> 
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr> 
        </table>    
       </form:form>  
       
       </body>