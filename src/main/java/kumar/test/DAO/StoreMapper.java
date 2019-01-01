package kumar.test.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StoreMapper implements RowMapper<ReturnValues>
{
    public ReturnValues mapRow(ResultSet row, int rowNum) throws SQLException 
    {
    	ReturnValues student = new ReturnValues();
    	student.setSku_nbr(row.getInt("sku_nbr"));
         //student.setPartnername(row.getString("partnername"));
        // student.setAge(row.getInt("age"));
         return student;
    }
}