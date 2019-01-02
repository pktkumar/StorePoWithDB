package kumar.test.controller;

import java.util.ArrayList;
import java.util.List;
import kumar.test.DAO.ConnetDB;
import kumar.test.DAO.ReturnValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	ConnetDB connetDB;
	
	
	@RequestMapping(value="/", method= {RequestMethod.GET,RequestMethod.POST},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	//@RequestMapping("/")
	public List<ReturnValues> testDB(@RequestParam int skuNbr ){
	
	
		
		String returnVal="";
		List<ReturnValues> returnValues=new ArrayList<ReturnValues>();
		returnValues = connetDB.getStorePOs(skuNbr);
		        // just added see in the console
				for(ReturnValues item : returnValues){
					returnVal=item.getPo_ctrl_nbr();
					System.out.println(returnVal);
				}
		
		return returnValues;
			
	}
	
	
	

}

//http://www.springboottutorial.com/spring-boot-content-negotiation-with-xml-json-representations


/*
  in browser it will come only with xml reponse(in postman will support both xml and json resonce)
  http://localhost:8080/?skuNbr=106270
  
 
  
*/


/*to add first time
git init
git status
git add .
git commit -m "first commit"
git remote add origin https://github.com/pktkumar/TestWithService.git
git push origin master
 
 
to update repositories
git add .
git commit -m "updated with swagger"
git push origin master
*/	
