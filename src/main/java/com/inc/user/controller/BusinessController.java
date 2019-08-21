/**
 * 
 */
package com.inc.user.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xml.sax.SAXException;

import com.inc.user.helper.LoginHelper;
import com.inc.user.model.CodeCoverage;

/**
 * @author Ananthan
 *
 */
@Controller
public class BusinessController {
	
	@RequestMapping(value = "/xmlParse", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<CodeCoverage> xmlParseResult(Model model) throws FileNotFoundException, SAXException, IOException {
		LoginHelper helper = new LoginHelper();
		List<CodeCoverage> result = helper.xmlParseResult();
		
		for(CodeCoverage rs : result) {
			System.out.println(rs.getType()+"\t"+rs.getDefaultValue()+"\t"+rs.getActualValue()+"\t"+rs.getDescription());
		}
		return result;
	}

}
