package com.FileReader_manager;

import java.io.IOException;

import com.configuration_helper.Configuration_Reader;

public class File_Reader_Manager {
	 
	
public static File_Reader_Manager get_instance_frm() {
// TODO Auto-generated method stub
File_Reader_Manager frm = new File_Reader_Manager();
return frm;
	}
public  Configuration_Reader get_instance_cr() throws IOException {
// TODO Auto-generated method stub
Configuration_Reader cr = new Configuration_Reader();
return cr;
	}
}
