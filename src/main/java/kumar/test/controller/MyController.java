package kumar.test.controller;

import java.util.ArrayList;
import java.util.List;

import kumar.test.DAO.ConnetDB;
import kumar.test.DAO.ReturnValues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	ConnetDB connetDB;
	
	@RequestMapping("/")
	public String testDB(@RequestParam int skuNbr ){
		//http://localhost:8080/?skuNbr=106270
		//int skuNbr=106270;
		String returnVal="";
		List<ReturnValues> returnValues=new ArrayList<ReturnValues>();
		
		 returnValues = connetDB.getStorePOs(skuNbr);
		
			for(ReturnValues item : returnValues){
				System.out.println(item.getPo_ctrl_nbr());
				
				returnVal=item.getPo_ctrl_nbr();
			}
			System.out.println("..........");
		
		return returnVal;
		
	}
	

}


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
