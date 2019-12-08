package tutorial.jdbc_guide;

import tutorial.jdbc_guide.god.God;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) 
    {
    	God.check_connection_with_database();
    	God.please_createDataBase();  	 		
    	God.create_table();						
        God.please_insert_to_table_something();
        God.please_show_me_table();
        God.update_info_of_table_employee();
        God.please_show_me_table();
        
    }
}
