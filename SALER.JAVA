nhập  java . sử dụng . *;

 hạng  công chúng Saler {
	 tên chuỗi  riêng ;
	riêng tư  Double  salesDoanhSo ;
	 Tiền thưởng nhân đôi  riêng ;
	public  static  Scanner  s = new  Scanner ( Hệ thống . in );

	public  String  getName () {
		trả lại  tên ;
	}

	public  void  setName ( String  name ) {
		cái này . name = tên ;
	}

	public  Double  getSalesDoanhSo () {
		bán hàng trả  lạiDoanhSo ;
	}

	public  void  setSalesDoanhSo ( Double  salesDoanhSo ) {
		cái này . salesDoanhSo = salesDoanhSo ;
	}

	public  Double  getBonus () {
		setBonus ( Tiền thưởng );
		trả lại  tiền thưởng ;
	}

	public  void  setBonus ( Phần thưởng gấp đôi  ) {
		Tiền thưởng = ( salesDoanhSo * 0,05 );
	}

}
