package kumar.test.DAO;

public class ReturnValues {

	private String loc_nbr;
	private String  po_ctrl_nbr;
	private String  expctd_arvl_dt;
	private int sku_nbr;
	
	public int getSku_nbr() {
		return sku_nbr;
	}

	public void setSku_nbr(int sku_nbr) {
		this.sku_nbr = sku_nbr;
	}

	public String getLoc_nbr() {
		return loc_nbr;
	}
	public void setLoc_nbr(String loc_nbr) {
		this.loc_nbr = loc_nbr;
	}
	public String getPo_ctrl_nbr() {
		return po_ctrl_nbr;
	}
	public void setPo_ctrl_nbr(String po_ctrl_nbr) {
		this.po_ctrl_nbr = po_ctrl_nbr;
	}
	public String getExpctd_arvl_dt() {
		return expctd_arvl_dt;
	}
	public void setExpctd_arvl_dt(String expctd_arvl_dt) {
		this.expctd_arvl_dt = expctd_arvl_dt;
	}
	
	
}
