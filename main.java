lớp  công khai Chính {

	public  static  void  main ( String [] args ) {
		// VIỆC CẦN LÀM Sơ khai phương thức được tạo tự động
     Saler  NV1BH = new   Saler ();
     NV1BH . setName ( "LÊ HỮU Văn" );
     NV1BH . setSalesDoanhSo ( 332000.0 );
     NV1BH . getBonus ();
     Hệ thống . ra ngoài . println ( "Tên:" + NV1BH . getName () + "DOANH SỐ:" + NV1BH . getSalesDoanhSo () + "Thưởng:" + NV1BH . getBonus ());
     Saler  NV2BH = new   Saler ();
     NV1BH . setName ( "Nguyễn Thị Hoa" );
     NV1BH . setSalesDoanhSo ( 40000.0 );
     NV1BH . getBonus ();
     Hệ thống . ra ngoài . println ( "Tên:" + NV1BH . getName () + "DOANH SỐ:" + NV1BH . getSalesDoanhSo () + "Thưởng:" + NV1BH . getBonus ());
     Saler  NVTT = new  Trainee ();
     NVTT . setName ( "Nguyễn Ngọc Hoa" );
     NVTT . setSalesDoanhSo ( 50000.0 );
     NVTT . getBonus ();
     Hệ thống . ra ngoài . println ( "Tên:" + NVTT . getName () + "DOANH SỐ:" + NVTT . getSalesDoanhSo () + "Thưởng:" + NVTT . getBonus ());
     
	}

}
