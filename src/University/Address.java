package University;

public class Address{
	
	public Address(String street, String district, String province, String zipcode){
		this.setStreet(street);
		this.setDistrict(district);
		this.setProvince(province);
		this.setZipcode(zipcode);
	}
	
	private String street;
	private String district;
	private String province;
	private String zipcode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
