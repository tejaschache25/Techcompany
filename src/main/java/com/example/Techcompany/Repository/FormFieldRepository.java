package com.example.Techcompany.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.Techcompany.Model.FormField;

@Component
public class FormFieldRepository
{
	 private final JdbcTemplate jdbcTemplate;
	 
	 public FormFieldRepository(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	public List<FormField> findAll() {
		 String sql = "SELECT * FROM form_fields";
	        return jdbcTemplate.query(sql, (rs, rowNum) -> mapToFormField(rs));
	}
	
	private FormField mapToFormField(ResultSet rs) throws SQLException {
		 FormField formField = new FormField();
	        formField.setId(rs.getLong("id"));
	        formField.setName(rs.getString("name"));
	        formField.setLabel(rs.getString("label"));
	        formField.setType(rs.getString("type"));
	        formField.setPlaceholder(rs.getString("placeholder"));
	        formField.setRequired(rs.getBoolean("required"));
	        // Set other properties as needed
	        return formField;
	}
	

	////manual data add in form filed data 
    public List<FormField> getContactList()
    {
    	//constructor parameter
    	 List<FormField> listContact = new ArrayList<>();
    	 listContact.add(new FormField("field1", "Label 1", "text", "Placeholder 1", false, null));
    	 listContact.add(new FormField("field2", "Label 2", "file", "Placeholder 1", false, null));
    	return listContact;
    }
    
    
    public Map<String, String> myVal(){
    	Map<String, String> map = new HashMap<String, String>();
    	 map.put("Sample", "Value");
         return map;  
    	
    }

}
