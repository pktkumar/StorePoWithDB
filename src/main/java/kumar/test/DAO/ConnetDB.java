package kumar.test.DAO;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class ConnetDB {
	

	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  
	  /*
		
		public List<ReturnValues> getValueFromDB(int skuNbr){
			
			
		
		        Connection connect = null;
		        Statement statement = null;
	            String StoreNumber1="9735";
	           
	            
	            String returnVal="";
	            
		        
		        try {
		            String driver2 = "com.informix.jdbc.IfxDriver";
		            Class.forName(driver2).newInstance();
		            String url = "jdbc:informix-sqli://ispb.st" + StoreNumber1
		                    + ".homedepot.com:25001/store:INFORMIXSERVER=onconfig_tcp";
		            connect = DriverManager.getConnection(url, "sauserqa", "qa02test");
		            
		            statement = connect.createStatement();
		            
		            query ="SELECT sps.loc_nbr,sps.acct_po_typ_cd,sps.po_ctrl_nbr,sps.sku_nbr,"
		        			+ "sps.ord_qty, sp.ord_typ_cd, sp.vsbl_expctd_arvl_ts, sp.rqst_dlvry_dt, sp.expctd_arvl_dt,"
		        			+ "sp.mvndr_nbr,sp.dc_nbr, sp.vsbl_trst_loc_cd "
		        			+ "FROM  str_po sp , str_po_sku sps "
		        			+ "WHERE sp.po_ctrl_nbr = sps.po_ctrl_nbr "
		        			+ "AND sp.ord_seq_nbr = sps.ord_seq_nbr "
		        			+ "AND sp.po_stat_cd in (2)  " //Open POs
		        			+ "AND sp.crt_dt >(today - 30) "
		        			+ "AND sps.sku_nbr in (106270) ";
		            
		      
		            
		            ;
		  
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return getSkuNbr(skuNbr); 
		    } 
	*/
	  
	  
	public List<ReturnValues> getStorePOs(int skuNbr) {
		
		  String query;
	
		  query ="SELECT sps.loc_nbr,sps.acct_po_typ_cd,sps.po_ctrl_nbr,sps.sku_nbr,"
      			+ "sps.ord_qty, sp.ord_typ_cd, sp.vsbl_expctd_arvl_ts, sp.rqst_dlvry_dt, sp.expctd_arvl_dt,"
      			+ "sp.mvndr_nbr,sp.dc_nbr, sp.vsbl_trst_loc_cd "
      			+ "FROM  str_po sp , str_po_sku sps "
      			+ "WHERE sp.po_ctrl_nbr = sps.po_ctrl_nbr "
      			+ "AND sp.ord_seq_nbr = sps.ord_seq_nbr "
      			+ "AND sp.po_stat_cd in (2)  " //Open POs
      			+ "AND sp.crt_dt >(today - 30) "
      			+ "AND sps.sku_nbr in ("+skuNbr+")";

		  return jdbcTemplate.query(query,
		            new BeanPropertyRowMapper<ReturnValues>(ReturnValues.class));
		  

	}
}
